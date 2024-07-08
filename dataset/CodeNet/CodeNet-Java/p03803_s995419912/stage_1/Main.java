
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
var newVariable_0 = list.add(i);			}
var newVariable_1 = list.add(1);
			int a = in.nextInt(), b = in.nextInt();

			int idxA = list.indexOf((Integer)a);
			int idxB = list.indexOf((Integer)b);

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
var newVariable_2 = tok.hasMoreTokens();			while (!newVariable_2) {
				try {
var newVariable_3 = in.readLine();					tok = new StringTokenizer(newVariable_3, " ");
				} catch (IOException e) {
					throw new InputMismatchException();
				}
			}
var newVariable_4 = tok.nextToken();			return newVariable_4;
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
