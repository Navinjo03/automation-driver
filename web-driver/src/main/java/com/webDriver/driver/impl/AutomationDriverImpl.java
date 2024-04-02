package com.webDriver.driver.impl;


import com.webDriver.driver.service.AutomationDriver;
import com.webDriver.element.finders.impl.WebDriverFinder;
import com.webDriver.element.finders.service.ElementFinder;
import com.webDriver.element.locator.target_locator.impl.TargetLocatorImpl;
import com.webDriver.element.locator.target_locator.service.TargetLocator;
import com.webDriver.page_component.impl.PageInformationImpl;
import com.webDriver.page_component.impl.PageNavigatorImpl;
import com.webDriver.page_component.service.PageInformation;
import com.webDriver.page_component.service.PageNavigator;
import com.webDriver.tabs.impl.TabHandlerImpl;
import com.webDriver.tabs.impl.TabNavigatorImpl;
import com.webDriver.tabs.service.TabHandler;
import com.webDriver.tabs.service.TabNavigator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

/**
 * Provides functionality for automating browser interactions using the WebDriver API.
 *
 * @author [Navin Jones]
 * @version 1.0
 * @see AutomationDriver
 */
public final class AutomationDriverImpl implements AutomationDriver {

    private final WebDriver driver;
    private final TakesScreenshot takeScreenshot;

    public AutomationDriverImpl(final WebDriver driver) {
        this.driver = driver;
        this.takeScreenshot = (TakesScreenshot) driver;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void close() {
        driver.close();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void quit() {
        driver.quit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ElementFinder find() {
        return new WebDriverFinder(driver);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PageInformation inform() {
        return new PageInformationImpl(driver);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PageNavigator navigator() {
        return new PageNavigatorImpl(driver.navigate());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TargetLocator targetLocator() {
        return new TargetLocatorImpl(driver.switchTo(), driver);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TabNavigator window() {
        return new TabNavigatorImpl(driver.manage().window());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TabHandler tabs() {
        return new TabHandlerImpl(driver);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException {
        return takeScreenshot.getScreenshotAs(target);
    }
}

