package by.task.first.entity;

import by.task.first.exception.WrongDataException;

 interface Observer {
    void handleEvent(Sphere sphere, long id) throws WrongDataException;
}
