package by.egar.shop.dao.impl;

import by.egar.shop.dao.ProductDao;
import by.egar.shop.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Denis Khalaev
 */
@Repository
public class ProductDaoImpl implements ProductDao {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addProduct(Product product) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(product);
    }

    @Override
    public void addProductList(List<Product> productList) {
        productList.forEach(this::addProduct);
    }

    @Override
    public Product getProductById(String idProduct) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Product.class, idProduct);
    }

    @Override
    public List<Product> getProductList() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Product").list();
    }
}
