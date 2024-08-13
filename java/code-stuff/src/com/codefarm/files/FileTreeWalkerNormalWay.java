package com.codefarm.files;

import java.io.File;

/**
 * @author - GreenLearner(https://www.youtube.com/c/greenlearner)
 */
public class FileTreeWalkerNormalWay {
    public static void main(String[] args) {
        String directoryPath = "c:/temp";
        File directory = new File(directoryPath);
        File[] files = directory.listFiles();
        for(File file : files){
            printFileName(file, 0);
        }
    }

    private static void printFileName(File file, int level) {
        for(int i=0; i< level; i++){
            System.out.print("\t");
        }
        if(file.isFile()){
            System.out.println(file.getName());
        }else{
            System.out.println("$$$ Directory Name - " + file.getAbsolutePath());
            File[] files = file.listFiles();
            for(File file1 : files){
                printFileName(file1, level+1);
            }
        }
    }

}
