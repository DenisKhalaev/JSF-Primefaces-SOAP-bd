package by.egar.shop.model;


import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Denis Khalaev
 */

public class Order {


    private long idOrder;
    private String nameClient;
    private String addressClient;
    private int sumOrder;
    private LocalDateTime dateOrder;


    private List<DetailOrder> detailOrderList;

    public long getIdOrder() {
        return idOrder;
    }

    public Order setIdOrder(long idOrder) {
        this.idOrder = idOrder;
        return this;
    }

    public String getNameClient() {
        return nameClient;
    }

    public Order setNameClient(String nameClient) {
        this.nameClient = nameClient;
        return this;
    }

    public String getAddressClient() {
        return addressClient;
    }

    public Order setAddressClient(String addressClient) {
        this.addressClient = addressClient;
        return this;
    }

    public int getSumOrder() {
        return sumOrder;
    }

    public Order setSumOrder(int sumOrder) {
        this.sumOrder = sumOrder;
        return this;
    }

    public LocalDateTime getDateOrder() {
        return dateOrder;
    }

    public Order setDateOrder(LocalDateTime dateOrder) {
        this.dateOrder = dateOrder;
        return this;
    }

    public List<DetailOrder> getDetailOrderList() {
        return detailOrderList;
    }

    public void setDetailOrderList(List<DetailOrder> detailOrderList) {
        this.detailOrderList = detailOrderList;
    }
}
