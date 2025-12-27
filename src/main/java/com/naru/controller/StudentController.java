package com.naru.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naru.entity.Student;
import com.naru.service.StudentService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/students")
@AllArgsConstructor
public class StudentController {
	
	private final StudentService service;

	@PostMapping
	public Student saveStudent(@RequestBody Student student) {
		return service.saveStudent(student);
	}
	
	@GetMapping
	public List<Student> getAllStudents(){
		return service.getAllStudents();
	}
	
	@PutMapping("/{id}")
	public Student updateStudent(@PathVariable Long id, @RequestBody Student student){
		return service.updateStudent(id, student);
	}
	
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable Long id) {
		service.deleteStudent(id);
		return "Student deleted successfully";
	}
	
}
