package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String[] coursePrefixes;

	@Override
	public void initialize(CourseCode theCourseCode) {
		this.coursePrefixes = theCourseCode.value();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		boolean result = false;

		if (theCode != null) {

			// loop thru course prefixes

			// check to see if code matches any of the course prefixed
			for (String tempPrefix : coursePrefixes) {
				result = theCode.startsWith(tempPrefix);

				if (result) {
					break;
				}
			}

		} else {
			result = true;
		}

		return result;
	}

}
