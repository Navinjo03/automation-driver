package com.webDriver.driver.service;


import com.webDriver.element.finders.service.ElementFinder;
import com.webDriver.element.locator.target_locator.service.TargetLocator;
import com.webDriver.page_component.service.PageInformation;
import com.webDriver.page_component.service.PageNavigator;
import com.webDriver.tabs.service.TabHandler;
import com.webDriver.tabs.service.TabNavigator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;

/**
 * Defines a set of methods for automating interactions with a web browser.
 *
 * @Author [Navin Jones]
 * @Version 1.0
 */

public interface AutomationDriver {

    /**
     * Closes the current window or tab.
     */
    void close();

    /**
     * Quits the browser, closing all windows and ending the session.
     */
    void quit();

    /**
     * To locate elements within the web page.
     *
     * @return A Finder instance for {@link ElementFinder}.
     */
    ElementFinder find();

    /**
     * To retrieve additional information about the web page.
     *
     * @return An Information instance for {@link PageInformation}.
     */
    PageInformation inform();

    /**
     * For navigating through pages.
     *
     * @return A PageNavigator instance for page {@link PageNavigator}.
     */
    PageNavigator navigator();

    /**
     * Locating targets within the web page.
     *
     * @return A TargetLocator instance for {@link TargetLocator}.
     */
    TargetLocator targetLocator();

    /**
     * For handling windows and tabs.
     *
     * @return A WindowHandler instance for {@link TabNavigator}.
     */
    TabNavigator window();

    /**
     * For identifying and managing tabs.
     *
     * @return A WindowIdentifier instance for {@link TabHandler}.
     */
    TabHandler tabs();


    <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException;
}



