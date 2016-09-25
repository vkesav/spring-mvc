package com.vkn.proj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vkn.proj.dal.WelcomeDao;
import com.vkn.proj.model.WelcomeMessage;

@Service
public class WelcomeServiceImpl implements WelcomeService {

	@Autowired
	private WelcomeDao welcomeDao;
	
	@Override
	public WelcomeMessage getWelcomeMessage() {
		WelcomeMessage welcomeMessage =new WelcomeMessage();
		String message = welcomeDao.getMessage();
		welcomeMessage.setMessage(message);
		return welcomeMessage;
	}


}
