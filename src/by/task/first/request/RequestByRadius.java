package by.task.first.request;

import by.task.first.entity.Sphere;

import java.util.List;
import java.util.stream.Collectors;

public class RequestByRadius implements Request {
    private double radius;

    public RequestByRadius(double radius){
        this.radius = radius;
    }
    @Override
    public List<Sphere> makeRequest(List<Sphere> spheres) {
        return spheres.stream().filter(sphere -> sphere.getRadius() == radius)
                .collect(Collectors.toList());
    }
}
