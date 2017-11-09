package com.kodilla.good.patterns.food2Door;

public class Food2Door {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        OrderRequest orderRequest = orderService.getOrderRequest();
        orderRequest.processOrder();
    }
}
