package com.sample.demo;


import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

	public String getHello() {
		return "{\r\n"
				+ "    \"resp\": \"Hello World\"\r\n"
				+ "}";
	}
}
