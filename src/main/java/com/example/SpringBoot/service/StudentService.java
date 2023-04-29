package com.example.SpringBoot.service;

import com.example.SpringBoot.dao.StudentDao;
import com.example.SpringBoot.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("studentService")
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public StudentService (StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public StudentService () {
    }

    public List<Student> getStudent(){
        return studentDao.findAll ();
    }

    public Student addStudent (Student student) {
        studentDao.save (student);
        return student;
    }

    public String deleteStudent (Long id) throws NullPointerException {
        String message1 = "Student delete successfully with id : ";
        String message2 = "Student not present with id : ";
        boolean idExists = studentDao.existsById (id);
        if(idExists) {
            studentDao.deleteById (id);
            return message1 + id;
        }else {
            return message2 + id;
        }
    }
}
