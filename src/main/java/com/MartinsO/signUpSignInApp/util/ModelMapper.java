package com.MartinsO.signUpSignInApp.util;

import com.MartinsO.signUpSignInApp.data.model.User;
import com.MartinsO.signUpSignInApp.dtos.request.CreateUserRequest;

public class ModelMapper {
	public User mapUser(CreateUserRequest request ){
		User user = new User();
		user.setEmail(request.getEmail());
		user.setFirstName(request.getFirstName());
		user.setLastName(request.getLastName());
		user.setPhoneNumber(request.getPhoneNumber());
		user.setPassword(request.getPassword());
		return user;
	}
}
