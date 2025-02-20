package de.muenchen.oss.digiwf.task.service.application.port.out.auth;

import io.holunda.polyflow.view.auth.User;

/**
 * Port to retrieve currently logged-in user information.
 */
public interface CurrentUserPort {
    /**
     * Retrieves current user.
     * @return current user.
     */
    User getCurrentUser();

    /**
     * Retrieves the username (not the user id) of the current user.
     * @return username of the current user.
     */
    String getCurrentUserUsername();

    /**
     * Retrieves the user JWT.
     * @return user's JWT.
     */
    String getCurrentUserToken();
}
