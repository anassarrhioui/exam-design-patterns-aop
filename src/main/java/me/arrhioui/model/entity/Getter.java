package me.arrhioui.model.entity;

import me.arrhioui.enums.Visibility;

import java.util.List;

public class Getter extends Method {
    public Getter(String name, String returnType, boolean isStatic, boolean isFinal, boolean isAbstract, Visibility visibility, List<Parameter> parameters) {
        super(name, returnType, false, false, false, Visibility.PUBLIC, parameters);
    }
}
