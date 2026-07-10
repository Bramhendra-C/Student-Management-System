package com.studentmanagement.StudentManagementSystem.controller;

import com.studentmanagement.StudentManagementSystem.model.Student;
import com.studentmanagement.StudentManagementSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@CrossOrigin(origins = "*")
public class StudentController {

    @Autowired
    StudentService service;

    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return service.addStudent(student);
    }

    @PostMapping("/studentsadd")
    public List<Student> addAllStudents(@RequestBody List<Student> studentList){
        return service.addAllStudents(studentList);
    }

    @GetMapping("/{id}")
    public Student getById(@PathVariable long id){
        return service.getById(id);
    }

    @GetMapping
    public List<Student> getAllStudents(){
        return service.getAllStudents();
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable long id , @RequestBody Student student){
        return service.updateById(id , student);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable long id){
        service.deleteById(id);
        return "Deleted";
    }

    @DeleteMapping
    public String deletedata(@RequestBody Student student){
        service.deleteByData(student);
        return "data deleted";
    }
}
