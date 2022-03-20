package Aggregation;
import java.util.*;

public class Club {
	String clubName;
	private List<Asal> region;
	Club(String clubName, List<Asal> region){
		this.clubName = clubName;
		this.region = region;
	}
	// count total students of all departments
	// in a given institute
	public int getTotalPlayerInClub(){
		int noOfPlayer = 0;
		List<Pemain> players;
		for(Asal neg : region){
			players = neg.getPlayers();
			for(Pemain p : players){
				noOfPlayer++;
			}
		}
	return noOfPlayer;
	}
}