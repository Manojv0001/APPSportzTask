package com.example.manoj_pc.sportztask.newmodel;

import com.google.gson.annotations.SerializedName;

public class Officials{

	@SerializedName("Umpires")
	private String umpires;

	@SerializedName("Referee")
	private String referee;

	public void setUmpires(String umpires){
		this.umpires = umpires;
	}

	public String getUmpires(){
		return umpires;
	}

	public void setReferee(String referee){
		this.referee = referee;
	}

	public String getReferee(){
		return referee;
	}

	@Override
 	public String toString(){
		return 
			"Officials{" + 
			"umpires = '" + umpires + '\'' + 
			",referee = '" + referee + '\'' + 
			"}";
		}
}