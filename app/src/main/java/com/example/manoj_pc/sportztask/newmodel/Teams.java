package com.example.manoj_pc.sportztask.newmodel;

import com.google.gson.annotations.SerializedName;

public class Teams{

	@SerializedName("1105")
	private JsonMember1105 jsonMember1105;

	@SerializedName("1379")
	private JsonMember1379 jsonMember1379;

	public void setJsonMember1105(JsonMember1105 jsonMember1105){
		this.jsonMember1105 = jsonMember1105;
	}

	public JsonMember1105 getJsonMember1105(){
		return jsonMember1105;
	}

	public void setJsonMember1379(JsonMember1379 jsonMember1379){
		this.jsonMember1379 = jsonMember1379;
	}

	public JsonMember1379 getJsonMember1379(){
		return jsonMember1379;
	}

	@Override
 	public String toString(){
		return 
			"Teams{" + 
			"1105 = '" + jsonMember1105 + '\'' + 
			",1379 = '" + jsonMember1379 + '\'' + 
			"}";
		}
}