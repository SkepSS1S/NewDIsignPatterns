package com.company.behavioral.command;

import javax.print.attribute.standard.OrientationRequested;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Meiram Sopy Temirzhanov
 */
public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for(Order order : orderList){
            order.execute();
        }
        orderList.clear();
    }

    public void printOrders(){
        for(Order order : orderList){
            System.out.println(order);
        }
    }

}
