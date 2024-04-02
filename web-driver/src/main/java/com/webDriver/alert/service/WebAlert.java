package com.webDriver.alert.service;

/**
 * Interacts with alerts in a web browser.
 *
 * @Version 1.0
 * @Author [Navin Jones]
 */

public interface WebAlert {

    /**
     * Dismisses the alert.
     */
    void dismiss();

    /**
     * Accepts the alert.
     */
    void accept();

    /**
     * Retrieves the text of the alert.
     *
     * @return The text of the alert.
     */
    String getText();

    /**
     * Sends keys to the alert.
     *
     * @param keysToSend The keys to send to the alert.
     */
    void sendKeys(final String keysToSend);
}

