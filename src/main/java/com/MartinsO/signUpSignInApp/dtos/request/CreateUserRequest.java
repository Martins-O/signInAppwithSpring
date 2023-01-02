package com.MartinsO.signUpSignInApp.dtos.request;

import lombok.Getter;

@Getter
public class CreateUserRequest {
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String phoneNumber;
}
