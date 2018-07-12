package fr.epita.iam.exceptions;

import fr.epita.iam.datamodel.User;
/**
 * <h3>UserDeletionException</h3>
 * <p> Exception designed for the User Deletion case
 * </p>
 *
 * @date 07/18
 * @author Maria Anastas
 */

public class UserDeletionException extends UserDataException{

	public UserDeletionException(Exception cause, User fault) {
		super(cause, fault);
	}

	private static final long serialVersionUID = 1L;


	@Override
	public String getMessage() {
		return "could not delete user, error: " + fault; //error and message
	}
	
}
