package by.task.tests.requesttest;

import by.task.first.entity.Point;
import by.task.first.entity.Sphere;
import by.task.first.repository.SphereRepository;
import by.task.first.request.RequestByRadiusRange;
import by.task.first.сomparator.RadiusComparator;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RequestTest {
    @Test()
    public void RadiusComparatorTest() {
        List<Sphere> spheres = new ArrayList<>();
        spheres.add(new Sphere(new Point(0,0,0), 5));
        spheres.add(new Sphere(new Point(2, 1,5), 10));
        spheres.add(new Sphere(new Point(5,2,1), 2));
        SphereRepository repository = new SphereRepository(spheres);
        List<Sphere> expected = Arrays.asList(spheres.get(2), spheres.get(0), spheres.get(1));
        repository.sort(new RadiusComparator());
        List<Sphere> actual = repository.getSpheres();
        Assert.assertEquals(expected,actual);
    }

    @Test()
    public void RadiusRangeRequest() {
        List<Sphere> spheres = new ArrayList<>();
        spheres.add(new Sphere(new Point(0,0,0), 5));
        spheres.add(new Sphere(new Point(2,4,1), 9));
        spheres.add(new Sphere(new Point(2, 1,5), 10));
        spheres.add(new Sphere(new Point(5,2,1), 2));
        SphereRepository repository = new SphereRepository(spheres);
        List<Sphere> expected = Arrays.asList(spheres.get(1), spheres.get(2));
        List actual = repository.query(new RequestByRadiusRange(8,10));
        Assert.assertEquals(expected,actual);
    }

}
