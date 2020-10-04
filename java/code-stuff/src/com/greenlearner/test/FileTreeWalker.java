package com.greenlearner.test;

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
        Path path = Paths.get(".");
        List<String> files = new ArrayList<>();
        List<String> dirs = new ArrayList<>();

        Files.walkFileTree(path, new SimpleFileVisitor<>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
//                System.out.println("file" + file.toAbsolutePath());
                files.add(file.toAbsolutePath().toString());
                return super.visitFile(file, attrs);
            }

            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
//                System.out.println("Dir" + dir.toAbsolutePath());
                dirs.add(dir.toAbsolutePath().toString());
                return super.preVisitDirectory(dir, attrs);
            }
        });

        System.out.println(files);
        System.out.println(dirs);
    }
}
