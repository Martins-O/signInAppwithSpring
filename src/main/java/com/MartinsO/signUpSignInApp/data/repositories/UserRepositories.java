package com.MartinsO.signUpSignInApp.data.repositories;

import com.MartinsO.signUpSignInApp.data.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepositories extends MongoRepository<User, String> {

	Optional<User> findByEmail(String email);
}
