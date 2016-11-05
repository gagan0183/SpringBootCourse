package com.spring;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.service.HelloWorldService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:hello-config.xml", "classpath:english-hello-config.xml" })
public class EnglishIntegrationTest {

	@Autowired
	private HelloWorldService helloWorldService;

	@Test
	public void test() {
		String greeting = helloWorldService.greeting();
		Assert.assertEquals("Hello", greeting);
	}

}
