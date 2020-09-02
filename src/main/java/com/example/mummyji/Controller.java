package com.example.mummyji;

import com.example.mummyji.service.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RequestMapping
public class Controller {
    @Autowired
    StudentsDao studentsDao;

    @GetMapping("/getnow")
    public Collection<Students> d() {
        return studentsDao.getAllStudents();
    }

    @GetMapping(value="/{id}")
    public Students getOne(@PathVariable("id") int id) {
        System.out.println("I am in getone");
        return studentsDao.getSingleStudent(id);
    }
    @DeleteMapping(value="/delete/{id}")
    public String deleteOne(@PathVariable("id") int id) {
        System.out.println("I am in delete");
        return studentsDao.deleteOne(id);
    }
}
