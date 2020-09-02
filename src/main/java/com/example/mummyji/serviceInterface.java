package com.example.mummyji;

import com.example.mummyji.entity.Student;

import java.util.Collection;

public interface serviceInterface {
    Collection<Student> getAllDetails();
    Student getOneStudentDetail(int studentId);
    String putDetails(Student student);
    String postDetails(Student student);
    String deleteDetails(int studentId);
    
}
