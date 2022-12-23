package me.arrhioui.cdprocessor.cdgenerator;

import me.arrhioui.ClassDiagram;

public class JavaClassDiagramGenerator implements ClassDiagramGenerator {

    @Override
    public void generate(ClassDiagram classDiagram) {
        System.out.println("########### Structures ###########");
        classDiagram.getEntities()
                .forEach(System.out::println);

        System.out.println("########### Relations ###########");
        classDiagram.getRelations()
                .forEach(System.out::println);
    }
}
