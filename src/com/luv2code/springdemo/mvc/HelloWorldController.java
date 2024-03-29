package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	// need a controller method to show the initial HTML form
	@RequestMapping(path = "/showForm", method = RequestMethod.GET)
	public String showForm() {
		return "helloworld-form";
	}

	// need a controller method to process the HTML form
	@RequestMapping(path = "/processForm", method = RequestMethod.POST)
	public String processForm() {
		return "helloworld";
	}

	// new a controller method to read form data and
	// add data to the model
	@RequestMapping(path = "/processFormVersionTwo", method = RequestMethod.POST)
	public String letsShoutDude(@RequestParam String studentName, Model model) {

		// convert the data to all caps
		studentName = studentName.toUpperCase();

		// create the message
		String result = "Yo! " + studentName;

		// add message to the model
		model.addAttribute("message", result);

		return "helloworld";
	}

	@RequestMapping(path = "/processFormVersionThree", method = RequestMethod.POST)
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
		// convert the data to all caps
		theName = theName.toUpperCase();

		// create the message
		String result = "Hey My Friend from v3! " + theName;

		// add message to the model
		model.addAttribute("message", result);

		return "helloworld";
	}
}
