package by.task.first.entity;

import by.task.first.action.SphereMethod;
import by.task.first.exception.WrongDataException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class Warehouse {
    public Map<Long, List<Double>> parameters = new HashMap<>();

    private Warehouse(){}
    private static Warehouse INSTANCE;

    public static Warehouse getInstance(){
        if(INSTANCE == null) {
            INSTANCE = new Warehouse();
        }
        return INSTANCE;
    }

    public void saveParameters(List<Sphere> spheres) throws WrongDataException{
        for(Sphere sphere : spheres){
            parameters.put(sphere.getSphereId(), Arrays.asList(SphereMethod.calculateSquare(sphere),SphereMethod.calculateVolume(sphere)));
        }
    }

    void changeParameters(Sphere sphere, long id) throws WrongDataException {
            parameters.get(id).set(0, SphereMethod.calculateSquare(sphere));
            parameters.get(id).set(1, SphereMethod.calculateVolume(sphere));
        }
    }

