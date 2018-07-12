package fr.epita.iam.exceptions;

import fr.epita.iam.datamodel.User;

/**
 * <h3>Description</h3>
 * <p> Exception designed for the User cases
 * </p>
 *
 * @date 07/18
 * @author Maria Anastas
 */
public class UserCreationException extends UserDataException{
	private static final long serialVersionUID = 1L;


	public UserCreationException(Exception e, User user) {
		super(e, user);
	}

	@Override
	public String getMessage() { 
		return "A problem occurred while creating the Identity : " + fault; //message and error
	}

}
