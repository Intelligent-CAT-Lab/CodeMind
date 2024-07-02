import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	static int MOD, N;
	static int[][] table;
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		N = sc.nextInt();
		MOD = sc.nextInt();
		
		table = new int[N + 1][N + 1];
		for (int rem = 0; rem < N + 1 ; rem++) {
			table[N][rem] = rem;
		}
		for (int pos = N - 1; pos >= 1; pos--) {
			for (int rem = 0; rem < N + 1; rem++) {
				table[pos][rem] = table[pos + 1][rem];
				int factor = Math.min(pos, N + 1 - pos);
System.out.println("[INST]25;factor;Math.min(pos, N + 1 - pos);"+factor);
				if (factor < rem) {
					table[pos][rem] += table[pos][rem-factor];
					table[pos][rem] %= MOD;
				}
			}
		}
		out.println(table[1][N]);
		
		out.flush();
System.out.println("[INST]34;None;out.flush();"+out.flush());
	}
	
	static class MyScanner {
		private BufferedReader br;
		private StringTokenizer tokenizer;
		
		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
System.out.println("[INST]46;None;tokenizer.hasMoreTokens();"+tokenizer.hasMoreTokens());
				try {
					tokenizer = new StringTokenizer(br.readLine());
System.out.println("[INST]48;None;br.readLine();"+br.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
System.out.println("[INST]53;None;tokenizer.nextToken();"+tokenizer.nextToken());
		}
		
		public int nextInt() {
			return Integer.parseInt(next());
		}
		
		public long nextLong() {
			return Long.parseLong(next());
		}
	}
}
