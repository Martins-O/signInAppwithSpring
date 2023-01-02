package com.MartinsO.signUpSignInApp.data.model;

import lombok.*;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class User {
	@NonNull
	private String firstName;
	@NonNull
	private String lastName;
	@NonNull
	private String email;
	@NonNull
	@Id
	private String id;
	@NonNull
	private String password;
	private String phoneNumber;
}
