package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Player {
	private String playerName;
	@Id
	@GeneratedValue(generator = "player_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "player_gen",sequenceName = "player_seq",initialValue = 100,allocationSize = 1) 
	private Integer playerId;
	private int age;
	private	String city;
	private String playerImg;
	
	@ManyToOne
	@JoinColumn(name= "team_id") 
	private Team team;
	
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public Integer getPlayerId() {
		return playerId;
	}
	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPlayerImg() {
		return playerImg;
	}
	public void setPlayerImg(String playerImg) {
		this.playerImg = playerImg;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	public Player(String playerName, int age, String city, String playerImg) {
		super();
		this.playerName = playerName;
		this.age = age;
		this.city = city;
		this.playerImg = playerImg;
	}
	
	
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Player [playerName=" + playerName + ", playerId=" + playerId + ", age=" + age + ", city=" + city
				+ ", playerImg=" + playerImg + "]";
	}

}
