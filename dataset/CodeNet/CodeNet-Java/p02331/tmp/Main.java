
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;


class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		//区別できるボールを区別できる箱に入れる入れ方は、
		//1つのボールに付き、箱の個数通り有り、それぞれ独立なので、
		//n kが与えられた時 k^nである。
		long MOD=1000000007;
		long n=sc.nextLong();
		long k=sc.nextLong();
		long ans=1;
		for(long i=0; i<n; i++) {
			ans=(ans*k)%MOD;
		}
		pl(ans);

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
System.out.println("[INST]41;None;tokenizer.hasMoreTokens();"+tokenizer.hasMoreTokens());
				try {
					tokenizer = new StringTokenizer(reader.readLine());
System.out.println("[INST]43;None;reader.readLine();"+reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			}
			return tokenizer.nextToken();
System.out.println("[INST]48;None;tokenizer.nextToken();"+tokenizer.nextToken());
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
System.out.println("[INST]61;None;reader.readLine();"+reader.readLine());
			} catch (IOException e) {
				throw new UncheckedIOException(e);
			}
		}
	}
}
