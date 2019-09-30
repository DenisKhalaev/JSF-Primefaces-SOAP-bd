package by.egar.shop.model;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

/**
 * @author Denis Khalaev
 */
@Entity
@Table(name = "product")
public class Product {

    @Id
    @Column(name = "id_product")
    private String idProduct;
    @Column(name = "name_product")
    private String nameProduct;
    @Column(name = "description")
    private String description;
    @Column(name = "date")
    private LocalDate date;
    @Column(name = "price")
    private int price;
    @OneToMany(mappedBy = "product")
    private List<DetailOrder> detailOrderList;

    public String getIdProduct() {
        return idProduct;
    }

    public Product setIdProduct(String idProduct) {
        this.idProduct = idProduct;
        return this;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public Product setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Product setDescription(String description) {
        this.description = description;
        return this;
    }

    public LocalDate getDate() {
        return date;
    }

    public Product setDate(LocalDate date) {
        this.date = date;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public Product setPrice(int price) {
        this.price = price;
        return this;
    }

    public List<DetailOrder> getDetailOrderList() {
        return detailOrderList;
    }

    public void setDetailOrderList(List<DetailOrder> detailOrderList) {
        this.detailOrderList = detailOrderList;
    }

    @Override
    public String toString() {
        return idProduct + " " + nameProduct + " " + description + " " + date + " " + price;
    }
}
