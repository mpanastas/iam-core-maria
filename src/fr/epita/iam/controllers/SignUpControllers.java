package fr.epita.iam.controllers;


import fr.epita.iam.datamodel.User;
import fr.epita.iam.services.identity.UserDAO;
import fr.epita.iam.datamodel.Identity;
import fr.epita.iam.views.MainFrame;
import fr.epita.iam.views.PopUp;

/**
 * <h3>Description</h3>
 * <p> The class controls the Sign In process for the user through the creation of
 *  the password and user
 * </p>
 *	@date 06/2018
 * @author Maria Anastas
 */
public class SignUpControllers {

	private SignUpControllers () {
		
	}
	
	/**
	 * @param username
	 * @param password
	 * @param uid
	 * @param displayName
	 * @param passConf
	 * @param email
	 */
	public static void onCreateUserBtnClick(String username, String password, String uid, String displayName,
			String passConfig, String email) {
		
		if(!password.equals(passConfig)) {
			PopUp.popUpMessage("The password and the confirm password fields have different values");
		}
		else {
			try {
				UserDAO userdao = new UserDAO();
				User user = new User();
				Identity userIdentity = new Identity();
				userIdentity.setDisplayName(displayName);
				userIdentity.setEmail(email);
				userIdentity.setUid(uid);
				user.setIdentity(userIdentity);
				user.setUsername(username);
				user.setPassword(password);
				
				
				userdao.create(user);
				
				MainFrame.getMainFrame().setViewTo(MainFrame.LOGIN_VIEW);
		
				PopUp.popUpMessage("User created"); //user creation is successful
			} catch (Exception e) {
				PopUp.popUpMessage("There was an error creating the User, try again");
			}
		}
		
	}
	
}
