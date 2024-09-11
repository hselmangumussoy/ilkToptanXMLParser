package com.hsgumussoy.testforilktoptan.feign;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.GetMapping;
@FeignClient(name = "productClient", url = "https://www.ilktoptan.com")
public interface ProductClient {
    @GetMapping("/ilktoptan")
    String getProductData();
}
