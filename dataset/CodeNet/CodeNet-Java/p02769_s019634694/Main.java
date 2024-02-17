import java.util.Scanner;

public class Main {

	public static final int MOD = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.close();

		long[] factorial = new long[n + 1];
		long[] inverse = new long[n + 1];
		long[] factorial_inverse = new long[n + 1];

		factorial[0] = 1;
		factorial[1] = 1;
		inverse[1] = 1;
		factorial_inverse[0] = 1;
		factorial_inverse[1] = 1;
		for (int i = 2; i <= n; i++) {
			factorial[i] = factorial[i - 1] * i % MOD;
			inverse[i] = MOD - inverse[MOD % i] * (MOD / i) % MOD;
			factorial_inverse[i] = factorial_inverse[i - 1] * inverse[i] % MOD;
		}

		long answer = 0;
		if (k == 1) {
			print(n * (n - 1));
			return;
		}
		if (k > n - 1) {
			k = n - 1;
		}
		for (int i = 0; i <= k; i++) {
			long combination = factorial[n] * (factorial_inverse[i] * factorial_inverse[n - i] % MOD) % MOD;
			long combination2 = factorial[n - 1] * (factorial_inverse[n - i - 1] * factorial_inverse[i] % MOD) % MOD;
			answer = (answer + (combination * combination2 % MOD)) % MOD;
		}
		print(answer);
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}