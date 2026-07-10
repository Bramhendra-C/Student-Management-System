package com.studentmanagement.StudentManagementSystem.service;

import com.studentmanagement.StudentManagementSystem.model.Student;
import com.studentmanagement.StudentManagementSystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository repository;

    public Student addStudent(Student student){
        return repository.save(student);
    }

    public List<Student> addAllStudents(List<Student> studentList){
        return repository.saveAll(studentList);
    }

    public List<Student> getAllStudents(){
        return repository.findAll();
    }

    public Student getById(long id){
        return repository.getReferenceById(id);
    }

    public Student updateById(long id, Student student){
        student.setId(id);
        return repository.save(student);
    }

    public void deleteById(long id){
        repository.deleteById(id);
    }

    public void deleteByData(Student student){
        repository.delete(student);
    }
}
