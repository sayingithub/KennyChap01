package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class KennyController {

	@RequestMapping("/message")
	public String getMessage(){
		return "hello"; // returning to hello.html page
	}
	
}
