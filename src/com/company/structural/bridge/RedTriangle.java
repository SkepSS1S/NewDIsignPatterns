package com.company.structural.bridge;

/**
 * @author Meiram Sopy Temirzhanov
 */
public class RedTriangle implements IShape_BP{
    @Override
    public void shapeType_IShape() {
        System.out.println("Inside the class RedTriangle,  which implements shapeType_IShape()");

    }

    @Override
    public void shapeColor_IShape() {
        System.out.println("Inside the class RedTriangle, which implements shapeColor_IShape()");
    }
}
