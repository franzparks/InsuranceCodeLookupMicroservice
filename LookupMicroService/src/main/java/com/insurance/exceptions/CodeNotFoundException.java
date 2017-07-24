/**
 * 
 */
package com.insurance.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author francisphiri
 *Allow the controller to return a 404 if a code is not found by simply
 * throwing this exception. The @ResponseStatus causes Spring MVC to return a
 * 404 instead of the usual 500.
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class CodeNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public CodeNotFoundException(String codeNumber) {
		super("No such code: " + codeNumber);
	}
	
}
