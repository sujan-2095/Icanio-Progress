package com.trial;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("1cardPayment")
@Primary
public class CardPayment implements PaymentService {

    @Override
    public String pay() {
        return "Payment made using Card";
    }
}