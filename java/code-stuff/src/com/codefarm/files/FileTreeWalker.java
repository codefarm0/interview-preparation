package com.codefarm.files;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

/**
 * @author - GreenLearner(https://www.youtube.com/c/greenlearner)
 */
public class FileTreeWalker {
    public static void main(String[] args) throws IOException {
        String directoryPath = "c:/temp";

        List<String> files = new ArrayList<>();

        Path path = Paths.get(directoryPath);

        Files.walkFileTree(path,new SimpleFileVisitor<>(){
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                System.out.println("directory - " + dir.toAbsolutePath());
                return super.preVisitDirectory(dir, attrs);
            }

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                files.add(file.toAbsolutePath().toString());
                System.out.println("file - " + file.toAbsolutePath());
                return super.visitFile(file, attrs);
            }
        });
        System.out.println(files);
    }


}
