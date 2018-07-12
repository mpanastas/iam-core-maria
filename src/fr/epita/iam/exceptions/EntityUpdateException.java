package fr.epita.iam.exceptions;

import fr.epita.iam.datamodel.Identity;

/**
 * <h3>EntityUpdateException</h3>
 * <p>Exception created for errors on the updates of an identity</p>
 * 
 * @date 06/2018
 * @author Maria Anastas
 *
 */

public class EntityUpdateException extends EntityDataException{
	private static final long serialVersionUID = 1L;

	public EntityUpdateException(Exception e, Identity identity) {
		super(e, identity);
	}

	@Override
	public String getMessage() { 
		return "Couldn't update the Identity, error,  : " + fault; //message and error
	}

}
