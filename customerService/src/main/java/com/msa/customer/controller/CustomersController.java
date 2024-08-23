package com.msa.customer.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customers")
@Slf4j
public class CustomersController {

    @GetMapping("/{customerId}")
    public String getCustomerDetail(@PathVariable String customerId) {
        log.info("[CUSTOMER SERVICE : " + this.getClass().getName() + "] getCustomerDetail start........");
        log.info("request customerID : " + customerId);

        return "[ CUSTOMER SERVICE.......Customer id = " + customerId + " at " + System.currentTimeMillis() + " ]";
    }
}
