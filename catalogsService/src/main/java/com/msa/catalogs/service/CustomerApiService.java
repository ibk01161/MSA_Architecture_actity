package com.msa.catalogs.service;

import com.msa.catalogs.client.CatalogsClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class CustomerApiService {

    private final CatalogsClient catalogsClient;

    public String getCustomerDetail(String customerId) {
        log.info("[CATALOGS SERVICE : " + this.getClass().getName() + "] getCustomerDetail start........");
        //return customerId;
        return catalogsClient.getCustomerDetail(customerId);
    }
}
