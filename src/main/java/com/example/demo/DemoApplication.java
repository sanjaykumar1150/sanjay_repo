package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.sanjay.utility.SanjayUtil;

@SpringBootApplication
@ComponentScan(basePackages = {"com.sanjay.utility"})
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		
		SanjayUtil util = ctx.getBean(SanjayUtil.class);
		System.out.println("Hello");
		String upperCase = util.getUpperCase("sanjay");
		System.out.println(upperCase);
	}

}
