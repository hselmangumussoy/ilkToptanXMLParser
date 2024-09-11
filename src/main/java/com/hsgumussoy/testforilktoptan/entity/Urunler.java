package com.hsgumussoy.testforilktoptan.entity;

import com.hsgumussoy.testforilktoptan.entity.Product;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;
@XmlRootElement(name = "Urunler")
public class Urunler {

    private List<Product> products;

    @XmlElement(name = "product")
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
