package by.task.first.repository;

import by.task.first.entity.Sphere;
import by.task.first.request.Request;

import java.util.Comparator;
import java.util.List;

public class SphereRepository implements Repository {
    private List<Sphere> spheres;

    public SphereRepository(List<Sphere> spheres){
        this.spheres = spheres;
    }

    public List<Sphere> getSpheres(){
        return spheres;
    }
    public void addSphere(Sphere sphere){
        spheres.add(sphere);
    }
    public void removeSpheres(Sphere sphere){
        spheres.remove(sphere);
    }
    public void update(Sphere sphere){
    }

    public List query(Request request) {
        return request.makeRequest(spheres);
    }

    @SuppressWarnings("unchecked")
    public void sort(Comparator comparator) {
        spheres.sort(comparator);
    }


}
