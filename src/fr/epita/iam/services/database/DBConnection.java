package fr.epita.iam.services.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import fr.epita.utils.services.Services;
import fr.epita.iam.utils.logger.Logger;

/**
 * <h3>DBConnection</h3>
 * <p>The DBConnection class connects the application with the Database</p>
 *
 * @date 6/18
 * @author Maria Anastas
 */
public class DBConnection {

	private static final Logger LOGGER = new Logger(DBConnection.class);
	
	private static final String DB_HOST = "db.host";
	private static final String DB_PWD = "db.pwd";
	private static final String DB_USER = "db.user";
	
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {

		LOGGER.trace("Getting a DB connection");
		final Services confService = Services.getInstance();

		final String url = confService.getConfigurationValue(DB_HOST);
		final String password = confService.getConfigurationValue(DB_PWD);
		final String username = confService.getConfigurationValue(DB_USER);

		Class.forName("org.apache.derby.jdbc.ClientDriver");

		return DriverManager.getConnection(url, username, password);
	}
	
}
