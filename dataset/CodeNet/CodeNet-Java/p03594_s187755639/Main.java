import java.util.*;
import java.io.*;

public class Main {

	void solve() {
		int n = in.nextInt(), m = in.nextInt(), d = in.nextInt();
		String colors = "RYGB";
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int k = (i + j) % (2 * d);
				int l = (i - j) % (2 * d);
				l = (l + 2 * d) % (2 * d);
				int col = (k / d) * 2 + (l / d);
				out.print(colors.charAt(col));
			}
			out.println();
		}
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
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
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
