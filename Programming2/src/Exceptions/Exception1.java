package Exceptions;

public class Exception1 {

	public static void main(String[] args) {

		int [] myNumbers = {1,2,3,4,5,6,7};

		int index = 6;

		if (index < myNumbers.length) { // for seven its false

			System.out.println("log this");
		}
		else {
			System.out.println(myNumbers[index]);
		}
	}

}
