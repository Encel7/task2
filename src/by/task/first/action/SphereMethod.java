package by.task.first.action;

import by.task.first.entity.Sphere;
import by.task.first.exception.WrongDataException;


public class SphereMethod {
    public static double calculateVolume(Sphere sphere) throws WrongDataException{
        if(!isSphere(sphere)){
            throw new WrongDataException("wrong data! set positive radius");
        }
        return (double)4/3 * Math.pow(sphere.getRadius(), 3) * Math.PI;
    }

    public static double calculateSquare(Sphere sphere) throws WrongDataException{
        if(!isSphere(sphere)){
            throw new WrongDataException("wrong data! set positive radius");
        }
        return 4 * Math.PI * Math.pow(sphere.getRadius(),2);
    }

    public static boolean isSphere(Sphere sphere){
        return sphere.getRadius() > 0;
    }
}
