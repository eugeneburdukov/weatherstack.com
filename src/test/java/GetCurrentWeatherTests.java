import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.testng.annotations.Test;
import requestutils.Requests;

import java.util.HashMap;
import java.util.Map;

    /*
    http://api.weatherstack.com/current
    ? access_key = YOUR_ACCESS_KEY
    & query = New York
     */

public class GetCurrentWeatherTests extends Requests {
    Map<String, String> requestParameters = new HashMap<>();
//    String uri = "http://api.weatherstack.com/current";

    @Test
    public void test1(){
        requestParameters.put(UserCredentials.ACCESS_KEY_KEY, UserCredentials.ACCESS_KEY);
        requestParameters.put(UserCredentials.ACCESS_QUERY, "Los Angeles");

//        System.out.println(requestParameters);
        getCurrentWeather(ForeCastTypes.CURRENT.getUrl(),requestParameters);

    }
}
