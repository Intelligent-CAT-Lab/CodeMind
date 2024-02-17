import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		int r2 = sc.nextInt();
		int c2 = sc.nextInt();
		sc.close();

		int mod = 1000000007;
		long[] p = new long[2000003];
		long[] pi = new long[2000003];
		p[0] = 1;
		pi[0] = 1;
		for (int i = 1; i < p.length; i++) {
			p[i] = p[i - 1] * i % mod;
			pi[i] = modinv(p[i], mod);
		}

		long v1 = nCr(r2 + c2 + 2, r2 + 1, mod, p, pi);
		long v2 = nCr(r1 + c2 + 1, r1, mod, p, pi);
		long v3 = nCr(r2 + c1 + 1, c1, mod, p, pi);
		long v4 = nCr(r1 + c1, r1, mod, p, pi);
		long ans = v1 - v2 - v3 + v4;
		while (ans < 0) {
			ans += mod;
		}
		ans %= mod;
		System.out.println(ans);
	}

	static long nCr(int n, int r, int m, long[] p, long[] pi) {
		return p[n] * pi[r] % m * pi[n - r] % m;
	}

	static long modinv(long a, int m) {
		long b = m;
		long u = 1;
		long v = 0;
		long tmp = 0;

		while (b > 0) {
			long t = a / b;
			a -= t * b;
			tmp = a;
			a = b;
			b = tmp;

			u -= t * v;
			tmp = u;
			u = v;
			v = tmp;
		}

		u %= m;
		if (u < 0) u += m;
		return u;
	}
}
