//package com.example.SpringBoot.service;
//
//import com.example.SpringBoot.dao.StudentDao;
//import com.example.SpringBoot.dto.Student;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.LocalDate;
//import java.time.Month;
//import java.util.List;
//
//@Configuration
//public class StudentConfig {
//    @Bean
//    CommandLineRunner commandLineRunner(StudentDao studentDao){
//        return args -> {
//            Student java = new Student (1l,"java", "Java@coding.com", LocalDate.of (2000, Month.JANUARY, 5));
//            Student alex = new Student (2L, "alex", "alex@coding.com", LocalDate.of (2001, Month.JANUARY, 5));
//            Student python = new Student (3L, "python", "python@coding.com", LocalDate.of (2015, Month.JANUARY, 5));
//            Student gpay = new Student (4L, "gpay", "gpay@coding.com", LocalDate.of (2021, Month.JANUARY, 5));
//            Student javascript = new Student (5L, "Javascript", "Jscript@coding.com", LocalDate.of (2007, Month.JANUARY, 5));
//            Student chrome = new Student (6L, "chrome", "chrome@coding.com", LocalDate.of (2006, Month.JANUARY, 5));
//            Student js = new Student (7L, "js", "js@coding.com", LocalDate.of (2003, Month.JANUARY, 5));
//            Student ruby = new Student (8L, "ruby", "ruby@coding.com", LocalDate.of (2002, Month.JANUARY, 5));
//
//            studentDao.saveAll (List.of (java, alex, python,gpay, chrome, js, ruby));
//        };
//    }
//}
