package ru.hogwarts.school.service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.api.IStudent;
import ru.hogwarts.school.model.Student;

import java.util.HashMap;

@Service
public class StudentService implements IStudent {

    private final HashMap<Long, Student> students = new HashMap<>();
    private long lastId = 0;

    @Override
    public Student createdStudent(Student student) {
        student.setId(++lastId);
        students.put(lastId, student);
        return student;
    }

    @Override
    public Student findStudent(Long id) {
        return students.get(id);

    }

    @Override
    public Student editStudent(Student student) {
        students.put(student.getId(), student);
        return student;

    }

    @Override
    public Student deleteStudent(long id) {
        return students.remove(id);
    }




}
