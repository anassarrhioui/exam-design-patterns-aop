package me.arrhioui.model.entity;


import me.arrhioui.enums.Visibility;
import me.arrhioui.observer.Observer;

import java.io.Serializable;
import java.util.List;

public class Method implements Serializable, Observer {

    private String name;
    private String returnType;
    private boolean isStatic;
    private boolean isFinal;
    private boolean isAbstract;

    private Visibility visibility;
    private List<Parameter> parameters;


    public Method(String name, String returnType, boolean isStatic, boolean isFinal, boolean isAbstract, Visibility visibility, List<Parameter> parameters) {
        this.name = name;
        this.returnType = returnType;
        this.isStatic = isStatic;
        this.isFinal = isFinal;
        this.isAbstract = isAbstract;
        this.visibility = visibility;
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        return "\n\tMethod{" +
                "name='" + name + '\'' +
                ", returnType='" + returnType + '\'' +
                ", isStatic=" + isStatic +
                ", isFinal=" + isFinal +
                ", isAbstract=" + isAbstract +
                ", visibility=" + visibility +
                ", parameters=" + parameters +
                "}\n";
    }

    @Override
    public void update(Attribut data) {
        System.out.println("Observer triggered for " + data.getName());
    }
}
