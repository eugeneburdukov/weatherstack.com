package entity;

import com.google.gson.annotations.SerializedName;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;

import java.util.List;

public class Current {

    @SerializedName("weather_descriptions")
    private List<String> weatherDescriptions;

    @SerializedName("observation_time")
    private String observationTime;

    @SerializedName("wind_degree")
    private int windDegree;

    @SerializedName("visibility")
    private int visibility;

    @SerializedName("weather_icons")
    private List<String> weatherIcons;

    @SerializedName("feelslike")
    private int feelslike;

    @SerializedName("is_day")
    private String isDay;

    @SerializedName("wind_dir")
    private String windDir;

    @SerializedName("pressure")
    private int pressure;

    @SerializedName("cloudcover")
    private int cloudcover;

    @SerializedName("precip")
    private int precip;

    @SerializedName("uv_index")
    private int uvIndex;

    @SerializedName("temperature")
    private int temperature;

    @SerializedName("humidity")
    private int humidity;

    @SerializedName("wind_speed")
    private int windSpeed;

    @SerializedName("weather_code")
    private int weatherCode;

    public Current() {
    }

    public void setWeatherDescriptions(List<String> weatherDescriptions) {
        this.weatherDescriptions = weatherDescriptions;
    }

    public List<String> getWeatherDescriptions() {
        return weatherDescriptions;
    }

    public void setObservationTime(String observationTime) {
        this.observationTime = observationTime;
    }

    public String getObservationTime() {
        return observationTime;
    }

    public void setWindDegree(int windDegree) {
        this.windDegree = windDegree;
    }

    public int getWindDegree() {
        return windDegree;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setWeatherIcons(List<String> weatherIcons) {
        this.weatherIcons = weatherIcons;
    }

    public List<String> getWeatherIcons() {
        return weatherIcons;
    }

    public void setFeelslike(int feelslike) {
        this.feelslike = feelslike;
    }

    public int getFeelslike() {
        return feelslike;
    }

    public void setIsDay(String isDay) {
        this.isDay = isDay;
    }

    public String getIsDay() {
        return isDay;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getPressure() {
        return pressure;
    }

    public void setCloudcover(int cloudcover) {
        this.cloudcover = cloudcover;
    }

    public int getCloudcover() {
        return cloudcover;
    }

    public void setPrecip(int precip) {
        this.precip = precip;
    }

    public int getPrecip() {
        return precip;
    }

    public void setUvIndex(int uvIndex) {
        this.uvIndex = uvIndex;
    }

    public int getUvIndex() {
        return uvIndex;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public void setWeatherCode(int weatherCode) {
        this.weatherCode = weatherCode;
    }

    public int getWeatherCode() {
        return weatherCode;
    }

    public Current getCurrentWeatherJson(Response response) {
        return new JsonPath(response.getBody().asString()).getObject("current", Current.class);
    }

    @Override
    public String toString() {
        return
                "test.Current{" +
                        "weather_descriptions = '" + weatherDescriptions + '\'' +
                        ",observation_time = '" + observationTime + '\'' +
                        ",wind_degree = '" + windDegree + '\'' +
                        ",visibility = '" + visibility + '\'' +
                        ",weather_icons = '" + weatherIcons + '\'' +
                        ",feelslike = '" + feelslike + '\'' +
                        ",is_day = '" + isDay + '\'' +
                        ",wind_dir = '" + windDir + '\'' +
                        ",pressure = '" + pressure + '\'' +
                        ",cloudcover = '" + cloudcover + '\'' +
                        ",precip = '" + precip + '\'' +
                        ",uv_index = '" + uvIndex + '\'' +
                        ",temperature = '" + temperature + '\'' +
                        ",humidity = '" + humidity + '\'' +
                        ",wind_speed = '" + windSpeed + '\'' +
                        ",weather_code = '" + weatherCode + '\'' +
                        "}";
    }
}
