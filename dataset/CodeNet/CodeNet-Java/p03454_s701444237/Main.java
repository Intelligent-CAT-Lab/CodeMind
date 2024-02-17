import java.io.*;
import java.util.*;

public class Main {

	static final int P = 1_000_000_007;

	int ans = 0;

	long[] total = new long[10];
	{
		total[0] = 1;
		total[1] = 9;
		for (int i = 2; i < total.length; i++) {
			total[i] = 10 * total[i - 1];
		}
	}

	int pow(int a, int b) {
		int ret = 1;
		for (; b > 0; b >>= 1) {
			if ((b & 1) == 1) {
				ret = (int) ((long) ret * a % P);
			}
			a = (int) ((long) a * a % P);
		}
		return ret;
	}

	int goOne(int s, int len) {
		int need = s / len;
		if (len < total.length && need >= total[len]) {
			return 0;
		}

		int ret = (int) (9L * pow(10, len - 1) % P);
		ret -= need;
		if (ret < 0) {
			ret += P;
		}
		ret++;
		if (ret >= P) {
			ret -= P;
		}

		// System.err.println(s + " " + len + " " + ret);

		return ret;
	}

	void submit() {
		int s = nextInt();

		for (int x = 1; x * x <= s; x++) {
			if (s % x == 0) {
				ans += goOne(s, x);
				if (ans >= P) {
					ans -= P;
				}
				if (x * x < s) {
					ans += goOne(s, s / x);
					if (ans >= P) {
						ans -= P;
					}
				}
			}
		}

		for (int i = 1; i <= 8; i++) {
			for (int j = i; j <= 8; j++) {

				long have = 0;
				for (int k = i; k <= j; k++) {
					have += k * total[k];
				}

				if (have > s) {
					continue;
				}

				int left = (int) (s - have);

				ans += goTwo(left, (int) total[i - 1], i - 1,
						(int) total[j + 1], j + 1);
				if (ans >= P) {
					ans -= P;
				}
			}
		}

		// System.err.println("done!");

		for (int i = 1;; i++) {
			// System.err.println(i);
			int left = s - i - (i + 1);
			if (left < 0) {
				break;
			}

			if (i < 10) {

				ans += goTwo(left, getTotal(i) - 1, i, getTotal(i + 1) - 1,
						i + 1);
				if (ans >= P) {
					ans -= P;
				}
			} else {

//				System.err.println(left + " " + i);
//				System.err.println(goBig(left, i));
//				System.err.println(goTwo(left, getTotal(i) - 1, i,
//						getTotal(i + 1) - 1, i + 1));
//				System.err.println("-----------");
				 ans += goBig(left, i);
//				ans += goTwo(left, getTotal(i) - 1, i, getTotal(i + 1) - 1,
//						i + 1);
				if (ans >= P) {
					ans -= P;
				}
			}
		}

		out.println(ans);
	}

	int goBig(int c, int a) {
		// c = x*a + y*(a+1)
		int initY = c % a;
		int initXY = c / a;
		if (initXY < initY) {
			return 0;
		}

		// int steps = Math.min(initXY, (initXY - initY) )
		return (initXY - initY) / (a + 1) + 1;
	}

	int getTotal(int len) {
		return (int) total[Math.min(len, 9)];
	}

	int goTwo(int x, int cA, int a, int cB, int b) {

		// System.err.println(x + " " + a + " " + cA + " " + b + " " +cB);

		// number of pairs (i, j) s.t. 0 <= i < cA, 0 <= j < cB, a*i + b*j = x

		int ret = 0;

		for (int i = 0; i < cA; i++) {
			int y = x - i * a;
			if (y < 0) {
				break;
			}
			if (y % b == 0 && y / b < cB) {
				ret++;
			}
		}

		return ret;
	}

	void preCalc() {

	}

	void stress() {

	}

	void test() {

	}

	Main() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		preCalc();
		submit();
		// stress();
		// test();
		out.close();
	}

	static final Random rng = new Random();

	static int rand(int l, int r) {
		return l + rng.nextInt(r - l + 1);
	}

	public static void main(String[] args) throws IOException {
		new Main();
	}

	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;

	String nextToken() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return st.nextToken();
	}

	String nextString() {
		try {
			return br.readLine();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	int nextInt() {
		return Integer.parseInt(nextToken());
	}

	long nextLong() {
		return Long.parseLong(nextToken());
	}

	double nextDouble() {
		return Double.parseDouble(nextToken());
	}
}
