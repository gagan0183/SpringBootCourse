package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.spring.controller.GreetingController;

@SpringBootApplication
@ImportResource("classpath:spring-config.xml")
public class SpringBootCourseApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootCourseApplication.class, args);
		GreetingController controller = (GreetingController) context.getBean("greetingController");
		controller.sayHello();
	}
}
