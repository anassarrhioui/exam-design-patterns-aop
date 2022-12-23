package me.arrhioui.model.entity;

import java.io.Serializable;
import java.util.List;

public class Record extends Entity implements Serializable {

    private Constructor constructor;
    List<Attribut> attributs;

    List<Getter> getters;


    public Record(String name, String classPackage, Constructor constructor, List<Attribut> attributs, List<Getter> getters) {
        super(name, classPackage);
        this.constructor = constructor;
        this.attributs = attributs;
        this.getters = getters;
    }
}
