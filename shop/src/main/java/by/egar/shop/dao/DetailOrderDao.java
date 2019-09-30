package by.egar.shop.dao;

import by.egar.shop.model.DetailOrder;
import by.egar.shop.model.Orders;
import by.egar.shop.model.Product;

import java.util.List;

/**
 * @author Denis Khalaev
 */
public interface DetailOrderDao {

    List<DetailOrder> getAllDetailOrderListByOrder(long orderId);
}