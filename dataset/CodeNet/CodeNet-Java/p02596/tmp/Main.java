import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		setIO();

		int N = ni();
		
		int l = Integer.toString(N).length();
System.out.println("[INST]9;l;Integer.toString(N).length();"+l);
System.out.println("[INST]9;None;Integer.toString(N);"+Integer.toString(N));
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
		return Integer.parseInt(st.nextToken());
System.out.println("[INST]45;None;Integer.parseInt(st.nextToken());"+Integer.parseInt(st.nextToken()));
System.out.println("[INST]45;None;st.nextToken();"+st.nextToken());
	}

	static int ni() throws IOException {
		return Integer.parseInt(f.readLine());
System.out.println("[INST]49;None;Integer.parseInt(f.readLine());"+Integer.parseInt(f.readLine()));
System.out.println("[INST]49;None;f.readLine();"+f.readLine());
	}

	static StringTokenizer nl() throws IOException {
		return new StringTokenizer(f.readLine());
System.out.println("[INST]53;None;f.readLine();"+f.readLine());
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
