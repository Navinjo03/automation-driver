package com.webDriver.element.locator;

import com.webDriver.driver.service.AutomationDriver;
import com.webDriver.element.web.element.service.PageElement;
import org.openqa.selenium.By;

import java.util.Collection;

/**
 * Provides methods for locating web elements on a web page with browser alerts.
 *
 * @version 1.0
 * @author [Navin Jones]
 */
public final class ElementLocator {

    private static ElementLocator elementLocator;
    private final AutomationDriver automationDriver;

    private ElementLocator(final AutomationDriver automationDriver) {
        this.automationDriver = automationDriver;
    }

    /**
     * Retrieves the singleton instance of ElementLocator with the specified AutomationDriver instance.
     * Lazily initializes the instance if it is null and returns the instance.
     *
     * @param automationDriver The AutomationDriver instance used for element location.
     * @return The singleton instance of ElementLocator.
     */
    public static ElementLocator getInstance(final AutomationDriver automationDriver) {
        elementLocator = new ElementLocator(automationDriver);

        return elementLocator;
    }

    /**
     * Locates and returns a single web element on the web page based on the specified locator type and value.
     *
     * @param locatorType The type of locator to use for locating the web element.
     * @param value       The value associated with the locator type.
     * @return The located web element.
     */
    public PageElement getPageElement(final Locators locatorType, final String value) {
        return automationDriver.find().findElement(getByValue(locatorType, value));
    }

    /**
     * Locates and returns all web elements on the web page matching the specified locator type and value.
     *
     * @param locatorType The type of locator to use for locating the web elements.
     * @param value       The value associated with the locator type.
     * @return A collection of located web elements.
     */
    public Collection<PageElement> getPageElements(final Locators locatorType, final String value) {
        return automationDriver.find().findElements(getByValue(locatorType, value));
    }

    /**
     * Constructs and returns a By object based on the specified locator type and value.
     *
     * @param locatorType The type of locator to use for constructing the By object.
     * @param value The value associated with the locator type.
     * @return The constructed By object.
     */
    private By getByValue(final Locators locatorType, final String value) {
        return switch (locatorType) {
            case ID -> By.id(value);
            case NAME -> By.name(value);
            case CLASS_NAME -> By.className(value);
            case XPATH -> By.xpath(value);
            case LINK_TEXT -> By.linkText(value);
            case PARTIAL_LINK_TEXT -> By.partialLinkText(value);
            case CSS_SELECTOR -> By.cssSelector(value);
            case TAG_NAME -> By.tagName(value);
        };
    }
}

