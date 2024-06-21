package com.examples;

public class Gst extends IncomeTax{
    //String mobilephoneno;
    @Override
    int calculateTax(int income) {
        int oldTax = super.calculateTax(income);
        int newTax = 1000;
        return  oldTax + newTax;
    }
}
