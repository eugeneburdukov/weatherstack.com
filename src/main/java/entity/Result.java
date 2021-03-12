package entity;

import com.google.gson.annotations.SerializedName;

public class Result {

	@SerializedName("request")
	private Request request;

	@SerializedName("current")
	private Current current;

	@SerializedName("location")
	private Location location;

	public void setRequest(Request request){
		this.request = request;
	}

	public Request getRequest(){
		return request;
	}

	public void setCurrent(Current current){
		this.current = current;
	}

	public Current getCurrent(){
		return current;
	}

	public void setLocation(Location location){
		this.location = location;
	}

	public Location getLocation(){
		return location;
	}

	@Override
 	public String toString(){
		return 
			"entity.Response{" +
			"request = '" + request + '\'' + 
			",current = '" + current + '\'' + 
			",location = '" + location + '\'' + 
			"}";
		}
}
