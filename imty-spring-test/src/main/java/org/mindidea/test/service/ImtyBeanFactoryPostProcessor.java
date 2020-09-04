package org.mindidea.test.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * 对 Spring Bean 进行扩展增强
 */
@Component
public class ImtyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// 此处使用子类接收，因为子类中功能更强，而且 setBeanClass 只在子类中存在
		// 将 BeanDefinition 中关于 IndexService 替换成 UserService 类型
		GenericBeanDefinition indexService =
				(GenericBeanDefinition) beanFactory.getBeanDefinition("indexService");
		indexService.setBeanClass(UserService.class);
	}
}
