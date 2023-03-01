package com.company.creational.abstractfactory;

/**
 * @author Meiram Sopy Temirzhanov
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String factory){
        if(factory == null){
            return null;
        } else if(factory.equalsIgnoreCase("Shape")){
            return new ShapeFactory();
        }
        return null;
    }
}
