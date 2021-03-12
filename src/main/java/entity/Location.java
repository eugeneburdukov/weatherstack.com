package entity;

import com.google.gson.annotations.SerializedName;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;

public class Location{

	@SerializedName("localtime")
	private String localtime;

	@SerializedName("utc_offset")
	private String utcOffset;

	@SerializedName("country")
	private String country;

	@SerializedName("localtime_epoch")
	private int localtimeEpoch;

	@SerializedName("name")
	private String name;

	@SerializedName("timezone_id")
	private String timezoneId;

	@SerializedName("lon")
	private String lon;

	@SerializedName("region")
	private String region;

	@SerializedName("lat")
	private String lat;

	public Location getCurrentWeatherJsonLocation(Response response) {
		return new JsonPath(response.getBody().asString()).getObject("location", Location.class);
	}

	public void setLocaltime(String localtime){
		this.localtime = localtime;
	}

	public String getLocaltime(){
		return localtime;
	}

	public void setUtcOffset(String utcOffset){
		this.utcOffset = utcOffset;
	}

	public String getUtcOffset(){
		return utcOffset;
	}

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setLocaltimeEpoch(int localtimeEpoch){
		this.localtimeEpoch = localtimeEpoch;
	}

	public int getLocaltimeEpoch(){
		return localtimeEpoch;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setTimezoneId(String timezoneId){
		this.timezoneId = timezoneId;
	}

	public String getTimezoneId(){
		return timezoneId;
	}

	public void setLon(String lon){
		this.lon = lon;
	}

	public String getLon(){
		return lon;
	}

	public void setRegion(String region){
		this.region = region;
	}

	public String getRegion(){
		return region;
	}

	public void setLat(String lat){
		this.lat = lat;
	}

	public String getLat(){
		return lat;
	}

	@Override
 	public String toString(){
		return 
			"entity.Location{" +
			"localtime = '" + localtime + '\'' + 
			",utc_offset = '" + utcOffset + '\'' + 
			",country = '" + country + '\'' + 
			",localtime_epoch = '" + localtimeEpoch + '\'' + 
			",name = '" + name + '\'' + 
			",timezone_id = '" + timezoneId + '\'' + 
			",lon = '" + lon + '\'' + 
			",region = '" + region + '\'' + 
			",lat = '" + lat + '\'' + 
			"}";
		}
}
