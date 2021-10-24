package com.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.model.Board;
import com.example.model.League;
import com.example.model.LeagueView;
import com.example.model.Fixtures;
import com.example.model.Sports;
import com.example.model.SportView;
import com.example.model.Team;
import com.example.service.BoardServiceImpl;
import com.example.service.IBoardService;
import com.example.service.ILeagueService;
import com.example.service.ISportService;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
//	@Override
//	public void run(String... args) throws Exception {
//		
//		
//		
//		Board owner=new Board("KAlyan","HYderabad","Actor");
//		
//		Team team1=new Team("HK","Vadsaku");
//		Team team2=new Team("BR","MAni");
//		Team team3=new Team("TD","gdt");
//		Set<Team> allTeam=new HashSet<>(Arrays.asList(team1,team2,team3));
//		
////		Matches match1=new Matches("HK vs BR","delhi stadium",allTeam);
////		Matches match2=new Matches("TD VS HK"," sthydd",allTeam);
////		Set<Matches> allMatch=new HashSet<>(Arrays.asList(match1,match2));
//		
//		Matches features = new Matches("abc","xyz",allTeam);
//		Set<Matches> matches = new HashSet<>(Arrays.asList(features));
//		
//		Sport sport=new Sport("Cricket","England");
//		
//		League league=new League("T20","INdia",1,owner,matches,sport);
//		
//			//iSportService.addSport(sport);
//			//leagueService.addLeague(league);
//		
////			List<LeagueView> leagueView=leagueService.getLeagueDeatils();
////			for(LeagueView leagueDetails:leagueView) {
////				System.out.println(leagueDetails.getNAME()+"\t"+"\t"+leagueDetails.getCOUNTRY());
////			}
////		
//		
////		List<SportView> sportView=iSportService.getSportsDeatils();
////		for(SportView sportDetails:sportView) {
////			System.out.println(sportDetails.getSPORTNAME()+"\t"+sportDetails.getMEMBERNAME()+"\t"+sportDetails.getSTADIUM_NAME()+"\t"+sportDetails.getLEAGUENAME());
////		}
////	
//		
//		//System.out.println(leagueService.getLeagueCount("INdia"));
//	   System.out.println((leagueService.getLeagueByBoard("KAlyan")));
//	}
//	
//	

	
	@Autowired
	ILeagueService leagueService;
	
	@Autowired
	IBoardService boardService;
	
	@Autowired
	ISportService sportService;


	
	@Override
	public void run(String... args) throws Exception {
		
		Board board = new Board("Kalyan","Hydrebad","/assets/images/board/cmember.jpg");
		//boardService.addBoard(board);
		
		Sports csports = new Sports("Cricket","England","/assets/images/sports/cricket.jpg");
		//sportService.addSport(csports);
		Sports tsports = new Sports("Tennis","England","/assets/images/sports/tennis.jpg");
		//sportService.addSport(tsports);
		Sports fsports = new Sports("Football","England","/assets/images/sports/football.jpg");
		//sportService.addSport(fsports);

		
		
	}
	
}
