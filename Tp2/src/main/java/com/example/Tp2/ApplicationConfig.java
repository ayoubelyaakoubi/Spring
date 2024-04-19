package com.example.Tp2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfig {

    @Bean
    public StudentService studentService(StudentRepository studentRepository) {
        return new StudentServiceImpl();
    }

    @Bean
    @Primary  
    public StudentService studentServiceMock() {
        return new StudentServiceMock();
    }
    
}
