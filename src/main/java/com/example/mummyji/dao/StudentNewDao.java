package com.example.mummyji.dao;

import com.example.mummyji.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentNewDao {
    private static Map<Integer, Student> list;

    static {
        list = new HashMap() {
            {
                put(1, new Student(1, "Dheeraj Sachan", "Java"));
                put(2, new Student(2, "Vivek Sachan", "CW"));

                put(3, new Student(3, "Anjana Sachan", "YouTube"));

                put(4, new Student(4, "Ashok Kumar", "Military"));


            }

        };


    }

    public Collection<Student> getAllSTudent() {

        return this.list.values();
    }

    public Student getOneStudent(int studentID) {
        if (true == list.containsKey(studentID))
            return list.get(studentID);
        else return new Student();
    }

    public String putDetails(Student student) {
        Student s = list.get(student.getStudentCourse());
        //  s.setStudentName(student.getStudentName());
        list.put(student.getStudentId(), student);

        return "It has been inserted";
    }

    public String postDetails(Student student) {
        list.put(student.getStudentId(), student);
        return "It has been inserted";
    }

    public String deleteDetails(int id) {
        list.remove(id);
        return "The ID with " + id + " has been deleted";

    }
}
