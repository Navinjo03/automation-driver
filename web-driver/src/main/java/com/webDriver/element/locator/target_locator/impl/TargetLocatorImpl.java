package com.webDriver.element.locator.target_locator.impl;

import com.webDriver.alert.impl.WebAlertImpl;
import com.webDriver.alert.service.WebAlert;
import com.webDriver.driver.impl.AutomationDriverImpl;
import com.webDriver.driver.service.AutomationDriver;
import com.webDriver.element.locator.target_locator.service.TargetLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

/**
 * Functionalities for switching between different browsing contexts,
 * such as windows and frames, and interacting with browser alerts.
 *
 * @version 1.0
 * @author [Navin Jones]
 */
public final class TargetLocatorImpl implements TargetLocator {

    private final WebDriver.TargetLocator targetLocator;
    private final WebDriver driver;

    public TargetLocatorImpl(final WebDriver.TargetLocator targetLocator, final WebDriver driver) {
        this.targetLocator = targetLocator;
        this.driver = driver;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AutomationDriver window(final String name) {
        return new AutomationDriverImpl(targetLocator.window(name));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AutomationDriver newWindow(final WindowType windowType) {
        return new AutomationDriverImpl(targetLocator.newWindow(windowType));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebAlert alert() {
        return new WebAlertImpl(driver.switchTo().alert());
    }
}

