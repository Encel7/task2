package by.task.first.request;

import by.task.first.entity.Sphere;

import java.util.List;
import java.util.stream.Collectors;

public class RequestByRadiusRange implements Request {
    private double downRadius;
    private double upperRadius;

    public RequestByRadiusRange(double downRadius, double upperRadius){
        this.downRadius = downRadius;
        this.upperRadius = upperRadius;
    }
    @Override
    public List<Sphere> makeRequest(List<Sphere> spheres) {
        return spheres.stream().filter(sphere -> sphere.getRadius() <= upperRadius && sphere.getRadius() >= downRadius)
                .collect(Collectors.toList());
    }
}
