package by.egar.shop.service.impl;

import by.egar.shop.dao.DetailOrderDao;
import by.egar.shop.model.DetailOrder;
import by.egar.shop.service.DetailOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Denis Khalaev
 */
@Service
public class DetailOrderServiceImpl implements DetailOrderService {

    private final DetailOrderDao detailOrderDao;

    @Autowired
    public DetailOrderServiceImpl(DetailOrderDao detailOrderDao) {
        this.detailOrderDao = detailOrderDao;
    }

    @Override
    @Transactional
    public List<DetailOrder> getAllDetailOrderListByOrder(long orderId) {
        return detailOrderDao.getAllDetailOrderListByOrder(orderId);
    }
}
