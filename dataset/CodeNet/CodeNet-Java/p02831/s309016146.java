import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A, B;
		A = sc.nextLong();
		B = sc.nextLong();
		sc.close();

		long gcd = 0;
		for (int i = 1; i < Math.max(A, B); i++) {
			if (A % i == 0 && B % i == 0) {
				gcd = i;
			}
		}
		long lcm = A * B / gcd;
		System.out.println(lcm);
	}
}