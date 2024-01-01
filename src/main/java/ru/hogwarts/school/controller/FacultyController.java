package ru.hogwarts.school.controller;

import org.springframework.web.bind.annotation.*;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.model.Student;
import ru.hogwarts.school.service.FacultyService;

@RestController
@RequestMapping("faculties")
public class FacultyController {

    private final FacultyService facultyService;

    public FacultyController(FacultyService facultyService) {
        this.facultyService = facultyService;
    }

    @PostMapping //POST localhost:8080/faculty/1
    public Faculty createFaculty(Faculty faculty) {
        return facultyService.createdFaculty(faculty);
    }

    @GetMapping("{id}") //GET localhost:8080/faculties/1
    public Faculty getFacultyInfo(@PathVariable long id) {
        return facultyService.findFaculty(id);
    }

    @PutMapping //PUT localhost:8080/faculties/1
    public Faculty editFaculty(Faculty faculty) {
        return  facultyService.editFaculty(faculty);
    }

    @DeleteMapping //DELETE localhost:8080/faculties/1
    public Faculty deleteFaculty(@PathVariable long id) {
        return  facultyService.deleteFaculty(id);
    }


}
