package com.rupamshaw.studentsystem.service;

import java.util.List;

import com.rupamshaw.studentsystem.model.Student;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
