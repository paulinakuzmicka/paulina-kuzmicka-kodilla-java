package com.kodilla.good.patterns.allegro;

import java.time.LocalDateTime;
import java.util.Random;

public interface ProductOrderRepository {
    boolean createProductOrder(User user, LocalDateTime orderDate, Product product, int quantity);
}
