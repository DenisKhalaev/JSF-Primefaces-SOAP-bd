package by.egar.shop.model;


import java.time.LocalDate;
import java.util.List;

/**
 * @author Denis Khalaev
 */
public class Product {

    private String idProduct;
    private String nameProduct;
    private String description;
    private LocalDate date;
    private int price;

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
        return "Product{" +
                "idProduct='" + idProduct + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", price=" + price +
                ", detailOrderList=" + detailOrderList +
                '}';
    }
}
