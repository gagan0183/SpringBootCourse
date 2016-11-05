package com.spring.controller;

import com.spring.service.HelloWorldService;

public class GreetingController {

	private HelloWorldService helloWorldService;

	private HelloWorldService helloWorldServiceGerman;

	private HelloWorldService helloWorldServiceFrench;

	public void setHelloWorldService(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}

	public String sayHello() {
		String greeting = helloWorldService.greeting();
		System.out.println(greeting);
		System.out.println(helloWorldServiceGerman.greeting());
		System.out.println(helloWorldServiceFrench.greeting());
		return greeting;
	}

	public void setHelloWorldServiceGerman(HelloWorldService helloWorldServiceGerman) {
		this.helloWorldServiceGerman = helloWorldServiceGerman;
	}

	public void setHelloWorldServiceFrench(HelloWorldService helloWorldServiceFrench) {
		this.helloWorldServiceFrench = helloWorldServiceFrench;
	}
}
