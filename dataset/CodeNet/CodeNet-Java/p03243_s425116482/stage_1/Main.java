
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		String n = sc.next();
var newVariable_0 = n.charAt(0);		int san = newVariable_0 - 48;
		int ok = san * 100 + san * 10 + san;
var newVariable_1 = Integer.parseInt(n);		if (newVariable_1 <= ok) {
			out.println(ok);
		} else {
			san = san + 1;
			ok = san * 100 + san * 10 + san;
			out.println(ok);
		}

		out.flush();

	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
var newVariable_2 = st.hasMoreElements();			while (st == null || !newVariable_2) {
				try {
var newVariable_3 = br.readLine();					st = new StringTokenizer(newVariable_3);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
var newVariable_4 = st.nextToken();			return newVariable_4;
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}
