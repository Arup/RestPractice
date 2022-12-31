package com.stripetries;

import com.stripe.model.Customer;
import com.stripe.model.CustomerCollection;
import com.stripe.net.RequestOptions;
import com.stripe.param.CustomerListParams;
import com.stripe.param.CustomerUpdateParams;

import java.util.Map;

public class DemoExample {
    public static void main(String[] args) {
        CustomerListParams params = CustomerListParams.builder().setEmail("someEmail@gmail.com").build();

        try {
            //Stripe.apiKey = "";

            RequestOptions requestOptions = RequestOptions.builder().
                    setApiKey("").build();
            Customer customer = Customer.retrieve("",
                    requestOptions);
//            CustomerUpdateParams params2 = CustomerUpdateParams.builder().setInvoiceSettings(CustomerUpdateParams.
//                    InvoiceSettings.builder().addCustomField(
//                            CustomerUpdateParams.InvoiceSettings.CustomField.builder().
//                            setName("VAT").setValue("ABC123").build())).build();

            CustomerUpdateParams params2 = CustomerUpdateParams.builder().build();
            Customer updatedCustomer = customer.update(params2);
            //CustomerCollection customers = Customer.list(params,requestOptions);
            System.out.println(customer);
        } catch (Exception e) {
            System.out.println(e);

        }
    }
}
