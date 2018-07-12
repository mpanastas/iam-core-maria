package fr.epita.iam.controllers;


import java.util.List;

import fr.epita.iam.datamodel.User;
import fr.epita.iam.exceptions.EntitySearchException;
import fr.epita.iam.exceptions.UserSearchException;
import fr.epita.iam.services.identity.UserDAO;
import fr.epita.iam.views.PopUp;
import fr.epita.iam.utils.logger.Logger;

/**
 * <h3>Description</h3>
 * <p>Validates user and controls log in
 * </p>
 *
 * @date 06/2018
 * @author Maria Anastas
 */
public class LoginController {
	private static final Logger LOGGER = new Logger(LoginController.class);
	private LoginController () {
		
	}

	
	public static boolean authenticate(String username, String password) {
		boolean isValid = false;
		UserDAO userdao = new UserDAO();
		User criteria = new User();
		criteria.setPassword(password);
		criteria.setUsername(username);
		
		try {
			List<User> matchedUsers = userdao.search(criteria);
			if (matchedUsers.size() == 1) {
				isValid = true;
			}
		} 
		catch (EntitySearchException e) {
			LOGGER.error("User not found");
			PopUp.popUpMessage("Error on the authentication process");
		}	catch (UserSearchException e) {
			LOGGER.error("User not found");
			PopUp.popUpMessage("Error on the authentication process");
		} 
		return isValid;
		
	}

}
