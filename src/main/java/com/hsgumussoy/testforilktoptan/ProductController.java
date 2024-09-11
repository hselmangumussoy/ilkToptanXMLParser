package com.hsgumussoy.testforilktoptan;

import jakarta.xml.bind.JAXBException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*@RestController
@RequestMapping("/products")
public class IlkToptanController {
    private final IlkToptanServiceImpl service;

    @Autowired
    public IlkToptanController(IlkToptanServiceImpl service) {
        this.service = service;
    }

    @GetMapping
    public List<Product> getProducts() {
        try {
            String xmlData = service.fetchXmlData();
            return service.convertXmlToJava(xmlData);
        } catch (JAXBException e) {
            e.printStackTrace();
            return null; // Hata durumunda uygun bir yanıt döndürmelisiniz.
        }
    }
}*/
@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<Urunler> getProducts() throws JAXBException {
        return ResponseEntity.ok(productService.fetchProducts());
    }
}