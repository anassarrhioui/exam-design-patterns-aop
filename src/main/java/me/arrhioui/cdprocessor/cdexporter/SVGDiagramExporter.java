package me.arrhioui.cdprocessor.cdexporter;

import me.arrhioui.ClassDiagram;

public class SVGDiagramExporter implements ClassDiagramExporter {
    @Override
    public void export(ClassDiagram classDiagram, String path) {

        System.out.println("SVG export.....");
    }
}
