package Aggregation;
import java.util.*;

public class MainProgram {
	public static void main (String[] args){
		Pemain p1 = new Pemain("Ardhian", 1, "Indonesia");
		Pemain p2 = new Pemain("Fadhil", 16, "Indonesia");
		Pemain p3 = new Pemain("Ronaldo", 7, "Portugal");
		Pemain p4 = new Pemain("Ruben", 3, "Portugal");
		Pemain p5 = new Pemain("Ipul", 20, "Indonesia");
		// making a List of
		// CSE Students.
		List <Pemain> Ind_players = new ArrayList<Pemain>();
		Ind_players.add(p1);
		Ind_players.add(p2);
		Ind_players.add(p5);
		// making a List of
		// EE Students
		List <Pemain> Por_players = new ArrayList<Pemain>();
		Por_players.add(p3);
		Por_players.add(p4);
		Asal Ind = new Asal("Indonesia", Ind_players);
		Asal Por = new Asal("Portugal", Por_players);
		List <Asal> region = new ArrayList<Asal>();
		region.add(Ind);
		region.add(Por);
		// creating an instance of Institute.
		Club club = new Club("Manchester United", region);
		System.out.print("Total players in club: ");
		System.out.print(club.getTotalPlayerInClub());
	}

}
