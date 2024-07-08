import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		setIO();

		int N = ni();
		
var newVariable_0 = Integer.toString(N);		int l = newVariable_0.length();
		int m = 0;
		for (int i = 0; i < l; i++) {
			m = (10 * m + 7) % N;
		}
		
		int i = l;
		boolean[] vis = new boolean[N];
		
		while (true) {
			if (vis[m]) {
				out.println(-1);
				break;
			}
			
			vis[m] = true;
			
			if (m == 0) {
				out.println(i);
				break;
			}
			
			m = (10 * m + 7) % N;
			i++;
		}
		
		f.close();
		out.close();
	}

	static final int MOD = 1000000007;

	static BufferedReader f;
	static PrintWriter out;

	static int ni(StringTokenizer st) {
var newVariable_1 = Integer.parseInt(st.nextToken());var newVariable_2 = st.nextToken();		return Integer.parseInt(newVariable_2);
	}

	static int ni() throws IOException {
var newVariable_3 = Integer.parseInt(f.readLine());var newVariable_4 = f.readLine();		return Integer.parseInt(newVariable_4);
	}

	static StringTokenizer nl() throws IOException {
var newVariable_5 = f.readLine();		return new StringTokenizer(newVariable_5);
	}

	static int[] nia(int N) throws IOException {
		StringTokenizer st = nl();
		int[] A = new int[N];
		for (int i = 0; i < N; i++)
			A[i] = ni(st);
		return A;
	}

	static void setIO(String s) throws IOException {
		f = new BufferedReader(new FileReader(s + ".in"));
		out = new PrintWriter(new FileWriter(s + ".out"));
	}

	static void setIO() {
		f = (new BufferedReader(new InputStreamReader(System.in)));
		out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	}
}
