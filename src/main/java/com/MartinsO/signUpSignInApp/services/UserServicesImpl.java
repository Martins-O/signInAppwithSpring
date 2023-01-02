package com.MartinsO.signUpSignInApp.services;

import com.MartinsO.signUpSignInApp.data.model.User;
import com.MartinsO.signUpSignInApp.data.repositories.UserRepositories;
import com.MartinsO.signUpSignInApp.dtos.request.CreateUserRequest;
import com.MartinsO.signUpSignInApp.dtos.response.CreateUserResponse;
import com.MartinsO.signUpSignInApp.exception.EmailAlreadyExistsException;
import com.MartinsO.signUpSignInApp.util.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServicesImpl implements UserServices{

	@Autowired
	private UserRepositories userRepositories;
	private final ModelMapper modelMapper = new ModelMapper();

	@Override
	public CreateUserResponse createUser(CreateUserRequest request) throws EmailAlreadyExistsException {
		Optional<User> existingUser = userRepositories.findByEmail(request.getEmail());
		if(existingUser.isPresent()) {
			throw new EmailAlreadyExistsException("This email is already exists by another user");
		}

		User user = modelMapper.mapUser(request);
		User savedUser = userRepositories.save(user);

		return new CreateUserResponse("Register successful",savedUser.getEmail());
	}
}
