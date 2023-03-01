package com.company.behavioral.command;

/**
 * @author Meiram Sopy Temirzhanov
 */
public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [" + name + "], " + "quantity " + quantity + "], was bought");
    }
    public void sell(){
        System.out.println("Stock [" + name + "], " + "quantity " + quantity + "], was sold");
    }
}
