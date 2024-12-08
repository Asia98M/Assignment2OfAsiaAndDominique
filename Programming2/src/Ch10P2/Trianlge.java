package Ch10P2;

import java.util.Scanner;

public class Trianlge {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter an interger smaller than 80");
		int i = scn.nextInt();
		scn.close();
		
		char star = '*';
		
		for (int n = 1; n<=i; n++) {
			
			for (int k = 1; k<=n; k++){
				System.out.print(star);
			}
			System.out.println();
		}
		

	}

}
