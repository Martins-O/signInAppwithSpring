package com.MartinsO.signUpSignInApp.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreateUserResponse {
	private String message;
	private String email;
}
