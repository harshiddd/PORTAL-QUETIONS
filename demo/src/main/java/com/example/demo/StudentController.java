package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping("/")
	public String homepage() {
		return "Welcome to student list";
	}
	
	@GetMapping("/list")
	public List<Student> getLIst(){
		List<Student> detailsList=new ArrayList<>();
		detailsList.add(new Student(1,"XXXX",23));
		detailsList.add(new Student(2,"YYYY",3));
		detailsList.add(new Student(3,"ZZZZ",25));
		return detailsList;
	}
}
