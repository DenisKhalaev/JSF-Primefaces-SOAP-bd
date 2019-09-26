package by.egar.servertime.soap;

import javax.jws.WebService;
import java.time.Clock;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * @author Denis Khalaev
 */
@WebService(endpointInterface = "by.egar.servertime.soap.TimeWebService")
public class TimeWebServiceImpl implements TimeWebService {

    @Override
    public String getTime() {
        Clock clock = Clock.system(ZoneId.of("Europe/Moscow"));
        LocalTime ldt2 = LocalTime.now(clock);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm");
        return ldt2.format(formatter);
    }
}
