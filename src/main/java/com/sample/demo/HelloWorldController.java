package com.sample.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/v1/helloworld")
public class HelloWorldController {

	public HelloWorldService helloService;
	
	@Autowired
	public HelloWorldController(HelloWorldService helloService) {
		super();
		this.helloService = helloService;
	}
	
	@GetMapping(produces="application/json")
	public String getStudent() {
		return helloService.getHello();
	}
}
