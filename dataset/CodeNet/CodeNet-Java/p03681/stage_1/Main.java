import java.io.*;
import java.util.*;

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
		int n = ni(), m = ni();
		if(n>m) {
			int t = n;
			n = m;
			m = t;
		}
		
		if(m-n>1) {
			out.println(0);
			return;
		}

		long ans = 1;
		for(int i=0;i<n;i++) {
			ans = mul(ans, i+1);
		}
		for(int i=0;i<m;i++) {
			ans = mul(ans, i+1);
		}
		
		if(m==n) {
			ans = mul(ans, 2);
		}
		
		out.println(ans);
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
var newVariable_0 = ls.size();		if (newVariable_0 == 0)
			return -1;
var newVariable_1 = ls.get(0);		if (newVariable_1 instanceof Integer) {
var newVariable_2 = Collections.binarySearch(ls, x, (t1, t2) -> ((Integer) t1).compareTo((Integer) t2) >= 0 ? 1 : -1);var newVariable_3 = ((Integer) t1).compareTo((Integer) t2);			return ~Collections.binarySearch(ls, x, (t1, t2) -> newVariable_3 >= 0 ? 1 : -1);
var newVariable_4 = ls.get(0);		} else if (newVariable_4 instanceof Long) {
var newVariable_5 = Collections.binarySearch(ls, x, (t1, t2) -> ((Long) t1).compareTo((Long) t2) >= 0 ? 1 : -1);var newVariable_6 = ((Long) t1).compareTo((Long) t2);			return ~Collections.binarySearch(ls, x, (t1, t2) -> newVariable_6 >= 0 ? 1 : -1);
var newVariable_7 = ls.get(0);		} else if (newVariable_7 instanceof Double) {
var newVariable_8 = Collections.binarySearch(ls, x, (t1, t2) -> ((Double) t1).compareTo((Double) t2) >= 0 ? 1 : -1);var newVariable_9 = ((Double) t1).compareTo((Double) t2);			return ~Collections.binarySearch(ls, x, (t1, t2) -> newVariable_9 >= 0 ? 1 : -1);
		} else {
			System.err.println(
					String.format("%s:数値でないリストを二分探索しています。", Thread.currentThread().getStackTrace()[1].getMethodName()));
			throw new RuntimeException();
		}
	}

	static <T> int upperBound(List<T> ls, T x) throws RuntimeException {
var newVariable_10 = ls.size();		if (newVariable_10 == 0)
			return -1;
var newVariable_11 = ls.get(0);		if (newVariable_11 instanceof Integer) {
var newVariable_12 = Collections.binarySearch(ls, x, (t1, t2) -> ((Integer) t1).compareTo((Integer) t2) > 0 ? 1 : -1);var newVariable_13 = ((Integer) t1).compareTo((Integer) t2);			return ~Collections.binarySearch(ls, x, (t1, t2) -> newVariable_13 > 0 ? 1 : -1);
var newVariable_14 = ls.get(0);		} else if (newVariable_14 instanceof Long) {
var newVariable_15 = Collections.binarySearch(ls, x, (t1, t2) -> ((Long) t1).compareTo((Long) t2) > 0 ? 1 : -1);var newVariable_16 = ((Long) t1).compareTo((Long) t2);			return ~Collections.binarySearch(ls, x, (t1, t2) -> newVariable_16 > 0 ? 1 : -1);
var newVariable_17 = ls.get(0);		} else if (newVariable_17 instanceof Double) {
var newVariable_18 = Collections.binarySearch(ls, x, (t1, t2) -> ((Double) t1).compareTo((Double) t2) > 0 ? 1 : -1);var newVariable_19 = ((Double) t1).compareTo((Double) t2);			return ~Collections.binarySearch(ls, x, (t1, t2) -> newVariable_19 > 0 ? 1 : -1);
		} else {
			System.err.println(
					String.format("%s:数値でないリストを二分探索しています。", Thread.currentThread().getStackTrace()[1].getMethodName()));
			throw new RuntimeException();
		}
	}

	static <T> int rupperBound(List<T> ls, T x) throws RuntimeException {
var newVariable_20 = ls.size();		if (newVariable_20 == 0)
			return -1;
var newVariable_21 = ls.get(0);		if (newVariable_21 instanceof Integer) {
var newVariable_22 = Collections.binarySearch(ls, x, (t1, t2) -> ((Integer) t1).compareTo((Integer) t2) < 0 ? 1 : -1);var newVariable_23 = ((Integer) t1).compareTo((Integer) t2);			return ~Collections.binarySearch(ls, x, (t1, t2) -> newVariable_23 < 0 ? 1 : -1);
var newVariable_24 = ls.get(0);		} else if (newVariable_24 instanceof Long) {
var newVariable_25 = Collections.binarySearch(ls, x, (t1, t2) -> ((Long) t1).compareTo((Long) t2) < 0 ? 1 : -1);var newVariable_26 = ((Long) t1).compareTo((Long) t2);			return ~Collections.binarySearch(ls, x, (t1, t2) -> newVariable_26 < 0 ? 1 : -1);
var newVariable_27 = ls.get(0);		} else if (newVariable_27 instanceof Double) {
var newVariable_28 = Collections.binarySearch(ls, x, (t1, t2) -> ((Double) t1).compareTo((Double) t2) < 0 ? 1 : -1);var newVariable_29 = ((Double) t1).compareTo((Double) t2);			return ~Collections.binarySearch(ls, x, (t1, t2) -> newVariable_29 < 0 ? 1 : -1);
		} else {
			System.err.println(
					String.format("%s:数値でないリストを二分探索しています。", Thread.currentThread().getStackTrace()[1].getMethodName()));
			throw new RuntimeException();
		}
	}

	static <T> int rlowerBound(List<T> ls, T x) {
var newVariable_30 = ls.size();		if (newVariable_30 == 0)
			return -1;
var newVariable_31 = ls.get(0);		if (newVariable_31 instanceof Integer) {
var newVariable_32 = Collections.binarySearch(ls, x, (t1, t2) -> ((Integer) t1).compareTo((Integer) t2) <= 0 ? 1 : -1);var newVariable_33 = ((Integer) t1).compareTo((Integer) t2);			return ~Collections.binarySearch(ls, x, (t1, t2) -> newVariable_33 <= 0 ? 1 : -1);
var newVariable_34 = ls.get(0);		} else if (newVariable_34 instanceof Long) {
var newVariable_35 = Collections.binarySearch(ls, x, (t1, t2) -> ((Long) t1).compareTo((Long) t2) <= 0 ? 1 : -1);var newVariable_36 = ((Long) t1).compareTo((Long) t2);			return ~Collections.binarySearch(ls, x, (t1, t2) -> newVariable_36 <= 0 ? 1 : -1);
var newVariable_37 = ls.get(0);		} else if (newVariable_37 instanceof Double) {
var newVariable_38 = Collections.binarySearch(ls, x, (t1, t2) -> ((Double) t1).compareTo((Double) t2) <= 0 ? 1 : -1);var newVariable_39 = ((Double) t1).compareTo((Double) t2);			return ~Collections.binarySearch(ls, x, (t1, t2) -> newVariable_39 <= 0 ? 1 : -1);
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
var newVariable_40 = INPUT.isEmpty();var newVariable_41 = INPUT.getBytes();		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(newVariable_41);
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
var newVariable_42 = sb.appendCodePoint(b);			b = readByte();
		}
var newVariable_43 = sb.toString();		return newVariable_43;
	}

	private static char[] ns(int n) {
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while (p < n && !(isSpaceChar(b))) {
			buf[p++] = (char) b;
			b = readByte();
		}
var newVariable_44 = Arrays.copyOf(buf, p);		return n == p ? buf : newVariable_44;
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
