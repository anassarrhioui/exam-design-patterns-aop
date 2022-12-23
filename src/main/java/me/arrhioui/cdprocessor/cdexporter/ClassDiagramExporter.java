package me.arrhioui.cdprocessor.cdexporter;

import me.arrhioui.ClassDiagram;

public interface ClassDiagramExporter {

    void export(ClassDiagram classDiagram, String path);
}
