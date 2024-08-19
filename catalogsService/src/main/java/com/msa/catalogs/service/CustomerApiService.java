package com.msa.catalogs.service;

import org.springframework.stereotype.Service;

@Service
public class CustomerApiService {

    public String getCustomerDetail(String customerId) {
        return customerId;
    }
}
