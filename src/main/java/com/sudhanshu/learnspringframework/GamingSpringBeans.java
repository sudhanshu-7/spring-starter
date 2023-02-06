package com.sudhanshu.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sudhanshu.learnspringframework.game.GameRunner;
import com.sudhanshu.learnspringframework.game.GamingConsole;

@Configuration
@ComponentScan("com.sudhanshu.learnspringframework.game")
public class GamingSpringBeans {

	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(GamingSpringBeans.class)){
			context.getBean(GamingConsole.class);
			context.getBean(GameRunner.class).run();
		}
	}

}
