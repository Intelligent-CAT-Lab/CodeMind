import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// long t = System.currentTimeMillis();
		new Main().run();
		// System.err.println(System.currentTimeMillis() - t);
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		solver(sc.nextLong(), sc.nextLong());
System.out.println("[INST]13;None;sc.nextLong();"+sc.nextLong());
System.out.println("[INST]13;None;sc.nextLong();"+sc.nextLong());
	}

	void solver(long n, long a) {
		long ans = n;
		for (int m = 2; m <= 40; ++m) {
			long c = (long) Math.pow(n, 1.0 / m);
			for (long i = Math.max(c - 2, 2); i <= c + 2; ++i) {
System.out.println("[INST]20;i;Math.max(c - 2, 2);"+i);
				if (Math.log(i) * (m - 1) > 40 * Math.log(2))
System.out.println("[INST]21;None;Math.log(i);"+Math.log(i));
System.out.println("[INST]21;None;Math.log(2);"+Math.log(2));
					continue;
				for (int j = 0; j <= m - 1; ++j) {
					long res = a * (m - 1);
					res += j * i + (m - 1 - j) * (i + 1);
					long den = pow(i, j) * pow(i + 1, m - 1 - j);
					res += (n + den - 1) / den;
					ans = Math.min(ans, res);
System.out.println("[INST]28;ans;Math.min(ans, res);"+ans);
				}
			}
		}
		System.out.println(ans);
	}

	long pow(long a, long n) {
		long ret = 1;
		for (; n > 0; n >>= 1, a *= a) {
			if (n % 2 == 1) {
				ret *= a;
			}
		}
		return ret;
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
