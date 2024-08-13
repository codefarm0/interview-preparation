package com.codefarm.design;

public class ClientPrinter {


    private Printer printer;

    public ClientPrinter(Printer printer) {
        this.printer = printer;
    }

    public void callThePrinter(String doc) {
        printer.print(doc);
    }


    public Printer getPrinter() {
        return printer;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }
}
