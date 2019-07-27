package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SillyController {

	@RequestMapping(path = "/showForm", method = RequestMethod.GET)
	public String displaytheForm() {
		return "silly";
	}
}
