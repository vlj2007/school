package ru.hogwarts.school.api;
import ru.hogwarts.school.model.Faculty;

import java.util.Collection;

public interface IFaculty {

    Faculty createdFaculty(Faculty faculty);
    Faculty findFaculty(Long id);
    Faculty editFaculty(Faculty faculty);
    Faculty deleteFaculty(long id);
    Faculty deleteAllFaculty(Faculty faculty);
    Collection<Faculty> showAllFaculty();
    Collection<Faculty> findByColor(String color);
}
