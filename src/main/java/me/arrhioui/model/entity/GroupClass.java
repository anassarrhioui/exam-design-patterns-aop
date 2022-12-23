package me.arrhioui.model.entity;

import java.util.ArrayList;
import java.util.List;

public class GroupClass extends ClassComposite {
    List<ClassComposite> classComposites = new ArrayList<>();

    public GroupClass(String name, String classPackage) {
        super(name, classPackage);
    }

    public List<ClassComposite> getClassComposites() {
        return classComposites;
    }

    public void setClassComposites(List<ClassComposite> classComposites) {
        this.classComposites = classComposites;
    }
}
