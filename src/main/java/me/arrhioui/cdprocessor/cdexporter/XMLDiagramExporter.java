package me.arrhioui.cdprocessor.cdexporter;

import me.arrhioui.ClassDiagram;

public class XMLDiagramExporter implements ClassDiagramExporter {
    @Override
    public void export(ClassDiagram classDiagram, String path) {

        System.out.println("XML export.....");
    }
}
