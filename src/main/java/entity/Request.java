package entity;

import com.google.gson.annotations.SerializedName;

public class Request{

	@SerializedName("unit")
	private String unit;

	@SerializedName("query")
	private String query;

	@SerializedName("language")
	private String language;

	@SerializedName("type")
	private String type;

	public void setUnit(String unit){
		this.unit = unit;
	}

	public String getUnit(){
		return unit;
	}

	public void setQuery(String query){
		this.query = query;
	}

	public String getQuery(){
		return query;
	}

	public void setLanguage(String language){
		this.language = language;
	}

	public String getLanguage(){
		return language;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	@Override
 	public String toString(){
		return 
			"entity.Request{" +
			"unit = '" + unit + '\'' + 
			",query = '" + query + '\'' + 
			",language = '" + language + '\'' + 
			",type = '" + type + '\'' + 
			"}";
		}
}
