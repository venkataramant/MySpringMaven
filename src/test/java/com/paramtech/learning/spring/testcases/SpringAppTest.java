package com.paramtech.learning.spring.testcases;

import junit.framework.TestCase;

import com.paramtech.learning.spring.interfaces.Guest;
import com.paramtech.learning.spring.main.SpringApp;

public class SpringAppTest extends TestCase {
	public SpringAppTest(String name) {
		super(name);
	}

	public void testBeans() {
		SpringApp springApp = new SpringApp();
		Guest goldenCustomer = springApp.getCustomer("golden");
		assertNotNull(goldenCustomer);
		assertEquals("Raman", goldenCustomer.getName());
	}
}
