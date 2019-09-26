package by.egar.servertime;

import by.egar.servertime.soap.TimeWebService;
import by.egar.servertime.soap.TimeWebServiceImplService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * @author Denis Khalaev
 */
@ManagedBean
@ViewScoped
public class TimeBean {

    private String dateTime;

    public TimeBean() {
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @PostConstruct
    public void updateDateTime() {
        TimeWebServiceImplService timeService = new TimeWebServiceImplService();
        TimeWebService time = timeService.getTimeWebServiceImplPort();
        dateTime = time.getTime();
    }
}
