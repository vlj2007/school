package ru.hogwarts.school.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.hogwarts.school.model.Student;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.api.Assertions;

import java.util.*;

import java.util.function.BooleanSupplier;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class StudentServiceTest {

    StudentService studentService = new StudentService();


    public static Stream<Arguments> provideParamsForTest() {
        return Stream.of(
                Arguments.of(0L, "Tesla", 21),
                Arguments.of(1L, "Tesla1", 20),
                Arguments.of(2L, "Tesla2", 18)
        );
    }

    public static final Student STUDENT1 = new Student(0L, "Tesla", 21);
    public static final Student STUDENT2 = new Student(1L, "Nasa", 20);

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    void createdStudent(Student student) {
        studentService.createdStudent(student);
        assertTrue((BooleanSupplier) studentService.findStudent(student.getId()));
    }

    @Test
    void findStudent(Long id) {
        studentService.createdStudent(STUDENT1);
        studentService.findStudent(STUDENT1.getId());
        assertTrue((BooleanSupplier) studentService.findStudent(STUDENT1.getId()));
    }

    @Test
    void editStudent() {
        studentService.createdStudent(STUDENT1);
        studentService.editStudent(STUDENT2).getId();


    }

    @Test
    void deleteStudent() {
    }
}