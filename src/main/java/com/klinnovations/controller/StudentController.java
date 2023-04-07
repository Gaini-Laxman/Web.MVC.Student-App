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

		//Student sobj = new Student();
		
		init(model);
		
		//model.addAttribute("student", sobj);
		// sobj.setName("Laxman");
		// List<String> courseList = service.getCourses();
		//model.addAttribute("courses", service.getCourses());
		
		return "index";

	}

	private void init(Model model) {
		model.addAttribute("student", new Student());
		model.addAttribute("courses", service.getCourses());
		model.addAttribute("prefTimings", service.getTimings());
	}

	@PostMapping("/save")
	public String handleSubmitBtn(Student s, Model model) {
		
		boolean isSaved = service.saveStudent(s);
		
		if(isSaved) {
		
		//System.out.println(s);
		//service.saveStudent(s);
		model.addAttribute("msg", "Data Saved SuccessFully....");
		}
		
		init(model);

		return "index";
	}
}
