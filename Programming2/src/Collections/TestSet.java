package Collections;

import java.util.Set;
import java.util.TreeSet;

public class TestSet {
	
	static Set <Integer> set1 = new TreeSet<>();
	static Set <Integer> set2 = new TreeSet<>();
	static Set <Integer> set3 = new TreeSet<>();
	static Set <Integer> set4 = new TreeSet<>();
	
	public static void main(String[] args) {
		
		set1.add(8);
		set1.add(14);
		set1.add(4);
		set1.add(29);
		set1.add(24);
		set1.add(8);
		
		for(int i = 1; i <= 10; i++) {
			set2.add(i);
		}
		set3.addAll(set1);
		set3.addAll(set2);
		
		set4.addAll(set2);
		set4.retainAll(set1);
				
		System.out.println("set1: " + set1);
		System.out.println("set2: " + set2);
		//Union use addAll
		System.out.println("set3: " + set3);
		//Intersection retainAll
		System.out.println("set4: " + set4);
		//Minus both ways remove, removeAll
		set3.removeAll(set1);
		System.out.println("set3 without set1: " + set3);
		
		set3.addAll(set1);
		set3.removeAll(set2);
		System.out.println(set3);
	}

}
