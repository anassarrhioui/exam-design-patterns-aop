package me.arrhioui.cdprocessor.cdgenerator.adapter;

import me.arrhioui.ClassDiagram;
import me.arrhioui.cdprocessor.cdgenerator.ClassDiagramGenerator;
import me.arrhioui.cdprocessor.cdgenerator.JavaClassDiagramGenerator;
import me.arrhioui.cdprocessor.cdgenerator.old.OldGenerator;

public class GeneratorAdapter implements ClassDiagramGenerator {

    private OldGenerator oldGenerator = new OldGenerator();
    @Override
    public void generate(ClassDiagram classDiagram) {
        oldGenerator.generateClassDiagram(classDiagram);
    }
}
