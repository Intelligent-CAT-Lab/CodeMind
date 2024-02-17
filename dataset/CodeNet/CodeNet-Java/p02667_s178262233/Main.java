import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	
	static int tot;
	static boolean[] par;
	static int[] nextPar;
	static long[] minus;
	
	static void calc(int pos, boolean inv) {
		if (pos == tot) {
			return;
		}
		if (par[pos] != inv) {
			calc(pos + 1, !inv);
			minus[pos] = minus[pos + 1];
			nextPar[pos] = nextPar[pos + 1] + 1;
		} else {
			calc(pos + 1, inv);
			minus[pos] = minus[pos + 1] + nextPar[pos + 1] + 1;
			nextPar[pos] = tot - pos - 1 - nextPar[pos + 1];
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		char[] vals = sc.next().toCharArray();
		tot = 0;
		par = new boolean[vals.length];
		int ones = 0;
		long ans = 0;
		for (int i = 0; i < vals.length; i++) {
			ans += i / 2 + 1;
			if (vals[i] == '0') {
				par[tot++] = ones % 2 == 1;
			} else {
				ones++;
			}
		}
		
		nextPar = new int[tot + 1];
		minus = new long[tot + 1];
		
		calc(0, false);
		out.println(ans - minus[0]);
		
		
		out.flush();
	}
	
	static class MyScanner {
		private BufferedReader br;
		private StringTokenizer tokenizer;
		
		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}
		
		public int nextInt() {
			return Integer.parseInt(next());
		}
		
		public long nextLong() {
			return Long.parseLong(next());
		}
	}
}
