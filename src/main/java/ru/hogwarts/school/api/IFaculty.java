package ru.hogwarts.school.api;
import ru.hogwarts.school.model.Faculty;
public interface IFaculty {

    Faculty createdFaculty(Faculty faculty);
    Faculty findFaculty(Long id);
    Faculty editFaculty(Faculty faculty);
    Faculty deleteFaculty(long id);
}
