package com.stripetries;
import com.stripe.Stripe;
import com.stripe.model.Customer;
import com.stripe.model.CustomerCollection;
import com.stripe.net.RequestOptions;
import com.stripe.param.CustomerListParams;

public class Authentication {
    public static void main(String[] args) {
        try {
            //Stripe.apiKey = "sk_test_4eC39HqLyjWDarjtT1zdp7dc";

            RequestOptions requestOptions = RequestOptions.builder().
                    setStripeAccount("").
                    setApiKey("").build();
            Customer customer = Customer.retrieve("",
                    requestOptions);
            CustomerListParams params = CustomerListParams.builder().build();
            CustomerCollection customers = Customer.list(params,requestOptions);
            System.out.println(customers);
        } catch (Exception e) {
            System.out.println(e);

        }
    }
}
