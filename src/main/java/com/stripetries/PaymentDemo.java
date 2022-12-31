package com.stripetries;

import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import com.stripe.param.PaymentIntentCreateParams;

public class PaymentDemo {
    public static void main(String[] args) {
        PaymentIntentCreateParams paymentIntentCreateParams = PaymentIntentCreateParams.builder().setAmount(1000L).
                setCurrency("USD").build();

        try {
            PaymentIntent paymentIntent = PaymentIntent.create(paymentIntentCreateParams);
            System.out.println(paymentIntent.getId());
            System.out.println(paymentIntent.getStatus());
        } catch (StripeException e) {
            e.printStackTrace();
        }
    }
}
