package com.example.demo.student;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Component//or @Service to be more specific
public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "john",
                        "john@gmail.com",
                        LocalDate.of(2000, Month.JANUARY,5),
                        21
                )
        );
    }
}
