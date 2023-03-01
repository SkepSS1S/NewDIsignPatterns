package com.company.structural.decorator;

/**
 * @author Meiram Sopy Temirzhanov
 */
public class BlueShapeDecorator extends ShapeDecorator{

    public BlueShapeDecorator(IShape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void drawShape(){
        decoratedShape.drawShape();
        setRedBorder(decoratedShape);
    }


    protected void setRedBorder(IShape decoratedShape){
        System.out.println("Border color: Blue");
    }
}
