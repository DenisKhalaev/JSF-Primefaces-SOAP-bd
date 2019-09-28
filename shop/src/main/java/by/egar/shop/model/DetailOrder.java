package by.egar.shop.model;



/**
 * @author Denis Khalaev
 */

public class DetailOrder {


    private long idDetail;
    private int quantity;


    private Product product;


    private Order order;

    public long getIdDetail() {
        return idDetail;
    }

    public DetailOrder setIdDetail(long idDetail) {
        this.idDetail = idDetail;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public DetailOrder setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public Product getProduct() {
        return product;
    }

    public DetailOrder setProduct(Product product) {
        this.product = product;
        return this;
    }

    public Order getOrder() {
        return order;
    }

    public DetailOrder setOrder(Order order) {
        this.order = order;
        return this;
    }
}
