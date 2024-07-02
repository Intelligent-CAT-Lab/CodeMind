
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
System.out.println("[INST]8;A;scan.nextInt();"+A);
		int B = scan.nextInt();
System.out.println("[INST]9;B;scan.nextInt();"+B);
		int C = scan.nextInt();
System.out.println("[INST]10;C;scan.nextInt();"+C);

		if((A == B && B == C)||(A!=B && A!=C && B!=C) ) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}

}
