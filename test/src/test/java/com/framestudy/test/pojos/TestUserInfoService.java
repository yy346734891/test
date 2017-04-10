package com.framestudy.test.pojos;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.framestudy.springContainer.beans.UserInfo;
import com.framestudy.springContainer.service.IUserInfoService;

public class TestUserInfoService {

	private ApplicationContext ac;
	
	private IUserInfoService userService;
	
	@Before
	public void before(){
		ac = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
		userService = (IUserInfoService) ac.getBean("userInfoServiceImpl");
	}
	
	@Test
	public void testSaveUserInfo(){
		UserInfo user = new UserInfo(null, "小黄", 8);
		try {
			userService.saveUserInfo(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
}
