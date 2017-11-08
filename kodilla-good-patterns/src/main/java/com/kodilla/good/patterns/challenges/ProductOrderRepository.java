package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface ProductOrderRepository {

    default boolean createProductOrder(User user, LocalDateTime orderDate, Product product, int quantity){
        return Math.random()>0.5;
    }
}
