package fr.epita.utils.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import fr.epita.iam.utils.logger.Logger;

/**
 * <h3>Description</h3>
 * <p>Used to get the configuration file for avoid hard-coding it inside the project.</p>
 *
 * @author 
 */
public class Services {

	private Properties properties;

	private static Services instance;
	private static final Logger LOGGER = new Logger(Services.class);

	/**
	 * @param filePathToConfiguration
	 */
	private Services(String filePathToConfiguration) {
		try {
			properties = new Properties();
			properties.load(new FileInputStream(new File(filePathToConfiguration)));
		} catch (final IOException e) {
			LOGGER.error("There was an IOException while loading the configuration File");
		}
	}

	/**
	 * @return instance
	 */
	public static Services getInstance() {
		if (instance == null) {
			instance = new Services(System.getProperty("conf"));
		}
		return instance;
	}

	/**
	 * @param propertyKey
	 * @return String configValue
	 */
	public String getConfigurationValue(String propertyKey) {
		return properties.getProperty(propertyKey);
	}
}

