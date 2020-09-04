package org.mindidea.test;

import org.mindidea.test.config.AppConfig;
import org.mindidea.test.service.UserService;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// 初始化 Spring 容器
		AnnotationConfigApplicationContext acct =
				new AnnotationConfigApplicationContext();

		acct.register(AppConfig.class);
		// TODO: 头闭循环依赖
		AbstractAutowireCapableBeanFactory beanFactory = (AbstractAutowireCapableBeanFactory) acct.getBeanFactory();
		beanFactory.setAllowCircularReferences(false);

		acct.refresh();

		UserService indexService = acct.getBean(UserService.class);
		System.out.println(indexService);
	}
}
