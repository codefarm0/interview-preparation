package com.codefarm.general;

public class Finallyize {
    final int counter=10;
    public static void main(String[] args) {

        try{
            int num = 10/10;
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            int f = 10/0;
            System.out.println("Always executed");
        }
    }

     void print(){
       // counter = 12;
    }

    int numb(){
        try{
            int f = 30/0;
            return 10;
        }finally {
            System.out.println("Always executed");
            return 0;
        }
    }

}
