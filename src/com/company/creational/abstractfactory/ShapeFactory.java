package com.company.creational.abstractfactory;

/**
 * @author Meiram Sopy Temirzhanov
 */
public class ShapeFactory extends AbstractFactory{
    @Override
    IShape getShape(String shape) {
        if(shape == null){
            return null;
        }

        if(shape.equalsIgnoreCase("circle")){
            return new Circle();
        } else if(shape.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        } else if(shape.equalsIgnoreCase("triangle")){
            return new Triangle();
        } else if(shape.equalsIgnoreCase("ellipse")){
            return new Ellipse();
        }
        return null;
    }

    @Override
    IShape fillColor(String color) {
        return null;
    }
}
