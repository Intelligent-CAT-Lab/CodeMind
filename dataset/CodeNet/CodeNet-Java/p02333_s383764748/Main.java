
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
		long[][] dp=new long[N+1][K+1];
		long MOD=1000000007;
		for(int i=0; i<=N; i++) {
			for(int j=0; j<=K; j++) {
				dp[i][j]=0;
			}
		}
		dp[0][0]=1;
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=K; j++) {
				dp[i][j]+=dp[i-1][j]*j;	//j個の箱の中にi-1個のボールが入っていてi個目のボールを入れる	新しく入れるボールはi種類（ボール1を、ボール2をボール３を。。。ボールiを）
				dp[i][j]+=dp[i-1][j-1]*j;	//i-1個のボールがj-1個の箱に入っている状態で、i個目のボールは新しい箱に入れる場合　は i通り
				dp[i][j]%=MOD;
			}
		}
		pl(dp[N][K]);
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
