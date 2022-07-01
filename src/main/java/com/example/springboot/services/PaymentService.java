package com.example.springboot.services;

import com.example.springboot.model.Check;
import com.example.springboot.model.CreditCard;
import com.example.springboot.model.Payment;
import org.springframework.stereotype.Service;

@Service
public interface PaymentService {
    String createPayment(Check check);
}
