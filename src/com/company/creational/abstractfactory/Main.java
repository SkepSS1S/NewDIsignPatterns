package com.company.creational.abstractfactory;

/**
 * @author Meiram Sopy Temirzhanov
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");

        IShape circle = shapeFactory.getShape("Circle");
        circle.drawShape();

        IShape rectangle = shapeFactory.getShape("Rectangle");
        rectangle.drawShape();

        IShape triangle = shapeFactory.getShape("Triangle");
        triangle.drawShape();

        IShape ellipse = shapeFactory.getShape("Ellipse");
        ellipse.drawShape();

        System.out.println(circle.getClass());
    }
}
