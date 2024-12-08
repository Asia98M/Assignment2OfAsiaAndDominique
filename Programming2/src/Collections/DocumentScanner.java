package Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.io.File;
import java.io.FileNotFoundException;

public class DocumentScanner {

	public static void main(String[] args) {
		
		Set <String> vocabulary = new HashSet<>();
		// bow = bag of words, for each word -> count of occurences
		Map <String, Integer> bow = new TreeMap<>();
		
		try {
		Scanner scan = new Scanner(new File("C:\\Users\\domin\\eclipse-workspace\\shakespeare1.txt"));
		
		while(scan.hasNext()) {
			String word = scan.next();
			word = word.toLowerCase();
			word = word.replaceAll("[ 0-9.,;:!?'\"\\(\\)&]", "");
			// System.out.println(word);
			vocabulary.add(word);
			// adding to a map requires a test, is this word present already
			// if it is in the key, increase by one
			// else it is new so put(new word, 1);
			if (bow.containsKey(word)) {
				
				int currentCount = bow.get(word);
				System.out.println(word + " new count " + (currentCount));
				// we have an entry
				bow.put(word, currentCount+1);
			}
			else {// only when word is new.
				bow.put(word, 1);
			}
			
			}
		}
		catch (FileNotFoundException e) {
			
			System.out.println("File not Found");
			
			}
//		System.out.println("luxury" + " " + bow.get("luxury"));
//		System.out.println(bow);
			
		
	}

}
