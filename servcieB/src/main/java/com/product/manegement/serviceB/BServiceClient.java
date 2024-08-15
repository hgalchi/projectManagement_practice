package com.product.manegement.serviceB;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service-b", url = "${service.b.url}")
public interface BServiceClient {
    @GetMapping("/hello")
    public String getHello();
}
