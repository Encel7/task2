package by.task.first.request;

import by.task.first.entity.Sphere;

import java.util.List;
import java.util.stream.Collectors;

public class RequestById implements Request {
    private Long id;

    public RequestById(Long id){
        this.id = id;
    }

    @Override
    public List<Sphere> makeRequest(List<Sphere> spheres) {
        return spheres.stream().filter(sphere -> sphere.getSphereId() == id)
                                                        .collect(Collectors.toList());
    }
}
