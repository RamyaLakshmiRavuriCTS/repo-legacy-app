package com.example.servlet;

import java.util.ArrayList;
import java.util.List;

public class RegistrationData {
	public static List<Registration> getDetails(){
		List<Registration> students=new ArrayList<>();
		students.add(new Registration("Ajay","Krishna","ajay@gmail.com","123,Adyar"));
		students.add(new Registration("Vinay","Kumar","vinay@gmail.com","453,Chekpauk"));
		students.add(new Registration("Sahel","Khan","sahel@gmail.com","192,Guindy"));
		return students;
	}

}
