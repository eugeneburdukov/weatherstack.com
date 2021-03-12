package test.java.currentweathertest;

import com.jayway.restassured.response.Response;
import entity.Location;
import entity.Result;
import org.testng.Assert;
import org.testng.annotations.Test;
import requestutils.ForeCastTypes;
import requestutils.RequestsUtils;
import requestutils.UserCredentials;

import java.util.HashMap;
import java.util.Map;

    /*
    http://api.weatherstack.com/current
    ? access_key = YOUR_ACCESS_KEY
    & query = New York
     */

public class GetCurrentWeatherTest extends RequestsUtils {
    Map<String, String> requestParameters = new HashMap<>();
//    String uri = "http://api.weatherstack.com/current";

    @Test
    public void test1(){
        requestParameters.put(UserCredentials.ACCESS_KEY_KEY, UserCredentials.ACCESS_KEY);
        requestParameters.put(UserCredentials.ACCESS_QUERY, "Toronto");

        Response response = getCurrentWeather(ForeCastTypes.CURRENT.getUrl(),requestParameters);

        Result result1 = getResponse(response);

//        System.out.println(response.getBody().prettyPrint());
//        System.out.println(result1.getCurrent().getHumidity());

//        Current current = new Current().getCurrentWeatherJson(response);
//
//        System.out.println(current.getTemperature());

        Location location = new Location().getCurrentWeatherJsonLocation(response);
        System.out.println(location.getName());

        Assert.assertEquals(location.getName(),requestParameters.get("query"));
    }
}
