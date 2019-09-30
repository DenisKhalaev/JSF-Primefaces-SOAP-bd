package by.egar.shop.model;


import javax.persistence.*;

/**
 * @author Denis Khalaev
 */
@Entity
@Table(name = "product_detail_order")
public class DetailOrder {

    @Id
    @Column(name = "id_detail_order")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDetailOrder;
    @Column(name = "quantity")
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Orders order;

    public long getIdDetailOrder() {
        return idDetailOrder;
    }

    public DetailOrder setIdDetailOrder(long idDetailOrder) {
        this.idDetailOrder = idDetailOrder;
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

    public Orders getOrder() {
        return order;
    }

    public DetailOrder setOrder(Orders order) {
        this.order = order;
        return this;
    }
}
