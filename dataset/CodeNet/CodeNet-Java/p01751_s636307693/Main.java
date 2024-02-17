import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		SC sc = new SC(System.in);

		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		//寝て起きての周期が60の倍数または約数でない
		/*
		 * 降車できるとき、最大でも山手線は119週しかしない(寝て起きての周期、60)の最小公倍数を60で割ったときの最大値が119であるから
		 */
		if(a+b==0) {
			pl(-1);
			System.exit(0);
		}
		else {
			for(int i=0; i<=120; i++) {
				int when=60*i+c;
				int roop=when/(a+b);
				if(roop*(a+b)<=when && when<=roop*(a+b)+a) {
					pl(when);
					System.exit(0);
				}
			}
		}
		pl(-1);
		System.exit(0);
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
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
	}
	private static int gcd(int m, int n) {
		if(m < n) return gcd(n, m);
		if(n == 0) return m;
			return gcd(n, m % n);
		}
}
