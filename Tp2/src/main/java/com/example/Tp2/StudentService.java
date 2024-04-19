
package com.example.Tp2;


import java.util.List;

public interface StudentService {
    Student createStudent(Student student);
    Student findStudentById(Long id);
    List<Student> findAllStudents();
}


