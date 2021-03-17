package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {

	Map<String, WordEnhanced> dizionario;
	
	public AlienDictionary() {
		
		dizionario = new TreeMap<String, WordEnhanced>();
	}
	
	public void addWord(String alienWord, String translation) {
		
		if(dizionario.containsKey(alienWord))
			dizionario.get(alienWord).translation.add(translation);		
		else {
		WordEnhanced temp = new WordEnhanced(alienWord, translation);
		dizionario.put(alienWord, temp);}
	}
	
	public String translateWord(String alienWord) {
		
		if(dizionario.get(alienWord)==null)
			return "Parola non trovata!";
		else return dizionario.get(alienWord).toString();
	}
	
	public void clear() {
		
		dizionario.clear();
	}
}
