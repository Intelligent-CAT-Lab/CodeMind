import java.util.*;
import java.io.*;
public class Main {
	static boolean DEBUG;
	public static void main(String[] args) {
		DEBUG = args.length > 0 && args[0].equals("-DEBUG");
		Solver solver = new Solver();
		solver.solve();
		solver.exit();
	}

	static class FastScanner {
		private final InputStream in = System.in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int buflen = 0;
		private boolean hasNextByte() {
			if (ptr < buflen) {
				return true;
			}else{
				ptr = 0;
				try {
					buflen = in.read(buffer);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (buflen <= 0) {
					return false;
				}
			}
			return true;
		}
		private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
		private boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
		private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
		public boolean hasNext() { skipUnprintable(); return hasNextByte();}
		public String next() {
			if (!hasNext()) throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while(isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}
		public long nextLong() {
			if (!hasNext()) throw new NoSuchElementException();
			long n = 0;
			boolean minus = false;
			int b = readByte();
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			if (b < '0' || '9' < b) {
				throw new NumberFormatException();
			}
			while(true){
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				}else if(b == -1 || !isPrintableChar(b)){
					return minus ? -n : n;
				}else{
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}
	}

	static class Solver {
		FastScanner sc = new FastScanner();
		public Solver() { }

		String ns() { return sc.next(); }
		String[] ns(int n) {
			String a[] = new String[n];
			for(int i = 0; i < n; i ++) { a[i] = ns(); }
			return a;
		}
		String[][] ns(int n, int m) {
			String a[][] = new String[n][m];
			for(int i = 0; i < n; i ++) { a[i] = ns(m); }
			return a;
		}
		char[] nc(int n) {
			String str = ns();
			char a[] = new char[max(n, str.length())];
			for(int i = 0; i < str.length(); i ++) { a[i] = str.charAt(i); }
			return a;
		}
		char[][] nc(int n, int m) {
			char a[][] = new char[n][m];
			for(int i = 0; i < n; i ++) { a[i] = nc(m); }
			return a;
		}
		boolean[] nb(int n, char t) {
			char c[] = nc(-1);
			if(n < 0) n = c.length;
			boolean a[] = new boolean[n];
			for(int i = 0; i < n; i ++) { a[i] = c[i] == t; }
			return a;
		}
		boolean[][] nb(int n, int m, char t) {
			boolean a[][] = new boolean[n][m];
			for(int i = 0; i < n; i ++) { a[i] = nb(m, t); }
			return a;
		}
		int ni() { return (int)sc.nextLong(); }
		int[] ni(int n) {
			int a[] = new int[n];
			for(int i = 0; i < n; i ++) { a[i] = ni(); }
			return a;
		}
		int[][] ni(int n, int m) {
			int a[][] = new int[n][m];
			for(int i = 0; i < n; i ++) { a[i] = ni(m); }
			return a;
		}
		long nl() { return sc.nextLong(); }
		long[] nl(int n) {
			long a[] = new long[n];
			for(int i = 0; i < n; i ++) { a[i] = nl(); }
			return a;
		}
		long[][] nl(int n, int m) {
			long a[][] = new long[n][m];
			for(int i = 0; i < n; i ++) { a[i] = nl(m); }
			return a;
		}
		double nd() { return Double.parseDouble(sc.next()); }
		double[] nd(int n) {
			double a[] = new double[n];
			for(int i = 0; i < n; i ++) { a[i] = nd(); }
			return a;
		}
		double[][] nd(int n, int m) {
			double a[][] = new double[n][m];
			for(int i = 0; i < n; i ++) { a[i] = nd(m); }
			return a;
		}

		PrintWriter out = new PrintWriter(System.out);
		PrintWriter err = new PrintWriter(System.err);
		void prt() { out.print(""); }
		<T> void prt(T a) { out.print(a); }
		void prtln() { out.println(""); }
		<T> void prtln(T a) { out.println(a); }
		void prtln(int... a) {
			StringBuilder sb = new StringBuilder();
			for(int element : a){ sb.append(element+" "); }
			prtln(sb.toString().trim());
		}
		void prtln(long... a) {
			StringBuilder sb = new StringBuilder();
			for(long element : a){ sb.append(element+" "); }
			prtln(sb.toString().trim());
		}
		void prtln(double... a) {
			StringBuilder sb = new StringBuilder();
			for(double element : a){ sb.append(element+" "); }
			prtln(sb.toString().trim());
		}
		void prtln(String... a) {
			StringBuilder sb = new StringBuilder();
			for(String element : a){ sb.append(element+" "); }
			prtln(sb.toString().trim());
		}
		void prtln(char... a) {
			StringBuilder sb = new StringBuilder();
			for(char element : a){ sb.append(element); }
			prtln(sb.toString().trim());
		}
		void prtln(int[][] a) { for(int[] element : a){ prtln(element); } }
		void prtln(long[][] a) { for(long[] element : a){ prtln(element); } }
		void prtln(double[][] a) { for(double[] element : a){ prtln(element); } }
		void prtln(String[][] a) { for(String[] element : a){ prtln(element); } }
		void prtln(char[][] a) { for(char[] element : a){ prtln(element); } }
		String errconvert(int a) { return isINF(a) ? "_" : String.valueOf(a); }
		String errconvert(long a) { return isINF(a) ? "_" : String.valueOf(a); }
		void errprt(int a) { if(DEBUG) { err.print(errconvert(a)); } }
		void errprt(long a) { if(DEBUG) { err.print(errconvert(a)); } }
		void errprt() { if(DEBUG) { err.print(""); } }
		<T> void errprt(T a) { if(DEBUG) { err.print(a); } }
		void errprt(boolean a) { if(DEBUG) { errprt(a ? "#" : "."); } }
		void errprtln() { if(DEBUG) { err.println(""); } }
		void errprtln(int a) { if(DEBUG) { err.println(errconvert(a)); } }
		void errprtln(long a) { if(DEBUG) { err.println(errconvert(a)); } }
		<T> void errprtln(T a) { if(DEBUG) { err.println(a); } }
		void errprtln(boolean a) { if(DEBUG) { errprtln(a ? "#" : "."); } }
		void errprtln(int... a) {
			if(DEBUG) {
				StringBuilder sb = new StringBuilder();
				for(int element : a){ sb.append(errconvert(element)+" "); }
				errprtln(sb.toString().trim());
			}
		}
		void errprtln(long... a) {
			if(DEBUG) {
				StringBuilder sb = new StringBuilder();
				for(long element : a){ sb.append(errconvert(element)+" "); }
				errprtln(sb.toString().trim());
			}
		}
		void errprtln(double... a) {
			if(DEBUG) {
				StringBuilder sb = new StringBuilder();
				for(double element : a){ sb.append(element+" "); }
				errprtln(sb.toString().trim());
			}
		}
		void errprtln(String... a) {
			if(DEBUG) {
				StringBuilder sb = new StringBuilder();
				for(String element : a){ sb.append(element+" "); }
				errprtln(sb.toString().trim());
			}
		}
		void errprtln(char... a) {
			if(DEBUG) {
				StringBuilder sb = new StringBuilder();
				for(char element : a){ sb.append(element); }
				errprtln(sb.toString().trim());
			}
		}
		void errprtln(boolean... a) {
			if(DEBUG) {
				StringBuilder sb = new StringBuilder();
				for(boolean element : a){ sb.append((element ? "#" : ".")+" "); }
				errprtln(sb.toString().trim());
			}
		}
		void errprtln(int[][] a) { if(DEBUG) { for(int[] element : a){ errprtln(element); } } }
		void errprtln(long[][] a) { if(DEBUG) { for(long[] element : a){ errprtln(element); } } }
		void errprtln(double[][] a) { if(DEBUG) { for(double[] element : a){ errprtln(element); } } }
		void errprtln(String[][] a) { if(DEBUG) { for(String[] element : a){ errprtln(element); } } }
		void errprtln(char[][] a) { if(DEBUG) { for(char[] element : a){ errprtln(element); } } }
		void errprtln(boolean[][] a) { if(DEBUG) { for(boolean[] element : a){ errprtln(element); } } }

		void reply(boolean b) { prtln(b ? "Yes" : "No"); }
		void REPLY(boolean b) { prtln(b ? "YES" : "NO"); }

		void flush() { out.flush(); if(DEBUG) { err.flush(); } }
		void exit() { flush(); System.exit(0); }

		int min(int a, int b) { return Math.min(a, b); }
		long min(long a, long b) { return Math.min(a, b); }
		double min(double a, double b) { return Math.min(a, b); }
		int min(int... x) {
			int min = x[0];
			for(int val : x) { min = min(min, val); }
			return min;
		}
		long min(long... x) {
			long min = x[0];
			for(long val : x) { min = min(min, val); }
			return min;
		}
		double min(double... x) {
			double min = x[0];
			for(double val : x) { min = min(min, val); }
			return min;
		}
		int max(int a, int b) { return Math.max(a, b); }
		long max(long a, long b) { return Math.max(a, b); }
		double max(double a, double b) { return Math.max(a, b); }
		int max(int... x) {
			int max = x[0];
			for(int val : x) { max = max(max, val); }
			return max;
		}
		long max(long... x) {
			long max = x[0];
			for(long val : x) { max = max(max, val); }
			return max;
		}
		double max(double... x) {
			double max = x[0];
			for(double val : x) { max = max(max, val); }
			return max;
		}
		long sum(int... a) {
			long sum = 0;
			for(int element : a) { sum += element; }
			return sum;
		}
		long sum(long... a) {
			long sum = 0;
			for(long element : a) { sum += element; }
			return sum;
		}
		double sum(double... a) {
			double sum = 0;
			for(double element : a) { sum += element; }
			return sum;
		}
		long[] sums(int[] a) {
			long sum[] = new long[a.length + 1];
			sum[0] = 0;
			for(int i = 0; i < a.length; i ++) { sum[i + 1] = sum[i] + a[i]; }
			return sum;
		}
		long[] sums(long[] a) {
			long sum[] = new long[a.length + 1];
			sum[0] = 0;
			for(int i = 0; i < a.length; i ++) { sum[i + 1] = sum[i] + a[i]; }
			return sum;
		}
		double[] sums(double[] a) {
			double sum[] = new double[a.length + 1];
			sum[0] = 0;
			for(int i = 0; i < a.length; i ++) { sum[i + 1] = sum[i] + a[i]; }
			return sum;
		}

		long abs(double x) { return (long)Math.abs(x); }
		long round(double x) { return Math.round(x); }
		long floor(double x) { return (long)Math.floor(x); }
		long ceil(double x) { return (long)Math.ceil(x); }
		double sqrt(double x) { return Math.sqrt(x); }
		double pow(double x, double y) { return Math.pow(x, y); }
		long pow(long x, long y) { return (long)Math.pow(x, y); }
		int gcd(int a, int b) { return b == 0 ? a : gcd(b, a % b); }
		long gcd(long a, long b) { return b == 0 ? a : gcd(b, a % b); }
		long lcm(long a, long b) { return a * b / gcd(a, b); }

		int upperToInt(char a) { return a - 'A'; }
		int lowerToInt(char a) { return a - 'a'; }
		int numToInt(char a) { return a - '0'; }
		int charToInt(char a) { return a >= 'a' ? lowerToInt(a) : a >= 'A' ? upperToInt(a) : numToInt(a); }
		char intToUpper(int a) { return (char)(a + 'A'); }
		char intToLower(int a) { return (char)(a + 'a'); }
		char intToNum(int a) { return (char)(a + '0'); }

		long[] div(long a) {
			List<Long> divList = new ArrayList<Long>();
			for(long i = 1; i * i <= a; i ++) {
				if(a % i == 0) {
					divList.add(i);
					if(i * i != a) { divList.add(a / i); };
				}
			}

			long div[] = new long[divList.size()];
			for(int i = 0; i < divList.size(); i ++) { div[i] = divList.get(i); }
			return div;
		}

		long[][] factor(long a) {
			List<Long> factorList = new ArrayList<Long>();
			List<Long> degreeList = new ArrayList<Long>();
			for(long i = 2; i * i <= a; i ++) {
				if(a % i == 0) {
					long count = 0;
					while(a % i == 0) {
						a /= i;
						count ++;
					}
					factorList.add(i);
					degreeList.add(count);
				}
			}
			if(a > 1) {
				factorList.add(a);
				degreeList.add(1L);
			}
			long factor[][] = new long[factorList.size()][2];
			for(int i = 0; i < factorList.size(); i ++) {
				factor[i][0] = factorList.get(i);
				factor[i][1] = degreeList.get(i);
			}
			Arrays.sort(factor, (sort1, sort2) -> Long.compare(sort1[0], sort2[0]));
			return factor;
		}

		boolean isPrime(long x) {
			boolean ok = x > 1;
			for(long i = 2; i * i <= x; i ++) {
				ok &= x % i != 0;
				if(!ok) return ok;
			}
			return ok;
		}
		boolean[] prime(int num) {
			boolean prime[] = new boolean[num];
			fill(prime, true);
			prime[0] = false;
			prime[1] = false;
			for(int i = 2; i < num; i ++) {
				if(prime[i]) {
					for(int j = 2; i * j < num; j ++) {
						prime[i * j] = false;
					}
				}
			}
			return prime;
		}

		long[][] countElements(long[] a, boolean sort) {
			int len = a.length;
			long array[] = new long[len];
			for(int i = 0; i < len; i ++) {
				array[i] = a[i];
			}
			if(sort) { Arrays.sort(array); }
			List<Long> elem = new ArrayList<Long>();
			List<Long> cnt = new ArrayList<Long>();
			long tmp = 1;
			for(int i = 1; i <= len; i ++) {
				if(i == len || array[i] != array[i - 1]) {
					elem.add(array[i - 1]);
					cnt.add(tmp);
					tmp = 1;
				}else {
					tmp ++;
				}
			}
			long counts[][] = new long[elem.size()][2];
			for(int i = 0; i < elem.size(); i ++) {
				counts[i][0] = elem.get(i);
				counts[i][1] = cnt.get(i);
			}
			return counts;
		}
		long[][] countElements(String str, boolean sort) {
			int len = str.length();
			char array[] = str.toCharArray();
			if(sort) { Arrays.sort(array); }
			List<Long> elem = new ArrayList<Long>();
			List<Long> cnt = new ArrayList<Long>();
			long tmp = 1;
			for(int i = 1; i <= len; i ++) {
				if(i == len || array[i] != array[i - 1]) {
					elem.add((long)array[i - 1]);
					cnt.add(tmp);
					tmp = 1;
				}else {
					tmp ++;
				}
			}
			long counts[][] = new long[elem.size()][2];
			for(int i = 0; i < elem.size(); i ++) {
				counts[i][0] = elem.get(i);
				counts[i][1] = cnt.get(i);
			}
			return counts;
		}

		int numDigits(long a) { return Long.toString(a).length(); }
		long bitFlag(int a) { return 1L << (long)a; }
		boolean isFlagged(long x, int a) { return (x & bitFlag(a)) != 0; }

		long countString(String str, String a) { return (str.length() - str.replace(a, "").length()) / a.length(); }
		long countStringAll(String str, String a) { return str.length() - str.replaceAll(a, "").length(); }

		int lowerBound(long array[], long key) {
			return BS(array, key, true, true, true);
		}
		int lowerBound(long array[], long key, int ng, int ok) {
			return BS(array, key, true, true, true, ng, ok);
		}
		int upperBound(long array[], long key) {
			return BS(array, key, true, true, false);
		}
		int upperBound(long array[], long key, int ng, int ok) {
			return BS(array, key, true, true, false, ng, ok);
		}
		int cntBS(long array[], long key, boolean ascending, boolean greater, boolean equals) {
			return BS(array, key, ascending, greater, equals, true);
		}
		int cntBS(long array[], long key, boolean ascending, boolean greater, boolean equals, int ng, int ok) {
			return BS(array, key, ascending, greater, equals, true, ng, ok);
		}
		int BS(long array[], long key, boolean ascending, boolean greater, boolean equals) {
			return BS(array, key, ascending, greater, equals, false);
		}
		int BS(long array[], long key, boolean ascending, boolean greater, boolean equals, int ng, int ok) {
			return BS(array, key, ascending, greater, equals, false, ng, ok);
		}
		int BS(long array[], long key, boolean ascending, boolean greater, boolean equals, boolean count) {
			int ng = ascending ^ greater ? array.length : -1;
			int ok = ascending ^ greater ? -1 : array.length;
			return BS(array, key, ascending, greater, equals, count, ng, ok);
		}
		int BS(long array[], long key, boolean ascending, boolean greater, boolean equals, boolean count, int ng, int ok) {
			int index = binarySearch(array, key, greater, equals, ng, ok);
			return count ? (int)abs(ok - index) : index;
		}
		int binarySearch(long array[], long key, boolean greater, boolean equals, int ng, int ok) {
			while (abs(ok - ng) > 1) {
				int mid = (ok + ng) / 2;
				if(isOKforBinarySearch(array, mid, key, greater, equals)) {
					ok = mid;
				}else {
					ng = mid;
				}
			}
			return ok;
		}
		boolean isOKforBinarySearch(long array[], int index, long key, boolean greater, boolean equals) {
			return (array[index] > key && greater)
				|| (array[index] < key && !greater)
				|| (array[index] == key && equals);
		}

		void reverse(String array[]) {
			String reversed[] = new String[array.length];
			for(int i = 0; i < array.length; i ++) { reversed[array.length - i - 1] = array[i]; }
			for(int i = 0; i < array.length; i ++) { array[i] = reversed[i]; }
		}
		void reverse(int array[]) {
			int reversed[] = new int[array.length];
			for(int i = 0; i < array.length; i ++) { reversed[array.length - i - 1] = array[i]; }
			for(int i = 0; i < array.length; i ++) { array[i] = reversed[i]; }
		}
		void reverse(long array[]) {
			long reversed[] = new long[array.length];
			for(int i = 0; i < array.length; i ++) { reversed[array.length - i - 1] = array[i]; }
			for(int i = 0; i < array.length; i ++) { array[i] = reversed[i]; }
		}
		void reverse(double array[]) {
			double reversed[] = new double[array.length];
			for(int i = 0; i < array.length; i ++) { reversed[array.length - i - 1] = array[i]; }
			for(int i = 0; i < array.length; i ++) { array[i] = reversed[i]; }
		}
		void reverse(boolean array[]) {
			boolean reversed[] = new boolean[array.length];
			for(int i = 0; i < array.length; i ++) { reversed[array.length - i - 1] = array[i]; }
			for(int i = 0; i < array.length; i ++) { array[i] = reversed[i]; }
		}
		void fill(int array[], int x) { Arrays.fill(array, x); }
		void fill(long array[], long x) { Arrays.fill(array, x); }
		void fill(double array[], double x) { Arrays.fill(array, x); }
		void fill(boolean array[], boolean x) { Arrays.fill(array, x); }
		void fill(int array[][], int x) { for(int a[] : array) { fill(a, x); } }
		void fill(long array[][], long x) { for(long a[] : array) { fill(a, x); } }
		void fill(double array[][], double x) { for(double a[] : array) { fill(a, x); } }
		void fill(boolean array[][], boolean x) { for(boolean a[] : array) { fill(a, x); } }
		void fill(int array[][][], int x) { for(int a[][] : array) { fill(a, x); } }
		void fill(long array[][][], long x) { for(long a[][] : array) { fill(a, x); } }
		void fill(double array[][][], double x) { for(double a[][] : array) { fill(a, x); } }
		void fill(boolean array[][][], boolean x) { for(boolean a[][] : array) { fill(a, x); } }

		void shuffleArray(int[] array){
			int n = array.length;
			Random rnd = new Random();
			for(int i = 0; i < n; i ++){
				int tmp = array[i];
				int randomPos = i + rnd.nextInt(n - i);
				array[i] = array[randomPos];
				array[randomPos] = tmp;
			}
		}
		void shuffleArray(long[] array){
			int n = array.length;
			Random rnd = new Random();
			for(int i = 0; i < n; i ++){
				long tmp = array[i];
				int randomPos = i + rnd.nextInt(n - i);
				array[i] = array[randomPos];
				array[randomPos] = tmp;
			}
		}
		void shuffleArray(double[] array){
			int n = array.length;
			Random rnd = new Random();
			for(int i = 0; i < n; i ++){
				double tmp = array[i];
				int randomPos = i + rnd.nextInt(n - i);
				array[i] = array[randomPos];
				array[randomPos] = tmp;
			}
		}

		long INF = (long)1e18 + 7;
		boolean isINF(long a) { return abs(a) > INF / 1000; }
		boolean isPlusINF(long a) { return a > 0 && isINF(a); }
		boolean isMinusINF(long a) { return isPlusINF(- a); }
		int I_INF = (int)1e9 + 7;
		boolean isINF(int a) { return abs(a) > I_INF / 1000; }
		boolean isPlusINF(int a) { return a > 0 && isINF(a); }
		boolean isMinusINF(int a) { return isPlusINF(- a); }


		// mods
		long MOD = (long)1e9 + 7; // 998244353;
		public long mod(long i) { i %= MOD; return i + (i < 0 ? MOD : 0); }

		long pow_m(long x, long y) {
			if (y == 0) { return 1;
			}else {
				long tmp = pow_m(x, y / 2);
				return mod(mod(tmp * tmp) * (y % 2 == 0 ? 1 : x));
			}
		}
		long[] pows_m(long x, int max) {
			long pow[] = new long[max + 1];
			pow[0] = 1;
			for(int i = 0; i < max; i ++) {
				pow[i + 1] = mod(pow[i] * x);
			}
			return pow;
		}

		int MAX_INV_SIZE = 100_100;
		HashMap<Long, Long> invMap = new HashMap<>();
		long inv(long x) {
			x = mod(x);
			if(invMap.containsKey(x)) { return invMap.get(x); }
			if(invMap.size() >= MAX_INV_SIZE) { return calInv(x); }
			invMap.put(x, calInv(x));
			return invMap.get(x);
		}
		long calInv(long x) { return pow_m(x, MOD - 2); }

		int MAX_FACT = 5_000_100;
		long fact[];
		long invFact[];
		boolean isFactPrepared = false;
		HashMap<Integer, long[]> factMap;
		void prepareFact() {
			fact = new long[MAX_FACT];
			Arrays.fill(fact, 0);
			invFact = new long[MAX_FACT];
			Arrays.fill(invFact, 0);
			fact[0] = 1;
			int maxIndex = min(MAX_FACT, (int)MOD);
			for(int i = 1; i < maxIndex; i ++) { fact[i] = mod(fact[i - 1] * i); }
			invFact[maxIndex - 1] = inv(fact[maxIndex - 1]);
			for(int i = maxIndex - 1; i > 0; i --) { invFact[i - 1] = mod(invFact[i] * i); }

			factMap = new HashMap<>();
			isFactPrepared = true;
		}

		long P(int n, int r) {
			if(!isFactPrepared) { prepareFact(); }
			if(n < 0 || r < 0 || n < r) { return 0; }
			if(n >= MAX_FACT) {
				if(!factMap.containsKey(n)) {
					long largeFact[] = new long[MAX_FACT];
					factMap.put(n, largeFact);
					fill(largeFact, -INF);
					largeFact[0] = 1;
				}
				long largeFact[] = factMap.get(n);
				int i = r;
				while(isINF(largeFact[i])) { i --; }
				for(; i < r; i ++) { largeFact[i + 1] = mod(largeFact[i] * (n - i)); }
				return largeFact[r];
			}
			return mod(fact[n] * invFact[n - r]);
		}
		long C(int n, int r) {
			if(!isFactPrepared) { prepareFact(); }
			if(n < 0 || r < 0 || n < r) { return 0; }
			return mod(P(n, r) * invFact[r]);
		}
		long H(int n, int r) { return C((n - 1) + r, r); }


		// grid
		class Grids {
			int h;
			int w;
			Grid[][] gs;
			Grids(int h, int w) {
				this.h = h;
				this.w = w;
				gs = new Grid[h][w];
				for(int i = 0; i < h; i ++) {
					for(int j = 0; j < w; j ++) {
						gs[i][j] = new Grid(i, j, h, w);
					}
				}
			}

			void init(boolean[][] b) {
				for(int i = 0; i < h; i ++) {
					for(int j = 0; j < w; j ++) {
						gs[i][j].b = b[i][j];
					}
				}
			}
			void init(long[][] val) {
				for(int i = 0; i < h; i ++) {
					for(int j = 0; j < w; j ++) {
						gs[i][j].val = val[i][j];
					}
				}
			}

			int dx[] = {0, -1, 1, 0, 0, -1, 1, -1, 1};
			int dy[] = {0, 0, 0, -1, 1, -1, -1, 1, 1};
			Grid next(Grid g, int i) {
				return isValid(g.x + dx[i], g.y + dy[i], g.h, g.w)
					? gs[g.x + dx[i]][g.y + dy[i]]
					: null;
			}
		}
		class Grid implements Comparable<Grid> {
			int x;
			int y;
			int h;
			int w;
			int i;
			boolean b;
			long val;

			Grid() {  }
			Grid(int x, int y, int h, int w) { init(x, y, h, w, false, 0); }
			Grid(int x, int y, int h, int w, boolean b) { init(x, y, h, w, b, 0); }
			Grid(int x, int y, int h, int w, long val) { init(x, y, h, w, false, val); }
			Grid(int x, int y, int h, int w, boolean b, long val) { init(x, y, h, w, b, val); }

			void init(int x, int y, int h, int w, boolean b, long val) {
				this.x = x;
				this.y = y;
				this.h = h;
				this.w = w;
				this.b = b;
				this.val = val;
				i = x * w + y;
			}

			@Override
			public int compareTo(Grid g) {
				return Long.compare(this.val, g.val);
			}
		}

		boolean isValid(int x, int y, int h, int w) {
			return x >= 0 && x < h && y >= 0 && y < w;
		}
		boolean isValid(Grid g) {
			return isValid(g.x, g.y, g.h, g.w);
		}

		// graph
		class Graph {
			int numNode;
			int numEdge;
			boolean directed;
			Edge edges[];
			Node nodes[];
			Node reversedNodes[];

			Graph(int numNode, int numEdge, Edge edges[], boolean directed) {
				this.numNode = numNode;
				this.numEdge = numEdge;
				this.directed = directed;
				this.edges = edges;
				nodes = new Node[numNode];
				reversedNodes = new Node[numNode];
				for(int i = 0; i < numNode; i ++) {
					nodes[i] = new Node(i);
					reversedNodes[i] = new Node(i);
				}

				for(Edge edge : edges) {
					nodes[edge.source].add(edge.target, edge.cost);
					if(directed) {
						reversedNodes[edge.target].add(edge.source, edge.cost);
					}else {
						nodes[edge.target].add(edge.source, edge.cost);
					}
				}
			}

			void clearNodes() {
				for(Node n : nodes) { n.clear(); }
				for(Node n : reversedNodes) { n.clear(); }
			}
		}

		class Node {
			int id;
			ArrayList<Edge> edges = new ArrayList<Edge>();

			Node(int id) {
				this.id = id;
			}
			void add(int target, long cost) {
				edges.add(new Edge(id, target, cost));
			}
			void clear() {
				edges.clear();
			}
		}

		class Edge implements Comparable<Edge> {
			int source;
			int target;
			long cost;
			Edge(int source, int target, long cost) {
				this.source = source;
				this.target = target;
				this.cost = cost;
			}

			@Override
			public int compareTo(Edge e) {
				return Long.compare(this.cost, e.cost);
			}
		}

public void solve() {
	int l = ni();
	l --;
	int crt = 1;
	List<Edge> edges = new ArrayList<>();
	int numNode = 20;
	while(l >= 0 && crt < numNode) {
		if(l % 2 == 0) {
			edges.add(new Edge(crt, numNode, l));
			l --;
		}else {
			l /= 2;
			edges.add(new Edge(crt, crt + 1, 0));
			edges.add(new Edge(crt, crt + 1, l + 1));
			crt ++;
		}
	}
	prtln(numNode, edges.size());
	assert(edges.size() <= 60);
	assert(crt <= numNode);
	for(int i = 0; i < edges.size(); i ++) {
		prtln(edges.get(i).source, edges.get(i).target, edges.get(i).cost);
	}
}



	}
}