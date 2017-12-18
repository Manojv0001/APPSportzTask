package com.example.manoj_pc.sportztask.newmodel;

import com.google.gson.annotations.SerializedName;

public class Venue{

	@SerializedName("Id")
	private String id;

	@SerializedName("Name")
	private String name;

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	@Override
 	public String toString(){
		return 
			"Venue{" + 
			"id = '" + id + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}