package by.egar.servertime.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * @author Denis Khalaev
 */

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface TimeWebService {

    @WebMethod
    String getTime();
}
