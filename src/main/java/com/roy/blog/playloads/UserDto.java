package com.roy.blog.playloads;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDto {

	private int userId;

	@Email(message = "Email address is not valid !!")
	@NotBlank(message = "Email cannot be null !!")
	private String email;

	@NotBlank(message = "Password cannot be null !!")
	@Pattern(regexp = "(?=^.{8,}$)(?=.*\\d)(?=.*[!@#$%^&*]+)(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$", message = "Password must be 1 uppercase, 1 lowercase, 1 numeric, 1 special character and size should be greater than or equal to 8")
	private String password;

	@NotBlank(message = "Firstname cannot be null !!")
	private String firstname;

	@NotBlank(message = "Lastname cannot be null !!")
	private String lastname;

	@NotBlank(message = "Phone cannot be null !!")
	private String phone;

	private String about;

	private boolean enabled = true;

}
