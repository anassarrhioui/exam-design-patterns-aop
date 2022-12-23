package me.arrhioui.model.relation;

import me.arrhioui.model.entity.Entity;

import java.io.Serializable;

public class Extention extends Relation implements Serializable {

    private Entity source;
    private Entity destination;

    public Extention(Entity source, Entity destination) {
        this.source = source;
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "\n\tExtention{" +
                "source=" + source +
                ", destination=" + destination +
                "}\n";
    }
}
