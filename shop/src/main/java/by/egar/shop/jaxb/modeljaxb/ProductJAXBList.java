package by.egar.shop.jaxb.modeljaxb;

import by.egar.shop.jaxb.modeljaxb.ProductJAXB;
import by.egar.shop.model.Product;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Denis Khalaev
 */

@XmlRootElement(name = "products")
@XmlAccessorType (XmlAccessType.FIELD)
public class ProductJAXBList {

    @XmlElement(name = "product")
    private List<ProductJAXB> productList = null;

    public List<ProductJAXB> getProductList() {
        return productList;
    }

    public void setProductList(List<ProductJAXB> productList) {
        this.productList = productList;
    }
}
