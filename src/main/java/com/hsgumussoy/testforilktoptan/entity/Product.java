package com.hsgumussoy.testforilktoptan.entity;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "product")
public class Product {
    private String productName;
    private String productModel;
    private String productBarcode;
    private String productSupplier;
    private String productCategory1;
    private String productCategory2;
    private String productCategory3;
    private String productDescription;
    private double productPrice1;
    private double productPrice2;
    private double productBrand;
    private int productStock;
    private String productMainImageUrl;
    private String productExtraImageUrl1;
    private String productExtraImageUrl2;
    private String productExtraImageUrl3;
    private String productExtraImageUrl4;
    private String productExtraImageUrl5;
    private String productExtraImageUrl6;
    private double productWeight;
    @XmlElement(name = "urun_adi")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    @XmlElement(name = "urun_modeli")
    public String getProductModel() {
        return productModel;
    }

    public void setProductModel(String productModel) {
        this.productModel = productModel;
    }
    @XmlElement(name = "urun_barkod")
    public String getProductBarcode() {
        return productBarcode;
    }

    public void setProductBarcode(String productBarcode) {
        this.productBarcode = productBarcode;
    }
    @XmlElement(name = "tedarikci")
    public String getProductSupplier() {
        return productSupplier;
    }

    public void setProductSupplier(String productSupplier) {
        this.productSupplier = productSupplier;
    }
    @XmlElement(name = "urun_kategorisi1")
    public String getProductCategory1() {
        return productCategory1;
    }

    public void setProductCategory1(String productCategory1) {
        this.productCategory1 = productCategory1;
    }
    @XmlElement(name = "urun_kategorisi2")
    public String getProductCategory2() {
        return productCategory2;
    }

    public void setProductCategory2(String productCategory2) {
        this.productCategory2 = productCategory2;
    }
    @XmlElement(name = "urun_kategorisi3")
    public String getProductCategory3() {
        return productCategory3;
    }

    public void setProductCategory3(String productCategory3) {
        this.productCategory3 = productCategory3;
    }
    @XmlElement(name = "urun_aciklamasi")
    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    @XmlElement(name = "urun_fiyati")
    public double getProductPrice1() {
        return productPrice1;
    }

    public void setProductPrice1(double productPrice1) {
        this.productPrice1 = productPrice1;
    }
    @XmlElement(name = "urun_fiyati1")
    public double getProductPrice2() {
        return productPrice2;
    }

    public void setProductPrice2(double productPrice2) {
        this.productPrice2 = productPrice2;
    }
    @XmlElement(name = "urun_marka")
    public double getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(double productBrand) {
        this.productBrand = productBrand;
    }
    @XmlElement(name = "urun_stok")
    public double getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }
    @XmlElement(name = "urun_ana_resim")
    public String getProductMainImageUrl() {
        return productMainImageUrl;
    }

    public void setProductMainImageUrl(String productMainImageUrl) {
        this.productMainImageUrl = productMainImageUrl;
    }
    @XmlElement(name = "urun_ek_resimler1")
    public String getProductExtraImageUrl1() {
        return productExtraImageUrl1;
    }

    public void setProductExtraImageUrl1(String productExtraImageUrl1) {
        this.productExtraImageUrl1 = productExtraImageUrl1;
    }
    @XmlElement(name = "urun_ek_resimler2")
    public String getProductExtraImageUrl2() {
        return productExtraImageUrl2;
    }

    public void setProductExtraImageUrl2(String productExtraImageUrl2) {
        this.productExtraImageUrl2 = productExtraImageUrl2;
    }
    @XmlElement(name = "urun_ek_resimler3")
    public String getProductExtraImageUrl3() {
        return productExtraImageUrl3;
    }

    public void setProductExtraImageUrl3(String productExtraImageUrl3) {
        this.productExtraImageUrl3 = productExtraImageUrl3;
    }
    @XmlElement(name = "urun_ek_resimler4")
    public String getProductExtraImageUrl4() {
        return productExtraImageUrl4;
    }

    public void setProductExtraImageUrl4(String productExtraImageUrl4) {
        this.productExtraImageUrl4 = productExtraImageUrl4;
    }
    @XmlElement(name = "urun_ek_resimler5")
    public String getProductExtraImageUrl5() {
        return productExtraImageUrl5;
    }

    public void setProductExtraImageUrl5(String productExtraImageUrl5) {
        this.productExtraImageUrl5 = productExtraImageUrl5;
    }
    @XmlElement(name = "urun_ek_resimler6")
    public String getProductExtraImageUrl6() {
        return productExtraImageUrl6;
    }

    public void setProductExtraImageUrl6(String productExtraImageUrl6) {
        this.productExtraImageUrl6 = productExtraImageUrl6;
    }
    @XmlElement(name = "urun_agirlik")
    public double getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(double productWeight) {
        this.productWeight = productWeight;
    }
}
