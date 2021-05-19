package org.mindidea.demo01;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		// 使用 BeanDefinition 创建一个 Bean 的定义
		AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
		// 为 Bean 定义设置属性
		beanDefinition.setBeanClass(User.class);

		// 将 bean 定义注册到 context
		applicationContext.registerBeanDefinition("user", beanDefinition);


		applicationContext.refresh();
		User user = applicationContext.getBean("user", User.class);
		System.out.println(user);

	}
}
