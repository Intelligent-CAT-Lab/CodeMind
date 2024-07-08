import java.io.*;
import java.util.*;

class P{
	long num;
	double snuke;
	public P(long num, double snuke) {
		super();
		this.num = num;
		this.snuke = snuke;
	}
}

public class Main {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";

	static final long mod = (long) 1e9 + 7;
	static final int dx[] = { -1, 0, 1, 0 }, dy[] = { 0, -1, 0, 1 };
	static final int[] dx8 = { -1, -1, -1, 0, 0, 1, 1, 1 }, dy8 = { -1, 0, 1, -1, 1, -1, 0, 1 };
	static final int inf = Integer.MAX_VALUE / 3;
	static final long linf = Long.MAX_VALUE / 3;
	static final double dinf = Double.MAX_VALUE / 3;
	static final double eps = 1e-10;
	static final double pi = Math.PI;

	static void solve() {
		int k = ni();
		PriorityQueue<P> q = new PriorityQueue<>((p1, p2)->{
			if(p1.snuke == p2.snuke) return p1.num - p2.num>0?1:-1;
			return p1.snuke - p2.snuke > 0?1:-1;
		}); 
		Set<Long> set = new HashSet<>();
		for(int i=1;i<10;i++) {
var newVariable_0 = set.add((long)i);		}
		for(int i=1;i<=10000;i++) {
			long t = i;
			for(int j=0;j<20;j++) {
				t *= 10;
				t += 9; 
var newVariable_1 = set.add(t);			}
		}
		for(long t:set) {
			q.add(new P(t, ((double)t)/dsum(t)));							
		}
		long min = 0;
		while(k>0) {
			P p = q.poll();
			if(min<=p.num) {
				min = p.num;
				out.println(p.num);
				k--;
			}
		}
	}
	
	static long dsum(long t) {
		long res = 0;
		while(t>0) {
			res += t%10;
			t /= 10;
		}
		return res;
	}

	//libraries		
	static int lowerBound(int[] a, int x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] < x) {//昇順の配列
				//if (a[c] > x) {//降順の配列
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}

	static int upperBound(int[] a, int x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] <= x) {
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}

	static int lowerBound(long[] a, long x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] < x) {
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}

	static int upperBound(long[] a, long x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] <= x) {
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}

	static int lowerBound(double[] a, double x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] < x) {
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}

	static int upperBound(double[] a, double x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] <= x) {
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}

	static <T> int lowerBound(List<T> ls, T x) throws RuntimeException {
var newVariable_2 = ls.size();		if (newVariable_2 == 0)
			return -1;
var newVariable_3 = ls.get(0);		if (newVariable_3 instanceof Integer) {
var newVariable_4 = Collections.binarySearch(ls, x, (t1, t2) -> ((Integer) t1).compareTo((Integer) t2) >= 0 ? 1 : -1);var newVariable_5 = ((Integer) t1).compareTo((Integer) t2);			return ~Collections.binarySearch(ls, x, (t1, t2) -> newVariable_5 >= 0 ? 1 : -1);
var newVariable_6 = ls.get(0);		} else if (newVariable_6 instanceof Long) {
var newVariable_7 = Collections.binarySearch(ls, x, (t1, t2) -> ((Long) t1).compareTo((Long) t2) >= 0 ? 1 : -1);var newVariable_8 = ((Long) t1).compareTo((Long) t2);			return ~Collections.binarySearch(ls, x, (t1, t2) -> newVariable_8 >= 0 ? 1 : -1);
var newVariable_9 = ls.get(0);		} else if (newVariable_9 instanceof Double) {
var newVariable_10 = Collections.binarySearch(ls, x, (t1, t2) -> ((Double) t1).compareTo((Double) t2) >= 0 ? 1 : -1);var newVariable_11 = ((Double) t1).compareTo((Double) t2);			return ~Collections.binarySearch(ls, x, (t1, t2) -> newVariable_11 >= 0 ? 1 : -1);
		} else {
			System.err.println(
					String.format("%s:数値でないリストを二分探索しています。", Thread.currentThread().getStackTrace()[1].getMethodName()));
			throw new RuntimeException();
		}
	}

	static <T> int upperBound(List<T> ls, T x) throws RuntimeException {
var newVariable_12 = ls.size();		if (newVariable_12 == 0)
			return -1;
var newVariable_13 = ls.get(0);		if (newVariable_13 instanceof Integer) {
var newVariable_14 = Collections.binarySearch(ls, x, (t1, t2) -> ((Integer) t1).compareTo((Integer) t2) > 0 ? 1 : -1);var newVariable_15 = ((Integer) t1).compareTo((Integer) t2);			return ~Collections.binarySearch(ls, x, (t1, t2) -> newVariable_15 > 0 ? 1 : -1);
var newVariable_16 = ls.get(0);		} else if (newVariable_16 instanceof Long) {
var newVariable_17 = Collections.binarySearch(ls, x, (t1, t2) -> ((Long) t1).compareTo((Long) t2) > 0 ? 1 : -1);var newVariable_18 = ((Long) t1).compareTo((Long) t2);			return ~Collections.binarySearch(ls, x, (t1, t2) -> newVariable_18 > 0 ? 1 : -1);
var newVariable_19 = ls.get(0);		} else if (newVariable_19 instanceof Double) {
var newVariable_20 = Collections.binarySearch(ls, x, (t1, t2) -> ((Double) t1).compareTo((Double) t2) > 0 ? 1 : -1);var newVariable_21 = ((Double) t1).compareTo((Double) t2);			return ~Collections.binarySearch(ls, x, (t1, t2) -> newVariable_21 > 0 ? 1 : -1);
		} else {
			System.err.println(
					String.format("%s:数値でないリストを二分探索しています。", Thread.currentThread().getStackTrace()[1].getMethodName()));
			throw new RuntimeException();
		}
	}

	static <T> int rupperBound(List<T> ls, T x) throws RuntimeException {
var newVariable_22 = ls.size();		if (newVariable_22 == 0)
			return -1;
var newVariable_23 = ls.get(0);		if (newVariable_23 instanceof Integer) {
var newVariable_24 = Collections.binarySearch(ls, x, (t1, t2) -> ((Integer) t1).compareTo((Integer) t2) < 0 ? 1 : -1);var newVariable_25 = ((Integer) t1).compareTo((Integer) t2);			return ~Collections.binarySearch(ls, x, (t1, t2) -> newVariable_25 < 0 ? 1 : -1);
var newVariable_26 = ls.get(0);		} else if (newVariable_26 instanceof Long) {
var newVariable_27 = Collections.binarySearch(ls, x, (t1, t2) -> ((Long) t1).compareTo((Long) t2) < 0 ? 1 : -1);var newVariable_28 = ((Long) t1).compareTo((Long) t2);			return ~Collections.binarySearch(ls, x, (t1, t2) -> newVariable_28 < 0 ? 1 : -1);
var newVariable_29 = ls.get(0);		} else if (newVariable_29 instanceof Double) {
var newVariable_30 = Collections.binarySearch(ls, x, (t1, t2) -> ((Double) t1).compareTo((Double) t2) < 0 ? 1 : -1);var newVariable_31 = ((Double) t1).compareTo((Double) t2);			return ~Collections.binarySearch(ls, x, (t1, t2) -> newVariable_31 < 0 ? 1 : -1);
		} else {
			System.err.println(
					String.format("%s:数値でないリストを二分探索しています。", Thread.currentThread().getStackTrace()[1].getMethodName()));
			throw new RuntimeException();
		}
	}

	static <T> int rlowerBound(List<T> ls, T x) {
var newVariable_32 = ls.size();		if (newVariable_32 == 0)
			return -1;
var newVariable_33 = ls.get(0);		if (newVariable_33 instanceof Integer) {
var newVariable_34 = Collections.binarySearch(ls, x, (t1, t2) -> ((Integer) t1).compareTo((Integer) t2) <= 0 ? 1 : -1);var newVariable_35 = ((Integer) t1).compareTo((Integer) t2);			return ~Collections.binarySearch(ls, x, (t1, t2) -> newVariable_35 <= 0 ? 1 : -1);
var newVariable_36 = ls.get(0);		} else if (newVariable_36 instanceof Long) {
var newVariable_37 = Collections.binarySearch(ls, x, (t1, t2) -> ((Long) t1).compareTo((Long) t2) <= 0 ? 1 : -1);var newVariable_38 = ((Long) t1).compareTo((Long) t2);			return ~Collections.binarySearch(ls, x, (t1, t2) -> newVariable_38 <= 0 ? 1 : -1);
var newVariable_39 = ls.get(0);		} else if (newVariable_39 instanceof Double) {
var newVariable_40 = Collections.binarySearch(ls, x, (t1, t2) -> ((Double) t1).compareTo((Double) t2) <= 0 ? 1 : -1);var newVariable_41 = ((Double) t1).compareTo((Double) t2);			return ~Collections.binarySearch(ls, x, (t1, t2) -> newVariable_41 <= 0 ? 1 : -1);
		} else {
			System.err.println(
					String.format("%s:数値でないリストを二分探索しています。", Thread.currentThread().getStackTrace()[1].getMethodName()));
			throw new RuntimeException();
		}
	}

	static int[] concat(int x, int arr[]) {
		int ret[] = new int[arr.length + 1];
		System.arraycopy(arr, 0, ret, 1, ret.length - 1);
		ret[0] = x;
		return ret;
	}

	static int[] concat(int arr[], int x) {
		int ret[] = new int[arr.length + 1];
		System.arraycopy(arr, 0, ret, 0, ret.length - 1);
		ret[ret.length - 1] = x;
		return ret;
	}

	static long[] concat(long x, long arr[]) {
		long ret[] = new long[arr.length + 1];
		System.arraycopy(arr, 0, ret, 1, ret.length - 1);
		ret[0] = x;
		return ret;
	}

	static long[] concat(long arr[], long x) {
		long ret[] = new long[arr.length + 1];
		System.arraycopy(arr, 0, ret, 0, ret.length - 1);
		ret[ret.length - 1] = x;
		return ret;
	}

	static long max(long x, long y) {
		return Math.max(x, y);
	}

	static long min(long x, long y) {
		return Math.min(x, y);
	}

	static long max(long x, long y, long z) {
		x = Math.max(x, y);
		x = Math.max(x, z);
		return x;
	}

	static long min(long x, long y, long z) {
		x = Math.min(x, y);
		x = Math.min(x, z);
		return x;
	}

	static double max(double x, double y) {
		return Math.max(x, y);
	}

	static double min(double x, double y) {
		return Math.min(x, y);
	}

	static double max(double x, double y, double z) {
		x = Math.max(x, y);
		x = Math.max(x, z);
		return x;
	}

	static double min(double x, double y, double z) {
		x = Math.min(x, y);
		x = Math.min(x, z);
		return x;
	}

	static void sort(int[] ar) {
		Arrays.sort(ar);
	}

	static void sort(long[] ar) {
		Arrays.sort(ar);
	}

	static void sort(double[] ar) {
		Arrays.sort(ar);
	}

	static void rsort(int[] ar) {
		Arrays.sort(ar);
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			int tmp = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = tmp;
		}
	}

	static void rsort(long[] ar) {
		Arrays.sort(ar);
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			long tmp = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = tmp;
		}
	}

	static void rsort(double[] ar) {
		Arrays.sort(ar);
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			double tmp = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = tmp;
		}
	}

	static void fill(int arr[], int x) {
		Arrays.fill(arr, x);
	}

	static void fill(long arr[], long x) {
		Arrays.fill(arr, x);
	}

	static void fill(double arr[], double x) {
		Arrays.fill(arr, x);
	}

	static void fill(int arr[][], int x) {
		for (int i = 0; i < arr.length; i++)
			Arrays.fill(arr[i], x);
	}

	static void fill(long arr[][], long x) {
		for (int i = 0; i < arr.length; i++)
			Arrays.fill(arr[i], x);
	}

	static void fill(double arr[][], double x) {
		for (int i = 0; i < arr.length; i++)
			Arrays.fill(arr[i], x);
	}

	//MOD culc
	static long plus(long x, long y) {
		long res = (x + y) % mod;
		return res < 0 ? res + mod : res;
	}

	static long sub(long x, long y) {
		long res = (x - y) % mod;
		return res < 0 ? res + mod : res;
	}

	static long mul(long x, long y) {
		long res = (x * y) % mod;
		return res < 0 ? res + mod : res;
	}

	static long div(long x, long y) {
		long res = x * pow(y, mod - 2) % mod;
		return res < 0 ? res + mod : res;
	}

	static long pow(long x, long y) {
		if (y < 0)
			return 0;
		if (y == 0)
			return 1;
		if (y % 2 == 1)
			return (x * pow(x, y - 1)) % mod;
		long root = pow(x, y / 2);
		return root * root % mod;
	}

	public static void main(String[] args) throws Exception {
var newVariable_42 = INPUT.isEmpty();var newVariable_43 = INPUT.getBytes();		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(newVariable_43);
		out = new PrintWriter(System.out);
		solve();
		out.flush();
	}

	//input
	private static byte[] inbuf = new byte[1024];
	static int lenbuf = 0, ptrbuf = 0;

	private static int readByte() {
		if (lenbuf == -1)
			throw new InputMismatchException();
		if (ptrbuf >= lenbuf) {
			ptrbuf = 0;
			try {
				lenbuf = is.read(inbuf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (lenbuf <= 0)
				return -1;
		}
		return inbuf[ptrbuf++];
	}

	private static boolean isSpaceChar(int c) {
		return !(c >= 33 && c <= 126);
	}

	private static int skip() {
		int b;
		while ((b = readByte()) != -1 && isSpaceChar(b))
			;
		return b;
	}

	@SuppressWarnings("unused")
	private static double nd() {
		return Double.parseDouble(ns());
	}

	@SuppressWarnings("unused")
	private static char nc() {
		return (char) skip();
	}

	private static String ns() {
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while (!(isSpaceChar(b))) {
var newVariable_44 = sb.appendCodePoint(b);			b = readByte();
		}
var newVariable_45 = sb.toString();		return newVariable_45;
	}

	private static char[] ns(int n) {
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while (p < n && !(isSpaceChar(b))) {
			buf[p++] = (char) b;
			b = readByte();
		}
var newVariable_46 = Arrays.copyOf(buf, p);		return n == p ? buf : newVariable_46;
	}

	@SuppressWarnings("unused")
	private static char[][] nm(int n, int m) {
		char[][] map = new char[n][];
		for (int i = 0; i < n; i++)
			map[i] = ns(m);
		return map;
	}

	@SuppressWarnings("unused")
	private static int[] na(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = ni();
		return a;
	}

	private static int ni() {
		int num = 0, b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = readByte();
		}

		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}

	@SuppressWarnings("unused")
	private static long nl() {
		long num = 0;
		int b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = readByte();
		}

		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}

}
