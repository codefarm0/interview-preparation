package com.greenlearner.files;

import java.io.File;
import java.util.Arrays;

/**
 * @author - GreenLearner(https://www.youtube.com/c/greenlearner)
 */
public class FileFilteringWhileTraversing {
    public static void main(String[] args) {
        String directoryPath = "c:/temp";

        File file = new File(directoryPath);

        File[] list = file.listFiles(file1 -> file1.isDirectory()/*file1.getName().toLowerCase().endsWith(".txt")*/);

        for(File file1 : list){
            System.out.println(file1.getName());
        }
    }
}
