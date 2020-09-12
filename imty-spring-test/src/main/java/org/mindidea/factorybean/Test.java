package org.mindidea.factorybean;

import org.mindidea.test.entity.Car;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class Test {

	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("beanFactoryTest.xml");

		ClassPathResource resource = new ClassPathResource("beanFactoryTest.xml");
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
		reader.loadBeanDefinitions(resource);

		Car car2 = (Car) beanFactory.getBean("car2");
		System.out.println(car2);
	}
}
