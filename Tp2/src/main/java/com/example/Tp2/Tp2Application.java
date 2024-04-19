package com.example.Tp2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Tp2Application {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(Tp2Application.class, args);
        
        
        StudentService studentService = context.getBean(StudentService.class);

       
        studentService.createStudent(new Student((long) 1, "ayoubelyaakoubi", "ayoubelyaakoubi222@gmail.com"));
        Student student = studentService.findStudentById((long) 1);
        System.out.println("Found student: " + student.getName());
        
        System.out.println("All students:");
        for (Student s : studentService.findAllStudents()) {
            System.out.println(s);
        }
	}

}
