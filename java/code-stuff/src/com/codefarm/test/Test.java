package com.codefarm.test;

import java.io.File;
import java.util.Arrays;

/**
 * @author - GreenLearner(https://www.youtube.com/c/greenlearner)
 */
public class Test {
    public static void main(String[] args) {
        File file = new File("c:/temp");

//        File[] files = file.listFiles();
        File[] files = file.listFiles(e -> !e.isFile());
        String[] list = file.list((d, e) -> {
            System.out.println(d +"~"+e);
            return e.toLowerCase().endsWith(".txt");
        });

        System.out.println(Arrays.asList(list));
//        file.list
//        FileFilter;
//        FilenameFilter
        for(File file1 : files){
            //System.out.println(file1.getAbsolutePath());
        }
    }
}
