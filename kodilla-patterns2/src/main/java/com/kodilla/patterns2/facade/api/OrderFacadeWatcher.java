package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OrderFacadeWatcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderFacadeWatcher.class);

//    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" +
//            "&& args(order, userId) && target(object)")
//    public void logEvent(OrderDto order, Long userId, Object object) {
//        LOGGER.info("Logging the event: OrderFacade processOrder call:\n" +
//                "Class: " + object.getClass().getName() +
//                "\nArgs: OrderDto: " + order.getItems().stream().toString() +
//                "\nUserId: " + userId);
//    }

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public void logEvent() {
        LOGGER.info("\nLogging the event: OrderFacade processOrder method call");
    }
}
