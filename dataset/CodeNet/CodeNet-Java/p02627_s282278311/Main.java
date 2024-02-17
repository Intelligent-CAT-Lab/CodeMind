import java.util.*;
import java.io.*;
import java.math.*;
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
		private int pointer = 0;
		private int buflen = 0;
		private boolean hasNextByte() {
			if(pointer < buflen) return true;
			else {
				pointer = 0;
				try {
					buflen = in.read(buffer);
				}catch (IOException e) {
					e.printStackTrace();
				}
				return buflen > 0;
			}
		}
		private int readByte() { if(hasNextByte()) return buffer[pointer ++]; else return -1; }
		private boolean isPrintableChar(int c) { return isPrintableChar(c, false); }
		private boolean isPrintableChar(int c, boolean includingSpace) { return (includingSpace ? 32 : 33) <= c && c <= 126; }
		private void skipUnprintable() { skipUnprintable(false); }
		private void skipUnprintable(boolean includingSpace) { while(hasNextByte() && !isPrintableChar(buffer[pointer], includingSpace)) pointer++; }
		private boolean hasNext() { return hasNext(false); }
		private boolean hasNext(boolean includingSpace) { skipUnprintable(includingSpace); return hasNextByte(); }
		private StringBuilder sb = new StringBuilder();
		public String next() { return next(false); }
		public String next(boolean includingSpace) {
			if(!hasNext(includingSpace)) throw new NoSuchElementException();
			sb.setLength(0);
			int b = readByte();
			while(isPrintableChar(b, includingSpace)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}
		public long nextLong() {
			if(!hasNext()) throw new NoSuchElementException();
			long n = 0;
			boolean minus = false;
			int b = readByte();
			if(b == '-') {
				minus = true;
				b = readByte();
			}
			if(b < '0' || '9' < b) throw new NumberFormatException();
			while(true) {
				if('0' <= b && b <= '9') n = n * 10 + b - '0';
				else if(b == -1 || !isPrintableChar(b)) return minus ? -n : n;
				else throw new NumberFormatException();
				b = readByte();
			}
		}
	}

	static class Solver {
		FastScanner sc = new FastScanner();
		public Solver() { }

		String ns() { return ns(false); }
		String ns(boolean includingSpace) { return sc.next(includingSpace); }
		String[] ns(int n) { return ns(n, false); }
		String[] ns(int n, boolean includingSpace) {
			String a[] = new String[n];
			for(int i = 0; i < n; i ++) { a[i] = ns(includingSpace); }
			return a;
		}
		String[][] ns(int n, int m) { return ns(n, m, false); }
		String[][] ns(int n, int m, boolean includingSpace) {
			String a[][] = new String[n][m];
			for(int i = 0; i < n; i ++) { a[i] = ns(m, includingSpace); }
			return a;
		}
		char nc() { return ns().charAt(0); }
		char[] nc(int n) {
			String str = ns();
			if(n < 0) n = str.length();
			char a[] = new char[n];
			for(int i = 0; i < n; i ++) { a[i] = str.charAt(i); }
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
		int ni() { return Math.toIntExact(sc.nextLong()); }
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


		String boolToString(boolean b) { return b ? "#" : "."; }

		PrintWriter out = new PrintWriter(System.out);
		PrintWriter err = new PrintWriter(System.err);
		StringBuilder sb4prtln = new StringBuilder();
		void prt() { out.print(""); }
		<T> void prt(T a) { out.print(a); }
		void prtln() { out.println(""); }
		<T> void prtln(T a) { out.println(a); }
		void prtln(int... a) {
			sb4prtln.setLength(0);
			for(int element : a){ sb4prtln.append(element+" "); }
			prtln(sb4prtln.toString().trim());
		}
		void prtln(long... a) {
			sb4prtln.setLength(0);
			for(long element : a){ sb4prtln.append(element+" "); }
			prtln(sb4prtln.toString().trim());
		}
		void prtln(double... a) {
			sb4prtln.setLength(0);
			for(double element : a){ sb4prtln.append(element+" "); }
			prtln(sb4prtln.toString().trim());
		}
		void prtln(String... a) {
			sb4prtln.setLength(0);
			for(String element : a){ sb4prtln.append(element+" "); }
			prtln(sb4prtln.toString().trim());
		}
		void prtln(char... a) {
			sb4prtln.setLength(0);
			for(char element : a){ sb4prtln.append(element); }
			prtln(sb4prtln.toString());
		}
		void prtln(boolean... a) {
			sb4prtln.setLength(0);
			for(boolean element : a){ sb4prtln.append(boolToString(element)); }
			prtln(sb4prtln.toString());
		}
		void prtln(int[][] a) { for(int[] element : a){ prtln(element); } }
		void prtln(long[][] a) { for(long[] element : a){ prtln(element); } }
		void prtln(double[][] a) { for(double[] element : a){ prtln(element); } }
		void prtln(String[][] a) { for(String[] element : a){ prtln(element); } }
		void prtln(char[][] a) { for(char[] element : a){ prtln(element); } }
		void prtln(boolean[][] a) { for(boolean[] element : a){ prtln(element); } }

		String errconvert(int a) { return isINF(a) ? "_" : String.valueOf(a); }
		String errconvert(long a) { return isINF(a) ? "_" : String.valueOf(a); }
		void errprt(int a) { if(DEBUG) { err.print(errconvert(a)); } }
		void errprt(long a) { if(DEBUG) { err.print(errconvert(a)); } }
		void errprt() { if(DEBUG) { err.print(""); } }
		<T> void errprt(T a) { if(DEBUG) { err.print(a); } }
		void errprt(boolean a) { if(DEBUG) { errprt(boolToString(a)); } }
		void errprtln() { if(DEBUG) { err.println(""); } }
		void errprtln(int a) { if(DEBUG) { err.println(errconvert(a)); } }
		void errprtln(long a) { if(DEBUG) { err.println(errconvert(a)); } }
		<T> void errprtln(T a) { if(DEBUG) { err.println(a); } }
		void errprtln(boolean a) { if(DEBUG) { errprtln(boolToString(a)); } }
		void errprtln(int... a) {
			if(DEBUG) {
				sb4prtln.setLength(0);
				for(int element : a){ sb4prtln.append(errconvert(element)+" "); }
				errprtln(sb4prtln.toString().trim());
			}
		}
		void errprtln(long... a) {
			if(DEBUG) {
				sb4prtln.setLength(0);
				for(long element : a){ sb4prtln.append(errconvert(element)+" "); }
				errprtln(sb4prtln.toString().trim());
			}
		}
		void errprtln(double... a) {
			if(DEBUG) {
				sb4prtln.setLength(0);
				for(double element : a){ sb4prtln.append(element+" "); }
				errprtln(sb4prtln.toString().trim());
			}
		}
		void errprtln(String... a) {
			if(DEBUG) {
				sb4prtln.setLength(0);
				for(String element : a){ sb4prtln.append(element+" "); }
				errprtln(sb4prtln.toString().trim());
			}
		}
		void errprtln(char... a) {
			if(DEBUG) {
				sb4prtln.setLength(0);
				for(char element : a){ sb4prtln.append(element); }
				errprtln(sb4prtln.toString());
			}
		}
		void errprtln(boolean... a) {
			if(DEBUG) {
				sb4prtln.setLength(0);
				for(boolean element : a){ sb4prtln.append(boolToString(element)); }
				errprtln(sb4prtln.toString());
			}
		}
		void errprtln(int[][] a) { if(DEBUG) { for(int[] element : a){ errprtln(element); } } }
		void errprtln(long[][] a) { if(DEBUG) { for(long[] element : a){ errprtln(element); } } }
		void errprtln(double[][] a) { if(DEBUG) { for(double[] element : a){ errprtln(element); } } }
		void errprtln(String[][] a) { if(DEBUG) { for(String[] element : a){ errprtln(element); } } }
		void errprtln(char[][] a) { if(DEBUG) { for(char[] element : a){ errprtln(element); } } }
		void errprtln(boolean[][] a) { if(DEBUG) { for(boolean[] element : a){ errprtln(element); } } }
		void errprtln(Object[] a) { if(DEBUG) { for(Object element : a){ errprtln(element); } } }
		void errprtln(Object[][] a) { if(DEBUG) { for(Object element : a){ errprtln(element); errprtln(); } } }

		void reply(boolean b) { prtln(b ? "Yes" : "No"); }
		void REPLY(boolean b) { prtln(b ? "YES" : "NO"); }

		void flush() { out.flush(); if(DEBUG) { err.flush(); } }
		void exit() { flush(); System.exit(0); }
		void assertion(boolean b) { if(!b) throw new AssertionError(); }

		<T> void exit(T a) { prtln(a); exit(); }
		void exit(int... a) { prtln(a); exit(); }
		void exit(long... a) { prtln(a); exit(); }
		void exit(double... a) { prtln(a); exit(); }
		void exit(String... a) { prtln(a); exit(); }
		void exit(char... a) { prtln(a); exit(); }
		void exit(boolean... a) { prtln(a); exit(); }
		void exit(int[][] a) { prtln(a); exit(); }
		void exit(long[][] a) { prtln(a); exit(); }
		void exit(double[][] a) { prtln(a); exit(); }
		void exit(String[][] a) { prtln(a); exit(); }
		void exit(char[][] a) { prtln(a); exit(); }
		void exit(boolean[][] a) { prtln(a); exit(); }


		int min(int a, int b) { return Math.min(a, b); }
		long min(long a, long b) { return Math.min(a, b); }
		double min(double a, double b) { return Math.min(a, b); }
		<T extends Comparable<T>> T min(T a, T b) { return a.compareTo(b) <= 0 ? a : b; }
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
		<T extends Comparable<T>> T max(T a, T b) { return a.compareTo(b) >= 0 ? a : b; }
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
		long sum(boolean... a) {
			long sum = 0;
			for(boolean element : a) { sum += element ? 1 : 0; }
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
		long[] sums(boolean[] a) {
			long sum[] = new long[a.length + 1];
			sum[0] = 0;
			for(int i = 0; i < a.length; i ++) { sum[i + 1] = sum[i] + (a[i] ? 1 : 0); }
			return sum;
		}
		long[][] sums(int[][] a) {
			long sum[][] = new long[a.length + 1][a[0].length + 1];
			fill(sum, 0);
			for(int i = 0; i < a.length; i ++) {
				for(int j = 0; j < a[i].length; j ++) {
					sum[i + 1][j + 1] = sum[i + 1][j] + sum[i][j + 1] - sum[i][j] + a[i][j];
				}
			}
			return sum;
		}
		long[][] sums(long[][] a) {
			long sum[][] = new long[a.length + 1][a[0].length + 1];
			fill(sum, 0);
			for(int i = 0; i < a.length; i ++) {
				for(int j = 0; j < a[i].length; j ++) {
					sum[i + 1][j + 1] = sum[i + 1][j] + sum[i][j + 1] - sum[i][j] + a[i][j];
				}
			}
			return sum;
		}
		double[][] sums(double[][] a) {
			double sum[][] = new double[a.length + 1][a[0].length + 1];
			fill(sum, 0);
			for(int i = 0; i < a.length; i ++) {
				for(int j = 0; j < a[i].length; j ++) {
					sum[i + 1][j + 1] = sum[i + 1][j] + sum[i][j + 1] - sum[i][j] + a[i][j];
				}
			}
			return sum;
		}
		long[][] sums(boolean[][] a) {
			long sum[][] = new long[a.length + 1][a[0].length + 1];
			fill(sum, 0);
			for(int i = 0; i < a.length; i ++) {
				for(int j = 0; j < a[i].length; j ++) {
					sum[i + 1][j + 1] = sum[i + 1][j] + sum[i][j + 1] - sum[i][j] + (a[i][j] ? 1 : 0);
				}
			}
			return sum;
		}
		int constrain(int x, int l, int r) { return min(max(x, min(l, r)), max(l, r)); }
		long constrain(long x, long l, long r) { return min(max(x, min(l, r)), max(l, r)); }
		double constrain(double x, double l, double r) { return min(max(x, min(l, r)), max(l, r)); }

		int abs(int x) { return x >= 0 ? x : - x; }
		long abs(long x) { return x >= 0 ? x : - x; }
		double abs(double x) { return x >= 0 ? x : - x; }
		int signum(int x) { return x > 0 ? 1 : x < 0 ? -1 : 0; }
		int signum(long x) { return x > 0 ? 1 : x < 0 ? -1 : 0; }
		int signum(double x) { return x > 0 ? 1 : x < 0 ? -1 : 0; }
		long round(double x) { return Math.round(x); }
		long floor(double x) { return (long)Math.floor(x); }
		int divfloor(int a, int b) { return signum(a) == signum(b) ? a / b : - divceil(abs(a), abs(b)); }
		long divfloor(long a, long b) { return signum(a) == signum(b) ? a / b : - divceil(abs(a), abs(b)); }
		long ceil(double x) { return (long)Math.ceil(x); }
		int divceil(int a, int b) { return a >= 0 && b > 0 ? (a + b - 1) / b
											: a < 0 && b < 0 ? divceil(abs(a), abs(b))
											: - divfloor(abs(a), abs(b)); }
		long divceil(long a, long b) { return a >= 0 && b > 0 ? (a + b - 1) / b
											: a < 0 && b < 0 ? divceil(abs(a), abs(b))
											: - divfloor(abs(a), abs(b)); }
		double sqrt(int x) { return Math.sqrt((double)x); }
		double sqrt(long x) { return Math.sqrt((double)x); }
		double sqrt(double x) { return Math.sqrt(x); }
		long fact(int n) {
			long ans = 1;
			for(int i = 1; i <= n; i ++) ans *= i;
			return ans;
		}
		double pow(double x, double y) { return Math.pow(x, y); }
		long pow(long x, long y) {
			long ans = 1;
			for(; y > 0; y /= 2) {
				if(y % 2 != 0) ans *= x;
				x *= x;
			}
			return ans;
		}
		int gcd(int a, int b) {
			while(true) {
				if(b == 0) return a;
				int tmp = a;
				a = b;
				b = tmp % b;
			}
		}
		long gcd(long a, long b) {
			while(true) {
				if(b == 0) return a;
				long tmp = a;
				a = b;
				b = tmp % b;
			}
		}
		long lcm(long a, long b) { return a / gcd(a, b) * b; }
		int gcd(int... a) {
			int gcd = 0;
			for(int i = 0; i < a.length; i ++) { gcd = gcd(gcd, a[i]); }
			return gcd;
		}
		long gcd(long... a) {
			long gcd = 0;
			for(int i = 0; i < a.length; i ++) { gcd = gcd(gcd, a[i]); }
			return gcd;
		}

		long[] mulMat(long[][] mat1, long[] mat2) {
			long mul[] = new long[mat2.length];
			for(int i = 0; i < mul.length; i ++) {
				for(int j = 0; j < mat2.length; j ++) {
					mul[i] += mat1[i][j] * mat2[j];
				}
			}
			return mul;
		}
		long[][] mulMat(long[][] mat1, long[][] mat2) {
			long mul[][] = new long[mat1.length][mat2[0].length];
			for(int i = 0; i < mul.length; i ++) {
				for(int j = 0; j < mul[i].length; j ++) {
					for(int k = 0; k < mat2.length; k ++) {
						mul[i][j] += mat1[i][k] * mat2[k][j];
					}
				}
			}
			return mul;
		}
		long[][] powMat(long[][] mat, long y) {
			int num = mat.length;
			long[][] ans = new long[num][num];
			fill(ans, 0);
			for(int i = 0; i < num; i ++) ans[i][i] = 1;
			long[][] x = new long[num][num];
			for(int i = 0; i < num; i ++) for(int j = 0; j < num; j ++) x[i][j] = mat[i][j];
			for(; y > 0; y /= 2) {
				if(y % 2 != 0) ans = mulMat(ans, x);
				x = mulMat(x, x);
			}
			return ans;
		}

		boolean isUpper(char a) { return a >= 'A' && a <= 'Z'; }
		boolean isLower(char a) { return a >= 'a' && a <= 'z'; }
		int upperToInt(char a) { return a - 'A'; }
		int lowerToInt(char a) { return a - 'a'; }
		int numToInt(char a) { return a - '0'; }
		int charToInt(char a) { return a >= 'a' ? lowerToInt(a) : a >= 'A' ? upperToInt(a) : numToInt(a); }
		char intToUpper(int a) { return (char)(a + 'A'); }
		char intToLower(int a) { return (char)(a + 'a'); }
		char intToNum(int a) { return (char)(a + '0'); }
		int[] charToInt(char[] a) {
			int array[] = new int[a.length];
			for(int i = 0; i < a.length; i ++) { array[i] = charToInt(a[i]); }
			return array;
		}

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
			if(num > 0) prime[0] = false;
			if(num > 1) prime[1] = false;
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

		int[] baseConvert(long x, int n, int len) {
			int digit[] = new int[len];
			int i = 0;
			long tmp = x;
			while(tmp > 0 && i < len) { digit[i ++] = (int)(tmp % n); tmp /= n; }
			return digit;
		}
		int[] baseConvert(long x, int n) {
			long tmp = x;
			int len = 0;
			while(tmp > 0) { tmp /= n; len ++; }
			return baseConvert(x, n, len);
		}
		int[] baseConvert(int x, int n, int len) {
			int digit[] = new int[len];
			int i = 0;
			int tmp = x;
			while(tmp > 0 && i < len) { digit[i ++] = (int)(tmp % n); tmp /= n; }
			return digit;
		}
		int[] baseConvert(int x, int n) {
			int tmp = x;
			int len = 0;
			while(tmp > 0) { tmp /= n; len ++; }
			return baseConvert(x, n, len);
		}
		long[] baseConvert(long x, long n, int len) {
			long digit[] = new long[len];
			int i = 0;
			long tmp = x;
			while(tmp > 0 && i < len) { digit[i ++] = tmp % n; tmp /= n; }
			return digit;
		}
		long[] baseConvert(long x, long n) {
			long tmp = x;
			int len = 0;
			while(tmp > 0) { tmp /= n; len ++; }
			return baseConvert(x, n, len);
		}

		int numDigits(long a) { return Long.toString(a).length(); }
		long bitFlag(int a) { return 1L << (long)a; }
		boolean isFlagged(long x, int a) { return (x & bitFlag(a)) != 0; }

		long countString(String str, String a) { return (str.length() - str.replace(a, "").length()) / a.length(); }
		long countStringAll(String str, String a) { return str.length() - str.replaceAll(a, "").length(); }

		int lowerBound(int[] array, int key) {
			return BS(array, key, true, true, true);
		}
		int lowerBound(int[] array, int key, int ng, int ok) {
			return BS(array, key, true, true, true, ng, ok);
		}
		int upperBound(int[] array, int key) {
			return BS(array, key, true, true, false);
		}
		int upperBound(int[] array, int key, int ng, int ok) {
			return BS(array, key, true, true, false, ng, ok);
		}
		int cntBS(int[] array, int key, boolean ascending, boolean greater, boolean equals) {
			return BS(array, key, ascending, greater, equals, true);
		}
		int cntBS(int[] array, int key, boolean ascending, boolean greater, boolean equals, int ng, int ok) {
			return BS(array, key, ascending, greater, equals, true, ng, ok);
		}
		int BS(int[] array, int key, boolean ascending, boolean greater, boolean equals) {
			return BS(array, key, ascending, greater, equals, false);
		}
		int BS(int[] array, int key, boolean ascending, boolean greater, boolean equals, int ng, int ok) {
			return BS(array, key, ascending, greater, equals, false, ng, ok);
		}
		int BS(int[] array, int key, boolean ascending, boolean greater, boolean equals, boolean count) {
			int ng = ascending ^ greater ? array.length : -1;
			int ok = ascending ^ greater ? -1 : array.length;
			return BS(array, key, ascending, greater, equals, count, ng, ok);
		}
		int BS(int[] array, int key, boolean ascending, boolean greater, boolean equals, boolean count, int ng, int ok) {
			int index = binarySearch(array, key, greater, equals, ng, ok);
			return count ? (int)abs(ok - index) : index;
		}
		int binarySearch(int[] array, int key, boolean greater, boolean equals, int ng, int ok) {
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
		boolean isOKforBinarySearch(int[] array, int index, int key, boolean greater, boolean equals) {
			return (array[index] > key && greater)
				|| (array[index] < key && !greater)
				|| (array[index] == key && equals);
		}
		int lowerBound(long[] array, long key) {
			return BS(array, key, true, true, true);
		}
		int lowerBound(long[] array, long key, int ng, int ok) {
			return BS(array, key, true, true, true, ng, ok);
		}
		int upperBound(long[] array, long key) {
			return BS(array, key, true, true, false);
		}
		int upperBound(long[] array, long key, int ng, int ok) {
			return BS(array, key, true, true, false, ng, ok);
		}
		int cntBS(long[] array, long key, boolean ascending, boolean greater, boolean equals) {
			return BS(array, key, ascending, greater, equals, true);
		}
		int cntBS(long[] array, long key, boolean ascending, boolean greater, boolean equals, int ng, int ok) {
			return BS(array, key, ascending, greater, equals, true, ng, ok);
		}
		int BS(long[] array, long key, boolean ascending, boolean greater, boolean equals) {
			return BS(array, key, ascending, greater, equals, false);
		}
		int BS(long[] array, long key, boolean ascending, boolean greater, boolean equals, int ng, int ok) {
			return BS(array, key, ascending, greater, equals, false, ng, ok);
		}
		int BS(long[] array, long key, boolean ascending, boolean greater, boolean equals, boolean count) {
			int ng = ascending ^ greater ? array.length : -1;
			int ok = ascending ^ greater ? -1 : array.length;
			return BS(array, key, ascending, greater, equals, count, ng, ok);
		}
		int BS(long[] array, long key, boolean ascending, boolean greater, boolean equals, boolean count, int ng, int ok) {
			int index = binarySearch(array, key, greater, equals, ng, ok);
			return count ? (int)abs(ok - index) : index;
		}
		int binarySearch(long[] array, long key, boolean greater, boolean equals, int ng, int ok) {
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
		boolean isOKforBinarySearch(long[] array, int index, long key, boolean greater, boolean equals) {
			return (array[index] > key && greater)
				|| (array[index] < key && !greater)
				|| (array[index] == key && equals);
		}
		int lowerBound(double[] array, double key) {
			return BS(array, key, true, true, true);
		}
		int lowerBound(double[] array, double key, int ng, int ok) {
			return BS(array, key, true, true, true, ng, ok);
		}
		int upperBound(double[] array, double key) {
			return BS(array, key, true, true, false);
		}
		int upperBound(double[] array, double key, int ng, int ok) {
			return BS(array, key, true, true, false, ng, ok);
		}
		int cntBS(double[] array, double key, boolean ascending, boolean greater, boolean equals) {
			return BS(array, key, ascending, greater, equals, true);
		}
		int cntBS(double[] array, double key, boolean ascending, boolean greater, boolean equals, int ng, int ok) {
			return BS(array, key, ascending, greater, equals, true, ng, ok);
		}
		int BS(double[] array, double key, boolean ascending, boolean greater, boolean equals) {
			return BS(array, key, ascending, greater, equals, false);
		}
		int BS(double[] array, double key, boolean ascending, boolean greater, boolean equals, int ng, int ok) {
			return BS(array, key, ascending, greater, equals, false, ng, ok);
		}
		int BS(double[] array, double key, boolean ascending, boolean greater, boolean equals, boolean count) {
			int ng = ascending ^ greater ? array.length : -1;
			int ok = ascending ^ greater ? -1 : array.length;
			return BS(array, key, ascending, greater, equals, count, ng, ok);
		}
		int BS(double[] array, double key, boolean ascending, boolean greater, boolean equals, boolean count, int ng, int ok) {
			int index = binarySearch(array, key, greater, equals, ng, ok);
			return count ? (int)abs(ok - index) : index;
		}
		int binarySearch(double[] array, double key, boolean greater, boolean equals, int ng, int ok) {
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
		boolean isOKforBinarySearch(double[] array, int index, double key, boolean greater, boolean equals) {
			return (array[index] > key && greater)
				|| (array[index] < key && !greater)
				|| (array[index] == key && equals);
		}
		<T> int lowerBound(T[] array, T key, Comparator<? super T> c) {
			return BS(array, key, true, true, true, c);
		}
		<T> int lowerBound(T[] array, T key, int ng, int ok, Comparator<? super T> c) {
			return BS(array, key, true, true, true, ng, ok, c);
		}
		<T> int upperBound(T[] array, T key, Comparator<? super T> c) {
			return BS(array, key, true, true, false, c);
		}
		<T> int upperBound(T[] array, T key, int ng, int ok, Comparator<? super T> c) {
			return BS(array, key, true, true, false, ng, ok, c);
		}
		<T> int cntBS(T[] array, T key, boolean ascending, boolean greater, boolean equals, Comparator<? super T> c) {
			return BS(array, key, ascending, greater, equals, true, c);
		}
		<T> int cntBS(T[] array, T key, boolean ascending, boolean greater, boolean equals, int ng, int ok, Comparator<? super T> c) {
			return BS(array, key, ascending, greater, equals, true, ng, ok, c);
		}
		<T> int BS(T[] array, T key, boolean ascending, boolean greater, boolean equals, Comparator<? super T> c) {
			return BS(array, key, ascending, greater, equals, false, c);
		}
		<T> int BS(T[] array, T key, boolean ascending, boolean greater, boolean equals, int ng, int ok, Comparator<? super T> c) {
			return BS(array, key, ascending, greater, equals, false, ng, ok, c);
		}
		<T> int BS(T[] array, T key, boolean ascending, boolean greater, boolean equals, boolean count, Comparator<? super T> c) {
			int ng = ascending ^ greater ? array.length : -1;
			int ok = ascending ^ greater ? -1 : array.length;
			return BS(array, key, ascending, greater, equals, count, ng, ok, c);
		}
		<T> int BS(T[] array, T key, boolean ascending, boolean greater, boolean equals, boolean count, int ng, int ok, Comparator<? super T> c) {
			int index = binarySearch(array, key, greater, equals, ng, ok, c);
			return count ? (int)abs(ok - index) : index;
		}
		<T> int binarySearch(T[] array, T key, boolean greater, boolean equals, int ng, int ok, Comparator<? super T> c) {
			while (abs(ok - ng) > 1) {
				int mid = (ok + ng) / 2;
				if(isOKforBinarySearch(array, mid, key, greater, equals, c)) {
					ok = mid;
				}else {
					ng = mid;
				}
			}
			return ok;
		}
		<T> boolean isOKforBinarySearch(T[] array, int index, T key, boolean greater, boolean equals, Comparator<? super T> c) {
			int compare = c.compare(array[index], key);
			return (compare > 0 && greater)
				|| (compare < 0 && !greater)
				|| (compare == 0 && equals);
		}



		String reverse(String str) { return (new StringBuilder(str)).reverse().toString(); }
		void reverse(String[] array) {
			for(int i = 0; i < array.length / 2; i ++) { swap(array, i, array.length - i - 1); }
		}
		void reverse(int[] array) {
			for(int i = 0; i < array.length / 2; i ++) { swap(array, i, array.length - i - 1); }
		}
		void reverse(long[] array) {
			for(int i = 0; i < array.length / 2; i ++) { swap(array, i, array.length - i - 1); }
		}
		void reverse(double[] array) {
			for(int i = 0; i < array.length / 2; i ++) { swap(array, i, array.length - i - 1); }
		}
		void reverse(char[] array) {
			for(int i = 0; i < array.length / 2; i ++) { swap(array, i, array.length - i - 1); }
		}
		void reverse(boolean[] array) {
			for(int i = 0; i < array.length / 2; i ++) { swap(array, i, array.length - i - 1); }
		}
		<T> void reverse(T[] array) {
			for(int i = 0; i < array.length / 2; i ++) { swap(array, i, array.length - i - 1); }
		}
		void fill(int[] array, int x) { Arrays.fill(array, x); }
		void fill(long[] array, long x) { Arrays.fill(array, x); }
		void fill(double[] array, double x) { Arrays.fill(array, x); }
		void fill(char[] array, char x) { Arrays.fill(array, x); }
		void fill(boolean[] array, boolean x) { Arrays.fill(array, x); }
		void fill(int[][] array, int x) { for(int[] a : array) { fill(a, x); } }
		void fill(long[][] array, long x) { for(long[] a : array) { fill(a, x); } }
		void fill(double[][] array, double x) { for(double[] a : array) { fill(a, x); } }
		void fill(char[][] array, char x) { for(char[] a : array) { fill(a, x); } }
		void fill(boolean[][] array, boolean x) { for(boolean[] a : array) { fill(a, x); } }
		void fill(int[][][] array, int x) { for(int[][] a : array) { fill(a, x); } }
		void fill(long[][][] array, long x) { for(long[][] a : array) { fill(a, x); } }
		void fill(double[][][] array, double x) { for(double[][] a : array) { fill(a, x); } }
		void fill(char[][][] array, char x) { for(char[][] a : array) { fill(a, x); } }
		void fill(boolean[][][] array, boolean x) { for(boolean[][] a : array) { fill(a, x); } }

		int[] resize(int[] array, int m, int x) {
			int resized[] = new int[m];
			for(int i = max(0, - x); i < array.length && i + x < m; i ++) { resized[i + x] = array[i]; }
			return resized;
		}
		long[] resize(long[] array, int m, int x) {
			long resized[] = new long[m];
			for(int i = max(0, - x); i < array.length && i + x < m; i ++) { resized[i + x] = array[i]; }
			return resized;
		}
		double[] resize(double[] array, int m, int x) {
			double resized[] = new double[m];
			for(int i = max(0, - x); i < array.length && i + x < m; i ++) { resized[i + x] = array[i]; }
			return resized;
		}
		char[] resize(char[] array, int m, int x) {
			char resized[] = new char[m];
			for(int i = max(0, - x); i < array.length && i + x < m; i ++) { resized[i + x] = array[i]; }
			return resized;
		}
		boolean[] resize(boolean[] array, int m, int x) {
			boolean resized[] = new boolean[m];
			for(int i = max(0, - x); i < array.length && i + x < m; i ++) { resized[i + x] = array[i]; }
			return resized;
		}
		Object[] resize(Object[] array, int m, int x) {
			Object resized[] = new Object[m];
			for(int i = max(0, - x); i < array.length && i + x < m; i ++) { resized[i + x] = array[i]; }
			return resized;
		}

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

		void swap(String[] array, int i, int j) {
			String tmp = array[i];
			array[i] = array[j];
			array[j] = tmp;
		}
		void swap(int[] array, int i, int j) {
			int tmp = array[i];
			array[i] = array[j];
			array[j] = tmp;
		}
		void swap(long[] array, int i, int j) {
			long tmp = array[i];
			array[i] = array[j];
			array[j] = tmp;
		}
		void swap(double[] array, int i, int j) {
			double tmp = array[i];
			array[i] = array[j];
			array[j] = tmp;
		}
		void swap(char[] array, int i, int j) {
			char tmp = array[i];
			array[i] = array[j];
			array[j] = tmp;
		}
		void swap(boolean[] array, int i, int j) {
			boolean tmp = array[i];
			array[i] = array[j];
			array[j] = tmp;
		}
		<T> void swap(T[] array, int i, int j) {
			T tmp = array[i];
			array[i] = array[j];
			array[j] = tmp;
		}

		int[] compress(int[] a) {
			int num = a.length;
			Set<Integer> ss = new TreeSet<>();
			for(int i = 0; i < num; i ++) ss.add(a[i]);
			int compressed[] = new int[ss.size()];
			int j = 0;
			for(Integer x : ss) compressed[j ++] = x;
			for(int i = 0; i < num; i ++) a[i] = lowerBound(compressed, a[i]);
			return compressed;
		}
		long[] compress(long[] a) {
			int num = a.length;
			Set<Long> ss = new TreeSet<>();
			for(int i = 0; i < num; i ++) ss.add(a[i]);
			long compressed[] = new long[ss.size()];
			int j = 0;
			for(Long x : ss) compressed[j ++] = x;
			for(int i = 0; i < num; i ++) a[i] = lowerBound(compressed, a[i]);
			return compressed;
		}
		double[] compress(double[] a) {
			int num = a.length;
			Set<Double> ss = new TreeSet<>();
			for(int i = 0; i < num; i ++) ss.add(a[i]);
			double compressed[] = new double[ss.size()];
			int j = 0;
			for(Double x : ss) compressed[j ++] = x;
			for(int i = 0; i < num; i ++) a[i] = lowerBound(compressed, a[i]);
			return compressed;
		}

		long INF = (long)1e18 + 7;
		boolean isINF(long a) { return abs(a) > INF / 100; }
		boolean isPlusINF(long a) { return a > 0 && isINF(a); }
		boolean isMinusINF(long a) { return isPlusINF(- a); }
		int I_INF = (int)1e9 + 7;
		boolean isINF(int a) { return abs(a) > I_INF / 100; }
		boolean isPlusINF(int a) { return a > 0 && isINF(a); }
		boolean isMinusINF(int a) { return isPlusINF(- a); }


		// mods
		final long MOD = (long)1e9 + 7; // 998244353;
		public long mod(long i) { i %= MOD; return i + (i < 0 ? MOD : 0); }

		long pow_m(long x, long y) {
			long ans = 1;
			for(; y > 0; y /= 2) {
				if(y % 2 != 0) ans = mod(ans * x);
				x = mod(x * x);
			}
			return ans;
		}
		long[] pows_m(long x, int max) {
			long pow[] = new long[max + 1];
			pow[0] = 1;
			for(int i = 0; i < max; i ++) {
				pow[i + 1] = mod(pow[i] * x);
			}
			return pow;
		}
		long fact_m(int n) {
			long ans = 1;
			for(int i = 1; i <= n; i ++) ans = mod(ans * i);
			return ans;
		}

		int MAX_INV_SIZE = 100_100;
		Map<Long, Long> invMap = new HashMap<>();
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
		Map<Integer, long[]> factMap;
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
			Grid[] gi;
			Grids(int h, int w) {
				this.h = h;
				this.w = w;
				gs = new Grid[h][w];
				gi = new Grid[h * w];
				for(int i = 0; i < h; i ++) {
					for(int j = 0; j < w; j ++) {
						gs[i][j] = new Grid(i, j, h, w);
						gi[gs[i][j].i] = gs[i][j];
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

			Grid get(int x, int y) { return isValid(x, y, h, w) ? gs[x][y] : null; }
			Grid get(int i) { return get(i / w, i % w); }

			int dx[] = {0, -1, 1, 0, 0, -1, 1, -1, 1};
			int dy[] = {0, 0, 0, -1, 1, -1, -1, 1, 1};
			Grid next(int x, int y, int i) { return next(gs[x][y], i); }
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
			public int compareTo(Grid g) { return Long.compare(this.val, g.val); }

			@Override
			public String toString() { return "("+x+", "+y+")"+" "+boolToString(b)+" "+val; }
		}

		boolean isValid(int x, int y, int h, int w) { return x >= 0 && x < h && y >= 0 && y < w; }
		boolean isValid(Grid g) { return isValid(g.x, g.y, g.h, g.w); }

		// graph
		class Graph {
			int numNode;
			int numEdge;
			boolean directed;
			Edge edges[];
			Node nodes[];
			Node reversedNodes[];

			Graph(int numNode, int numEdge, boolean directed) {
				this.numNode = numNode;
				this.numEdge = numEdge;
				this.directed = directed;
				nodes = new Node[numNode];
				reversedNodes = new Node[numNode];
				for(int i = 0; i < numNode; i ++) {
					nodes[i] = new Node(i);
					reversedNodes[i] = new Node(i);
				}
			}

			void init(Edge[] edges) {
				this.edges = edges;
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

		class Node extends ArrayList<Edge> {
			int id;

			Node(int id) { this.id = id; }
			void add(int target, long cost) { add(new Edge(id, target, cost)); }
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
			public int compareTo(Edge e) { return Long.compare(this.cost, e.cost); }

			@Override
			public String toString() { return source+" - "+cost+" -> "+target; }
		}

public void solve() {
	prtln(isLower(nc()) ? "a" : "A");
}



	}
}