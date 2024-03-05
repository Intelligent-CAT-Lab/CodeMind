
import java.util.Scanner;

public class p02771 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();

		if((A == B && B == C)||(A!=B && A!=C && B!=C) ) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}

}
