package org.mindidea.factorybean;

import org.mindidea.test.entity.Car;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beanFactoryTest.xml");
		Object car21 = context.getBean("&car2");
		System.out.println(car21);

		ClassPathResource resource = new ClassPathResource("beanFactoryTest.xml");
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
		reader.loadBeanDefinitions(resource);

		// 直接获取 Car 对象
		Car car2 = (Car) beanFactory.getBean("car2");
		System.out.println(car2);

		// bean 的 name 前面加上 & 符号，getBean 得到的是 CarFactoryBean 的对象
		CarFactoryBean bean = (CarFactoryBean) beanFactory.getBean("&car2");
		System.out.println(bean);
	}
}
