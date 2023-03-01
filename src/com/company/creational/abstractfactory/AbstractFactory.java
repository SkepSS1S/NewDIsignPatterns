package com.company.creational.abstractfactory;

/**
 * @author Meiram Sopy Temirzhanov
 */
public abstract class AbstractFactory {
    abstract IShape getShape(String shape);
    abstract IShape fillColor(String color);
}
