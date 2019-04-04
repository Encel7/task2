package by.task.first.repository;

import by.task.first.entity.Sphere;
import by.task.first.request.Request;
import java.util.List;

public interface  Repository {
    void addSphere(Sphere sphere);
    void removeSpheres(Sphere sphere);
    void update(Sphere sphere);

    List query(Request request);
}
