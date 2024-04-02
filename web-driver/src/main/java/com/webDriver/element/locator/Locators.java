package com.webDriver.element.locator;

/**
 * Represents different types of locators that can be used to identify
 * web elements on a web page.
 *
 * @version 1.0
 * @author [Navin Jones]
 */
public enum Locators {

    /** Locator type: ID attribute */
    ID,

    /** Locator type: Name attribute */
    NAME,

    /** Locator type: Class name attribute */
    CLASS_NAME,

    /** Locator type: Link text */
    LINK_TEXT,

    /** Locator type: Partial link text */
    PARTIAL_LINK_TEXT,

    /** Locator type: CSS selector */
    CSS_SELECTOR,

    /** Locator type: XPath expression */
    XPATH,

    /** Locator type: HTML tag name */
    TAG_NAME
}

