import java.util.Scanner;

public class Main {
	static long MOD = 1000000007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long pow =1;

		for (int i = 1; i <= N; i++) {
			pow = pow * i % MOD;
		}

		System.out.println(pow);
	}
}
