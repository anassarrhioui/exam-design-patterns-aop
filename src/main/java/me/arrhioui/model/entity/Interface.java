package me.arrhioui.model.entity;

import java.io.Serializable;
import java.util.List;

public class Interface extends Entity  implements Serializable {

    List<AbstractMethod> abstractMethods;

    public Interface(String name, String classPackage, List<AbstractMethod> abstractMethods) {
        super(name, classPackage);
        this.abstractMethods = abstractMethods;
    }


    @Override
    public String toString() {
        return "Interface{" +
                ", classPackage='" + classPackage + '\'' +
                ", name='" + name + '\'' +
                "abstractMethods=" + abstractMethods +
                "}\n";
    }
}
