import java.io.*;
import java.util.*;

class Main {

	private static final int M = 1000000007;

	private static Combination c;

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		int r2 = sc.nextInt();
		int c2 = sc.nextInt();

		c = new Combination(r2 + c2 + 10, M);
		long answer = f(r2 + 1, c2 + 1);
		answer = (((answer - f(r2 + 1, c1)) % M) + M) % M;
		answer = (((answer - f(r1, c2 + 1)) % M) + M) % M;
		answer = (answer + f(r1, c1)) % M;
		System.out.println(answer);
	}

	private static long f(int a, int b) {
		return c.choose(a + b, a);
	}

	private static class Combination {
		private final int M;
		private long[] fact;
		private long[] ifact;
		private long[] inv;

		public Combination(int n, int M) {
			this.M = M;
			fact = new long[n + 1];
			ifact = new long[n + 1];
			inv = new long[n + 1];

			fact[0] = fact[1] = 1;
			ifact[0] = ifact[1] = 1;
			inv[1] = 1;

			for (int i = 2; i <= n; i++) {
				fact[i] = fact[i - 1] * i % M;
				// p = (p / a * a) + (p % a)
				// 0 ≡ (p / a * a) + (p % a)          (mod p)
				// a^(-1) ≡ - (p % a)^(-1) * (p / a)  (mod p)
				inv[i] = M - inv[M % i] * (M / i) % M;
				ifact[i] = ifact[i - 1] * inv[i] % M;
			}
		}

		public long choose(int n, int k) {
			if (n < k) return 0;
			if (n < 0 || k < 0) return 0;
			return fact[n] * (ifact[k] * ifact[n - k] % M) % M;
		}
	}

}
