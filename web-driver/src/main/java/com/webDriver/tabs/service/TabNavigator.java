package com.webDriver.tabs.service;

/**
 * <p>
 * Handles the browser window.
 * </p>
 *
 * Author: [Navin Jones]
 * Version: 1.0
 */

public interface TabNavigator {

    /**
     * Maximizes the browser window.
     */
    void maximize();

    /**
     * Minimizes the browser window.
     */
    void minimize();

    /**
     * Sets the browser window to fullscreen mode.
     */
    void fullscreen();
}

