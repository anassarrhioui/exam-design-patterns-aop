package me.arrhioui.model.entity;

import java.io.Serializable;

public class Annotation extends Entity implements Serializable {
    public Annotation(String name, String classPackage) {
        super(name, classPackage);
    }


    @Override
    public String toString() {
        return "Annotation{" +
                "name='" + name + '\'' +
                ", classPackage='" + classPackage + '\'' +
                "}\n";
    }
}
