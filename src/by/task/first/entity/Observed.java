package by.task.first.entity;

import by.task.first.exception.WrongDataException;

interface Observed {
    void addObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers() throws WrongDataException;
}
