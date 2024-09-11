package com.hsgumussoy.testforilktoptan.service;

import com.hsgumussoy.testforilktoptan.entity.Urunler;
import com.hsgumussoy.testforilktoptan.feign.ProductClient;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.StringReader;

@Service
public class ProductService {

    @Autowired
    private ProductClient productClient;

    public Urunler fetchProducts() throws JAXBException {
        String xmlData = productClient.getProductData();

        JAXBContext jaxbContext = JAXBContext.newInstance(Urunler.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        StringReader reader = new StringReader(xmlData);
        return (Urunler) unmarshaller.unmarshal(reader);
    }
}