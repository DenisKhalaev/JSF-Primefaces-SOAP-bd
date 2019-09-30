package by.egar.shop.service;

import by.egar.shop.model.DetailOrder;

import java.util.List;

/**
 * @author Denis Khalaev
 */
public interface DetailOrderService {

    List<DetailOrder> getAllDetailOrderListByOrder(long orderId);
}
