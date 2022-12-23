package me.arrhioui.model.entity;

import java.io.Serializable;
import java.util.List;

public class Enumeration extends Entity implements Serializable {

    private List<EnumVal> enumVals;

    public Enumeration(String name, String classPackage, List<EnumVal> enumVals) {
        super(name, classPackage);
        this.enumVals = enumVals;
    }


    @Override
    public String toString() {
        return "Enumeration{" +
                ", classPackage='" + classPackage + '\'' +
                ", name='" + name + '\'' +
                "enumVals=" + enumVals +
                "}\n";
    }
}
