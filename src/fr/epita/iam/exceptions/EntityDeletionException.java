/**
 * 
 */
package fr.epita.iam.exceptions;

import fr.epita.iam.datamodel.Identity;

/**
 * <h3>EntityDeletionException</h3>
 * <p>Exception created for errors on the creation of an identity</p>
 * 
 * @date 06/2018
 * @author Maria Anastas
 *
 */
public class EntityDeletionException extends EntityDataException {
	public EntityDeletionException(Exception cause, Identity fault) {
		super(cause, fault);
	}


	private static final long serialVersionUID = 1L;


	@Override
	public String getMessage() {
		return "a problem occured while deleting the identity : " + fault; //message and error
	}
}
