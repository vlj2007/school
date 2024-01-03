package ru.hogwarts.school.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.model.Student;
import ru.hogwarts.school.service.FacultyService;


@Component
public class RunnerFaculty implements CommandLineRunner {

    @Autowired
    private FacultyService faculties;

    @Override
    public void run(String... args) throws Exception {
        faculties.createdFaculty(new Faculty(0L, "Биологический", "blue"));
        faculties.createdFaculty(new Faculty(1L, "Военный", "black"));
        faculties.createdFaculty(new Faculty(2L, "журналистики", "white"));
        faculties.createdFaculty(new Faculty(3L, "Исторический", "blue"));
        faculties.createdFaculty(new Faculty(4L, "Механико-математический", "black"));
        faculties.createdFaculty(new Faculty(5L, "Медицинский", "red"));
        faculties.createdFaculty(new Faculty(6L, "Юридический", "black"));
        faculties.createdFaculty(new Faculty(7L, "Теологический", "green"));
    }
    
}
