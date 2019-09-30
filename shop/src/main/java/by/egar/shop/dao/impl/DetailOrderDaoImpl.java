package by.egar.shop.dao.impl;

import by.egar.shop.dao.DetailOrderDao;
import by.egar.shop.model.DetailOrder;
import by.egar.shop.model.Orders;
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
public class DetailOrderDaoImpl implements DetailOrderDao {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<DetailOrder> getAllDetailOrderListByOrder(long orderId) {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from DetailOrder where order_id = :orderId").setParameter("orderId", orderId).list();
    }
}
