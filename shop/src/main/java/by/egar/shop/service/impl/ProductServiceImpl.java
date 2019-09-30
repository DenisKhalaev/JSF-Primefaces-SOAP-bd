package by.egar.shop.service.impl;

import by.egar.shop.dao.ProductDao;
import by.egar.shop.dao.impl.ProductDaoImpl;
import by.egar.shop.jaxb.service.ProductXMLService;
import by.egar.shop.jaxb.service.impl.ProductXMLServiceImpl;
import by.egar.shop.model.Product;
import by.egar.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.xml.bind.JAXBException;
import java.util.List;

/**
 * @author Denis Khalaev
 */
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductDao productDao;

    @Autowired
    public ProductServiceImpl(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    @Transactional
    public void addProduct(Product product) {
        productDao.addProduct(product);
    }

    @Override
    @Transactional
    public void addProductList(List<Product> productList) {
        productDao.addProductList(productList);
    }

    @Override
    @Transactional
    public Product getProductById(String idProduct) {
        return productDao.getProductById(idProduct);
    }

    @Override
    @Transactional
    public List<Product> getProductList() {
        return productDao.getProductList();
    }

    @Override
    @Transactional
    public void addProductListFromXML() {
        productDao.addProductList(new ProductXMLServiceImpl().getProductListFromXML());
    }
}
