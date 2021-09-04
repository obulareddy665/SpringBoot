package com.createiq;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {
	@RequestMapping("/hello")
	public String hello() {
		return "helloworld";
	}
	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome";
	}

	public void map(){
}
}
