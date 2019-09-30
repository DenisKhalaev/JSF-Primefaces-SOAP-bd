package by.egar.shop.model;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * @author Denis Khalaev
 */
@Entity
@Table(name = "orders")
public class Orders {

    @Id
    @Column(name = "id_order")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idOrder;
    @Column(name = "name_client")
    private String nameClient;
    @Column(name = "address_client")
    private String addressClient;
    @Column(name = "sum_order")
    private int sumOrder = 0;
    @Column(name = "date_order")
    private LocalDateTime dateOrder;

    @OneToMany
    private List<DetailOrder> detailOrderList;

    public long getIdOrder() {
        return idOrder;
    }

    public Orders setIdOrder(long idOrder) {
        this.idOrder = idOrder;
        return this;
    }

    public String getNameClient() {
        return nameClient;
    }

    public Orders setNameClient(String nameClient) {
        this.nameClient = nameClient;
        return this;
    }

    public String getAddressClient() {
        return addressClient;
    }

    public Orders setAddressClient(String addressClient) {
        this.addressClient = addressClient;
        return this;
    }

    public int getSumOrder() {
        return sumOrder;
    }

    public Orders setSumOrder(int sumOrder) {
        this.sumOrder = sumOrder;
        return this;
    }

    public LocalDateTime getDateOrder() {
        return dateOrder;
    }

    public Orders setDateOrder(LocalDateTime dateOrder) {
        this.dateOrder = dateOrder;
        return this;
    }

    public List<DetailOrder> getDetailOrderList() {
        return detailOrderList;
    }

    public void setDetailOrderList(List<DetailOrder> detailOrderList) {
        this.detailOrderList = detailOrderList;
    }

    public String getFormattedDateTime(){
        return dateOrder.format(DateTimeFormatter.ISO_DATE_TIME);
    }

    @Override
    public String toString() {
        return idOrder + " " + nameClient + " " + addressClient + " " + sumOrder + " " + dateOrder;
    }
}
