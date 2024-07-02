import java.util.Scanner;

/**
 * Design of a Mansion
 */
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int H, A, B;
		H = sc.nextInt();
System.out.println("[INST]12;H;sc.nextInt();"+H);
		A = sc.nextInt();
System.out.println("[INST]13;A;sc.nextInt();"+A);
		B = sc.nextInt();
System.out.println("[INST]14;B;sc.nextInt();"+B);

		int ans = 0;

		for (int i = A; i <= B; i++) {
			if (H % i == 0) ans++;
		}

		System.out.println(ans);
	}
}

