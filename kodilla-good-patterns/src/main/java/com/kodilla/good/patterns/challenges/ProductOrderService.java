package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

interface ProductOrderService {
    default boolean sold(User user, LocalDateTime orderDate, Product product, int quantity){
        return Math.random()>0.5;
    }
}
