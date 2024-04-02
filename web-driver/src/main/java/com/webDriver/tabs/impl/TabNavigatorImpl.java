package com.webDriver.tabs.impl;

import com.webDriver.tabs.service.TabNavigator;
import org.openqa.selenium.WebDriver;

/**
 * Handles browser window operations, such as maximizing, minimizing,
 * and toggling fullscreen mode.
 *
 * @version 1.0
 * @author [Navin Jones]
 * @see TabNavigator
 */
public final class TabNavigatorImpl implements TabNavigator {

    private final WebDriver.Window window;

    public TabNavigatorImpl(final WebDriver.Window window) {
        this.window = window;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void maximize() {
        window.maximize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void minimize() {
        window.minimize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void fullscreen() {
        window.fullscreen();
    }
}

