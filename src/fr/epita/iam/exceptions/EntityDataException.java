package fr.epita.iam.exceptions;

import fr.epita.iam.datamodel.Identity;

/**
 * <h3>EntityDataException</h3>
 * <p>Parent of the different exception classes
 * </p>
 * 
 * @date 06/2018
 * @author Maria Anastas
 */
public class EntityDataException extends Exception{

	protected final Identity fault;
	private static final long serialVersionUID = 1L;


	public EntityDataException(Exception cause, Identity fault) {
		initCause(cause);
		this.fault = fault; // error
	}
	
}
