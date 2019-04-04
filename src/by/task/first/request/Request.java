package by.task.first.request;

import by.task.first.entity.Sphere;

import java.util.List;

public interface Request {
    List<Sphere> makeRequest(List<Sphere> spheres);
}
