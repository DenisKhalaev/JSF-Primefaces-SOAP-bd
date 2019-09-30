package by.egar.shop.service.impl;

import by.egar.shop.dao.OrderDao;
import by.egar.shop.model.Orders;
import by.egar.shop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Denis Khalaev
 */
@Service
public class OrderServiceImpl implements OrderService {

    private final OrderDao orderDao;

    @Autowired
    public OrderServiceImpl(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    @Override
    @Transactional
    public Orders getOrderById(Long idOrder) {
        return orderDao.getOrderById(idOrder);
    }

    @Override
    @Transactional
    public List<Orders> getOrderList() {
        return orderDao.getOrderList();
    }
}
