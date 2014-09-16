package edu.jsu.mcis;

import java.util.*;

public class Hangman {
    public enum Result { WIN, LOSE, NONE };
    private String word;
    private List<Character> usedLetters;
    
    public Hangman() {
        word = "";
        usedLetters = new ArrayList<Character>();
    }
    
    public void setWord(String word) {
        this.word = word;
    }
    
    public boolean available(char c) {
		boolean isAvailable = true;
		
		for(int i=0; i< usedLetters.size(); i++){
			if(usedLetters.equals(c)){isAvailable = false;}
			else{usedLetters.add(usedLetters.size(), c);}
		}
		
        return isAvailable;
    }
    
    public int guess(char c) {
		int counter = 0;
		for(int i=0; i<word.length(); i++){
			if(word.charAt(i) == c){counter++;}
			else{}
		}
        return counter;
    }
		
	public boolean missedLettersCount(){
		if(usedLetters.size()>=6){return false;}
		else{return true;}
	}
	
	
    
    public Result getResult() {
		if(missedLettersCount() == false){return Result.LOSE;}
		else{return Result.WIN;}
    }
	
	/*public String getResult(){
		return "WIN";
	}*/
    
}












