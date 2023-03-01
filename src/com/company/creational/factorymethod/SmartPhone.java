package com.company.creational.factorymethod;

/**
 * @author Meiram Sopy Temirzhanov
 */
public abstract class SmartPhone {
    public abstract String getModel();

    @Override
    public String toString() {
        return "Model: " + this.getModel();
    }
}
