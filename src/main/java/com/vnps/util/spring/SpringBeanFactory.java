package com.vnps.util.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanFactory {

	private static SpringBeanFactory beanFactory;
	
	private ClassPathXmlApplicationContext applCtx;
	
	private SpringBeanFactory(String beanFileName) {
		// TODO Auto-generated constructor stub
		applCtx = new ClassPathXmlApplicationContext(beanFileName);
	}

	public Object getBean(String beanId) {
		return applCtx.getBean(beanId);
	}
}
