package com.demo.student_app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentCtrls {
	
	@Autowired
	private StudentRepo studentRepo;
	
	@RequestMapping("/")
	public String printHello() {
		return "Hello User";
	}
	
	@RequestMapping("/getStudent")
	public List<Student> getStudents(){
		return studentRepo.findAll();
	}
	
	@RequestMapping("/addStudent")
	public void addStudent(){
		Student s1=new Student();
		s1.setAge(24);
		s1.setName("rishav");
		studentRepo.save(s1);
		
		Student s2=new Student();
		s2.setAge(24);
		s2.setName("sonu");
		studentRepo.save(s2);
		
	}
	
}
