package com.example.feignservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value ="feignDemo" , url ="http://localhost:9090/user")
public interface FeignUtil {

    @GetMapping("/name")
    public String getName();

    @GetMapping("/address")
    public String getAddress();

    @GetMapping("/status")
    public String getStatus();
}
