package com.company.behavioral.command;

/**
 * @author Meiram Sopy Temirzhanov
 */
public class BuyStock implements Order{
    private Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
