package com.spring.util;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.School;

public class AppMain {

	public static void main(String[] args) {

		// Reading the spring configuration file!
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("spring-staticfactory.xml");

		School s = (School) ac.getBean("oxford");
		System.out.println(s.toString());

		School s1 = (School) ac.getBean("stanford");
		System.out.println(s1.toString());

		ac.close();
	}
}