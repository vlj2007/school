package ru.hogwarts.school.api;
import ru.hogwarts.school.model.Student;

import java.util.Collection;

public interface IStudent {

    Student createdStudent(Student student);
    Student findStudent(Long id);
    Student editStudent(Student student);
    Student deleteStudent(long id);
    Collection<Student> showAllStudents();
    Student deleteAllStudents(Student student);
}
