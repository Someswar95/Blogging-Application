package com.roy.blog;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.roy.blog.config.AppConstants;
import com.roy.blog.models.Role;
import com.roy.blog.playloads.RoleRepo;

@SpringBootApplication
public class BlogApiApplication implements CommandLineRunner {

	@Autowired
	private RoleRepo roleRepo;

	public static void main(String[] args) {
		SpringApplication.run(BlogApiApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	@Override
	public void run(String... args) throws Exception {

		// set role for user as runtime
		try {

			Role role1 = new Role();
			role1.setRoleId(AppConstants.ROLE_ADMIN);
			role1.setRoleName("ROLE_ADMIN");

			Role role2 = new Role();
			role2.setRoleId(AppConstants.ROLE_NORMAL);
			role2.setRoleName("ROLE_NORMAL");

			List<Role> roles = List.of(role1, role2);
			List<Role> result = this.roleRepo.saveAll(roles);
			result.forEach(r -> {
				System.out.println(r.getRoleName());
			});

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
