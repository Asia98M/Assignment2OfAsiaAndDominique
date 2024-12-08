import java.util.Scanner;

public class Loop1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an interger as n");
		int n = scan.nextInt();
		System.out.println("read " + n);
		// figure out loop to do a triangle.
		for (int i = 1; i <=n; i++) {
		System.out.print("*");
		}
		scan.close();
				
	}

}
