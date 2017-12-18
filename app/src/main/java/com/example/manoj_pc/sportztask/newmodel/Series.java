package com.example.manoj_pc.sportztask.newmodel;

import com.google.gson.annotations.SerializedName;

public class Series{

	@SerializedName("Status")
	private String status;

	@SerializedName("Id")
	private String id;

	@SerializedName("Name")
	private String name;

	@SerializedName("Tour")
	private String tour;

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

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

	public void setTour(String tour){
		this.tour = tour;
	}

	public String getTour(){
		return tour;
	}

	@Override
 	public String toString(){
		return 
			"Series{" + 
			"status = '" + status + '\'' + 
			",id = '" + id + '\'' + 
			",name = '" + name + '\'' + 
			",tour = '" + tour + '\'' + 
			"}";
		}
}