package com.MartinsO.signUpSignInApp.services;

import com.MartinsO.signUpSignInApp.dtos.request.CreateUserRequest;
import com.MartinsO.signUpSignInApp.dtos.response.CreateUserResponse;
import com.MartinsO.signUpSignInApp.exception.EmailAlreadyExistsException;

public interface UserServices {
	CreateUserResponse createUser (CreateUserRequest request) throws EmailAlreadyExistsException;
}
