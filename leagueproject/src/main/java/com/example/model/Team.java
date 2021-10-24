package com.example.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Team {
	
	private String teamName;
	@Id
	@GeneratedValue(generator = "team_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "team_gen",sequenceName = "team_seq",initialValue = 1,allocationSize = 1) 
	private Integer teamId;
	private String owner;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "team_id")
	private Set<Player> players;
	private String teamImg;
	
	
	
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public Integer getTeamId() {
		return teamId;
	}
	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public Set<Player> getPlayers() {
		return players;
	}
	public void setPlayers(Set<Player> players) {
		this.players = players;
	}
	public String getTeamImg() {
		return teamImg;
	}
	public void setTeamImg(String teamImg) {
		this.teamImg = teamImg;
	}
	public Team(String teamName, String owner, Set<Player> players, String teamImg) {
		super();
		this.teamName = teamName;
		this.owner = owner;
		this.players = players;
		this.teamImg = teamImg;
	}
	@Override
	public String toString() {
		return "Team [teamName=" + teamName + ", teamId=" + teamId + ", owner=" + owner + ", players=" + players
				+ ", teamImg=" + teamImg + "]";
	}

    
	
}
