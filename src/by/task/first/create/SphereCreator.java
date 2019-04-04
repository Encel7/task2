package by.task.first.create;

import by.task.first.entity.Warehouse;
import by.task.first.entity.*;
import java.util.*;

import by.task.first.exception.WrongDataException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SphereCreator  {
    private final static Logger logger = LogManager.getLogger();

    public List<Sphere> createSpheres (List<List<Double>> data) throws WrongDataException {
        List<Sphere> spheres = new ArrayList<>();
        for(List<Double> line : data){
            Point tempPoint = new Point(line.get(0),line.get(1),line.get(2));
            Sphere tempSphere = new Sphere(tempPoint, line.get(3));
            spheres.add(tempSphere);
            logger.info("sphere " + tempSphere.getSphereId() + " created");
        }
        Warehouse warehouse = Warehouse.getInstance();
        warehouse.saveParameters(spheres);
        return spheres;
    }
}
