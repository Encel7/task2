package by.task.first.create;

import by.task.first.entity.Sphere;
import by.task.first.repository.SphereRepository;

import java.util.List;

public class RepositoryCreator {
    public SphereRepository createRepository(List<Sphere> spheres){
        return new SphereRepository(spheres);
    }
}
