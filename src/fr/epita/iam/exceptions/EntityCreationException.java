package fr.epita.iam.exceptions;

import fr.epita.iam.datamodel.Identity;
/**
 * <h3>EntityCreationException</h3>
 * <p>Exception created for errors on the creation of an identity</p>
 *
 *
 * @date 06/2018
 * @author Maria Anastas
 *
 * ${tags}
 */
public class EntityCreationException extends EntityDataException{
	private static final long serialVersionUID = 1L;

	public EntityCreationException(Exception e, Identity identity) {
		super(e, identity);
	}

	@Override
	public String getMessage() { 
		return "A problem occurred while creating the Identity : " + fault; //message and error
	}
}
