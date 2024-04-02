package com.webDriver.element.web.element.service;

/**
 * Represents a web element on a web page, providing
 * methods for interacting with the element.
 *
 * @version 1.0
 * @author [Navin Jones]
 */

public interface PageElement {

    /**
     * Clicks on the web element.
     */
    void click();

    /**
     * Submits the form containing the web element.
     */
    void submit();

    /**
     * Sends the specified keys to the web element.
     *
     * @param keysToSend The keys to send to the web element.
     */
    void sendKeys(final CharSequence... keysToSend);

    /**
     * Clears the text from the web element.
     */
    void clear();

    /**
     * Checks if the web element is displayed.
     *
     * @return true if the web element is displayed, false otherwise.
     */
    boolean isDisplayed();

    /**
     * Retrieves the text content of the web element.
     *
     * @return a String containing the text content of the web element.
     */
    String getText();
}