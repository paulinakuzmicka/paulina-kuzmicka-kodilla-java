package com.kodilla.good.patterns.food2Door;

import java.util.HashMap;
import java.util.Map;

public class OrderService {


    public OrderRequest getOrderRequest() {
        Customer customer = new Customer("JohDoe");
        FoodProducer foodProducer = new GlutenFreeShop();
        Map<Product, Integer> productsList = new HashMap<>();
        productsList.put(new GlutenFreeProduct("bread", "Bread made from coconut flour"), 2);
        productsList.put(new GlutenFreeProduct("rice", "extraordinary white rice"), 3);
        productsList.put(new GlutenFreeProduct("cookies", "amaranth cookies with dactyls"), 1000);

        return new OrderRequest(customer, foodProducer, productsList);
    }
}
