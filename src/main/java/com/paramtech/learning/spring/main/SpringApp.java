package com.paramtech.learning.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.paramtech.learning.spring.interfaces.Guest;

public class SpringApp {
	public static void main(String[] args) {
		new SpringApp().getCustomer("golden");
	}

	public Guest getCustomer(String type) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"my-spring-beans.xml");
		Guest guest = (Guest) context.getBean("goldenGuest");
		System.out.println(guest.getName());
		return guest;
	}
}
