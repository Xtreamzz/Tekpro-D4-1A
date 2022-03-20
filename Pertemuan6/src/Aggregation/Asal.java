package Aggregation;
import java.util.*;

public class Asal {
	String negara;
	private List<Pemain> players;
	Asal(String negara, List<Pemain> players){
		this.negara = negara;
		this.players = players;
	}
	public List<Pemain> getPlayers(){
		return players;
	}
}
