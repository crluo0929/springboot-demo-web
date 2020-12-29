package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

	public String helloService(String data) {
		if(data.matches("\\d+")) return data +" is Number!" ;
		return data + " is Text" ;
	}
	
}
