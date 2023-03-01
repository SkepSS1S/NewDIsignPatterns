package com.company.behavioral.command;/**
 * @author Meiram Sopy Temirzhanov
 */

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();
        BuyStock buyStockOrder = new BuyStock(stock);
        SellStock sellStockOrder = new SellStock(stock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);
        broker.placeOrders();

    }
}
