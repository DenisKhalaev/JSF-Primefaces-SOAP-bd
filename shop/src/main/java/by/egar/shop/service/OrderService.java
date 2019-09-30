package by.egar.shop.service;

import by.egar.shop.model.Orders;

import java.util.List;

/**
 * @author Denis Khalaev
 */
public interface OrderService {

    Orders getOrderById(Long idOrder);

    List<Orders> getOrderList();
}
