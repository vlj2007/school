package ru.hogwarts.school.controller;

import org.springframework.web.bind.annotation.RestController;
import ru.hogwarts.school.service.FacultyService;
@RestController
public class FacultyController {

    private final FacultyService facultyService;

    public FacultyController(FacultyService facultyService) {
        this.facultyService = facultyService;
    }
}
