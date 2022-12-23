package me.arrhioui.cdprocessor;

import me.arrhioui.ClassDiagram;
import me.arrhioui.cdprocessor.cdexporter.ClassDiagramExporter;
import me.arrhioui.cdprocessor.cdgenerator.ClassDiagramGenerator;

public class ClassDiagramProcessor {
    private ClassDiagramGenerator classDiagramGenerator;
    private ClassDiagramExporter classDiagramExporter;

    public void generate(ClassDiagram classDiagram){
        classDiagramGenerator.generate(classDiagram);
    }

    public void export(ClassDiagram classDiagram, String path){
        classDiagramExporter.export(classDiagram, path);
    }

    public void setClassDiagramGenerator(ClassDiagramGenerator classDiagramGenerator) {
        this.classDiagramGenerator = classDiagramGenerator;
    }

    public void setClassDiagramExporter(ClassDiagramExporter classDiagramExporter) {
        this.classDiagramExporter = classDiagramExporter;
    }
}
