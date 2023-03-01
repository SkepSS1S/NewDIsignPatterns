package com.company.structural.adapter;

/**
 * @author Meiram Sopy Temirzhanov
 */
public class Line {
    public void draw(int x, int y, int k, int z){
        System.out.println("Line from point A(" +
            x + "," + y + "), " + " to point B(" + k + "," + z + ")");
    }
}
