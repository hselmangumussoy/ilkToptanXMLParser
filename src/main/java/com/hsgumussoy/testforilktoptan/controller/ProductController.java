package com.hsgumussoy.testforilktoptan.controller;

import com.hsgumussoy.testforilktoptan.service.ProductService;
import com.hsgumussoy.testforilktoptan.entity.Urunler;
import jakarta.xml.bind.JAXBException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<Urunler> getProducts() throws JAXBException {
        return ResponseEntity.ok(productService.fetchProducts());
    }
}