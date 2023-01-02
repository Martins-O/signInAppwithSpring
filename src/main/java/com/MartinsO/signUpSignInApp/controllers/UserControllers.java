package com.MartinsO.signUpSignInApp.controllers;

import com.MartinsO.signUpSignInApp.dtos.request.CreateUserRequest;
import com.MartinsO.signUpSignInApp.dtos.response.CreateUserResponse;
import com.MartinsO.signUpSignInApp.exception.EmailAlreadyExistsException;
import com.MartinsO.signUpSignInApp.services.UserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("user/")
 public class UserControllers {


	private final UserServices userServices;

	@PostMapping("register/")
	public ResponseEntity<?> register (@RequestBody CreateUserRequest request){
		try {
			CreateUserResponse response = userServices.createUser(request);
			return new ResponseEntity<>(response, HttpStatus.CREATED);
		}
		catch (EmailAlreadyExistsException ex){
			return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
		}

	}
}
