package org.mindidea.circle.setter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("beanFactoryTest.xml");
	}
}
