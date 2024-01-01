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
        facults.createdFaculty(new Faculty(0L, "Vladislav", "blue"));
        facults.createdFaculty(new Faculty(1L, "Sergey", "black"));
        facults.createdFaculty(new Faculty(2L, "Evgeniy", "white"));
    }
    
}
