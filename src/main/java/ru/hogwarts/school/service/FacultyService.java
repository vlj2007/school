package ru.hogwarts.school.service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.api.IFaculty;
import ru.hogwarts.school.model.Faculty;


import java.util.HashMap;

@Service
public class FacultyService implements IFaculty {

    private final HashMap<Long, Faculty> faculties = new HashMap<>();
    private long count = 0;
    @Override
    public Faculty createdFaculty(Faculty faculty) {
        faculty.setId(++count);
        faculties.put(faculty.getId(), faculty);
        return faculty;
    }

    @Override
    public Faculty findFaculty(Long id) {
        return faculties.get(id);
    }

    @Override
    public Faculty editFaculty(Faculty faculty) {

        if (!faculties.containsKey(faculty.getId())) {
            return null;
        }

        faculties.put(faculty.getId(), faculty);
        return faculty;
    }

    @Override
    public Faculty deleteFaculty(long id) {
        return faculties.remove(id);
    }


}
