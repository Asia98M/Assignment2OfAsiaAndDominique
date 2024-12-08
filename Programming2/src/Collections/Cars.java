package Collections;

import java.util.HashSet;
import java.util.Set;

public class Cars {

	static int count; // how many cars are there
	static int MAX_CARS = 10;

	private String make;
	private String model;
	private String registration;
	private int cc; //engine volume in cubic centimeters

	public Cars(String make, String model, String registration, int cc) {
		super();
		this.make = make;
		this.model = model;
		this.registration = registration;
		this.cc = cc;
		count++;
	}

	@Override
	public String toString() {
		return "Cars [make=" + make + ", model=" + model +
				", cc=" + cc + "registration=" + registration +"]";
	}
	

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public static void main(String[] args) {

		Set <Cars> mycars = new HashSet<>();

		mycars.add(new Cars ("Ford", "Escort", "BL 23500", 1000));
		System.out.println(mycars.toString() + " current count: " + count);
		mycars.add(new Cars("Renault", "Captur", "BS 32123", 1600));
		System.out.println(mycars.toString() + " current count: " + count);

	}

}
