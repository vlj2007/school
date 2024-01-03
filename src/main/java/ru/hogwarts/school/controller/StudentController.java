package ru.hogwarts.school.controller;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.hogwarts.school.model.Student;
import ru.hogwarts.school.service.StudentService;
import java.util.Collection;
import org.springframework.http.ResponseEntity;

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

    @GetMapping("{id}")
    public ResponseEntity<Student> getStudentInfo(@PathVariable Long id){
        Student student = studentService.findStudent(id);
        if (student == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(student);
    }

    @PutMapping //PUT localhost:8080/students/1
    public ResponseEntity<Student> editStudent(@RequestBody Student student){
        Student foundStudent = studentService.editStudent(student);
        if (foundStudent == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.ok(foundStudent);
    }

    @DeleteMapping("{id}") //DELETE localhost:8080/students/1
    public ResponseEntity<Void> deleteStudent(@PathVariable long id) {
        studentService.deleteStudent(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping(path = "/find")
    public Collection<Student> getStudents(){
        return studentService.showAllStudents();
    }

 //   @DeleteMapping //DELETE localhost:8080/students
 //   public Student deleteAllStudent(Student student) {
  //      return  studentService.deleteStudent(student);
   // }














}
