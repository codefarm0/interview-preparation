package com.codefarm.design;

public class PrinterUser {
    public static void main(String[] args) {
        ClientPrinter cp = new ClientPrinter(new PrinterA());
        cp.callThePrinter("doc");


        ClientPrinter cpB = new ClientPrinter(new PrinterB());
        cpB.callThePrinter("doc");

    }
}
