package by.task.tests.warehousetest;

import by.task.first.action.SphereMethod;
import by.task.first.entity.Point;
import by.task.first.entity.Sphere;
import by.task.first.entity.Warehouse;
import by.task.first.exception.WrongDataException;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

public class warehousetest {
    @Test()
    public void warehouseSquareTest() throws WrongDataException {
        List<Sphere> spheres = new ArrayList<>();
        spheres.add(new Sphere(new Point(0,0,0), 5));
        Warehouse warehouse = Warehouse.getInstance();
        warehouse.saveParameters(spheres);
        spheres.get(0).setRadius(3);
        double expected = SphereMethod.calculateSquare(spheres.get(0));
        double actual = warehouse.parameters.get(spheres.get(0).getSphereId()).get(0);
        Assert.assertEquals(expected,actual,0.0001);
    }

    @Test()
    public void warehouseVolumeTest() throws WrongDataException {
        List<Sphere> spheres = new ArrayList<>();
        spheres.add(new Sphere(new Point(0,0,0), 1));
        Warehouse warehouse = Warehouse.getInstance();
        warehouse.saveParameters(spheres);
        spheres.get(0).setRadius(5);
        double expected = SphereMethod.calculateVolume(spheres.get(0));
        double actual = warehouse.parameters.get(spheres.get(0).getSphereId()).get(1);
        Assert.assertEquals(expected,actual,0.0001);
    }
}
