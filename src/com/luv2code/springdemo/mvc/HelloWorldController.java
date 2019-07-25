package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {

	// need a controller method to show the initial HTML form
	@RequestMapping(path = "/showForm", method = RequestMethod.GET)
	public String showForm() {
		return "helloword-form";
	}

	// need a controller method to process the HTML form
	@RequestMapping(path = "/processForm", method = RequestMethod.POST)
	public String processForm() {
		return "helloworld";
	}
}
