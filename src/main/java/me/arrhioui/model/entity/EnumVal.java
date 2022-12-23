package me.arrhioui.model.entity;

import java.io.Serializable;

public class EnumVal  implements Serializable {
    private String value;

    public EnumVal(String value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return "EnumVal{" +
                "value='" + value + '\'' +
                "}\n";
    }
}
