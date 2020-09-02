package com.example.mummyji.controller;

import com.example.mummyji.ServiceInterfaceImpl;
import com.example.mummyji.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping
public class StudentController {
    @Autowired
    ServiceInterfaceImpl serviceInterfaceImpl;

    @GetMapping("/getAllSudentsDetails")
    public Collection<Student> getAllStudent() {
        return serviceInterfaceImpl.getAllDetails();
    }

    @GetMapping(value = "/getOneSTudentDetail/{id}")
    public Student getOneStudent(@PathVariable("id") int id) {
        return serviceInterfaceImpl.getOneStudentDetail(id);

    }

    @PutMapping(value = "/put",consumes = MediaType.APPLICATION_JSON_VALUE)
    public String putSudentDetails(@RequestBody Student student) {
        return serviceInterfaceImpl.putDetails(student);

    }

    @PostMapping(value = "/post")
    public String postSudentDetails(@RequestBody Student student) {
        return serviceInterfaceImpl.postDetails(student);

    }

    @DeleteMapping("/delete/{number}")
    public String deleteStudentDetail(@PathVariable("number") int number) {
        return serviceInterfaceImpl.deleteDetails(number);

    }
}
