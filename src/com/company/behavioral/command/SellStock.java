package com.company.behavioral.command;

/**
 * @author Meiram Sopy Temirzhanov
 */
public class SellStock implements Order{
    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
