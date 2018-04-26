package com.homecredit.exam;

public class CapCase {
	
	public String toCapCase(String phrase) {
		
		if(phrase == null) {
			return null;
		}
		
		if(phrase.equals("")) {
			return null;
		}
		
		// TODO put your code below this comment
		String[] sentence = phrase.split(" ");
		String newSentence = "";
		for(String word:sentence) {
			newSentence = newSentence.concat(capitalize(word)+ " ");
		}
		newSentence = newSentence.trim();
		return newSentence;
	}

	private static String capitalize(final String line) {
		return Character.toUpperCase(line.charAt(0)) + line.substring(1);
	}

}