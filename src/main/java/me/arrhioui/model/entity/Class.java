package me.arrhioui.model.entity;

import java.io.Serializable;
import java.util.List;

public class Class extends ClassComposite implements Serializable {

    private boolean isPublic;
    private boolean isStatic;
    private boolean isFinal;
    private boolean isAbstract;
    private List<Attribut> attributs;
    private List<Method> methods;
    private List<Constructor> constructors;




    public Class(String name, String classPackage, boolean isPublic, boolean isStatic, boolean isFinal, boolean isAbstract, List<Attribut> attributs, List<Method> methods, List<Constructor> constructors) {
        super(name, classPackage);
        this.isPublic = isPublic;
        this.isStatic = isStatic;
        this.isFinal = isFinal;
        this.isAbstract = isAbstract;
        this.attributs = attributs;
        this.methods = methods;
        this.constructors = constructors;
    }

    @Override
    public String toString() {
        return "Class{" +
                ", classPackage='" + classPackage + '\'' +
                ", name='" + name + '\'' +
                "isPublic=" + isPublic +
                ", isStatic=" + isStatic +
                ", isFinal=" + isFinal +
                ", isAbstract=" + isAbstract +
                ", constructors=" + constructors +
                ", attributs=" + attributs +
                ", methods=" + methods +
                '}';
    }
}
