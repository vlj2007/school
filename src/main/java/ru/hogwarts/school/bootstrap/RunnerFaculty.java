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
    private FacultyService facults;

    @Override
    public void run(String... args) throws Exception {
        facults.createdFaculty(new Faculty(0L, "Биологический", "blue"));
        facults.createdFaculty(new Faculty(1L, "Военный", "black"));
        facults.createdFaculty(new Faculty(2L, "журналистики", "white"));
        facults.createdFaculty(new Faculty(3L, "Исторический", "blue"));
        facults.createdFaculty(new Faculty(4L, "Механико-математический", "black"));
        facults.createdFaculty(new Faculty(5L, "Медицинский", "red"));
        facults.createdFaculty(new Faculty(6L, "Юридический", "black"));
        facults.createdFaculty(new Faculty(7L, "Теологический", "green"));
    }
    
}
