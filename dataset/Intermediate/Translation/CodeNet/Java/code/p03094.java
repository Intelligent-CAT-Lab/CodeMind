import java.io.*;
import java.util.*;

public class p03094 {

	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;
	boolean eof;

	static final int P = 1_000_000_007;
	
	void solve() throws IOException {
		int n = nextInt();
		int[] dp = {1, 0, 0};
		
		int[] inv = new int[n + 7];
		inv[1] = 1;
		for (int x = 2; x < inv.length; x++) {
			inv[x] = P - (int)((long)(P / x) * inv[P % x] % P);
		}
		
		int coef = 1;
		long ret = 0;
		for (int k = 1; k <= n; k++) {
			int[] nxt = new int[3];
			for (int j1 = 0; j1 < 3; j1++) {
				for (int j2 = 0; j2 < 3; j2++) {
					if (j1 != j2) {
						nxt[j2] += dp[j1];
						if (nxt[j2] >= P) {
							nxt[j2] -= P;
						}
					}
				}
			}
			
			dp = nxt;
			
			coef = (int)((long)coef * (n - k + 1) % P * inv[k] % P);
			
			int ways = (int)((long)dp[1] * coef % P);
			
			int delta = (int)((long)inv[3] * inv[n] % P * inv[k] % P * ways % P);
			
			ret += delta;
		}
		
		ret %= P;
		
		for (int i = 1; i < n; i++) {
			ret = ret * inv[3] % P;
		}
		
		out.println(ret);
	}

	void inp() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		solve();
		out.close();
	}

	public static void main(String[] args) throws IOException {
		new p03094().inp();
	}

	String nextToken() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (Exception e) {
				eof = true;
				return null;
			}
		}
		return st.nextToken();
	}

	String nextString() {
		try {
			return br.readLine();
		} catch (IOException e) {
			eof = true;
			return null;
		}
	}

	int nextInt() throws IOException {
		return Integer.parseInt(nextToken());
	}

	long nextLong() throws IOException {
		return Long.parseLong(nextToken());
	}

	double nextDouble() throws IOException {
		return Double.parseDouble(nextToken());
	}
}
