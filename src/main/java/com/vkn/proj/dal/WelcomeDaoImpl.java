package com.vkn.proj.dal;

import org.springframework.stereotype.Repository;

@Repository
public class WelcomeDaoImpl implements WelcomeDao {

	@Override
	public String getMessage() {
		return "Welcome to Spring MVC WebApp.";
	}

}
