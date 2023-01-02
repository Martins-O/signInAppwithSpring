package com.MartinsO.signUpSignInApp.exception;

import com.MartinsO.signUpSignInApp.SignUpSignInAppApplication;

public class EmailAlreadyExistsException extends SignUpSignInAppApplicationException {
	public EmailAlreadyExistsException(String message) {
		super(message);
	}
}
