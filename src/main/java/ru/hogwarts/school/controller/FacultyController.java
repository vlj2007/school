package ru.hogwarts.school.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.service.FacultyService;

@RestController
@RequestMapping("faculty")
public class FacultyController {

    private final FacultyService facultyService;

    public FacultyController(FacultyService facultyService) {
        this.facultyService = facultyService;
    }

    @PostMapping //POST localhost:8080/faculty/1
    public Faculty createFaculty(@RequestBody Faculty faculty) {
        return facultyService.createdFaculty(faculty);
    }

    @GetMapping("{id}") //GET http://localhost:8080/faculties/1

    public ResponseEntity<Faculty> getFacultyInfo(@PathVariable long id) {
        Faculty faculty = facultyService.findFaculty(id);
        if(faculty == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(faculty);
    }

    @PutMapping //PUT localhost:8080/faculties/1
    public Faculty editFaculty(Faculty faculty) {
        return  facultyService.editFaculty(faculty);
    }

    @DeleteMapping("{id}") //DELETE http://localhost:8080/faculties/1
    public ResponseEntity<Faculty> deleteFaculty(@PathVariable long id){
        facultyService.deleteFaculty(id);
        return ResponseEntity.ok().build();
    }

}
