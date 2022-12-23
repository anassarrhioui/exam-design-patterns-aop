package me.arrhioui.model.entity;

import java.io.Serializable;
import java.util.List;

public class AbstractMethod implements Serializable {

    private String name;
    private String returnType;
    List<Parameter> parameters;

    public AbstractMethod(String name, String returnType, List<Parameter> parameters) {
        this.name = name;
        this.returnType = returnType;
        this.parameters = parameters;
    }


    @Override
    public String toString() {
        return "AbstractMethod{" +
                "name='" + name + '\'' +
                ", returnType='" + returnType + '\'' +
                ", parameters=" + parameters +
                "}\n";
    }
}
