import java.util.*;

public class Main {
	static final int r = 1000000000 + 7;

	public static int binarypow(long a, long b) {
		if (b == 0)
			return 1;
		if (b == 1)
			return (int) (a % (long) r);
		if (b % 2 == 1)
			return (int) ((a * binarypow(a, b - 1)) % (long) r);
		long tmp = binarypow(a, b / 2);
		return (int) ((tmp * tmp) % (long) r);
	}

	public static int combination(int n, int k) {
		long tmpx = 1, tmpy = 1;
		int ans = 0;
		for (int i = 0; i < k; ++i) {
			tmpx *= (long) (n - i);
			tmpy *= (long) (i + 1);
			tmpx %= (long) r;
			tmpy %= (long) r;
		}
		tmpy = (long) binarypow(tmpy, (long) (r - 2));
		ans = (int) ((tmpx * tmpy) % (long) r);
		return ans;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
		int ans = binarypow(2, n) - 1;
		ans %= r;
		int comb = combination(n, a);
		ans -= comb;
		ans = (ans <= 0 ? (ans + r) % r : ans % r);
		comb = combination(n, b);
		ans -= comb;
		ans = (ans <= 0 ? (ans + r) % r : ans % r);
		sc.close();
		System.out.println(ans);
	}
}
