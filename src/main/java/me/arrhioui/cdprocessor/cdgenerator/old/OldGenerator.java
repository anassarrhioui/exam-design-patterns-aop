package me.arrhioui.cdprocessor.cdgenerator.old;

import me.arrhioui.ClassDiagram;
import me.arrhioui.model.entity.Entity;
import me.arrhioui.model.relation.Relation;

public class OldGenerator {

    public void generateClassDiagram(ClassDiagram classDiagram) {
        System.out.println("+++++++++++++ Structure +++++++++++++");
        for (Entity e : classDiagram.getEntities())
            System.out.println(e);

        System.out.println("+++++++++++++ Relation +++++++++++++");
        for (Relation relation : classDiagram.getRelations())
            System.out.println(relation);
    }
}
