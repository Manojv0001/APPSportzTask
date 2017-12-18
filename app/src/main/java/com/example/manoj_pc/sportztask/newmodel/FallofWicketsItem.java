package com.example.manoj_pc.sportztask.newmodel;

import com.google.gson.annotations.SerializedName;

public class FallofWicketsItem{

	@SerializedName("Score")
	private String score;

	@SerializedName("Batsman")
	private String batsman;

	@SerializedName("Overs")
	private String overs;

	public void setScore(String score){
		this.score = score;
	}

	public String getScore(){
		return score;
	}

	public void setBatsman(String batsman){
		this.batsman = batsman;
	}

	public String getBatsman(){
		return batsman;
	}

	public void setOvers(String overs){
		this.overs = overs;
	}

	public String getOvers(){
		return overs;
	}

	@Override
 	public String toString(){
		return 
			"FallofWicketsItem{" + 
			"score = '" + score + '\'' + 
			",batsman = '" + batsman + '\'' + 
			",overs = '" + overs + '\'' + 
			"}";
		}
}