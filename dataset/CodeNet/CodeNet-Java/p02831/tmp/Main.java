import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A, B;
		A = sc.nextLong();
System.out.println("[INST]6;A;sc.nextLong();"+A);
		B = sc.nextLong();
System.out.println("[INST]7;B;sc.nextLong();"+B);
		sc.close();

		long gcd = 0;
		for (int i = 1; i < Math.max(A, B); i++) {
System.out.println("[INST]11;None;Math.max(A, B);"+Math.max(A, B));
			if (A % i == 0 && B % i == 0) {
				gcd = i;
			}
		}
		long lcm = A * B / gcd;
		System.out.println(lcm);
	}
}