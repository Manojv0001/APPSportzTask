package com.example.manoj_pc.sportztask.newmodel;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Notes{

	@SerializedName("1")
	private List<String> jsonMember1;

	@SerializedName("2")
	private List<String> jsonMember2;

	public void setJsonMember1(List<String> jsonMember1){
		this.jsonMember1 = jsonMember1;
	}

	public List<String> getJsonMember1(){
		return jsonMember1;
	}

	public void setJsonMember2(List<String> jsonMember2){
		this.jsonMember2 = jsonMember2;
	}

	public List<String> getJsonMember2(){
		return jsonMember2;
	}

	@Override
 	public String toString(){
		return 
			"Notes{" + 
			"1 = '" + jsonMember1 + '\'' + 
			",2 = '" + jsonMember2 + '\'' + 
			"}";
		}
}