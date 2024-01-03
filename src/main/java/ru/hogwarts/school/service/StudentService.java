package ru.hogwarts.school.service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.api.IStudent;
import ru.hogwarts.school.model.Student;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

@Service
public class StudentService implements IStudent {

    private HashMap<Long, Student> students = new HashMap<>();
    private long count = 0;

    @Override
    public Student createdStudent(Student student) {
        student.setId(++count);
        students.put(student.getId(), student);
        return student;
    }

    @Override
    public Student findStudent(Long id) {
        return students.get(id);
    }

    @Override
    public Student editStudent(Student student) {

        if (!students.containsKey(student.getId())) {
            return null;
        }

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
        students.clear();
        return student;
    }
    
    public void clear() {
        students.clear();
    }

    public int size() {
        return students.size();
    }

    public Collection<Student> findByAge(int age){
        ArrayList<Student> result = new ArrayList<>();
        for (Student student : students.values()) {
            if (student.getAge() == age) {
                result.add(student);
            }
        }
        return result;
    }

}
