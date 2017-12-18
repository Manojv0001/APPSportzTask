package com.example.manoj_pc.sportztask.newmodel;

import com.google.gson.annotations.SerializedName;

public class JsonMember3993{

	@SerializedName("Iscaptain")
	private boolean iscaptain;

	@SerializedName("Bowling")
	private Bowling bowling;

	@SerializedName("Position")
	private String position;

	@SerializedName("Batting")
	private Batting batting;

	@SerializedName("Name_Full")
	private String nameFull;

	public void setIscaptain(boolean iscaptain){
		this.iscaptain = iscaptain;
	}

	public boolean isIscaptain(){
		return iscaptain;
	}

	public void setBowling(Bowling bowling){
		this.bowling = bowling;
	}

	public Bowling getBowling(){
		return bowling;
	}

	public void setPosition(String position){
		this.position = position;
	}

	public String getPosition(){
		return position;
	}

	public void setBatting(Batting batting){
		this.batting = batting;
	}

	public Batting getBatting(){
		return batting;
	}

	public void setNameFull(String nameFull){
		this.nameFull = nameFull;
	}

	public String getNameFull(){
		return nameFull;
	}

	@Override
 	public String toString(){
		return 
			"JsonMember3993{" + 
			"iscaptain = '" + iscaptain + '\'' + 
			",bowling = '" + bowling + '\'' + 
			",position = '" + position + '\'' + 
			",batting = '" + batting + '\'' + 
			",name_Full = '" + nameFull + '\'' + 
			"}";
		}
}