package ru.hogwarts.school.controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.hogwarts.school.model.Student;
import ru.hogwarts.school.service.StudentService;


@RestController
@RequestMapping("students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping //POST localhost:8080/students/1
    public Student createStudent(Student student) {
        return  studentService.createdStudent(student);
    }

    @GetMapping("{id}") //GET localhost:8080/students/1
    public Student getStudentInfo(@PathVariable long id){
        return  studentService.findStudent(id);
    }

    @PutMapping //PUT localhost:8080/students/1
    public Student editStudent(Student student) {
        return  studentService.editStudent(student);
    }

    @DeleteMapping //DELETE localhost:8080/students/1
    public Student deleteStudent(@PathVariable long id) {
        return  studentService.deleteStudent(id);
    }












}
