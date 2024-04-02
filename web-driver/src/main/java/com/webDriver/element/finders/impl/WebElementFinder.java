package com.webDriver.element.finders.impl;

import com.webDriver.element.finders.service.ElementFinder;
import com.webDriver.element.web.element.impl.PageElementImpl;
import com.webDriver.element.web.element.service.PageElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Provides methods for locating child web elements within a parent web element.
 *
 * @version 1.0
 * @author [Navin Jones]
 * @see ElementFinder
 */
public final class WebElementFinder implements ElementFinder {

    private final WebElement element;

    public WebElementFinder(final WebElement element) {
        this.element = element;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PageElement findElement(final By by) {
        return new PageElementImpl(element.findElement(by));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<PageElement> findElements(final By by) {
        final Collection<WebElement> webElements = element.findElements(by);
        final Collection<PageElement> pageElements = new ArrayList<>();

        for (final WebElement element : webElements) {
            pageElements.add(new PageElementImpl(element));
        }

        return pageElements;
    }
}

