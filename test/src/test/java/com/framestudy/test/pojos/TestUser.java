package com.framestudy.test.pojos;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.framestudy.springContainer.pojos.User;

public class TestUser {

	
	ApplicationContext  ac = null;
	
	@Before
	public void before(){
		
		//常见的spring容器有:
		//org.springframework.context.support.ClassPathXmlApplicationContext
		//org.springframework.context.support.FileSystemXmlApplicationContext
		//org.springframework.context.support.AbstractXmlApplicationContext
		//org.springframework.context.annotation.AnnotationConfigApplicationContext
		ac = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
	}
	
	@Test
	public void testGetUser(){
		User user = (User) ac.getBean("user");
		
		User user2 = (User) ac.getBean("user");
		
		
		System.out.println(user);
		System.out.println(user2);
	}
	
	
	
	
}
