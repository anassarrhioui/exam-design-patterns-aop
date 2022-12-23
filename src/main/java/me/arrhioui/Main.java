package me.arrhioui;


import me.arrhioui.cdprocessor.ClassDiagramProcessor;
import me.arrhioui.cdprocessor.cdexporter.SerialiserDiagramExporter;
import me.arrhioui.cdprocessor.cdgenerator.JavaClassDiagramGenerator;
import me.arrhioui.cdprocessor.cdgenerator.adapter.GeneratorAdapter;
import me.arrhioui.enums.Visibility;
import me.arrhioui.model.entity.Attribut;
import me.arrhioui.model.entity.Class;
import me.arrhioui.model.entity.Constructor;
import me.arrhioui.model.entity.Method;
import me.arrhioui.model.entity.Parameter;
import me.arrhioui.model.relation.Association;
import me.arrhioui.model.relation.Cardinalite;
import me.arrhioui.model.relation.Relation;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Parameter p1 = new Parameter("p1", "String");
        Parameter p2 = new Parameter("p2", "String");
        Parameter p3 = new Parameter("p3", "String");
        Parameter p4 = new Parameter("p4", "String");
        Parameter p5 = new Parameter("p5", "String");

        Constructor constructor1 = new Constructor(List.of(p1, p2));
        Constructor constructor2 = new Constructor(List.of());

        Method m1 = new Method("m1",
                "void",
                false,
                false,
                false,
                Visibility.PUBLIC,List.of(p3, p4, p5));

        Attribut a1 = new Attribut("at1", "int", false, true, Visibility.PUBLIC);
        Attribut a2 = new Attribut("at2", "String", false, false, Visibility.PROTECTED);
        Attribut a3 = new Attribut("at3", "int", false, true, Visibility.PUBLIC);

        Class c1 = new Class(
                "Class1",
                "me.arrhioui",
                true,
                false,
                false,
                false,
                List.of(a1, a2),
                List.of(m1),
                List.of(constructor1, constructor2)
        );

        Class c2 = new Class(
                "Class2",
                "me.arrhioui.examdp",
                true,
                false,
                false,
                false,
                List.of(a3, a2),
                List.of(m1),
                List.of(constructor1)
        );

        Relation r1 = new Association(c1, c2, Cardinalite.ZERO, Cardinalite.ONE, Cardinalite.ONE, Cardinalite.MANY);


        ClassDiagram classDiagram = new ClassDiagram();
        classDiagram.getEntities().add(c1);
        classDiagram.getEntities().add(c2);
        classDiagram.getRelations().add(r1);

        ClassDiagramProcessor classDiagramProcessor = new ClassDiagramProcessor();
        classDiagramProcessor.setClassDiagramGenerator(new JavaClassDiagramGenerator());
        classDiagramProcessor.setClassDiagramExporter(new SerialiserDiagramExporter());
        classDiagramProcessor.generate(classDiagram);

        GeneratorAdapter generatorAdapter = new GeneratorAdapter();
        classDiagramProcessor.setClassDiagramGenerator(generatorAdapter);
        System.out.println("##################################################");
        classDiagramProcessor.generate(classDiagram);
        classDiagramProcessor.export(classDiagram, "export1.dat");
    }
}
