package org.mindidea.test;

import org.mindidea.test.config.AppConfig;
import org.mindidea.test.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

	}

	private void test1() {
		// 初始化 Spring 容器
		AnnotationConfigApplicationContext acct = new AnnotationConfigApplicationContext(AppConfig.class);

//		acct.register(AppConfig.class);
//		AbstractAutowireCapableBeanFactory beanFactory = (AbstractAutowireCapableBeanFactory) acct.getBeanFactory();
		// TYTODO: 头闭循环依赖
//		beanFactory.setAllowCircularReferences(false);
//		acct.refresh();

//		acct.getBean("indexService");
		UserService indexService = (UserService) acct.getBean("userService");
		System.out.println(indexService);

		/* ************************************************************************************************************/
//		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactory.xml"));
//		UserService userService = (UserService) bf.getBean("userService");

	}

	private void test2() {

	}
}
