import java.io.*;
import java.util.*;

public class Main {

	static final int P = 1_000_000_007;
	int[][] ways;

	int[][] precGo;

	int go(int reds, int blues) {
		int hereAll = ways[reds + blues][reds];
		int hereGood = 0;

		for (int redsSuff = 0; redsSuff <= reds; redsSuff++) {
			int bluesSuff = reds - redsSuff;
			int redsPref = reds - redsSuff;
			int bluesPref = blues - bluesSuff;
			hereGood += choose(redsPref + bluesPref, redsPref);
			if (hereGood >= P) {
				hereGood -= P;
			}
		}

		int expect = 0;
		for (int i = 0; i <= reds; i++) {
			expect += choose(blues, i);
			if (expect >= P) {
				expect -= P;
			}
		}

		if (expect != hereGood) {
			throw new AssertionError();
		}
		return hereGood;

		// int hereBad = hereAll - hereGood;
		// if (hereBad < 0) {
		// hereBad += P;
		// }
		// return hereBad;
	}

	void submit() {
		int a = nextInt();
		int b = nextInt();

		int ans = ways[a + b][a];

		for (int ik = 0; ik <= a; ik++) {
			for (int j = 1; j <= b - 1 && ik + j <= a; j++) {

				int reds = a - ik - j;
				int blues = j - 1;

				ans -= (int) ((long) precGo[reds][blues] * ways[b - 1][j] % P
						* (ik + 1) % P);
				if (ans < 0) {
					ans += P;
				}
			}
		}

		out.println(ans);
	}

	int choose(int n, int k) {
		return n >= 0 && k >= 0 && k <= n ? ways[n][k] : 0;
	}

	void preCalc() {
		ways = new int[5000][];
		for (int i = 0; i < ways.length; i++) {
			ways[i] = new int[i + 1];
			ways[i][0] = ways[i][i] = 1;
			for (int j = 1; j < i; j++) {
				ways[i][j] = ways[i - 1][j] + ways[i - 1][j - 1];
				if (ways[i][j] >= P) {
					ways[i][j] -= P;
				}
			}
		}

		int C = 2400;

		precGo = new int[C][C];
		for (int j = 0; j < C; j++) {
			for (int i = 0; i < C; i++) {
				if (i > 0) {
					precGo[i][j] = precGo[i - 1][j];
				}
				precGo[i][j] += choose(j, i);
				if (precGo[i][j] >= P) {
					precGo[i][j] -= P;
				}
			}
		}

		for (int i = 0; i < C; i++) {
			for (int j = 0; j < C; j++) {
				precGo[i][j] = choose(i + j, i) - precGo[i][j];
				if (precGo[i][j] < 0) {
					precGo[i][j] += P;
				}
			}
		}
	}

	void stress() {

	}

	void test() {
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				System.err.print(go(i, j) + " ");
			}
			System.err.println();
		}
	}

	Main() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		preCalc();
		 submit();
		// stress();
//		test();
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
