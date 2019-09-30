package by.egar.shop.dao.impl;

import by.egar.shop.dao.OrderDao;
import by.egar.shop.model.Orders;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Denis Khalaev
 */
@Repository
public class OrderDaoImpl implements OrderDao {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Orders getOrderById(Long idOrder) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Orders.class, idOrder);
    }

    @Override
    public List<Orders> getOrderList() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Orders").list();
    }
}
