package com.webDriver.alert.impl;

import com.webDriver.alert.service.WebAlert;
import org.openqa.selenium.Alert;

/**
 * Provides functionality for interacting with browser alerts, such as dismissing them,
 * accepting them, retrieving their text, and sending keys to them.
 *
 * @version 1.0
 * @author [Navin Jones]
 * @see WebAlert
 */
public final class WebAlertImpl implements WebAlert {

    private final Alert alerts;

    public WebAlertImpl(final Alert alert) {
        this.alerts = alert;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void dismiss() {
        alerts.dismiss();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void accept() {
        alerts.accept();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getText() {
        return alerts.getText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void sendKeys(final String keysToSend) {
        alerts.sendKeys(keysToSend);
    }
}

