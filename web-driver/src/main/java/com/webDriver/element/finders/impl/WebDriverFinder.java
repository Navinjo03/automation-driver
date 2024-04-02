package com.webDriver.element.finders.impl;

import com.webDriver.element.finders.service.ElementFinder;
import com.webDriver.element.web.element.impl.PageElementImpl;
import com.webDriver.element.web.element.service.PageElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Methods for locating web elements within a web page using the WebDriver API.
 *
 * @version 1.0
 * @author [Navin Jones]
 * @see ElementFinder
 */
public final class WebDriverFinder implements ElementFinder {

    private final WebDriver driver;

    public WebDriverFinder(final WebDriver driver) {
        this.driver = driver;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PageElement findElement(final By by) {
        return new PageElementImpl(driver.findElement(by));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<PageElement> findElements(final By by) {
        final Collection<WebElement> webElements = driver.findElements(by);
        final Collection<PageElement> pageElements = new ArrayList<>();

        for (final WebElement element : webElements) {
            pageElements.add(new PageElementImpl(element));
        }

        return pageElements;
    }
}
