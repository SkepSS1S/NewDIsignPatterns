package com.company.structural.adapter;

import java.util.Random;

/**
 * @author Meiram Sopy Temirzhanov
 */
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
            new RectangleAdapter(new Rectangle()),
            new LineAdapter(new Line())
        };

        Random random = new Random();
        int x1 = random.nextInt(10);
        int y1 = random.nextInt(10);
        int x2 = random.nextInt(10);
        int y2 = random.nextInt(10);

        for(Shape shape : shapes){
            shape.draw(x1, y1, x2, y2);
        }

    }
}
