package by.task.first.сomparator;

import by.task.first.entity.Sphere;

import java.util.Comparator;

public class RadiusComparator implements Comparator<Sphere> {
    @Override
    public int compare(Sphere o1, Sphere o2) {
        return (int)(o1.getRadius() - o2.getRadius());
    }
}
