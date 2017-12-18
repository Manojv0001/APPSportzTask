package com.example.manoj_pc.sportztask.newmodel;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ServerResponse {

	@SerializedName("Matchdetail")
	private Matchdetail matchdetail;

	@SerializedName("Innings")
	private List<InningsItem> innings = new ArrayList<>();

	@SerializedName("Nuggets")
	private List<String> nuggets = new ArrayList<>();

	@SerializedName("Teams")
	private Teams teams;

	@SerializedName("Notes")
	private Notes notes;

	public void setMatchdetail(Matchdetail matchdetail){
		this.matchdetail = matchdetail;
	}

	public Matchdetail getMatchdetail(){
		return matchdetail;
	}

	public void setInnings(List<InningsItem> innings){
		this.innings = innings;
	}

	public List<InningsItem> getInnings(){
		return innings;
	}

	public void setNuggets(List<String> nuggets){
		this.nuggets = nuggets;
	}

	public List<String> getNuggets(){
		return nuggets;
	}

	public void setTeams(Teams teams){
		this.teams = teams;
	}

	public Teams getTeams(){
		return teams;
	}

	public void setNotes(Notes notes){
		this.notes = notes;
	}

	public Notes getNotes(){
		return notes;
	}

	@Override
 	public String toString(){
		return 
			"ServerResponse{" +
			"matchdetail = '" + matchdetail + '\'' + 
			",innings = '" + innings + '\'' + 
			",nuggets = '" + nuggets + '\'' + 
			",teams = '" + teams + '\'' + 
			",notes = '" + notes + '\'' + 
			"}";
		}
}