package fr.epita.iam.exceptions;

import fr.epita.iam.datamodel.Identity;

/**
 * <h3>EntitySearchException</h3>
 * <p>Exception created for errors on the search of an identity</p>
 * 
 * @date 07/2018
 * @author Maria Anastas
 *
 */

public class EntitySearchException extends EntityDataException {

	public EntitySearchException(Exception cause, Identity fault) {
		super(cause, fault);
	}


	private static final long serialVersionUID = 1L;


	@Override
	public String getMessage() {
		return "Identities not found, an error occurred : " + fault; //message and error
	}
	
}
