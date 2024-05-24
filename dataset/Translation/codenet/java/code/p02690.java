import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class p02690 {
	
	long maxDiff = 1_000_000_000;

	public static void main(String[] args) throws IOException {
		p02690 mainObj = new p02690();
		mainObj.solve();
	}

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		int x = fs.nextInt();
		
		HashMap<Long, Integer> powMap = new HashMap<>();
		powMap.put(0L, 0);
		powMap.put(1L, 1);
		
		long beforePow = 1;
		long base = 2;
		while(true) {
			long powVal = pow(base, 5);
			powMap.put(powVal, (int)base);
			if(powVal - beforePow > x) {
				break;
			}
			base++;
			beforePow = powVal;
		}
		
		for(Map.Entry<Long, Integer> mapEntry : powMap.entrySet()) {
			long powVal = mapEntry.getKey();
			
			long diff = Math.abs(x - powVal);
			if(powMap.containsKey(diff)) {
				System.out.print(powMap.get(powVal));
				if(powVal - x < 0) {
					System.out.print(" -"+powMap.get(diff));
				}else {
					System.out.print(" "+powMap.get(diff));
				}
				System.out.print("\n");
				return;
			}
		}
		
	}

	public long pow(long base, int n) {
		long retVal = 1;
		while (n > 0) {
			if ((n & 1) == 1) {
				retVal *= base;
			}
			n >>= 1;
			base *= base;
		}
		return retVal;
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
				st = new StringTokenizer(reader.readLine());
			}
			return st.nextToken();
		}

		public String nextLine() throws IOException {
			st = null;
			String readLine = null;
			readLine = reader.readLine();
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
