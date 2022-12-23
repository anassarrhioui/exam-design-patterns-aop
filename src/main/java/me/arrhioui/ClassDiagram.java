package me.arrhioui;
import me.arrhioui.model.entity.Entity;
import me.arrhioui.model.relation.Relation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ClassDiagram implements Serializable {

    private List<Entity> entities = new ArrayList<>();
    private List<Relation> relations = new ArrayList<>();

    public List<Entity> getEntities() {
        return entities;
    }

    public void setEntities(List<Entity> entities) {
        this.entities = entities;
    }

    public List<Relation> getRelations() {
        return relations;
    }

    public void setRelations(List<Relation> relations) {
        this.relations = relations;
    }
}
