package com.spring.factory;

import com.spring.service.HelloWorldService;
import com.spring.service.HelloWorldServiceEngImpl;
import com.spring.service.HelloWorldServiceFrenchImpl;
import com.spring.service.HelloWorldServiceGermanImpl;
import com.spring.service.HelloWorldServiceSpanishImpl;

public class HelloWorldFactory {

	public HelloWorldService createHelloWorldService(String language) {
		HelloWorldService helloWorldService = null;

		switch (language) {
		case "en":
			helloWorldService = new HelloWorldServiceEngImpl();
			break;
		case "es":
			helloWorldService = new HelloWorldServiceSpanishImpl();
			break;
		case "fr":
			helloWorldService = new HelloWorldServiceFrenchImpl();
			break;
		case "gr":
			helloWorldService = new HelloWorldServiceGermanImpl();
			break;
		default:
			helloWorldService = new HelloWorldServiceEngImpl();
			break;
		}
		return helloWorldService;
	}
}
