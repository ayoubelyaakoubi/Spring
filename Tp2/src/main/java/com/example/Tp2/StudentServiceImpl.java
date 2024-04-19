package com.example.Tp2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    

    @Override
    public Student createStudent(Student student) {
       return studentRepository.save(student);
    }

    @Override
    public Student findStudentById(Long id) {
       return studentRepository.findById(id).orElse(null);
    }

    @Override
    public List<Student> findAllStudents() {
       return studentRepository.findAll();
    }
    
}
