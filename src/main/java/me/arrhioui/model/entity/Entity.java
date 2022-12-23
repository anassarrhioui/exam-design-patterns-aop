package me.arrhioui.model.entity;

import java.io.Serializable;

public abstract class Entity  implements Serializable {

    protected String name;
    protected String classPackage;


    public Entity(String name, String classPackage) {
        this.name = name;
        this.classPackage = classPackage;
    }

    public String getName() {
        return name;
    }

    public String getClassPackage() {
        return classPackage;
    }
}
