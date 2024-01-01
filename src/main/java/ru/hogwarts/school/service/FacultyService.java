package ru.hogwarts.school.service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.model.Student;

import java.util.HashMap;

@Service
public class FacultyService {

    private final HashMap<Long, Faculty> facults = new HashMap<>();
    private long lastId = 0;

    public Faculty createdFaculty(Faculty faculty) {
        faculty.setId(++lastId);
        facults.put(lastId, faculty);
        return faculty;
    }

    public Faculty findFaculty(Long id) {
        return facults.get(id);
    }

    public Faculty editFaculty(Faculty faculty) {
        facults.put(faculty.getId(), faculty);
        return faculty;
    }

    public Faculty deleteFaculty(long id) {
        return facults.remove(id);
    }


}
