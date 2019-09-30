package by.egar.shop.dao;

import by.egar.shop.model.Product;

import java.util.List;

/**
 * @author Denis Khalaev
 */
public interface ProductDao {

    void addProduct(Product product);

    void addProductList(List<Product> productList);

    Product getProductById(String idProduct);

    List<Product> getProductList();
}
