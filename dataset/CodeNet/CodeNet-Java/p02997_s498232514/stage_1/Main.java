import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) {
		SC sc = new SC(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		if((N-2)*(N-1)/2<K) {
			pl("-1");
		}
		else {
			int g=N-1+(N-1)*(N-2)/2-K;
			pl(g);
			int yokei=(N-1)*(N-2)/2-K;
			for(int i=1; i<N; i++) {
				pl(i+" "+N);
			}
			for(int i=1; i<N; i++) {
				for(int j=1; j<i; j++) {
					if(yokei>0) {
						yokei--;
						pl(i+" "+j);
					}
				}
			}
		}
	}
	static class SC {
		private BufferedReader reader = null;
		private StringTokenizer tokenizer = null;
		public SC(InputStream in) {
			reader = new BufferedReader(new InputStreamReader(in));
		}
		public String next() {
var newVariable_0 = tokenizer.hasMoreTokens();			if (tokenizer == null || !newVariable_0) {
				try {
var newVariable_1 = reader.readLine();					tokenizer = new StringTokenizer(newVariable_1);
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			}
var newVariable_2 = tokenizer.nextToken();			return newVariable_2;
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
var newVariable_3 = reader.readLine();				return newVariable_3;
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
}