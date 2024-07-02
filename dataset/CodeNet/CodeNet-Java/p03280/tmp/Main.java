
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		int k = sc.nextInt()-1;
		int b = sc.nextInt()-1;

		out.println(k*b);
		out.flush();
System.out.println("[INST]15;None;out.flush();"+out.flush());

	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
System.out.println("[INST]28;None;st.hasMoreElements();"+st.hasMoreElements());
				try {
					st = new StringTokenizer(br.readLine());
System.out.println("[INST]30;None;br.readLine();"+br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
System.out.println("[INST]35;None;st.nextToken();"+st.nextToken());
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
System.out.println("[INST]53;str;br.readLine();"+str);
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}
