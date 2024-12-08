package Ch10P2;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestStudent {

	public static void main(String[] args) {
		
		Student one, two;
		ArrayList <Double> gradesOne = new ArrayList<>();
		ArrayList <Double> gradesTwo = new ArrayList<>();
		
		one = new Student("dew.new@students.fhnw.ch", "Basel under the bridge", "New Dew", 
				gradesOne, 12345678, LocalDate.of(2000, 12, 1));
		
		two = new Student("student@students.fhnw.ch", "Basel on the bridge", "Two Student", 
				gradesTwo, 22345678, LocalDate.of(2000, 12, 2));
		
		System.out.println(one);
		System.out.println(two);
		

	}

}
