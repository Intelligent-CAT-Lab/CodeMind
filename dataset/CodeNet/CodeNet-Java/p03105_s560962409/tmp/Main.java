
import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
System.out.println("[INST]7;A;sc.nextInt();"+A);
		int B = sc.nextInt();
System.out.println("[INST]8;B;sc.nextInt();"+B);
		int C = sc.nextInt();
System.out.println("[INST]9;C;sc.nextInt();"+C);
		
		if(B/A >= C) {
			System.out.print(C);
		} else if(B/A < C) {
			System.out.print(B/A);
		}

	}
}