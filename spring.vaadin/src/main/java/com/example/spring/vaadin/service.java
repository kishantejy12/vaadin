package com.example.spring.vaadin;

import org.springframework.stereotype.Component;

@Component
public class service {

	public static String sayHello(String name){
		return "Hey, " + name;
	}
}
