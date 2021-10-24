package com.example.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
//@NamedQuery(name="findByBoard",query="from League l inner join l.board b where b.name = ?1")
public class League {
	private String name;
	@Id
	@GeneratedValue(generator = "league_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "league_gen", sequenceName = "league_seq", initialValue = 1, allocationSize = 1)
	private Integer leagueId;
	private String country;

	@Column(name = "duration")
	private int durationInMonths;

	@OneToOne
	@JoinColumn(name = "board_id") // to give a different column name
	private Board board;
	private String leagueImg;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "league_id") // to remove the intermediate table and add the column to many side
	private Set<Fixtures> fixtures;

	// League is primary class. If you use ManyToOne add @JoinColumn annotation
	// together with this
	@ManyToOne
	@JoinColumn(name = "sports_id")
	private Sports sports;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLeagueId() {
		return leagueId;
	}

	public void setLeagueId(Integer leagueId) {
		this.leagueId = leagueId;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getDurationInMonths() {
		return durationInMonths;
	}

	public void setDurationInMonths(int durationInMonths) {
		this.durationInMonths = durationInMonths;
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public String getLeagueImg() {
		return leagueImg;
	}

	public void setLeagueImg(String leagueImg) {
		this.leagueImg = leagueImg;
	}

	public Set<Fixtures> getFixtures() {
		return fixtures;
	}

	public void setFixtures(Set<Fixtures> fixtures) {
		this.fixtures = fixtures;
	}

	public Sports getSports() {
		return sports;
	}

	public void setSports(Sports sports) {
		this.sports = sports;
	}

	public League() {
		super();
		// TODO Auto-generated constructor stub
	}

	public League(String name, Integer leagueId, String country, int durationInMonths, Board board, String leagueImg,
			Set<Fixtures> fixtures, Sports sports) {
		super();
		this.name = name;
		this.leagueId = leagueId;
		this.country = country;
		this.durationInMonths = durationInMonths;
		this.board = board;
		this.leagueImg = leagueImg;
		this.fixtures = fixtures;
		this.sports = sports;
	}

	@Override
	public String toString() {
		return "League [name=" + name + ", country=" + country + ", durationInMonths=" + durationInMonths + ", board="
				+ board + ", leagueImg=" + leagueImg + ", fixtures=" + fixtures + ", sports=" + sports + "]";
	}

	
}
