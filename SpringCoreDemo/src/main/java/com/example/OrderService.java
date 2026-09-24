package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    // Field Injection is not recommended
//    @Autowired
    private PaymentService paymentService;

    // Constructor injection is most recommended injection type and I can run this code  without using autowrired when there is only one constructor.
    public OrderService(PaymentService paymentService){
        this.paymentService=paymentService;
    }

//    public void setPaymentService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    public void placeOrder() {
        paymentService.pay();
        System.out.println("Order Placed");
    }
}
