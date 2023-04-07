package com.klinnovations.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.klinnovations.binding.Student;
import com.klinnovations.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService service;

	@GetMapping("/")
	public String loadIndexPage(Model model) {
		
		Student sobj = new Student();
		model.addAttribute("student", sobj);
		//sobj.setName("Laxman");
		
		model.addAttribute("courses", service.getCourses());
		return "index";
		
	}
	
	@PostMapping("/save")
	public String handleSubmitBtn(Student s , Model model) {
		
		System.out.println(s);
		model.addAttribute("msg", "Data Saved SuccessFully....");
		return "index";
}
}






