package org.mindidea.circle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("beanFactoryTest.xml");
	}
}
