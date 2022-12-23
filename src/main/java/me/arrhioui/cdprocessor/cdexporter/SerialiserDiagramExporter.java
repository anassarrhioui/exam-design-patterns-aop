package me.arrhioui.cdprocessor.cdexporter;

import me.arrhioui.ClassDiagram;
import me.arrhioui.aspect.Lock;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialiserDiagramExporter implements ClassDiagramExporter {

    @Override
    @Lock
    public void export(ClassDiagram classDiagram, String path) {

            try(FileOutputStream fileOutputStream = new FileOutputStream(path)) {
                try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);){
                    objectOutputStream.writeObject(classDiagram);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }
}
