package observer.after;

import java.util.ArrayList;
import java.util.List;

public class Player implements Observable {
    private String name;
    private Status status;
    private List<Observer> observers = new ArrayList<>();

    public Player(String name, Status status) {
        this.name = name;
        this.status = status;
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public void update(Status status){
        this.status = status;
        notifyAllObservers();
    }

    public Status getStatus() {
        return status;
    }
}
