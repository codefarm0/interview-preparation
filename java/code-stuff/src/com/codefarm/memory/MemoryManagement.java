package com.codefarm.memory;

public class MemoryManagement {

    private int instanceVariable; // Instance variable
    private static int staticVariable; // Static variable
    private final static int CONSTANT = 100; // Constant

    public static void main(String[] args) {
        MemoryManagement mm = new MemoryManagement();
        mm.method(123);
    }
    public void method(int parameter) { // Method parameter
        int localVariable = 10;
        method1();// Local variable
    }

    static void method1(){
        System.out.println("method1");
        method2();
    }

    private static void method2() {
        System.out.println("method2");
    }
}
