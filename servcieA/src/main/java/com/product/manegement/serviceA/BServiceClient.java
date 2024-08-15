package com.product.manegement.serviceA;


import lombok.RequiredArgsConstructor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@FeignClient(name = "service-b", url = "${service.b.url}")
public interface BServiceClient {
    @GetMapping("/hello")
    public String getHello();
}