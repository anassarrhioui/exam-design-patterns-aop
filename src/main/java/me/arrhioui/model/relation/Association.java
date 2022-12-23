package me.arrhioui.model.relation;

import me.arrhioui.model.entity.Class;
import me.arrhioui.model.entity.Entity;

import java.io.Serializable;

public class Association extends Relation implements Serializable {

    private Class source;
    private Class destination;
    private Cardinalite cardMinSource;
    private Cardinalite cardMaxSource;
    private Cardinalite cardMinDestination;
    private Cardinalite cardMaxDestination;


    public Association(Class source, Class destination, Cardinalite cardMinSource, Cardinalite cardMaxSource, Cardinalite cardMinDestination, Cardinalite cardMaxDestination) {
        this.source = source;
        this.destination = destination;
        this.cardMinSource = cardMinSource;
        this.cardMaxSource = cardMaxSource;
        this.cardMinDestination = cardMinDestination;
        this.cardMaxDestination = cardMaxDestination;
    }

    @Override
    public String toString() {
        return "\n\t\tAssociation{" +
                "source=" + source.getClassPackage()+"."+source.getName() +
                ", destination=" + destination.getClassPackage()+"."+destination.getName() +
                ", cardMinSource=" + cardMinSource +
                ", cardMaxSource=" + cardMaxSource +
                ", cardMinDestination=" + cardMinDestination +
                ", cardMaxDestination=" + cardMaxDestination +
                "}\n";
    }
}
