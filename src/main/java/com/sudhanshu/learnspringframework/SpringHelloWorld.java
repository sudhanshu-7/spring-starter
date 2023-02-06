package com.sudhanshu.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringHelloWorld {
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		System.out.println(context.getBean("person"));
	}
}
