package com.example.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Sports {
	
	private String name;
	@Id
	@GeneratedValue(generator = "sports_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "sports_gen",sequenceName = "sports_seq",initialValue = 20,allocationSize = 1)
	private Integer sportsId;
	private String origin;
	private String sportsImg;
	// use mappedBy as League is the primary class/owner of this relationship
	// cannot use joinColumn and mappedBy together
	@OneToMany(mappedBy = "sports") 
	private Set<League> leagues;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSportsId() {
		return sportsId;
	}
	public void setSportsId(Integer sportsId) {
		this.sportsId = sportsId;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getSportsImg() {
		return sportsImg;
	}
	public void setSportsImg(String sportsImg) {
		this.sportsImg = sportsImg;
	}
	public Set<League> getLeagues() {
		return leagues;
	}
	public void setLeagues(Set<League> leagues) {
		this.leagues = leagues;
	}
	public Sports() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sports(String name, String origin, String sportsImg) {
		super();
		this.name = name;
		this.origin = origin;
		this.sportsImg = sportsImg;
	}
	@Override
	public String toString() {
		return "Sports [name=" + name + ", sportsId=" + sportsId + ", origin=" + origin + ", sportsImg=" + sportsImg
				+ "]";
	}

}
