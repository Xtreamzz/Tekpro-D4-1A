package Composition;

import java.io.*;
import java.util.*;

public class MainProgram {
	public static void main (String[] args){
		// Creating the Objects of Book class.
		HP h1 = new HP("Xiaomi 11T", "MediaTek Dimensity 1200-Ultra 5G");
		HP h2 = new HP("Xiaomi 11T Pro", "Snapdragon 888 5G");
		HP h3 = new HP("Redmi 10", "Helio G88");
		
		// Creating the list which contains the
		// no. of books.
		List<HP> hp = new ArrayList<HP>();
		hp.add(h1);
		hp.add(h2);
		hp.add(h3);
		Pabrik pabrik = new Pabrik(hp);
		List<HP> hps = pabrik.getTotalHPInPabrik();
		for(HP hp1 : hps){
			System.out.println("Tipe : " + hp1.tipe);
			System.out.println(" Prossesor : " + hp1.prossesor);
			System.out.println();
		}
	}
}
