package com.example.springboot.controller;

import com.example.springboot.constant.CONSTANT;
import com.example.springboot.model.Check;
import com.example.springboot.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(CONSTANT.PAYMENT)
public class PaymentController {
    @Autowired
    PaymentService paymentService;

//    @PostMapping(value = "/createPayment")
//    public String createPayment(@RequestBody Check check) {
//        return paymentService.createPayment(check);
//    }

    @PostMapping(CONSTANT.CREATEPAYMENT)
    public String createcheckPayment(@RequestBody Check check) {
        return paymentService.createPayment(check);
    }
}
