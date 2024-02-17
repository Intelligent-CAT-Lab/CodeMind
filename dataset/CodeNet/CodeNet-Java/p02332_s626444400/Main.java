
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;


class Main{
	static long ans=0;
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		long[] dp=new long[K+1];
		for(int i=0; i<=K; i++) {
			dp[i]=0;
		}
		if(N>K) {
			pl(0);
		}
		else {
			long ans=1;
			long mod=1000000007;
			for(int i=K; i>=K-N+1; i--) {
				ans=(ans*((long)i))%mod;
			}
			pl(ans);
			//kPn
		}
	}
	public static void dfs(int nokori,int kosu,int kei) {

	}
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
	}
	static class SC {
		private BufferedReader reader = null;
		private StringTokenizer tokenizer = null;
		public SC(InputStream in) {
			reader = new BufferedReader(new InputStreamReader(in));
		}
		public String next() {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
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
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new UncheckedIOException(e);
			}
		}
	}
}
