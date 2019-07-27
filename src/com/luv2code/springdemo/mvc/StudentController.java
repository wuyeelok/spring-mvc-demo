package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.luv2code.constant.CountryConstant;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping(path = "/showForm", method = RequestMethod.GET)
	public String showForm(Model theModel) {

		// create a student object
		Student theStudent = new Student();

		// add student object to the model
		theModel.addAttribute("student", theStudent);

		theModel.addAttribute("countryOptions", CountryConstant.COUNTRYMAP);

		return "student-form";
	}

	@RequestMapping(path = "/processForm", method = RequestMethod.POST)
	public String processForm(@ModelAttribute Student student, Model theModel) {

		// log the input data
		System.out.println(
				"theStudent: " + student.getFirstName() + " " + student.getLastName() + " " + student.getCountry());

		theModel.addAttribute("countryOptions", CountryConstant.COUNTRYMAP);

		return "student-confirmation";
	}
}
