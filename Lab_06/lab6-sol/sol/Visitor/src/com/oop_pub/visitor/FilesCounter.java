package com.oop_pub.visitor;

import static java.nio.file.FileVisitResult.*;

import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;

public class FilesCounter extends SimpleFileVisitor<Path> {

    private ArrayList<Path> javaFiles;

    ArrayList<Path> getJavaFiles() {
        return javaFiles;
    }

    public void setJavaFiles(ArrayList<Path> javaFiles) {
        this.javaFiles = javaFiles;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attr) {
        if (attr.isRegularFile() && file.toString().endsWith(".class")) {

            if (javaFiles == null) {
                javaFiles = new ArrayList<Path>();
            }

            javaFiles.add(file);
        }

        return CONTINUE;
    }
}
