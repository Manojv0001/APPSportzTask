package com.example.manoj_pc.sportztask.newmodel;

import com.google.gson.annotations.SerializedName;

public class Matchdetail{

	@SerializedName("Status")
	private String status;

	@SerializedName("Venue")
	private Venue venue;

	@SerializedName("Team_Home")
	private String teamHome;

	@SerializedName("Player_Match")
	private String playerMatch;

	@SerializedName("Equation")
	private String equation;

	@SerializedName("Officials")
	private Officials officials;

	@SerializedName("Player_Series")
	private String playerSeries;

	@SerializedName("Winningteam")
	private String winningteam;

	@SerializedName("Match")
	private Match match;

	@SerializedName("Result")
	private String result;

	@SerializedName("Weather")
	private String weather;

	@SerializedName("Team_Away")
	private String teamAway;

	@SerializedName("Series")
	private Series series;

	@SerializedName("Tosswonby")
	private String tosswonby;

	@SerializedName("Winmargin")
	private String winmargin;

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	public void setVenue(Venue venue){
		this.venue = venue;
	}

	public Venue getVenue(){
		return venue;
	}

	public void setTeamHome(String teamHome){
		this.teamHome = teamHome;
	}

	public String getTeamHome(){
		return teamHome;
	}

	public void setPlayerMatch(String playerMatch){
		this.playerMatch = playerMatch;
	}

	public String getPlayerMatch(){
		return playerMatch;
	}

	public void setEquation(String equation){
		this.equation = equation;
	}

	public String getEquation(){
		return equation;
	}

	public void setOfficials(Officials officials){
		this.officials = officials;
	}

	public Officials getOfficials(){
		return officials;
	}

	public void setPlayerSeries(String playerSeries){
		this.playerSeries = playerSeries;
	}

	public String getPlayerSeries(){
		return playerSeries;
	}

	public void setWinningteam(String winningteam){
		this.winningteam = winningteam;
	}

	public String getWinningteam(){
		return winningteam;
	}

	public void setMatch(Match match){
		this.match = match;
	}

	public Match getMatch(){
		return match;
	}

	public void setResult(String result){
		this.result = result;
	}

	public String getResult(){
		return result;
	}

	public void setWeather(String weather){
		this.weather = weather;
	}

	public String getWeather(){
		return weather;
	}

	public void setTeamAway(String teamAway){
		this.teamAway = teamAway;
	}

	public String getTeamAway(){
		return teamAway;
	}

	public void setSeries(Series series){
		this.series = series;
	}

	public Series getSeries(){
		return series;
	}

	public void setTosswonby(String tosswonby){
		this.tosswonby = tosswonby;
	}

	public String getTosswonby(){
		return tosswonby;
	}

	public void setWinmargin(String winmargin){
		this.winmargin = winmargin;
	}

	public String getWinmargin(){
		return winmargin;
	}

	@Override
 	public String toString(){
		return 
			"Matchdetail{" + 
			"status = '" + status + '\'' + 
			",venue = '" + venue + '\'' + 
			",team_Home = '" + teamHome + '\'' + 
			",player_Match = '" + playerMatch + '\'' + 
			",equation = '" + equation + '\'' + 
			",officials = '" + officials + '\'' + 
			",player_Series = '" + playerSeries + '\'' + 
			",winningteam = '" + winningteam + '\'' + 
			",match = '" + match + '\'' + 
			",result = '" + result + '\'' + 
			",weather = '" + weather + '\'' + 
			",team_Away = '" + teamAway + '\'' + 
			",series = '" + series + '\'' + 
			",tosswonby = '" + tosswonby + '\'' + 
			",winmargin = '" + winmargin + '\'' + 
			"}";
		}
}