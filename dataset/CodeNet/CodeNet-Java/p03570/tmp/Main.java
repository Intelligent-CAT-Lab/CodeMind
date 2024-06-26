import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		FastScanner in = new FastScanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskD solver = new TaskD();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskD {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			char[] s = in.next().toCharArray();
			int[] d = new int[1 << 26];
			Arrays.fill(d, s.length);
System.out.println("[INST]30;None;Arrays.fill(d, s.length);"+Arrays.fill(d, s.length));
			d[0] = 0;
			int mask = 0;
			int ans = s.length;
			for (int i = 0; i < s.length; i++) {
				int c = s[i] - 'a';
				mask ^= 1 << c;
				for (int j = -1; j < 26; j++) {
					int m = j < 0 ? 0 : (1 << j);
					int cur = 1 + d[m ^ mask];
					d[mask] = Math.min(d[mask], cur);
System.out.println("[INST]40;None;Math.min(d[mask], cur);"+Math.min(d[mask], cur));
					if (i == s.length - 1) {
						ans = Math.min(ans, cur);
System.out.println("[INST]42;ans;Math.min(ans, cur);"+ans);
					}
				}
			}
			out.println(ans);
		}

	}

	static class FastScanner {
		private BufferedReader in;
		private StringTokenizer st;

		public FastScanner(InputStream stream) {
			in = new BufferedReader(new InputStreamReader(stream));
		}

		public String next() {
			while (st == null || !st.hasMoreTokens()) {
System.out.println("[INST]60;None;st.hasMoreTokens();"+st.hasMoreTokens());
				try {
					st = new StringTokenizer(in.readLine());
System.out.println("[INST]62;None;in.readLine();"+in.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return st.nextToken();
System.out.println("[INST]67;None;st.nextToken();"+st.nextToken());
		}

	}
}

