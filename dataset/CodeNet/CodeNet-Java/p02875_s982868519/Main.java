import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) {
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
			char a[] = new char[str.length()];
			for(int i = 0; i < str.length(); i ++) { a[i] = str.charAt(i); }
			return a;
		}
		char[][] nc(int n, int m) {
			char a[][] = new char[n][m];
			for(int i = 0; i < n; i ++) { a[i] = nc(m); }
			return a;
		}
		boolean[] nb(int n, char t) {
			boolean a[] = new boolean[n];
			char c[] = nc(n);
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

		PrintWriter out = new PrintWriter(System.out);
		PrintWriter err = new PrintWriter(System.err);
		void prt() { out.print(""); }
		void prt(int a) { out.print(a); }
		void prt(long a) { out.print(a); }
		void prt(double a) { out.print(a); }
		void prt(String a) { out.print(a); }
		void prt(char a) { out.print(a); }
		void prtln() { out.println(""); }
		void prtln(int a) { out.println(a); }
		void prtln(long a) { out.println(a); }
		void prtln(double a) { out.println(a); }
		void prtln(String a) { out.println(a); }
		void prtln(char a) { out.println(a); }
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
		void errprt() { err.print(""); }
		void errprt(int a) { err.print(a); }
		void errprt(long a) { err.print(a); }
		void errprt(double a) { err.print(a); }
		void errprt(String a) { err.print(a); }
		void errprt(char a) { err.print(a); }
		void errprt(boolean a) { errprt(a ? "#" : "."); }
		void errprtln() { err.println(""); }
		void errprtln(int a) { err.println(a); }
		void errprtln(long a) { err.println(a); }
		void errprtln(double a) { err.println(a); }
		void errprtln(String a) { err.println(a); }
		void errprtln(char a) { err.println(a); }
		void errprtln(boolean a) { errprtln(a ? "#" : "."); }
		void errprtln(int... a) {
			StringBuilder sb = new StringBuilder();
			for(int element : a){ sb.append(element+" "); }
			errprtln(sb.toString().trim());
		}
		void errprtln(long... a) {
			StringBuilder sb = new StringBuilder();
			for(long element : a){ sb.append(element+" "); }
			errprtln(sb.toString().trim());
		}
		void errprtln(double... a) {
			StringBuilder sb = new StringBuilder();
			for(double element : a){ sb.append(element+" "); }
			errprtln(sb.toString().trim());
		}
		void errprtln(String... a) {
			StringBuilder sb = new StringBuilder();
			for(String element : a){ sb.append(element+" "); }
			errprtln(sb.toString().trim());
		}
		void errprtln(char... a) {
			StringBuilder sb = new StringBuilder();
			for(char element : a){ sb.append(element); }
			errprtln(sb.toString().trim());
		}
		void errprtln(boolean... a) {
			StringBuilder sb = new StringBuilder();
			for(boolean element : a){ sb.append((element ? "#" : ".")+" "); }
			errprtln(sb.toString().trim());
		}
		void errprtln(int[][] a) { for(int[] element : a){ errprtln(element); } }
		void errprtln(long[][] a) { for(long[] element : a){ errprtln(element); } }
		void errprtln(double[][] a) { for(double[] element : a){ errprtln(element); } }
		void errprtln(String[][] a) { for(String[] element : a){ errprtln(element); } }
		void errprtln(char[][] a) { for(char[] element : a){ errprtln(element); } }
		void errprtln(boolean[][] a) { for(boolean[] element : a){ errprtln(element); } }

		void reply(boolean b) { prtln(b ? "Yes" : "No"); }
		void REPLY(boolean b) { prtln(b ? "YES" : "NO"); }

		void exit() { out.flush(); err.flush(); System.exit(0); }

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
			return factor;
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

		long INF = (long)1e+15;
		boolean isINF(long a) { return abs(a) > INF / 1000; }
		boolean isPlusINF(long a) { return a > 0 && isINF(a); }
		boolean isMinusINF(long a) { return isPlusINF(- a); }


		// mods
		long MOD = 998244353;
		public long mod(long i) { return i % MOD + ((i % MOD) < 0 ? MOD : 0); }

		long pow_m(long x, long y) {
			if (y == 0) { return 1;
			}else {
				long tmp = pow_m(x, y / 2);
				return mod(mod(tmp * tmp) * (y % 2 == 0 ? 1 : x));
			}
		}

		long inv(long x) { return pow_m(x, MOD - 2); }

		int MAX_FACT = 10_000_100;
		long fact[];
		long invFact[];
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
		}

		long P(int n, int r) {
			if(n < 0 || r < 0 || n < r) { return 0; }
			return mod(fact[n] * invFact[n - r]);
		}
		long C(int n, int r) {
			if(n < 0 || r < 0 || n < r) { return 0; }
			return mod(P(n, r) * invFact[r]);
		}
		long H(int n, int r) { return C((n - 1) + r, r); }


		// grid
		class Grid implements Comparable<Grid> {
			int h;
			int w;
			long val;

			Grid() {  }
			Grid(int h, int w) {
				this.h = h;
				this.w = w;
			}
			Grid(int h, int w, long val) {
				this.h = h;
				this.w = w;
				this.val = val;
			}

			@Override
			public int compareTo(Grid g) {
				return Long.compare(this.val, g.val);
			}
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
	prepareFact();
	int num = ni();
	long ans = pow_m(3, num);
	for(int i = num; i > num / 2; i --) {
		ans = mod(ans - mod(C(num, i) * pow_m(2, num - i)) * 2);
	}
	prtln(ans);
}



	}
}