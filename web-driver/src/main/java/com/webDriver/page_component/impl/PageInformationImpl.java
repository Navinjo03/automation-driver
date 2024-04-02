package com.webDriver.page_component.impl;

import com.webDriver.page_component.service.PageInformation;
import org.openqa.selenium.WebDriver;

/**
 * Retrieving information about the current web page,
 * such as its URL, title, and page source.
 *
 * @version 1.0
 * @author [Navin Jones]
 * @see PageInformation
 */
public final class PageInformationImpl implements PageInformation {

    private final WebDriver driver;

    public PageInformationImpl(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void goToUrl(final String url) {
        driver.get(url);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getTitle() {
        return driver.getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getPageSource() {
        return driver.getPageSource();
    }
}
