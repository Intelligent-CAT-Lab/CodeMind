
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
		int san = n.charAt(0) - 48;
System.out.println("[INST]12;None;n.charAt(0);"+n.charAt(0));
		int ok = san * 100 + san * 10 + san;
		if (Integer.parseInt(n) <= ok) {
System.out.println("[INST]14;None;Integer.parseInt(n);"+Integer.parseInt(n));
			out.println(ok);
		} else {
			san = san + 1;
			ok = san * 100 + san * 10 + san;
			out.println(ok);
		}

		out.flush();
System.out.println("[INST]22;None;out.flush();"+out.flush());

	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
System.out.println("[INST]35;None;st.hasMoreElements();"+st.hasMoreElements());
				try {
					st = new StringTokenizer(br.readLine());
System.out.println("[INST]37;None;br.readLine();"+br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
System.out.println("[INST]42;None;st.nextToken();"+st.nextToken());
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
System.out.println("[INST]60;str;br.readLine();"+str);
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}
