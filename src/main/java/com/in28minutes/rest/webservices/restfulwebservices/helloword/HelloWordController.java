package com.in28minutes.rest.webservices.restfulwebservices.helloword;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//REST API
@RestController
public class HelloWordController {
	
	//hello world
//	@RequestMapping(method=RequestMethod.GET,path="/hello_word")
	@GetMapping("/hello_word")
	public String helloword() {
		return "Hello_World_Congratulation_First_Programm_Succesfully_Run_GETMapping";
	}
	
	
	@GetMapping("/hello_word_bean")
	public Hellowordbean hellowordbean() {
		return new Hellowordbean("hello_word_bean");
	}

}
