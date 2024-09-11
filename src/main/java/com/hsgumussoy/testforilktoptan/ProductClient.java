package com.hsgumussoy.testforilktoptan;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
/*@FeignClient(name = "ilkToptanFeignClient", url = "https://www.ilktoptan.com")
public interface IlkToptanFeignClient {
    @GetMapping(value = "/export.xml")
    String getExportXml();
}*/
@FeignClient(name = "productClient", url = "https://www.ilktoptan.com")
public interface ProductClient {
    @GetMapping("/ilktoptan")
    String getProductData();
}
