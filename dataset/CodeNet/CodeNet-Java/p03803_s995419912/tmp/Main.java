
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskX solver = new TaskX();
		solver.solve(1, in, out);
		out.close();
	}

	static int INF = 1 << 30;
	static int modP = 1000000007;

	static class TaskX {
		public void solve(int testNumber, InputReader in, PrintWriter out) {

			List<Integer> list = new ArrayList<>();
			for (int i = 2; i <= 13; i++) {
				list.add(i);
System.out.println("[INST]32;None;list.add(i);"+list.add(i));
			}
			list.add(1);
System.out.println("[INST]34;None;list.add(1);"+list.add(1));

			int a = in.nextInt(), b = in.nextInt();

			int idxA = list.indexOf((Integer)a);
System.out.println("[INST]38;idxA;list.indexOf((Integer)a);"+idxA);
			int idxB = list.indexOf((Integer)b);
System.out.println("[INST]39;idxB;list.indexOf((Integer)b);"+idxB);

			if (idxA < idxB) {
				out.println("Bob");
			} else if (idxA == idxB) {
				out.println("Draw");
			} else if (idxA > idxB) {
				out.println("Alice");
			}

		}
	}

	static class InputReader {
		BufferedReader in;
		StringTokenizer tok;

		public String nextString() {
			while (!tok.hasMoreTokens()) {
System.out.println("[INST]57;None;tok.hasMoreTokens();"+tok.hasMoreTokens());
				try {
					tok = new StringTokenizer(in.readLine(), " ");
System.out.println("[INST]59;None;in.readLine();"+in.readLine());
				} catch (IOException e) {
					throw new InputMismatchException();
				}
			}
			return tok.nextToken();
System.out.println("[INST]64;None;tok.nextToken();"+tok.nextToken());
		}

		public int nextInt() {
			return Integer.parseInt(nextString());
		}

		public long nextLong() {
			return Long.parseLong(nextString());
		}

		public double nextDouble() {
			return Double.parseDouble(nextString());
		}

		public int[] nextIntArray(int n) {
			int[] res = new int[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextInt();
			}
			return res;
		}

		public long[] nextLongArray(int n) {
			long[] res = new long[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextLong();
			}
			return res;
		}

		public InputReader(InputStream inputStream) {
			in = new BufferedReader(new InputStreamReader(inputStream));
			tok = new StringTokenizer("");
		}

	}

}
