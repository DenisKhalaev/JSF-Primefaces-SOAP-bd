package by.egar.shop.controller;

import by.egar.shop.model.DetailOrder;
import by.egar.shop.model.Orders;
import by.egar.shop.model.Product;
import by.egar.shop.service.DetailOrderService;
import by.egar.shop.service.OrderService;
import by.egar.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.xml.bind.JAXBException;
import java.util.List;

/**
 * @author Denis Khalaev
 */
@Controller
public class ShopController {

    private final ProductService productService;
    private final OrderService orderService;
    private final DetailOrderService detailOrderService;

    @Autowired
    public ShopController(ProductService productService, OrderService orderService, DetailOrderService detailOrderService) throws JAXBException {
        this.productService = productService;
        this.orderService = orderService;
        this.detailOrderService = detailOrderService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView allProducts() {
        List<Orders> orderList = orderService.getOrderList();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("orderList", orderList);
        return modelAndView;
    }

    @RequestMapping(value = "/order/{idOrder}", method = RequestMethod.GET)
    public ModelAndView productListByOrder(@PathVariable("idOrder") Long idOrder) {
        Orders order = orderService.getOrderById(idOrder);
        List<DetailOrder> detailOrder = detailOrderService.getAllDetailOrderListByOrder(idOrder);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("order");
        modelAndView.addObject("order", order);
        modelAndView.addObject("detailOrder", detailOrder);
        return modelAndView;
    }

    @RequestMapping(value = "/product", method = RequestMethod.GET)
    public ModelAndView productListByOrder() {
        List<Product> productList = productService.getProductList();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("product");
        modelAndView.addObject("productList", productList);
        return modelAndView;
    }

    @RequestMapping(value = "/xml", method = RequestMethod.GET)
    public ModelAndView addProductFromXml() throws JAXBException {
        this.productService.addProductListFromXML();
        List<Orders> orderList = orderService.getOrderList();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("orderList", orderList);
        return modelAndView;
    }
}
