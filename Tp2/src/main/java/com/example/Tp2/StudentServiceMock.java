package com.example.Tp2;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceMock implements StudentService  {

     private List<Student> students = new ArrayList<>();

    @Override
    public Student createStudent(Student student) {
        student.setId((long) (students.size() + 1));
        students.add(student);
        return student;
    }

    @Override
    public Student findStudentById(Long id) {
        return students.stream().filter(student -> student.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public List<Student> findAllStudents() {
        return new ArrayList<>(students);
    }
    
}
