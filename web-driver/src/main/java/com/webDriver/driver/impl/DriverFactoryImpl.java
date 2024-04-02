package com.webDriver.driver.impl;

import com.commons.properties.PropertyFileReader;
import com.webDriver.driver.browser.Browser;
import com.webDriver.driver.browser.BrowserSetup;
import com.webDriver.driver.service.AutomationDriver;
import com.webDriver.driver.service.DriverFactory;

import java.util.Objects;

/**
 * A factory implementation for creating instances of AutomationDriver,
 * specifically tailored for web browser automation tasks.
 *
 * @Version 1.0
 * @Author [Navin Jones]
 * @see DriverFactory
 */
public final class DriverFactoryImpl implements DriverFactory {

    private static DriverFactoryImpl driver;
    private final PropertyFileReader propertyFileReader;

    public DriverFactoryImpl() {
        this.propertyFileReader = PropertyFileReader.getInstance();
    }

    /**
     * Implements the getDriver() method defined in the DriverBuilder interface.
     * Configures and returns an instance of AutomationDriver by setting up a browser
     * through BrowserController, using the browser instance obtained from the webFunctionalityHandler.
     * Ensures that the browser instance obtained from webFunctionalityHandler is not null
     * before proceeding with the setup process.
     *
     * @return An instance of AutomationDriver configured for automation tasks.
     * @throws NullPointerException if the browser instance obtained from webFunctionalityHandler is null.
     */
    @Override
    public AutomationDriver getDriver() {
        return BrowserSetup.getInstance().build(Objects.requireNonNull(Browser.valueOf
                (Objects.requireNonNull(propertyFileReader.getProperty()).getProperty("Browser"))));
    }
}
