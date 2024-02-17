import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Main  implements Runnable {
	public static void main(String[] args) {
		new Thread(null, new Main(), "", 64 * 1024 * 1024).start();
	}

	public void run() {
		FastScanner sc = new FastScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		//long n = Long.parseLong(sc.next());
		int n = Integer.parseInt(sc.next());
		//75=5*5*3, 25*3, 15*5, 75, 
		int[] f=new int[101];
		for (int i = 2; i <= n; i++) {
			factor(f, i);
		}
		int t_3=0;
		int t_5=0;
		int t_25=0;
		int t_15=0;
		int t_75=0;
		for (int i = 0; i <= n; i++) {
			if(f[i] >= 2) t_3++;
			if(f[i] >= 4) t_5++;
			if(f[i] >= 14) t_15++;
			if(f[i] >= 24) t_25++;
			if(f[i] >= 74) t_75++;
		}
		out.println(t_75+t_25*(t_3-1)+t_15*(t_5-1)+t_5*(t_5-1)/2*(t_3-2));
		out.flush();
	}
	void factor(int[] a, int c)
	{
		for (int i = 2; i < 100; i++) {
			while(c%i==0)
			{
				a[i] += 1;
				c /= i;
			}
		}
	}
	static class FastScanner {
		private BufferedReader reader = null;
		private StringTokenizer tokenizer = null;
		public FastScanner(String in) {
			StringReader sr = new StringReader(in);
			reader = new BufferedReader(new BufferedReader(sr));
			tokenizer = null;
		}
		public FastScanner(InputStream in) {
			reader = new BufferedReader(new InputStreamReader(in));
			tokenizer = null;
		}
		public String next() {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}
	}
}