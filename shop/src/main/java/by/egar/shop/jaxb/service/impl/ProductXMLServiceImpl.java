package by.egar.shop.jaxb.service.impl;

import by.egar.shop.jaxb.modeljaxb.ProductJAXB;
import by.egar.shop.jaxb.modeljaxb.ProductJAXBList;
import by.egar.shop.jaxb.service.ProductXMLService;
import by.egar.shop.model.Product;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Denis Khalaev
 */
public class ProductXMLServiceImpl implements ProductXMLService {

    private static final String PATH = "shop/src/main/resources/product/";
    private static final String FILENAME = "products.xml";

    @Override
    public List<Product> getProductListFromXML() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(ProductJAXBList.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        ProductJAXBList productJAXBFromXML = (ProductJAXBList) jaxbUnmarshaller.unmarshal(new File(PATH + FILENAME));
        List<Product> productList = new ArrayList<>();
        productJAXBFromXML.getProductList().forEach(e -> productList.add(convertProductJAXBToProduct(e)));
        return productList;
    }

    private Product convertProductJAXBToProduct(ProductJAXB productJAXB) {
        return new Product().setIdProduct(productJAXB.getIdProduct())
                .setNameProduct(productJAXB.getNameProduct())
                .setDescription(productJAXB.getDescription())
                .setDate(productJAXB.getDate())
                .setPrice(productJAXB.getPrice());
    }
}
