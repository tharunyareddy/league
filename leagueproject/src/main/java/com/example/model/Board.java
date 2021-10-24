package com.example.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Board {
	private String boardName;
	@Id
	@GeneratedValue(generator = "board_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "board_gen",sequenceName = "board_seq",initialValue = 100,allocationSize = 1) 
	private Integer boardId;
	private String city;
	private String boardLogo;
	
	@OneToOne(mappedBy="board")
	League league;
	
	

	public String getBoardName() {
		return boardName;
	}

	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}

	public Integer getBoardId() {
		return boardId;
	}

	public void setBoardId(Integer boardId) {
		this.boardId = boardId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getBoardLogo() {
		return boardLogo;
	}

	public void setBoardLogo(String boardLogo) {
		this.boardLogo = boardLogo;
	}

	public League getLeague() {
		return league;
	}

	public void setLeague(League league) {
		this.league = league;
	}
	
	

	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Board(String boardName, String city, String boardLogo) {
		super();
		this.boardName = boardName;
		this.city = city;
		this.boardLogo = boardLogo;
	}

	@Override
	public String toString() {
		return "Board [boardName=" + boardName + ", boardId=" + boardId + ", city=" + city + ", boardLogo=" + boardLogo
				+ "]";
	}

}
