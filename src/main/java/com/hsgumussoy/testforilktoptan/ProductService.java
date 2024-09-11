package com.hsgumussoy.testforilktoptan;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.StringReader;
import java.util.List;

/*@Service
public class IlkToptanServiceImpl {
    private final IlkToptanFeignClient ilkToptanFeignClient;

    @Autowired
    public IlkToptanServiceImpl(IlkToptanFeignClient ilkToptanFeignClient) {
        this.ilkToptanFeignClient = ilkToptanFeignClient;
    }

    public String fetchXmlData() {
        try {
            // XML verisini IlkToptanFeignClient üzerinden çek
            return ilkToptanFeignClient.getExportXml();
        } catch (Exception e) {
            // Eğer XML verisini alırken hata oluşursa, burada yönet
            System.err.println("Error fetching XML data: " + e.getMessage());
            e.printStackTrace();
            return null; // Hata durumunda null döndürülebilir
        }
    }

    public List<Product> convertXmlToJava(String xml) throws JAXBException {
        if (xml == null || xml.isEmpty()) {
            throw new IllegalArgumentException("XML data is null or empty");
        }
        JAXBContext jaxbContext = JAXBContext.newInstance(ProductList.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        StringReader reader = new StringReader(xml);
        ProductList wrapper = (ProductList) unmarshaller.unmarshal(reader);
        return wrapper.getProductList();
    }
}*/
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