package me.arrhioui.model.entity;

import java.io.Serializable;

public abstract class ClassComposite extends Entity implements Serializable {
    public ClassComposite(String name, String classPackage) {
        super(name, classPackage);
    }
}
