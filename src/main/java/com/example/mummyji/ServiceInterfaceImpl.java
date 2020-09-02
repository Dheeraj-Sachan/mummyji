package com.example.mummyji;

import com.example.mummyji.entity.Student;
import com.example.mummyji.dao.StudentNewDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ServiceInterfaceImpl implements serviceInterface {
    @Autowired
    StudentNewDao studentNewDao;

    @Override
    public Collection<Student> getAllDetails() {
        return studentNewDao.getAllSTudent();
    }

    @Override
    public Student getOneStudentDetail(int studentId) {
        return studentNewDao.getOneStudent(studentId);
    }

    @Override
    public String putDetails(Student student) {
        return studentNewDao.putDetails(student);
    }

    @Override
    public String postDetails(Student student) {
        return studentNewDao.postDetails(student);
    }

    @Override
    public String deleteDetails(int studentId) {
        return studentNewDao.deleteDetails(studentId);
    }
}
