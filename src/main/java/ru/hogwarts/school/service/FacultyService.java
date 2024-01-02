package ru.hogwarts.school.service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.api.IFaculty;
import ru.hogwarts.school.model.Faculty;


import java.util.HashMap;

@Service
public class FacultyService implements IFaculty {

    private final HashMap<Long, Faculty> facults = new HashMap<>();
    private long lastId = 0;
    @Override
    public Faculty createdFaculty(Faculty faculty) {
        faculty.setId(++lastId);
        facults.put(lastId, faculty);
        return faculty;
    }

    @Override
    public Faculty findFaculty(Long id) {
        return facults.get(id);
    }

    @Override
    public Faculty editFaculty(Faculty faculty) {
        facults.put(faculty.getId(), faculty);
        return faculty;
    }

    @Override
    public Faculty deleteFaculty(long id) {
        return facults.remove(id);
    }


}
