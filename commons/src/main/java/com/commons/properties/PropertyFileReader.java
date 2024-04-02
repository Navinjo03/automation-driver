package com.commons.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *<p>
 * Reads properties from a file.
 * <p>
 *
 * Author: [Navin Jones]
 * Version: 1.0
 */

public final class PropertyFileReader {

    private static final String currentDirectory = System.getProperty("user.dir");
    private static final String path = currentDirectory + "\\src\\main\\resources";
    private static final Properties properties = new Properties();

    private static PropertyFileReader propertyFileReader;

    private PropertyFileReader() {
    }

    /**
     * Gets the singleton instance of PropertyFileReader.
     *
     * @return The singleton instance of PropertyFileReader.
     */
    public static PropertyFileReader getInstance() {

        if (propertyFileReader == null) {
            propertyFileReader = new PropertyFileReader();
        }

        return propertyFileReader;
    }

    /**
     * Loads properties from the config.properties file.
     *
     * @return The Properties object containing the loaded properties.
     */
    public Properties getProperty() {
        final File file = new File(path, "config.properties");
        final String filePath = file.getAbsolutePath();

        try (final FileInputStream fileInputStream = new FileInputStream(filePath)) {
            properties.load(fileInputStream);

            return properties;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}

