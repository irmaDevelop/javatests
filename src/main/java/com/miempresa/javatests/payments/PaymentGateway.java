package com.miempresa.javatests.payments;

public interface PaymentGateway {
    //pasarela de pago

    PaymentResponse requestPayment(PaymentRequest request);

}
