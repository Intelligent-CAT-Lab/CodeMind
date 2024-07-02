import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
System.out.println("[INST]5;n;sc.nextLong();"+n);
		long m = sc.nextLong();
System.out.println("[INST]6;m;sc.nextLong();"+m);
		long a = sc.nextLong();
System.out.println("[INST]7;a;sc.nextLong();"+a);
		long b = sc.nextLong();
System.out.println("[INST]8;b;sc.nextLong();"+b);
		long p = sc.nextLong();
System.out.println("[INST]9;p;sc.nextLong();"+p);
		long q = sc.nextLong();
System.out.println("[INST]10;q;sc.nextLong();"+q);
		long INF = 1000_000_000_000_000L;
		if (a == 1 && b == 1) {
			// (p+q)N
			long ans = INF;
			long div = m / (p + q);
			div = Math.min(div, n);
System.out.println("[INST]16;div;Math.min(div, n);"+div);
			ans = Math.min(ans, Math.abs(div * (p + q) - m));
System.out.println("[INST]17;ans;Math.min(ans, Math.abs(div * (p + q) - m));"+ans);
System.out.println("[INST]17;None;Math.abs(div * (p + q) - m);"+Math.abs(div * (p + q) - m));
			div = Math.min(div + 1, n);
System.out.println("[INST]18;div;Math.min(div + 1, n);"+div);
			ans = Math.min(ans, Math.abs(div * (p + q) - m));
System.out.println("[INST]19;ans;Math.min(ans, Math.abs(div * (p + q) - m));"+ans);
System.out.println("[INST]19;None;Math.abs(div * (p + q) - m);"+Math.abs(div * (p + q) - m));
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
System.out.println("[INST]29;lim;Math.min(lim, n);"+lim);
		lim = Math.min(lim, 40);
System.out.println("[INST]30;lim;Math.min(lim, 40);"+lim);
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
					pending1.add(s);
System.out.println("[INST]54;None;pending1.add(s);"+pending1.add(s));
				else
					pending2.add(s);
System.out.println("[INST]56;None;pending2.add(s);"+pending2.add(s));
			}
		}

		Collections.sort(pending1);
System.out.println("[INST]60;None;Collections.sort(pending1);"+Collections.sort(pending1));
		Collections.sort(pending2);
System.out.println("[INST]61;None;Collections.sort(pending2);"+Collections.sort(pending2));

		long ans = m;
		for (int j = 0; j < 2; ++j) {
			int t = pending2.size() - 1;
System.out.println("[INST]65;None;pending2.size();"+pending2.size());
			for (int i = 0; i < pending1.size(); ++i) {
System.out.println("[INST]66;None;pending1.size();"+pending1.size());
				if (j == 0)
					while (t > 0 && pending1.get(i) + pending2.get(t) > m)
System.out.println("[INST]68;None;pending1.get(i);"+pending1.get(i));
System.out.println("[INST]68;None;pending2.get(t);"+pending2.get(t));
						--t;
				else if (j == 1)
					while (t > 0 && pending1.get(i) + pending2.get(t) >= m
System.out.println("[INST]71;None;pending1.get(i);"+pending1.get(i));
System.out.println("[INST]71;None;pending2.get(t);"+pending2.get(t));
							&& pending1.get(i) + pending2.get(t - 1) >= m)
System.out.println("[INST]72;None;pending1.get(i);"+pending1.get(i));
System.out.println("[INST]72;None;pending2.get(t - 1);"+pending2.get(t - 1));
						--t;
				ans = Math.min(ans, Math.abs(-m + pending1.get(i) + pending2.get(t)));
System.out.println("[INST]74;ans;Math.min(ans, Math.abs(-m + pending1.get(i) + pending2.get(t)));"+ans);
System.out.println("[INST]74;None;Math.abs(-m + pending1.get(i) + pending2.get(t));"+Math.abs(-m + pending1.get(i) + pending2.get(t)));
System.out.println("[INST]74;None;pending1.get(i);"+pending1.get(i));
System.out.println("[INST]74;None;pending2.get(t);"+pending2.get(t));
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