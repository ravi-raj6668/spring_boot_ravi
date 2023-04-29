package com.example.SpringBoot.controller;

import com.example.SpringBoot.dto.Student;
import com.example.SpringBoot.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

    public final StudentService studentService;

    public StudentController (StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/getStudent")
    public List<Student> getStudent(){
       return studentService.getStudent ();
    }

    @PostMapping("/registerStudent")
    public String registerNewStudent(@RequestBody Student student){
       Student s = studentService.addStudent(student);
       return " Successfully Registered " + student.toString ();
    }

    @DeleteMapping("/deleteStudent/{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long id){
        studentService.deleteStudent(id);
    }

}
