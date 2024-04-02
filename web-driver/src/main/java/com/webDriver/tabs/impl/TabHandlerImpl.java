package com.webDriver.tabs.impl;

import com.webDriver.tabs.service.TabHandler;
import org.openqa.selenium.WebDriver;

import java.util.Collection;

/**
 * Identifies browser window handles and the current window handle.
 *
 * @version 1.0
 * @author [Navin Jones]
 * @see TabHandler
 */
public final class TabHandlerImpl implements TabHandler {

    private final WebDriver driver;

    public TabHandlerImpl(final WebDriver driver) {
        this.driver = driver;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<String> getTabHandles() {
        return driver.getWindowHandles();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getTabHandle() {
        return driver.getWindowHandle();
    }
}

