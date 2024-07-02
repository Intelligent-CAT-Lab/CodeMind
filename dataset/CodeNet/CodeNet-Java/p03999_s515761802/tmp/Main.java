import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		String s = fs.next();
		System.out.println(dfs(0,0,0,s));
	}
	
	long dfs(long leftNum, long sum, int depth, String s) {
		int nowCharNum = s.charAt(depth) - '0';
System.out.println("[INST]19;None;s.charAt(depth);"+s.charAt(depth));
		if(depth == s.length() - 1) {
System.out.println("[INST]20;None;s.length();"+s.length());
			return sum + leftNum*10 + nowCharNum;
		}
		// +を置かない
		return dfs(leftNum*10+nowCharNum,sum, depth+1, s) + dfs(0, sum + leftNum*10+nowCharNum, depth+1, s);
		
	}

	

	public class FastScanner {

		BufferedReader reader;
		private StringTokenizer st;

		public FastScanner() {
			st = null;
			reader = new BufferedReader(new InputStreamReader(System.in));
		}

		public String next() throws IOException {
			if (st == null || !st.hasMoreElements()) {
System.out.println("[INST]41;None;st.hasMoreElements();"+st.hasMoreElements());
				st = new StringTokenizer(reader.readLine());
System.out.println("[INST]42;None;reader.readLine();"+reader.readLine());
			}
			return st.nextToken();
System.out.println("[INST]44;None;st.nextToken();"+st.nextToken());
		}

		public String nextLine() throws IOException {
			st = null;
			String readLine = null;
			readLine = reader.readLine();
System.out.println("[INST]50;readLine;reader.readLine();"+readLine);
			return readLine;
		}

		public int nextInt() throws NumberFormatException, IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}

		public int[] nextIntArr(int n) throws NumberFormatException, IOException {
			int[] retArr = new int[n];
			for (int i = 0; i < n; i++) {
				retArr[i] = nextInt();
			}
			return retArr;
		}

		public long[] nextLongArr(int n) throws NumberFormatException, IOException {
			long[] retArr = new long[n];
			for (int i = 0; i < n; i++) {
				retArr[i] = nextLong();
			}
			return retArr;
		}

		public void close() throws IOException {
			reader.close();
		}
	}

}
