import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long p = sc.nextLong();
		long q = sc.nextLong();
		long INF = 1000_000_000_000_000L;
		if (a == 1 && b == 1) {
			// (p+q)N
			long ans = INF;
			long div = m / (p + q);
			div = Math.min(div, n);
var newVariable_0 = Math.abs(div * (p + q) - m);			ans = Math.min(ans, newVariable_0);
			div = Math.min(div + 1, n);
var newVariable_1 = Math.abs(div * (p + q) - m);			ans = Math.min(ans, newVariable_1);
			System.out.println(ans);
			return;
		}
		// pa^k+qb^k
		long lim = 0;
		while (p * Math.pow(a, lim) + q * Math.pow(b, lim) <= m) {
			++lim;
		}
		lim += 1;
		lim = Math.min(lim, n);
		lim = Math.min(lim, 40);
		ArrayList<Long> pending1 = new ArrayList<>();
		ArrayList<Long> pending2 = new ArrayList<>();
		long[] powA = new long[42];
		long[] powB = new long[42];
		powA[0] = 1;
		powB[0] = 1;
		for (int i = 1; i < powA.length; ++i) {
			powA[i] = powA[i - 1] * a;
			powB[i] = powB[i - 1] * b;
		}
		for (int t = 0; t < 2; ++t) {
			long max = (t == 0 ? lim / 2 : (lim + 1) / 2);
			outer: for (long i = 0; i < (1L << max); ++i) {
				long s = 0;
				for (int j = 0; j < max; ++j) {
					if ((i & (1L << j)) > 0) {
						s += p * powA[(int) (j + (t == 1 ? lim / 2 : 0))]
								+ q * powB[(int) (j + (t == 1 ? lim / 2 : 0))];
						if (s > INF)
							continue outer;
					}
				}
				if (t == 0)
var newVariable_2 = pending1.add(s);				else
var newVariable_3 = pending2.add(s);			}
		}

		Collections.sort(pending1);
		Collections.sort(pending2);

		long ans = m;
		for (int j = 0; j < 2; ++j) {
var newVariable_4 = pending2.size();			int t = newVariable_4 - 1;
var newVariable_5 = pending1.size();			for (int i = 0; i < newVariable_5; ++i) {
				if (j == 0)
var newVariable_6 = pending1.get(i);var newVariable_7 = pending2.get(t);					while (t > 0 && pending1.get(i) + newVariable_7 > m)
						--t;
				else if (j == 1)
var newVariable_8 = pending1.get(i);var newVariable_9 = pending2.get(t);					while (t > 0 && pending1.get(i) + newVariable_9 >= m
var newVariable_10 = pending1.get(i);var newVariable_11 = pending2.get(t - 1);							&& pending1.get(i) + newVariable_11 >= m)
						--t;
var newVariable_12 = Math.abs(-m + pending1.get(i) + pending2.get(t));var newVariable_13 = pending1.get(i);var newVariable_14 = pending2.get(t);				ans = Math.min(ans, Math.abs(-m + pending1.get(i) + newVariable_14));
			}
		}

		System.out.println(ans);

	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

	static long pow(long a, long n) {
		long ret = 1;
		for (; n > 0; n >>= 1, a *= a) {
			if (n % 2 == 1) {
				ret *= a;
			}
		}
		return ret;
	}
}