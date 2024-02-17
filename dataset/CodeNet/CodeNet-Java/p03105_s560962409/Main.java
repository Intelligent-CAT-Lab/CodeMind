
import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if(B/A >= C) {
			System.out.print(C);
		} else if(B/A < C) {
			System.out.print(B/A);
		}

	}
}