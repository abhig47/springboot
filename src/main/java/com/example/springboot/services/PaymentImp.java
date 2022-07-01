package com.example.springboot.services;

import com.example.springboot.model.Check;
import com.example.springboot.model.CreditCard;
import com.example.springboot.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentImp implements PaymentService {
    @Autowired
    PaymentRepository paymentRepository;

    @Override
    public String createPayment(Check creditCard) {
        paymentRepository.save(creditCard);
        return "Payment Add to creditCard " + creditCard.getId();
    }
}