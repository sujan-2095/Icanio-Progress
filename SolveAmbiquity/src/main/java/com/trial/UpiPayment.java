package com.trial;

import org.springframework.stereotype.Component;

@Component("1upiPayment")
public class UpiPayment implements PaymentService {

    @Override
    public String pay() {
        return "Payment made using UPI";
    }
}