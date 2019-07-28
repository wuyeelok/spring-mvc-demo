package com.luv2code.springdemo.mvc;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/student")
public class StudentController {

	private final Map<String, String> countryOptions;
	private final Map<String, String> favourLangOptions;
	private final Map<String, String> osOptions;

	public StudentController(@Value("#{countryOptions}") Map<String, String> countryOptions,
			@Value("#{favourLangOptions}") Map<String, String> favourLangOptions,
			@Value("#{osOptions}") Map<String, String> osOptions) {

		// Sort properties map by value & assign to attribute
		this.countryOptions = countryOptions.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		this.favourLangOptions = favourLangOptions.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		this.osOptions = osOptions.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
	}

	@RequestMapping(path = "/showForm", method = RequestMethod.GET)
	public String showForm(Model theModel) {

		// create a student object
		Student theStudent = new Student();

		// add student object to the model
		theModel.addAttribute("student", theStudent);

		theModel.addAttribute("countryOptions", this.countryOptions);

		theModel.addAttribute("favourLangOptions", this.favourLangOptions);

		theModel.addAttribute("osOptions", this.osOptions);

		return "student-form";
	}

	@RequestMapping(path = "/processForm", method = RequestMethod.POST)
	public String processForm(@ModelAttribute Student student, Model theModel) {

		// log the input data
		System.out.println("theStudent: " + student.getFirstName() + " " + student.getLastName() + " "
				+ student.getCountry() + " " + student.getFavouriteLanguage()
				+ (student.getOperatingSystems() != null && student.getOperatingSystems().length > 0
						? " " + Arrays.asList(student.getOperatingSystems()).toString()
						: ""));

		theModel.addAttribute("countryOptions", this.countryOptions);

		theModel.addAttribute("favourLangOptions", this.favourLangOptions);

		theModel.addAttribute("osOptions", this.osOptions);

		return "student-confirmation";
	}
}
