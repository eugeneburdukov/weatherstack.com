package requestutils;

import com.jayway.restassured.response.Response;

import java.util.Map;

import static com.jayway.restassured.RestAssured.*;

public class Requests {
    /*
    http://api.weatherstack.com/current
    ? access_key = YOUR_ACCESS_KEY
    & query = New York
     */

    protected Response getCurrentWeather(String uri, Map<String, String> requestParameters) {
        return given()
                .queryParameters(requestParameters)
                .log()
                .all()
                .when()
                .get(uri)
                .then()
                .log()
                .all()
                .extract()
                .response();
    }
}
