package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(new Student(1L, "Dajakmpm", "adannanthony@gmail.com", LocalDate.of(1997, 12, 30), 26));
    }
}
