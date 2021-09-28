package com.sanjay.utility;

import org.springframework.stereotype.Component;

@Component
public class SanjayUtil {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getUpperCase(String inputStr) {
		String upperCase = null;
		
		upperCase = inputStr.toUpperCase();
		
		return upperCase;
	}

}
