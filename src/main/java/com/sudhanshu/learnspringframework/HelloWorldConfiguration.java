package com.sudhanshu.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name , int age) {};
@Configuration
public class HelloWorldConfiguration {
	@Bean
	public Person person() {
		return new Person("Sudhanshu" , 21);
	}

}
