package by.task.first.entity;

import by.task.first.exception.WrongDataException;

class SingleObserver implements Observer {
    @Override
    public void handleEvent(Sphere sphere, long id) throws WrongDataException {
        Warehouse warehouse = Warehouse.getInstance();
        warehouse.changeParameters(sphere, id);
    }
}
