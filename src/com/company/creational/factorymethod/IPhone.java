package com.company.creational.factorymethod;

/**
 * @author Meiram Sopy Temirzhanov
 */
public class IPhone extends SmartPhone {
    private String modelName;

    public IPhone(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String getModel() {
        return this.modelName;
    }
}
