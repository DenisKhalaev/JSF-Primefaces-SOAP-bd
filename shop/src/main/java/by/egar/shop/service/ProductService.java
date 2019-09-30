package by.egar.shop.service;

import by.egar.shop.model.Product;

import javax.xml.bind.JAXBException;
import java.util.List;

/**
 * @author Denis Khalaev
 */
public interface ProductService {

    void addProduct(Product product);

    void addProductList(List<Product> productList);

    Product getProductById(String idProduct);

    List<Product> getProductList();

    void addProductListFromXML() throws JAXBException;
}
