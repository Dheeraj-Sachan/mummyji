package com.example.mummyji;

import com.example.mummyji.service.Students;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;

@Repository
public class StudentsDao {
    static private HashMap<Integer, Students> students;

    static {
        students = new HashMap<Integer, Students>() {
            {
                put(1, new Students(1, "Dheeraj", "Java"));
                put(2, new Students(2, "Vivek", "Bank Manager CW"));
                put(3, new Students(3, "Preeti", "Customer Support"));

            }
        };
    }

    public Collection<Students> getAllStudents() {
        System.out.println("I am in DAO Class");
        return this.students.values();
    }

    public Students getSingleStudent(int id) {
        if (true == students.containsKey(id))
            return students.get(id);
        else return new Students();
    }

    public String deleteOne(int id) {
        if (true == students.containsKey(id)) {
            students.remove(id);
            return "Deleted";
        } else
            return "Student Not found";


    }
}
