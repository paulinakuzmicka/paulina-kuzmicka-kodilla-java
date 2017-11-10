package com.kodilla.good.patterns.food2Door;

import java.util.Map;

public class OrderRequest {
    private Customer customer;
    private FoodProducer foodProducer;
    private Map<Product, Integer> productOrderRequest;


    public OrderRequest(Customer customer, FoodProducer foodProducer, Map<Product, Integer> productOrderRequest) {
        this.customer = customer;
        this.foodProducer = foodProducer;
        this.productOrderRequest = productOrderRequest;
    }

    public boolean processOrder() {
        System.out.println("We're processing your order " + customer.getName());
        return foodProducer.process(customer, productOrderRequest);

    }
}
