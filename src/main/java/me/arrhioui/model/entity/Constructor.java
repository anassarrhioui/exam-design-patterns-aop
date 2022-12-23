package me.arrhioui.model.entity;

import java.io.Serializable;
import java.util.List;

public class Constructor  implements Serializable {

    private List<Parameter> parameters;

    public Constructor(List<Parameter> parameters) {
        this.parameters = parameters;
    }


    @Override
    public String toString() {
        return "\n\tConstructor{" +
                "parameters=" + parameters +
                "}\n";
    }
}
