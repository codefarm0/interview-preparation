package com.greenlearner.test;

import java.io.File;

/**
 * @author - GreenLearner(https://www.youtube.com/c/greenlearner)
 */
public class FileTreeWalkerNormal {
    public static void main(String[] args) {

        File dir = new File("c:/temp/file1.txt");
        File[] files = dir.listFiles();
        System.out.println(dir.exists() + "--"+files);
        for (File file : files) {
            printFileOrDirName(file, 0);
        }

    }
    static void printFileOrDirName(File dir, int level) {

        for(int i =0; i< level; i++){
            System.out.print("\t");
        }
        if (dir.isFile()) {
            System.out.println(dir.getName());
        } else if (dir.isDirectory()) {
            System.out.println("dir - " + dir.getAbsolutePath() + "--------");
            for (File file : dir.listFiles())
                printFileOrDirName(file, level + 1);
        }
    }
}
