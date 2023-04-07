package com.klinnovations.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	public List<String> getCourses(){
		return Arrays.asList("Java", "Python", "Devops", "Angular");
	}

}
