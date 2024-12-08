package Ch10P2;

import java.time.LocalDate;
import java.util.ArrayList;

public class BScStudent extends Student implements Studious{

	String practicalProjectTitle;
	String tobitTitle;

	public BScStudent(String email, String adress, String name, ArrayList<Double> grades, int matricNo, LocalDate dob,
			String practicalProjectTitle, String tobitTitle) {
		super(email, adress, name, grades, matricNo, dob);
		this.practicalProjectTitle = practicalProjectTitle;
		this.tobitTitle = tobitTitle;
	}

	public BScStudent(String email, String adress, String name, ArrayList<Double> grades, int matricNo, LocalDate dob) {
		super(email, adress, name, grades, matricNo, dob);

	}

	@Override
	public void startsCourse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getGradeAverage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void endsCourse() {
		// TODO Auto-generated method stub
		
	}

}
