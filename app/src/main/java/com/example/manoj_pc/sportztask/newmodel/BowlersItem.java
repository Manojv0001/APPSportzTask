package com.example.manoj_pc.sportztask.newmodel;

import com.google.gson.annotations.SerializedName;

public class BowlersItem{

	@SerializedName("Noballs")
	private String noballs;

	@SerializedName("Economyrate")
	private String economyrate;

	@SerializedName("Maidens")
	private String maidens;

	@SerializedName("Wickets")
	private String wickets;

	@SerializedName("Dots")
	private String dots;

	@SerializedName("Wides")
	private String wides;

	@SerializedName("Bowler")
	private String bowler;

	@SerializedName("Overs")
	private String overs;

	@SerializedName("Runs")
	private String runs;

	public void setNoballs(String noballs){
		this.noballs = noballs;
	}

	public String getNoballs(){
		return noballs;
	}

	public void setEconomyrate(String economyrate){
		this.economyrate = economyrate;
	}

	public String getEconomyrate(){
		return economyrate;
	}

	public void setMaidens(String maidens){
		this.maidens = maidens;
	}

	public String getMaidens(){
		return maidens;
	}

	public void setWickets(String wickets){
		this.wickets = wickets;
	}

	public String getWickets(){
		return wickets;
	}

	public void setDots(String dots){
		this.dots = dots;
	}

	public String getDots(){
		return dots;
	}

	public void setWides(String wides){
		this.wides = wides;
	}

	public String getWides(){
		return wides;
	}

	public void setBowler(String bowler){
		this.bowler = bowler;
	}

	public String getBowler(){
		return bowler;
	}

	public void setOvers(String overs){
		this.overs = overs;
	}

	public String getOvers(){
		return overs;
	}

	public void setRuns(String runs){
		this.runs = runs;
	}

	public String getRuns(){
		return runs;
	}

	@Override
 	public String toString(){
		return 
			"BowlersItem{" + 
			"noballs = '" + noballs + '\'' + 
			",economyrate = '" + economyrate + '\'' + 
			",maidens = '" + maidens + '\'' + 
			",wickets = '" + wickets + '\'' + 
			",dots = '" + dots + '\'' + 
			",wides = '" + wides + '\'' + 
			",bowler = '" + bowler + '\'' + 
			",overs = '" + overs + '\'' + 
			",runs = '" + runs + '\'' + 
			"}";
		}
}