package fr.epita.iam.exceptions;

import fr.epita.iam.datamodel.User;
/**
 * <h3>Description</h3>
 * <p> Exception designed for the data errors
 * </p>
 *
 * @date 07/18
 * @author Maria Anastas
 */
public class UserDataException extends Exception{
	protected final User fault;
	private static final long serialVersionUID = 1L;


	public UserDataException(Exception cause, User fault) {
		initCause(cause);
		this.fault = fault; //error
	}
}
