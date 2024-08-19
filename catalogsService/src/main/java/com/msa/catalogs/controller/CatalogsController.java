package com.msa.catalogs.controller;

import com.msa.catalogs.service.CustomerApiService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/catalogs")
@Slf4j
public class CatalogsController {

    private final CustomerApiService customerApiService;

    @GetMapping("/customerInfo/{customerId}")
    public String getCustomerInfo(@PathVariable String customerId) {
        String customerInfo = customerApiService.getCustomerDetail(customerId);
        log.debug("response customerInfo : " + customerInfo);

        return String.format("[Customer id = %s at %s %s ]", customerId, System.currentTimeMillis(), customerInfo);
    }

}
