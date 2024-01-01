package ru.hogwarts.school.bootstrap;

import org.springframework.stereotype.Component;
import org.springframework.boot.CommandLineRunner;
import ru.hogwarts.school.service.StudentService;
import ru.hogwarts.school.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class RunnerStudents implements CommandLineRunner {
    @Autowired
    private StudentService students;

    @Override
    public void run(String... args) throws Exception {
        students.createdStudent(new Student(0L, "Vladislav", 23));
        students.createdStudent(new Student(1L, "Sergey", 23));
        students.createdStudent(new Student(2L, "Evgeniy", 23));
        students.createdStudent(new Student(3L, "Vladimir", 23));
        students.createdStudent(new Student(4L, "Anna", 23));
        students.createdStudent(new Student(5L, "Vasiliy", 23));
        students.createdStudent(new Student(6L, "Elisoveta", 23));
        students.createdStudent(new Student(7L, "Aliena", 23));
        students.createdStudent(new Student(8L, "Stanislav", 23));
        students.createdStudent(new Student(9L, "Irina", 23));
    }





}
