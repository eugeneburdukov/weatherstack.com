package requestutils;

import com.google.gson.Gson;
import com.jayway.restassured.response.Response;
import entity.Current;
import entity.Result;

import java.util.Map;

import static com.jayway.restassured.RestAssured.*;

public class RequestsUtils {
    /*
    http://api.weatherstack.com/current
    ? access_key = YOUR_ACCESS_KEY
    & query = New York
     */

    protected Response getCurrentWeather(String uri, Map<String, String> requestParameters) {
        return given()
                .queryParameters(requestParameters)
//                .log()
//                .all()
                .when()
                .get(uri)
                .then()
//                .log()
//                .all()
                .extract()
                .response();
    }

    public Current getCurrent(Response response) {
        return new Gson().fromJson(response.getBody().asString(), Current.class);
    }

    public Result getResponse(Response response) {
        return new Gson().fromJson(response.getBody().asString(), Result.class);

        // 1 входящие данные 2 во что десериализируем
    }

}
