package com.msa.catalogs.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "customer", url = "http://localhost:8082")
public interface CatalogsClient {

    @GetMapping("/customers/{customerId}")
    String getCustomerDetail(@PathVariable String customerId);
}
