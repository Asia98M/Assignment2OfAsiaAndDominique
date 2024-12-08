package Ch10P2;

import java.time.LocalDate;
import java.util.ArrayList;

public class MScStudent extends Student implements Lazy, Studious {

	ArrayList<String> trips;

	public MScStudent(String email, String adress, String name, ArrayList<Double> grades, int matricNo, LocalDate dob,
			ArrayList<String> trips) {
		super(email, adress, name, grades, matricNo, dob);
		this.trips = new ArrayList<>();
	}

	@Override
	public void startsCourse() {
		System.out.println("Starting a course now");

	}

	@Override
	public double getGradeAverage() {

		if (this.grades.size() == 0) {
			return 0;
		}
		else {
			double value = 0;
			for (double x : this.grades) {
				value = value + x;
			}
			// consider when empty, return 0
			// when not empty return average
			return value/this.grades.size();
			}
		}

		@Override
		public void endsCourse() {
			// TODO Auto-generated method stub

		}

		@Override
		public void myStatus() {
			// TODO Auto-generated method stub

		}



	}
