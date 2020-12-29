package com.example.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.HelloService;

@RestController
public class HelloController {

	@Autowired HelloService helloService ;
	
	@GetMapping("/hello/{data}")
	public String hello(@PathVariable String data) {
		return helloService.helloService(data) ;
	}
	
}
