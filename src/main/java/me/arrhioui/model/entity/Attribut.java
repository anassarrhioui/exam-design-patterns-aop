package me.arrhioui.model.entity;

import me.arrhioui.enums.Visibility;
import me.arrhioui.observer.Observable;
import me.arrhioui.observer.Observer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Attribut implements Serializable, Observable {

    private String name;
    private String type;
    private boolean isStatic;
    private boolean isFinal;
    private Visibility visibility;
    private List<Observer> observers = new ArrayList<>();

    public Attribut(String name, String type, boolean isStatic, boolean isFinal, Visibility visibility) {
        this.name = name;
        this.type = type;
        this.isStatic = isStatic;
        this.isFinal = isFinal;
        this.visibility = visibility;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "\n\tAttribut{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", isStatic=" + isStatic +
                ", isFinal=" + isFinal +
                ", visibility=" + visibility +
                "}\n";
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
        observers.forEach(observer -> observer.update(this));
    }
}
