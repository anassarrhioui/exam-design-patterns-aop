package me.arrhioui.model.entity;

import java.io.Serializable;

public class Parameter  implements Serializable {
    private String name;
    private String type;

    public Parameter(String name, String type) {
        this.name = name;
        this.type = type;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "\n\t\tParameter{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                "}\n";
    }
}
