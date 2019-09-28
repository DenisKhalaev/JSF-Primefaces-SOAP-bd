package by.egar.shop.jaxb.service;

import by.egar.shop.model.Product;

import javax.xml.bind.JAXBException;
import java.util.List;

/**
 * @author Denis Khalaev
 */
public interface ProductXMLService {

    List<Product> getProductListFromXML() throws JAXBException;
}
