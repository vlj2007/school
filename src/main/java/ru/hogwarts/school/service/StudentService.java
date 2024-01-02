package ru.hogwarts.school.service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.api.IStudent;
import ru.hogwarts.school.model.Student;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Service
public class StudentService implements IStudent {

    private Map<Long, Student> students = new HashMap<>();
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


    @Override
    public Collection<Student> showAllStudents() {
        return Collections.unmodifiableMap(students).values();
    }

    @Override
    public Student deleteAllStudents(Student student) {
        return null;
        //return students.clear(student);
    }
    
    public void clear() {
        students.clear();
    }

    public int size() {
        return students.size();
    }

}
