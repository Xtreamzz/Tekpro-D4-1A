package Composition;

import java.io.*;
import java.util.*;

public class Pabrik {
	private final List<HP> hp;
	Pabrik (List<HP> hp){
		this.hp = hp;
	}
	public List<HP> getTotalHPInPabrik(){
		return hp;
	}
}
