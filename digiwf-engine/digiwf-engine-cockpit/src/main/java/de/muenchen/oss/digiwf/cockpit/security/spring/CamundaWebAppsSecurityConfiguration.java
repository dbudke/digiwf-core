package de.muenchen.oss.digiwf.cockpit.security.spring;

import de.muenchen.oss.digiwf.cockpit.CamundaWebappsProperties;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;
import org.springframework.security.web.SecurityFilterChain;

import static de.muenchen.oss.digiwf.spring.security.SecurityConfiguration.DEFAULT_SECURITY_ORDER;
import static de.muenchen.oss.digiwf.spring.security.SecurityConfiguration.SECURITY;

/**
 * Configuration making sure that webapps can be accessed only is the user has a specific role.
 */
@Configuration
@Slf4j
@RequiredArgsConstructor
@Profile(SECURITY)
public class CamundaWebAppsSecurityConfiguration {
  private static final String[] CAMUNDA_APP_PATHS = {
      "/camunda/app/**",
      "/camunda/api/**",
      "/camunda/lib/**"
  };

  private final CamundaWebappsProperties camundaWebappsProperties;

  @Bean
  @Order(DEFAULT_SECURITY_ORDER - 100)
  public SecurityFilterChain camundaWebAppFilterChain(
      final HttpSecurity http,
      final JwtAuthenticationConverter jwtAuthenticationConverter
  ) throws Exception {
    // @formatter:off
    http
        .securityMatcher(CAMUNDA_APP_PATHS)
        // Any requests on these paths require the configured role
        .authorizeHttpRequests(authorize -> authorize
            .anyRequest().hasRole(camundaWebappsProperties.getWebAppRole())
        )
        // Disable CSRF for these paths
        .csrf(AbstractHttpConfigurer::disable)
        // oath2 resource server config
        .oauth2ResourceServer( server -> server
          .jwt( jwt -> jwt
            .jwtAuthenticationConverter(jwtAuthenticationConverter)
          )
        )
    ;
    // @formatter:on
    return http.build();
  }
}
