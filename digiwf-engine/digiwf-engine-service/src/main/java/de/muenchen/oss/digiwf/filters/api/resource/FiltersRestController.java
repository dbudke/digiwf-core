/*
 * Copyright (c): it@M - Dienstleister für Informations- und Telekommunikationstechnik der Landeshauptstadt München, 2020
 */

package de.muenchen.oss.digiwf.filters.api.resource;

import de.muenchen.oss.digiwf.filters.api.mapper.FilterApiMapper;
import de.muenchen.oss.digiwf.filters.api.transport.FilterTO;
import de.muenchen.oss.digiwf.filters.api.transport.SaveFilterTO;
import de.muenchen.oss.digiwf.filters.domain.service.PersistentFilterService;
import de.muenchen.oss.digiwf.shared.security.AppAuthenticationProvider;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;


/**
 * API to load user filters and perform actions on them.
 */
@RestController
@Transactional
@RequestMapping("/rest/filter")
@RequiredArgsConstructor
@Slf4j
@Tag(name = "FilterRestController", description = "API to load user filters and perform actions on them")
public class FiltersRestController {

    private final PersistentFilterService persistentFilterService;
    private final AppAuthenticationProvider authenticationProvider;

    private final FilterApiMapper filterApiMapper;

    /**
     * Returns all filters of the authenticated user and page.
     *
     * @return filters
     */
    @GetMapping
    public ResponseEntity<List<FilterTO>> getFilters() {
        log.debug("getFilters");
        val filters = this.persistentFilterService.getFilters(this.authenticationProvider.getCurrentUserId());
        return ResponseEntity.ok(this.filterApiMapper.map2TO(filters));
    }

    /**
     * Saves the given filter.
     *
     * @param filterTO Data of the filter
     * @return the saved filter
     */
    @PutMapping
    public ResponseEntity<FilterTO> saveFilter(@Valid @RequestBody final SaveFilterTO filterTO) {
        this.persistentFilterService.saveFilter(filterApiMapper.map(filterTO, this.authenticationProvider.getCurrentUserId()));
        return ResponseEntity.ok().build();
    }

    /**
     * Deletes the filter.
     *
     * @param filterId Id of the filter
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") final String filterId) {
        this.persistentFilterService.deleteFilter(filterId, this.authenticationProvider.getCurrentUserId());
        return ResponseEntity.ok().build();
    }

}

