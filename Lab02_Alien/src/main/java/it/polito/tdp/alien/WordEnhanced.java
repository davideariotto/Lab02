package it.polito.tdp.alien;

import java.util.*;

public class WordEnhanced {

	private String alienWord;
	List<String> translation;
	
	public WordEnhanced(String a, String b) {
		
		alienWord = a;
		translation = new LinkedList<String>();
		translation.add(b);
	}
	
	
	public String getAlienWord() {
		return alienWord;
	}

	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}


	@Override
	public String toString() {
		
		String s = "";
		for(String x: translation.toArray(new String[0]))
			s = s + x + "\n";
		return  s;
	}


	@Override
	public boolean equals(Object obj) {
		
		if(this.alienWord.compareTo((String) obj)==0)
			return true;
		else return false;
	}
}
