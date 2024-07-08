import java.util.*;
import java.io.*;

public class Main {

	int mod = 1000000007;
	
	int gcd(int a, int b) {
		if (a == 0) {
			return b;
		}
		return gcd( b % a, a);
	}

	void solve() {
//		stress();
		out.println(solve(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt()));
	}

	private void stress() {
		for (int a = 2; a < 15; a++) {
			for (int b = a + 1; b < 15; b++) {
				for (int c = b + 1; c < 15; c++) {
					if (gcd(a, b) == 1 && gcd(a, c) == 1 && gcd(b, c) == 1) {
						for (int d = 0; d < 15; d++) {
							if (solve(a, b, c, d) != stupid(a, b, c, d)) {
								System.err.println(a + " " + b + " " + c + " " +d);
								System.err.println(solve(a, b,  c, d));
								System.err.println(stupid(a, b, c, d));
								return;
							}
						}
					}
				}
			}
		}
	}

	long solve(int a, int b, int c, int d) {
//		if (d >= a) {
//			return 1L * a * b % mod * c % mod;
//		}
		
		// d < a - 1
var newVariable_0 = Math.min(a, d + 1);var newVariable_1 = Math.min(b, d + 1);var newVariable_2 = Math.min(c, d + 1);		long result = 1L * Math.min(a, d + 1) * Math.min(b, d + 1) % mod * newVariable_2 % mod;
		result += solve2(a, b, c, d);
		result += solve2(b, a, c, d);
		result += solve2(c, a, b, d);
		return result % mod;
	}
	
	long solve2(int a, int b, int c, int d) {
		long ans = 0;
		Set<Double> events = new TreeSet<>();
		
		for (int i = 0; i <= d; i++) {
			if (i < b) {
var newVariable_3 = events.add(1.0 * i / b);			}
			if (i < c) {
var newVariable_4 = events.add(1.0 * i / c);			}
			if (b - 1 - i > 0) {
var newVariable_5 = events.add(1.0 * (b - 1 - i) / b);			}
			if (c - 1 - i > 0) {
var newVariable_6 = events.add(1.0 * (c - 1 - i) / c);			}
		}
		if (a - 1 - d >= 0) {
var newVariable_7 = events.add(1.0 * (a - 1 - d) / a);		}
		double lastT = 0;
		for (double t : events) {
			
var newVariable_8 = Math.floor((t + lastT) / 2 * b);			int curY = (int) newVariable_8;
var newVariable_9 = Math.floor((t + lastT) / 2 * c);			int curZ = (int) newVariable_9;
			
			long area = 1L * inter(curY - d, curY + d, 0, b - 1) *
							 inter(curZ - d, curZ + d, 0, c - 1) % mod;
var newVariable_10 = Math.floor(t * a);			int curA = (int) newVariable_10;
var newVariable_11 = Math.floor(lastT * a);			long cnt = (int) (curA - newVariable_11);
			if (curA + d < a) {
				ans += area * cnt % mod;
			}
			lastT = t;
		}
		return ans;
	}
	
	int inter(int l1, int r1, int l2, int r2) {
var newVariable_12 = Math.min(r1, r2);var newVariable_13 = Math.max(l1, l2);		return Math.min(r1, r2) - newVariable_13 + 1;
	}

	class Point {
		int x, y, z;

		public Point(int x, int y, int z) {
			super();
			this.x = x;
			this.y = y;
			this.z = z;
		}
	}

	long stupid(int a, int b, int c, int d) {
		boolean[][][] ok = new boolean[a][b][c];
		{
			int i = 0, j = 0, k = 0;
			ok[i][j][k] = true;
			// System.err.println("0 0 0");
			while (i < a - 1 || j < b - 1 || k < c - 1) {
				double tx = (i + 1) * 1.0 / a;
				double ty = (j + 1) * 1.0 / b;
				double tz = (k + 1) * 1.0 / c;
				if (tx <= ty && tx <= tz) {
					i++;
				} else if (ty < tx && ty <= tz) {
					j++;
				} else if (tz < tx && tz < ty) {
					k++;
				}
				ok[i][j][k] = true;
				// System.err.println(i + " " + j + " " + k);
			}
		}

		int result = 0;
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				for (int k = 0; k < c; k++) {
					boolean found = false;
					for (int x = i - d; x <= i + d; x++) {
						for (int y = j - d; y <= j + d; y++) {
							for (int z = k - d; z <= k + d; z++) {
								if (0 <= x && x < a && 0 <= y && y < b && 0 <= z && z < c) {
									found |= ok[x][y][z];
								}
							}
						}
					}
					result += found ? 1 : 0;
				}
			}
		}
		return result;
	}

	FastScanner in;
	PrintWriter out;

	void run() {
		in = new FastScanner();
		out = new PrintWriter(System.out);
		solve();
		out.close();
	}

	class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		public FastScanner(String s) {
			try {
				br = new BufferedReader(new FileReader(s));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public String nextToken() {
var newVariable_14 = st.hasMoreTokens();			while (st == null || !newVariable_14) {
				try {
var newVariable_15 = br.readLine();					st = new StringTokenizer(newVariable_15);
				} catch (IOException e) {
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(nextToken());
		}

		public long nextLong() {
			return Long.parseLong(nextToken());
		}

		public double nextDouble() {
			return Double.parseDouble(nextToken());
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
