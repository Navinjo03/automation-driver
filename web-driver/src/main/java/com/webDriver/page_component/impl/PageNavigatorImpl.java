package com.webDriver.page_component.impl;

import com.webDriver.page_component.service.PageNavigator;
import org.openqa.selenium.WebDriver;

/**
 * Navigates back and forward in the browser history,
 * navigating to a specific URL, and refreshing the current web page.
 *
 * @version 1.0
 * @author [Navin Jones]
 * @see PageNavigator
 */
public final class PageNavigatorImpl implements PageNavigator {

    private final WebDriver.Navigation pageNavigator;

    public PageNavigatorImpl(final WebDriver.Navigation pageNavigator) {
        this.pageNavigator = pageNavigator;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void back() {
        pageNavigator.back();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void forward() {
        pageNavigator.forward();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void to(final String url) {
        pageNavigator.to(url);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void refresh() {
        pageNavigator.refresh();
    }
}

