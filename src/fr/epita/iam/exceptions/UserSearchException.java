package fr.epita.iam.exceptions;

import fr.epita.iam.datamodel.User;
/**
 * <h3>UserSearchException</h3>
 * <p> Exception for the search user case
 * </p>
 *
 * @date 07/18
 * @author Maria Anastas
 */
public class UserSearchException extends UserDataException {
	public UserSearchException(Exception cause, User fault) {
		super(cause, fault);
	}

	private static final long serialVersionUID = 1L;


	@Override
	public String getMessage() {
		return "user not found, error : " + fault; //error and message
	}

}
