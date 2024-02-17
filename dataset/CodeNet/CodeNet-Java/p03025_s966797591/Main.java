import java.util.*;

public class Main {
	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
	}

	public static <T> void printArrayT(T[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
	}

	public static class Triple implements Comparable<Triple> {
		public int A, B, C;

		Triple(int A, int B, int C) {
			this.A = A;
			this.B = B;
			this.C = C;
		}

		@Override
		public String toString() {
			return String.format("(%d, %d, %d)", A, B, C);
		}

		@Override
		public int compareTo(Triple o) {
			int a = this.A - o.A;
			if (a != 0)
				return a;
			int b = this.B - o.B;
			if (b != 0)
				return b;
			return this.C - o.C;
		}
	}

	static final long MOD = 1000000007;

	// 逆数
	public static long inv(long n) {
		return pow(n, -1);
	}

	// 累乗
	// n ^ (P-1) == 1 (mod P) を利用すると
	// 1/n == n^(P-2)
	public static long pow(long n, int exp) {
		if (exp < 0) {
			exp += (MOD - 1);
		}
		long x = 1;
		while (exp > 0) {
			if ((exp & 1) == 1) {
				x *= n;
				x %= MOD;
			}
			n *= n;
			n %= MOD;
			exp >>= 1;
		}
		return x;
	}

	// 階乗
	public static long fac_len(int n, int len) {
		long x = n;
		for (int i = 1; i < len; i++) {
			x *= n - i;
			x %= MOD;
		}
		return x;
	}

	// コンビネーション
	public static long comb(int n, int m) {
		if (m * 2 > n) {
			m = (n - m);
		}
		if (m == 0) return 1;
		return fac_len(n, m) * inv(fac_len(m, m)) % MOD;
	}

	public static void fillpow(long[] xs, long x) {
		long s = 1;
		for (int i = 0; i < xs.length; i++) {
			xs[i] = s;
			s *= x;
			s %= MOD;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 2 * 10^5
		int A = sc.nextInt(); // 2 * 10^5
		int B = sc.nextInt(); // 2 * 10^5
		int C = sc.nextInt(); // 2 * 10^5

		long sum = 0;
		// ちょうどN回で終わる可能性 * N
		// sum += N * pow(A * inv(A+B), N);
		// sum += (N+1) * pow(A * inv(A+B), N - 1) * pow(B * inv(A+B), 1) * comb(N, 1);
		// ちょうどN+1回で終わる可能性 * N+1
		// ちょうど 2N-1 回で終わる可能性 * 2N-1 を足す

		long pA = A * inv(A + B) % MOD;
		long pB = B * inv(A + B) % MOD;
		long[] powA = new long[N + 1];
		long[] powB = new long[N + 1];
		long[] combN = new long[N + 1];
		fillpow(powA, pA);
		fillpow(powB, pB);

		combN[0] = comb(N - 1, 0);
		for (int i = 1; i <= N; i++) {
			// combN[i] = comb(N + i - 1, i);
			combN[i] = combN[i - 1] * (N+i-1) % MOD * inv(i) % MOD;
		}

		for (int i = 0; i < N; i++) {
			long a = powA[N] * powB[i] % MOD;
			long b = powA[i] * powB[N] % MOD;
			sum += (N + i) * (a + b) % MOD * combN[i] % MOD;
		}
		// System.out.println("sum = " + sum);
		// 最後に 1/(1-C) を掛ける Cが1に近いほど試行回数が増える
		sum *= 100;
		sum %= MOD;
		sum *= inv(A + B);
		sum %= MOD;
		System.out.println(sum);
	}
}
