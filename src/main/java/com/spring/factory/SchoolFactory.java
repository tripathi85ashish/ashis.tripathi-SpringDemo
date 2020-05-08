package com.spring.factory;

import com.spring.model.School;

public class SchoolFactory {

	public static School getSchool(String loc) {

		School school = null;

		if(loc.equalsIgnoreCase("Vikaspuri")) {

			school = new School();
			school.setId(1001);
			school.setName("Oxford Senior Seconday School");
			school.setLocation(loc);

		} else if (loc.equalsIgnoreCase("Janakpuri")) {

			school = new School();
			school.setId(1002);
			school.setName("Stanford Public School");
			school.setLocation(loc);
			
		} else {
			
			throw new IllegalArgumentException("Unknown school");
		}

		return school;
	}
}