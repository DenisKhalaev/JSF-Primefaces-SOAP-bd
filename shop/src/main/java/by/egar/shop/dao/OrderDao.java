package by.egar.shop.dao;

import by.egar.shop.model.Orders;

import java.util.List;

/**
 * @author Denis Khalaev
 */
public interface OrderDao {

    Orders getOrderById(Long idOrder);

    List<Orders> getOrderList();
}
