package com.trial;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    private final PaymentService cardPayment;
    private final PaymentService upiPayment;

    //DI
    public PaymentController(
            PaymentService cardPayment,
            @Qualifier("1upiPayment") PaymentService upiPayment) {

        this.cardPayment = cardPayment;
        this.upiPayment = upiPayment;
    }

    @GetMapping("/card")
    public String defaultPayment() {
        return cardPayment.pay();
    }

    @GetMapping("/upi")
    public String upiPayment() {
        return upiPayment.pay();
    }
}