package com.luv2code.constant;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountryConstant {

	public static final Map<String, String> COUNTRYMAP = new LinkedHashMap<>() {

		private static final long serialVersionUID = 1L;

		{
			put("BR", "BRAZIL");
			put("FR", "FRANCE");
			put("DE", "GERMANY");
			put("IN", "INDIA");
		}
	};

}
