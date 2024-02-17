import java.util.Arrays;
import java.util.Scanner;

public class Main {
	long[][] comb = new long[3001][3001];
	long M;
	int N;

	void run() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextLong();
		// f(K,X)=K個から非空かつdisjointな集合をx個、選ぶ方法
		// f(K,X)=f(K-1,X)*K+f(K-1,X-1)+1
		long[][] f = new long[N + 1][N + 1];
		f[0][0] = 1;
		for (int i = 1; i <= N; ++i) {
			for (int j = 0; j <= i; ++j) {
				f[i][j] = f[i - 1][j] * (j + 1) + (j - 1 >= 0 ? f[i - 1][j - 1] : 0);
				f[i][j] %= M;
			}
		}
		comb[0][0] = 1;
		for (int i = 1; i < comb.length; ++i) {
			for (int j = 0; j <= i; ++j) {
				comb[i][j] = (j > 0 ? comb[i - 1][j - 1] : 0) + comb[i - 1][j];
				comb[i][j] %= M;
			}
		}

		long ans = 0;
		for (int i = 0; i <= N; ++i) {
			long sum = 0;
			for (int k = 0; k <= i; ++k) {
				sum += f[i][k] * pow(2, (N - i) * k, M) % M;
				sum %= M;
			}
			ans += (i % 2 == 0 ? 1 : -1) * pow(2, pow(2, N - i, M - 1), M) % M * sum % M * comb[N][i] % M;
			ans = (ans + M) % M;
		}
		System.out.println(ans);
		// comb(N,i)g(i)(-1)^i
		// g(i)=2^2^(N-i) * sum_k f(i,k)2^((n-i)k)
		// (),(A),(B),(AB),(A,B),(AB,A,B),(AB,A),(AB,B) 2^(2^2-1)=2^3=8 - (A,AB),(B,AB)

	}

	long pow(long a, long n, long mod) {
		long ret = 1;
		a %= mod;
		for (; n > 0; n >>= 1, a = a * a % mod) {
			if (n % 2 == 1) {
				ret = ret * a % mod;
			}
		}
		return ret;
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
