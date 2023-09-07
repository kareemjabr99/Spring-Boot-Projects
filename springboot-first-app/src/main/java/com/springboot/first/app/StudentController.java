package com.springboot.first.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping("/student")
	public Student getStudent() {
		return new Student("karim", "gabr");
	}
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		List<Student> students = new ArrayList<>();
		students.add(new Student("Ahmed", "Mohsen"));
		students.add(new Student("Amr", "Samy"));
		students.add(new Student("Dana", "Hassan"));
		students.add(new Student("Mr", "A7A"));
		return students;
	}
	
	@GetMapping("/student/{firstname}/{lastname}")
	public Student studentPathVariable(@PathVariable("firstname") String firstName,@PathVariable("lastname") String lastName) {
		return new Student(firstName, lastName);
	}
	
	// build rest API to handle query parameters
	// http://localhost:8080/sudent?firstName=Ramesh&lastname=fadatr
	@GetMapping("/query")
	public Student studentQueryParam(
			@RequestParam(name = "firstName") String firstName,
			@RequestParam(name = "lastName") String lastName) {
		return new Student(firstName, lastName);
	}
	

}
