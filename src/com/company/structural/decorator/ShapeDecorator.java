package com.company.structural.decorator;

/**
 * @author Meiram Sopy Temirzhanov
 */
public class ShapeDecorator implements IShape{
    protected IShape decoratedShape;

    public ShapeDecorator(IShape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void drawShape() {
        decoratedShape.drawShape();
    }
}
