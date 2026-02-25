package com;

import Ironhack.com.Order;
import Ironhack.com.OrderItem;

import java.math.BigDecimal;
import java.util.List;

public class OrderCalculator {
    public void main(String[] args){
        List<OrderItem>orderItems1=List.of(new OrderItem("meat",new BigDecimal("12.5")),new OrderItem("knife",new BigDecimal("13.7")));
        List<OrderItem>orderItems2=List.of(new OrderItem("paper",new BigDecimal("12.6")),new OrderItem("Scissors",new BigDecimal("13.5")));

        Order order1 = new Order("1001", "Yunis Sadiq", orderItems1, new BigDecimal("27.2"));
        Order order2 = new Order("1002", "Ayhan Agayev", orderItems2, new BigDecimal("26.1"));

        BigDecimal threshold=new BigDecimal("26.0");
        List<Order>orders=List.of(order1,order2);
        printOrders(orders);
       finalTotalCalculator(orders);
      filterByPrice(orders,threshold);
      findMin(orders);
      findMax(orders);
    }

    public static void printOrders(List<Order> orders){
        System.out.println("Get each order");
        for(Order order:orders){
            System.out.println(order);
        }
    }
    public static void finalTotalCalculator(List<Order>orders){
        System.out.println("Total final");
        BigDecimal finalTotal= BigDecimal.ZERO;
        for(Order order:orders){
            finalTotal=finalTotal.add(order.getTotal());
        }
        System.out.println("\nFinal total of all orders: $" + finalTotal);
    }
    public static void filterByPrice(List<Order> orders, BigDecimal threshold){
        System.out.println("Orders that are above " + threshold);
        for(Order order:orders){
            if(order.getTotal().compareTo(threshold)>0) {
                System.out.println(order);
            }
        }
        System.out.println("---------------------");
    }
    public static void findMin(List<Order> orders){
        if(orders.isEmpty()){
            return;
        }
        Order minOrder=orders.get(0);
        for(Order order:orders){
            if(order.getTotal().compareTo(minOrder.getTotal())<0){
                minOrder=order;
            }
        }
        System.out.println("The order is with minimum total is "+minOrder);

    }
    public static void findMax(List<Order> orders){
        if(orders.isEmpty()){
            return;
        }
        Order maxOrder=orders.get(0);
        for(Order order:orders){
            if(order.getTotal().compareTo(maxOrder.getTotal())>0){
                maxOrder=order;
            }
        }
        System.out.println("The order is with minimum total is "+maxOrder);

    }
}
