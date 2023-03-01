package com.company.behavioral.chainofresponsibility;

/**
 * @author Meiram Sopy Temirzhanov
 */
public class ConsoleLogger extends AbstractLogger{

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Console logger: " + message);
    }
}
