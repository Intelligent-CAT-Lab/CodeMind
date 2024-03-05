import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p02668 {
	
	static final long MOD = 1000000007;
	static long[][] table;
	static long[][] table2;
	static int N, M;
	static long[] pot2, invPot2;
	
	static long calc(int rem, int bits) {
		long ret = table[rem][bits];
		if (ret != -1) return ret;
		if (bits == 1) return table[rem][bits] = pot2[rem];
		ret = (calc2(rem - 1, bits - 1) * pot2[rem]) % MOD;
		ret += (rem + 1) * calc(rem, bits - 1);
		ret %= MOD;
		return table[rem][bits] = ret;
	}
	
	static long calc2(int rem, int bits) {
		long ret = table2[rem][bits];
		if (ret != -1) return ret;
		if (rem == 0) return table2[rem][bits] = 0;
		ret = calc2(rem - 1, bits);
		long tmp = (rem * calc(rem, bits)) % MOD;
		tmp = (tmp * invPot2[rem + 1]) % MOD;
		ret = (ret + tmp) % MOD;
		return table2[rem][bits] = ret;
	}
	
	static long eleva(long a, int e) {
		if (e == 0) return 1;
		long ret = eleva(a, e / 2);
		ret = (ret * ret) % MOD;
		if (e % 2 == 1) {
			ret = (ret * a) % MOD;
		}
		return ret;
	}
	
	static long inv(long a) {
		return eleva(a, (int)MOD - 2);
	}
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		N = sc.nextInt();
		M = sc.nextInt();
		pot2 = new long[M + 1];
		invPot2 = new long[M + 1];
		pot2[0] = 1;
		for (int i = 1; i < pot2.length; i++) {
			pot2[i] = (pot2[i-1] * 2) % MOD;
		}
		invPot2[pot2.length - 1] = inv(pot2[pot2.length - 1]);
		for (int i = pot2.length - 2; i >= 0; i--) {
			invPot2[i] = (invPot2[i+1] * 2) % MOD;
		}
		table = new long[M+1][N+1];
		table2 = new long[M+1][N+1];
		for (int i = 0; i < table.length; i++) {
			Arrays.fill(table[i], -1);
			Arrays.fill(table2[i], -1);
		}
		out.println(calc(M, N));
		
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
