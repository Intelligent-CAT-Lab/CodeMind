import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	private static void solve() {
		long n = ni();
		long k = ni();
		final long M = 1000000007l;
		Mod m = new Mod(M);
		for (int i = 1; i <= k; i++) {
			long bl = modFact(m, k - 1, k - i);
			long re = modFact(m, n - k + 1, n - k - i + 1);
			out(bl * re % M);
		}
	}

	static long modFact(Mod m, long n, long k) {
		if (k < 0)
			return 0;
		if (k > n)
			return 0;
		if (n == k)
			return 1;
		m.vm.set("n", n);
		m.vm.set("k", k);
		return m.vm.run("n!/(n-k)!/k!");
	}

	static int min(int a, int b) {
		return a < b ? a : b;
	}

	static long min(long a, long b) {
		return a < b ? a : b;
	}

	static <A extends Comparable<? super A>> A min(A a, A b) {
		return a.compareTo(b) < 0 ? a : b;
	}

	static int max(int a, int b) {
		return a > b ? a : b;
	}

	static long max(long a, long b) {
		return a > b ? a : b;
	}

	static <A extends Comparable<? super A>> A max(A a, A b) {
		return a.compareTo(b) > 0 ? a : b;
	}

	static int clamp(int a, int min, int max) {
		return a < min ? min : a > max ? max : a;
	}

	static long clamp(long a, long min, long max) {
		return a < min ? min : a > max ? max : a;
	}

	static int abs(int a) {
		return a < 0 ? -a : a;
	}

	static long abs(long a) {
		return a < 0 ? -a : a;
	}

	static <A extends Comparable<? super A>> A clamp(A a, A min, A max) {
		return a.compareTo(min) < 0 ? min : a.compareTo(max) > 0 ? max : a;
	}

	static void out(String val) {
		IO.out(val);
	}

	static void out(Object val) {
		IO.out(String.valueOf(val));
	}

	static void out(int val) {
		IO.out(String.valueOf(val));
	}

	static void out(long val) {
		IO.out(String.valueOf(val));
	}

	static void out(char val) {
		IO.out(String.valueOf(val));
	}

	static void out(double val) {
		IO.out(Double.isFinite(val) ? BigDecimal.valueOf(val).toPlainString() : String.valueOf(val));
	}

	static void out(boolean val) {
		IO.out(val ? "true" : "false");
	}

	static void kil(String val) {
		IO.out(val);
		IO.flush();
		System.exit(0);
	}

	static void kil(Object val) {
		IO.out(String.valueOf(val));
		IO.flush();
		System.exit(0);
	}

	static void kil(int val) {
		IO.out(String.valueOf(val));
		IO.flush();
		System.exit(0);
	}

	static void kil(long val) {
		IO.out(String.valueOf(val));
		IO.flush();
		System.exit(0);
	}

	static void kil(char val) {
		IO.out(String.valueOf(val));
		IO.flush();
		System.exit(0);
	}

	static void kil(double val) {
		IO.out(Double.isFinite(val) ? BigDecimal.valueOf(val).toPlainString() : String.valueOf(val));
		IO.flush();
		System.exit(0);
	}

	static void kil(boolean val) {
		IO.out(val ? "true" : "false");
		IO.flush();
		System.exit(0);
	}

	static String ns() {
		return IO.next();
	}

	static int ni() {
		return IO.nextInt();
	}

	static long nl() {
		return IO.nextLong();
	}

	static double nd() {
		return IO.nextDouble();
	}

	static char nc() {
		return IO.nextChar();
	}

	static String[] nss(int n) {
		String[] as = new String[n];
		for (int i = 0; i < n; i++) {
			as[i] = IO.next();
		}
		return as;
	}

	static int[] nis(int n) {
		int[] as = new int[n];
		for (int i = 0; i < n; i++) {
			as[i] = IO.nextInt();
		}
		return as;
	}

	static long[] nls(int n) {
		long[] as = new long[n];
		for (int i = 0; i < n; i++) {
			as[i] = IO.nextLong();
		}
		return as;
	}

	static double[] nds(int n) {
		double[] as = new double[n];
		for (int i = 0; i < n; i++) {
			as[i] = IO.nextDouble();
		}
		return as;
	}

	static char[] ncs(int n) {
		char[] as = new char[n];
		for (int i = 0; i < n; i++) {
			as[i] = IO.nextChar();
		}
		return as;
	}

	static String[][] nss2(int n, int m) {
		String[][] as = new String[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				as[i][j] = IO.next();
			}
		}
		return as;
	}

	static int[][] nis2(int n, int m) {
		int[][] as = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				as[i][j] = IO.nextInt();
			}
		}
		return as;
	}

	static long[][] nls2(int n, int m) {
		long[][] as = new long[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				as[i][j] = IO.nextLong();
			}
		}
		return as;
	}

	static double[][] nds2(int n, int m) {
		double[][] as = new double[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				as[i][j] = IO.nextDouble();
			}
		}
		return as;
	}

	static char[][] ncs2(int n, int m) {
		char[][] as = new char[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				as[i][j] = IO.nextChar();
			}
		}
		return as;
	}

	static int parseInt(String val) {
		return Integer.parseInt(val);
	}

	static long parseLong(String val) {
		return Long.parseLong(val);
	}

	public static void main(String[] args) {
		try {
			solve();
			IO.flush();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (OutOfMemoryError e) {
			e.printStackTrace(); // this will be detected as RE
		}
	}
}

final class IO {
	private static final InputStream in = System.in;
	private static final PrintWriter out = new PrintWriter(System.out, false);
	private static final byte[] buffer = new byte[1024];
	private static int ptr = 0;
	private static int len = 0;

	private static boolean hasNextByte() {
		if (ptr < len)
			return true;
		ptr = 0;
		try {
			len = in.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return len > 0;
	}

	private static int readByte() {
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}

	static boolean hasNext() {
		byte c;
		while (hasNextByte() && ((c = buffer[ptr]) < '!' || c > '~'))
			ptr++;
		return hasNextByte();
	}

	static String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (b >= '!' && b <= '~') {
			sb.append((char) b);
			b = readByte();
		}
		return sb.toString();
	}

	static char nextChar() {
		if (!hasNext())
			throw new NoSuchElementException();
		return (char) readByte();
	}

	static long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
		long n = 0;
		int sign = 1;
		int b = readByte();
		if (b == '-') {
			sign = -1;
			b = readByte();
		}
		if (b < '0' || '9' < b)
			throw new NumberFormatException();
		while (true) {
			if ('0' <= b && b <= '9')
				n = n * 10 + b - '0';
			else if (b == -1 || b < '!' || b > '~')
				return n * sign;
			else
				throw new NumberFormatException();
			b = readByte();
		}
	}

	static int nextInt() {
		if (!hasNext())
			throw new NoSuchElementException();
		int n = 0;
		int sign = 1;
		int b = readByte();
		if (b == '-') {
			sign = -1;
			b = readByte();
		}
		if (b < '0' || '9' < b)
			throw new NumberFormatException();
		while (true) {
			if ('0' <= b && b <= '9')
				n = n * 10 + b - '0';
			else if (b == -1 || b < '!' || b > '~')
				return n * sign;
			else
				throw new NumberFormatException();
			b = readByte();
		}
	}

	static double nextDouble() {
		return Double.parseDouble(next());
	}

	static void out(String val) {
		out.println(val);
	}

	static void flush() {
		out.flush();
	}
}

// TODO: paste library here

class UP<A, B> { // Unordered Pair
	A a;
	B b;

	UP(A a, B b) {
		this.a = a;
		this.b = b;
	}

	static <A, B> UP<A, B> make(A a, B b) {
		return new UP<A, B>(a, b);
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof UP))
			return false;
		UP<?, ?> p = (UP<?, ?>) o;
		boolean aok = a == null ? p.a == null : a.equals(p.a);
		boolean bok = b == null ? p.b == null : b.equals(p.b);
		return aok && bok;
	}

	public String toString() {
		return "(" + a.toString() + ", " + b.toString() + ")";
	}
}

class P<A extends Comparable<? super A>, B extends Comparable<? super B>> extends UP<A, B> implements
		Comparable<P<A, B>> { // Pair
	P(A a, B b) {
		super(a, b);
	}

	static <A extends Comparable<? super A>, B extends Comparable<? super B>> P<A, B> make(A a, B b) {
		return new P<A, B>(a, b);
	}

	public int compareTo(P<A, B> o) {
		int sa = a.compareTo(o.a);
		int sb = b.compareTo(o.b);
		return sa != 0 ? sa : sb;
	}
}

class PI implements Comparable<PI> { // Pair int
	int a;
	int b;

	PI(int a, int b) {
		this.a = a;
		this.b = b;
	}

	static PI make(int a, int b) {
		return new PI(a, b);
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof PI))
			return false;
		PI p = (PI) o;
		return a == p.a && b == p.b;
	}

	public int compareTo(PI o) {
		int sa = a - o.a;
		int sb = b - o.b;
		return sa > 0 ? 1 : sa < 0 ? -1 : sb > 0 ? 1 : sb < 0 ? -1 : 0;
	}

	public String toString() {
		return "(" + a + ", " + b + ")";
	}
}

class PL implements Comparable<PL> { // Pair long
	long a;
	long b;

	PL(long a, long b) {
		this.a = a;
		this.b = b;
	}

	static PL make(long a, long b) {
		return new PL(a, b);
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof PL))
			return false;
		PL p = (PL) o;
		return a == p.a && b == p.b;
	}

	public int compareTo(PL o) {
		long sa = a - o.a;
		long sb = b - o.b;
		return sa > 0 ? 1 : sa < 0 ? -1 : sb > 0 ? 1 : sb < 0 ? -1 : 0;
	}

	public String toString() {
		return "(" + a + ", " + b + ")";
	}
}

class UT<A, B, C> { // Unordered Tuple
	A a;
	B b;
	C c;

	UT(A a, B b, C c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	static <A, B, C> UT<A, B, C> make(A a, B b, C c) {
		return new UT<A, B, C>(a, b, c);
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof UT))
			return false;
		UT<?, ?, ?> t = (UT<?, ?, ?>) o;
		boolean aok = a == null ? t.a == null : a.equals(t.a);
		boolean bok = b == null ? t.b == null : b.equals(t.b);
		boolean cok = c == null ? t.c == null : c.equals(t.c);
		return aok && bok && cok;
	}

	public String toString() {
		return "(" + a.toString() + ", " + b.toString() + ", " + c.toString() + ")";
	}
}

class T<A extends Comparable<? super A>, B extends Comparable<? super B>, C extends Comparable<? super C>> extends
		UT<A, B, C> implements Comparable<T<A, B, C>> { // Tuple
	T(A a, B b, C c) {
		super(a, b, c);
	}

	static <A extends Comparable<? super A>, B extends Comparable<? super B>, C extends Comparable<? super C>> T<A, B, C> make(
			A a, B b, C c) {
		return new T<A, B, C>(a, b, c);
	}

	public int compareTo(T<A, B, C> o) {
		int sa = a.compareTo(o.a);
		int sb = b.compareTo(o.b);
		int sc = c.compareTo(o.c);
		return sa != 0 ? sa : sb != 0 ? sb : sc;
	}
}

class TI implements Comparable<TI> { // Tuple int
	int a;
	int b;
	int c;

	TI(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	static TI make(int a, int b, int c) {
		return new TI(a, b, c);
	}

	TL toLong() {
		return TL.make(a, b, c);
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof TI))
			return false;
		TI t = (TI) o;
		return a == t.a && b == t.b && c == t.c;
	}

	public int compareTo(TI o) {
		int sa = a - o.a;
		int sb = b - o.b;
		int sc = c - o.c;
		return sa > 0 ? 1 : sa < 0 ? -1 : sb > 0 ? 1 : sb < 0 ? -1 : sc > 0 ? 1 : sc < 0 ? -1 : 0;
	}

	public String toString() {
		return "(" + a + ", " + b + ", " + c + ")";
	}
}

class TL implements Comparable<TL> { // Tuple long
	long a;
	long b;
	long c;

	TL(long a, long b, long c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	static TL make(long a, long b, long c) {
		return new TL(a, b, c);
	}

	TI toInt() {
		return TI.make((int) a, (int) b, (int) c);
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof TL))
			return false;
		TL t = (TL) o;
		return a == t.a && b == t.b && c == t.c;
	}

	public int compareTo(TL o) {
		long sa = a - o.a;
		long sb = b - o.b;
		long sc = c - o.c;
		return sa > 0 ? 1 : sa < 0 ? -1 : sb > 0 ? 1 : sb < 0 ? -1 : sc > 0 ? 1 : sc < 0 ? -1 : 0;
	}

	public String toString() {
		return "(" + a + ", " + b + ", " + c + ")";
	}
}

final class U { // Utilities
	private U() {
	}

	static <A> ArrayList<A> make(int n, F.IX<A> maker) {
		ArrayList<A> res = new ArrayList<A>();
		for (int i = 0; i < n; i++)
			res.add(maker.f(i));
		return res;
	}

	static boolean[] makeB(int n, F.IB maker) {
		boolean[] res = new boolean[n];
		for (int i = 0; i < n; i++)
			res[i] = maker.f(i);
		return res;
	}

	static int[] makeI(int n, F.II maker) {
		int[] res = new int[n];
		for (int i = 0; i < n; i++)
			res[i] = maker.f(i);
		return res;
	}

	static long[] makeL(int n, F.IL maker) {
		long[] res = new long[n];
		for (int i = 0; i < n; i++)
			res[i] = maker.f(i);
		return res;
	}

	static <A> A[] makeX(int n, F.IX<A> maker, A[] as) {
		A[] res = Arrays.copyOf(as, n);
		for (int i = 0; i < n; i++)
			res[i] = maker.f(i);
		return res;
	}

	static <A> ArrayList<A> filter(ArrayList<A> as, F.XB<A> pred) {
		ArrayList<A> res = new ArrayList<A>();
		for (A a : as)
			if (pred.f(a))
				res.add(a);
		return res;
	}

	static <A> int count(ArrayList<A> as, F.XB<A> pred) {
		int res = 0;
		for (A a : as)
			if (pred.f(a))
				res++;
		return res;
	}

	static <A> ArrayList<A> concat(ArrayList<A> as, ArrayList<A> bs) {
		ArrayList<A> res = new ArrayList<A>();
		res.addAll(as);
		res.addAll(bs);
		return res;
	}

	static <A> boolean any(ArrayList<A> as, F.XB<A> pred) {
		for (A a : as)
			if (pred.f(a))
				return true;
		return false;
	}

	static <A> boolean all(ArrayList<A> as, F.XB<A> pred) {
		for (A a : as)
			if (!pred.f(a))
				return false;
		return true;
	}

	static <A> ArrayList<A> flatten(ArrayList<ArrayList<A>> ass) {
		ArrayList<A> res = new ArrayList<A>();
		for (ArrayList<A> as : ass)
			res.addAll(as);
		return res;
	}

	static <A, B> B foldl(ArrayList<A> as, F.XXX<B, A, B> f, B e) {
		B res = e;
		for (A a : as)
			res = f.f(res, a);
		return res;
	}

	static <A, B> B foldr(ArrayList<A> as, F.XXX<A, B, B> f, B e) {
		B res = e;
		for (int i = as.size() - 1; i >= 0; i--)
			res = f.f(as.get(i), res);
		return res;
	}

	static <A> ArrayList<A> reverse(ArrayList<A> as) {
		int size = as.size();
		return make(size, i -> as.get(size - 1 - i));
	}

	static boolean[] reverse(boolean[] as) {
		int size = as.length;
		return makeB(size, i -> as[size - 1 - i]);
	}

	static int[] reverse(int[] as) {
		int size = as.length;
		return makeI(size, i -> as[size - 1 - i]);
	}

	static long[] reverse(long[] as) {
		int size = as.length;
		return makeL(size, i -> as[size - 1 - i]);
	}

	static <A> A[] reverse(A[] as) {
		int size = as.length;
		return makeX(size, i -> as[size - 1 - i], as);
	}

	static <A extends Comparable<? super A>> UP<TreeMap<A, Integer>, ArrayList<A>> compress(ArrayList<A> as) {
		TreeSet<A> set = new TreeSet<A>(as);
		TreeMap<A, Integer> map = new TreeMap<A, Integer>();
		ArrayList<A> imap = new ArrayList<A>();
		int i = 0;
		for (A a : set) {
			map.put(a, i++);
			imap.add(a);
		}
		return UP.make(map, imap);
	}

	static <A, B> ArrayList<B> map(ArrayList<A> as, F.XX<A, B> f) {
		return make(as.size(), (i) -> f.f(as.get(i)));
	}

	static <A, B> ArrayList<B> mapi(ArrayList<A> as, F.XIX<A, B> f) {
		return make(as.size(), (i) -> f.f(as.get(i), i));
	}

	static <A, B> ArrayList<UP<A, B>> zip(ArrayList<A> as, ArrayList<B> bs) {
		return make(min(as.size(), bs.size()), (i) -> UP.make(as.get(i), bs.get(i)));
	}

	static int min(int a, int b) {
		return a < b ? a : b;
	}

	static long min(long a, long b) {
		return a < b ? a : b;
	}

	static <A extends Comparable<? super A>> A min(A a, A b) {
		return a.compareTo(b) < 0 ? a : b;
	}

	static int max(int a, int b) {
		return a > b ? a : b;
	}

	static long max(long a, long b) {
		return a > b ? a : b;
	}

	static <A extends Comparable<? super A>> A max(A a, A b) {
		return a.compareTo(b) > 0 ? a : b;
	}

	static int clamp(int a, int min, int max) {
		return a < min ? min : a > max ? max : a;
	}

	static long clamp(long a, long min, long max) {
		return a < min ? min : a > max ? max : a;
	}

	static <A extends Comparable<? super A>> A clamp(A a, A min, A max) {
		return a.compareTo(min) < 0 ? min : a.compareTo(max) > 0 ? max : a;
	}

	static int abs(int a) {
		return a < 0 ? -a : a;
	}

	static long abs(long a) {
		return a < 0 ? -a : a;
	}

	static void forEachBitPerm(int n, int k, F.IV f) {
		for (int i = (1 << k) - 1; i < 1 << n;) {
			f.f(i);
			int t = (i | i - 1) + 1;
			i = t | ((t & -t) / (i & -i) >> 1) - 1;
		}
	}

	static int nextBitPerm(int a) {
		int t = (a | a - 1) + 1;
		return t | ((t & -t) / (a & -a) >> 1) - 1;
	}

	static void mebius(int n, F.IIV f) { // s, i
		int bit = 1;
		int exp = 0;
		for (int i = 1; i < 1 << n; i++) {
			f.f(i ^ bit, exp);
			if ((i & i + 1) == 0) {
				bit <<= 1;
				exp++;
			}
		}
	}

	static void zeta(int n, F.IIV f) { // s, i
		int m = (1 << n) - 1;
		int bit = 1;
		int exp = 0;
		for (int i = (1 << n) - 2; i >= 0; i--) {
			f.f(i ^ bit, exp);
			if ((~i & ~i + 1 & m) == 0) {
				bit <<= 1;
				exp++;
			}
		}
	}

	static <A> ArrayList<A> toAL(A[] as) {
		return make(as.length, i -> as[i]);
	}

	static <A> A[] doubleSize(A[] as) {
		return Arrays.copyOf(as, as.length << 1);
	}

	static long searchL(long ng, long ok, F.LB isOk) {
		while (ng - ok > 1 || ok - ng > 1) {
			long mid = ng + ok >> 1;
			if (isOk.f(mid))
				ok = mid;
			else
				ng = mid;
		}
		return ok;
	}

	static int searchI(int ng, int ok, F.IB isOk) {
		return (int) searchL((long) ng, (long) ok, (mid) -> isOk.f((int) mid));
	}
}

final class F { // Functions
	private F() {
	}

	interface VV {
		void f();
	}

	interface BV {
		void f(boolean a);
	}

	interface BXV<A> {
		void f(boolean a, A b);
	}

	interface BXXV<A, B> {
		void f(boolean a, A b, B c);
	}

	interface BXXXV<A, B, C> {
		void f(boolean a, A b, B c, C d);
	}

	interface XBV<A> {
		void f(A a, boolean b);
	}

	interface XXBV<A, B> {
		void f(A a, B b, boolean c);
	}

	interface XXXBV<A, B, C> {
		void f(A a, B b, C c, boolean d);
	}

	interface IV {
		void f(int a);
	}

	interface IXV<A> {
		void f(int a, A b);
	}

	interface IXXV<A, B> {
		void f(int a, A b, B c);
	}

	interface IXXXV<A, B, C> {
		void f(int a, A b, B c, C d);
	}

	interface XIV<A> {
		void f(A a, int b);
	}

	interface XXIV<A, B> {
		void f(A a, B b, int c);
	}

	interface XXXIV<A, B, C> {
		void f(A a, B b, C c, int d);
	}

	interface LV {
		void f(long a);
	}

	interface LXV<A> {
		void f(long a, A b);
	}

	interface LXXV<A, B> {
		void f(long a, A b, B c);
	}

	interface LXXXV<A, B, C> {
		void f(long a, A b, B c, C d);
	}

	interface XLV<A> {
		void f(A a, long b);
	}

	interface XXLV<A, B> {
		void f(A a, B b, long c);
	}

	interface XXXLV<A, B, C> {
		void f(A a, B b, C c, long d);
	}

	interface DV {
		void f(double a);
	}

	interface DXV<A> {
		void f(double a, A b);
	}

	interface DXXV<A, B> {
		void f(double a, A b, B c);
	}

	interface DXXXV<A, B, C> {
		void f(double a, A b, B c, C d);
	}

	interface XDV<A> {
		void f(A a, double b);
	}

	interface XXDV<A, B> {
		void f(A a, B b, double c);
	}

	interface XXXDV<A, B, C> {
		void f(A a, B b, C c, double d);
	}

	interface XV<A> {
		void f(A a);
	}

	interface XXV<A, B> {
		void f(A a, B b);
	}

	interface XXXV<A, B, C> {
		void f(A a, B b, C c);
	}

	interface XXXXV<A, B, C, D> {
		void f(A a, B b, C c, D d);
	}

	interface BBV {
		void f(boolean a, boolean b);
	}

	interface BIV {
		void f(boolean a, int b);
	}

	interface BLV {
		void f(boolean a, long b);
	}

	interface BDV {
		void f(boolean a, double b);
	}

	interface IBV {
		void f(int a, boolean b);
	}

	interface IIV {
		void f(int a, int b);
	}

	interface ILV {
		void f(int a, long b);
	}

	interface IDV {
		void f(int a, double b);
	}

	interface LBV {
		void f(long a, boolean b);
	}

	interface LIV {
		void f(long a, int b);
	}

	interface LLV {
		void f(long a, long b);
	}

	interface LDV {
		void f(long a, double b);
	}

	interface DBV {
		void f(double a, boolean b);
	}

	interface DIV {
		void f(double a, int b);
	}

	interface DLV {
		void f(double a, long b);
	}

	interface DDV {
		void f(double a, double b);
	}

	interface VB {
		boolean f();
	}

	interface BB {
		boolean f(boolean a);
	}

	interface BXB<A> {
		boolean f(boolean a, A b);
	}

	interface BXXB<A, B> {
		boolean f(boolean a, A b, B c);
	}

	interface BXXXB<A, B, C> {
		boolean f(boolean a, A b, B c, C d);
	}

	interface XBB<A> {
		boolean f(A a, boolean b);
	}

	interface XXBB<A, B> {
		boolean f(A a, B b, boolean c);
	}

	interface XXXBB<A, B, C> {
		boolean f(A a, B b, C c, boolean d);
	}

	interface IB {
		boolean f(int a);
	}

	interface IXB<A> {
		boolean f(int a, A b);
	}

	interface IXXB<A, B> {
		boolean f(int a, A b, B c);
	}

	interface IXXXB<A, B, C> {
		boolean f(int a, A b, B c, C d);
	}

	interface XIB<A> {
		boolean f(A a, int b);
	}

	interface XXIB<A, B> {
		boolean f(A a, B b, int c);
	}

	interface XXXIB<A, B, C> {
		boolean f(A a, B b, C c, int d);
	}

	interface LB {
		boolean f(long a);
	}

	interface LXB<A> {
		boolean f(long a, A b);
	}

	interface LXXB<A, B> {
		boolean f(long a, A b, B c);
	}

	interface LXXXB<A, B, C> {
		boolean f(long a, A b, B c, C d);
	}

	interface XLB<A> {
		boolean f(A a, long b);
	}

	interface XXLB<A, B> {
		boolean f(A a, B b, long c);
	}

	interface XXXLB<A, B, C> {
		boolean f(A a, B b, C c, long d);
	}

	interface DB {
		boolean f(double a);
	}

	interface DXB<A> {
		boolean f(double a, A b);
	}

	interface DXXB<A, B> {
		boolean f(double a, A b, B c);
	}

	interface DXXXB<A, B, C> {
		boolean f(double a, A b, B c, C d);
	}

	interface XDB<A> {
		boolean f(A a, double b);
	}

	interface XXDB<A, B> {
		boolean f(A a, B b, double c);
	}

	interface XXXDB<A, B, C> {
		boolean f(A a, B b, C c, double d);
	}

	interface XB<A> {
		boolean f(A a);
	}

	interface XXB<A, B> {
		boolean f(A a, B b);
	}

	interface XXXB<A, B, C> {
		boolean f(A a, B b, C c);
	}

	interface XXXXB<A, B, C, D> {
		boolean f(A a, B b, C c, D d);
	}

	interface BBB {
		boolean f(boolean a, boolean b);
	}

	interface BIB {
		boolean f(boolean a, int b);
	}

	interface BLB {
		boolean f(boolean a, long b);
	}

	interface BDB {
		boolean f(boolean a, double b);
	}

	interface IBB {
		boolean f(int a, boolean b);
	}

	interface IIB {
		boolean f(int a, int b);
	}

	interface ILB {
		boolean f(int a, long b);
	}

	interface IDB {
		boolean f(int a, double b);
	}

	interface LBB {
		boolean f(long a, boolean b);
	}

	interface LIB {
		boolean f(long a, int b);
	}

	interface LLB {
		boolean f(long a, long b);
	}

	interface LDB {
		boolean f(long a, double b);
	}

	interface DBB {
		boolean f(double a, boolean b);
	}

	interface DIB {
		boolean f(double a, int b);
	}

	interface DLB {
		boolean f(double a, long b);
	}

	interface DDB {
		boolean f(double a, double b);
	}

	interface VI {
		int f();
	}

	interface BI {
		int f(boolean a);
	}

	interface BXI<A> {
		int f(boolean a, A b);
	}

	interface BXXI<A, B> {
		int f(boolean a, A b, B c);
	}

	interface BXXXI<A, B, C> {
		int f(boolean a, A b, B c, C d);
	}

	interface XBI<A> {
		int f(A a, boolean b);
	}

	interface XXBI<A, B> {
		int f(A a, B b, boolean c);
	}

	interface XXXBI<A, B, C> {
		int f(A a, B b, C c, boolean d);
	}

	interface II {
		int f(int a);
	}

	interface IXI<A> {
		int f(int a, A b);
	}

	interface IXXI<A, B> {
		int f(int a, A b, B c);
	}

	interface IXXXI<A, B, C> {
		int f(int a, A b, B c, C d);
	}

	interface XII<A> {
		int f(A a, int b);
	}

	interface XXII<A, B> {
		int f(A a, B b, int c);
	}

	interface XXXII<A, B, C> {
		int f(A a, B b, C c, int d);
	}

	interface LI {
		int f(long a);
	}

	interface LXI<A> {
		int f(long a, A b);
	}

	interface LXXI<A, B> {
		int f(long a, A b, B c);
	}

	interface LXXXI<A, B, C> {
		int f(long a, A b, B c, C d);
	}

	interface XLI<A> {
		int f(A a, long b);
	}

	interface XXLI<A, B> {
		int f(A a, B b, long c);
	}

	interface XXXLI<A, B, C> {
		int f(A a, B b, C c, long d);
	}

	interface DI {
		int f(double a);
	}

	interface DXI<A> {
		int f(double a, A b);
	}

	interface DXXI<A, B> {
		int f(double a, A b, B c);
	}

	interface DXXXI<A, B, C> {
		int f(double a, A b, B c, C d);
	}

	interface XDI<A> {
		int f(A a, double b);
	}

	interface XXDI<A, B> {
		int f(A a, B b, double c);
	}

	interface XXXDI<A, B, C> {
		int f(A a, B b, C c, double d);
	}

	interface XI<A> {
		int f(A a);
	}

	interface XXI<A, B> {
		int f(A a, B b);
	}

	interface XXXI<A, B, C> {
		int f(A a, B b, C c);
	}

	interface XXXXI<A, B, C, D> {
		int f(A a, B b, C c, D d);
	}

	interface BBI {
		int f(boolean a, boolean b);
	}

	interface BII {
		int f(boolean a, int b);
	}

	interface BLI {
		int f(boolean a, long b);
	}

	interface BDI {
		int f(boolean a, double b);
	}

	interface IBI {
		int f(int a, boolean b);
	}

	interface III {
		int f(int a, int b);
	}

	interface ILI {
		int f(int a, long b);
	}

	interface IDI {
		int f(int a, double b);
	}

	interface LBI {
		int f(long a, boolean b);
	}

	interface LII {
		int f(long a, int b);
	}

	interface LLI {
		int f(long a, long b);
	}

	interface LDI {
		int f(long a, double b);
	}

	interface DBI {
		int f(double a, boolean b);
	}

	interface DII {
		int f(double a, int b);
	}

	interface DLI {
		int f(double a, long b);
	}

	interface DDI {
		int f(double a, double b);
	}

	interface VL {
		long f();
	}

	interface BL {
		long f(boolean a);
	}

	interface BXL<A> {
		long f(boolean a, A b);
	}

	interface BXXL<A, B> {
		long f(boolean a, A b, B c);
	}

	interface BXXXL<A, B, C> {
		long f(boolean a, A b, B c, C d);
	}

	interface XBL<A> {
		long f(A a, boolean b);
	}

	interface XXBL<A, B> {
		long f(A a, B b, boolean c);
	}

	interface XXXBL<A, B, C> {
		long f(A a, B b, C c, boolean d);
	}

	interface IL {
		long f(int a);
	}

	interface IXL<A> {
		long f(int a, A b);
	}

	interface IXXL<A, B> {
		long f(int a, A b, B c);
	}

	interface IXXXL<A, B, C> {
		long f(int a, A b, B c, C d);
	}

	interface XIL<A> {
		long f(A a, int b);
	}

	interface XXIL<A, B> {
		long f(A a, B b, int c);
	}

	interface XXXIL<A, B, C> {
		long f(A a, B b, C c, int d);
	}

	interface LL {
		long f(long a);
	}

	interface LXL<A> {
		long f(long a, A b);
	}

	interface LXXL<A, B> {
		long f(long a, A b, B c);
	}

	interface LXXXL<A, B, C> {
		long f(long a, A b, B c, C d);
	}

	interface XLL<A> {
		long f(A a, long b);
	}

	interface XXLL<A, B> {
		long f(A a, B b, long c);
	}

	interface XXXLL<A, B, C> {
		long f(A a, B b, C c, long d);
	}

	interface DL {
		long f(double a);
	}

	interface DXL<A> {
		long f(double a, A b);
	}

	interface DXXL<A, B> {
		long f(double a, A b, B c);
	}

	interface DXXXL<A, B, C> {
		long f(double a, A b, B c, C d);
	}

	interface XDL<A> {
		long f(A a, double b);
	}

	interface XXDL<A, B> {
		long f(A a, B b, double c);
	}

	interface XXXDL<A, B, C> {
		long f(A a, B b, C c, double d);
	}

	interface XL<A> {
		long f(A a);
	}

	interface XXL<A, B> {
		long f(A a, B b);
	}

	interface XXXL<A, B, C> {
		long f(A a, B b, C c);
	}

	interface XXXXL<A, B, C, D> {
		long f(A a, B b, C c, D d);
	}

	interface BBL {
		long f(boolean a, boolean b);
	}

	interface BIL {
		long f(boolean a, int b);
	}

	interface BLL {
		long f(boolean a, long b);
	}

	interface BDL {
		long f(boolean a, double b);
	}

	interface IBL {
		long f(int a, boolean b);
	}

	interface IIL {
		long f(int a, int b);
	}

	interface ILL {
		long f(int a, long b);
	}

	interface IDL {
		long f(int a, double b);
	}

	interface LBL {
		long f(long a, boolean b);
	}

	interface LIL {
		long f(long a, int b);
	}

	interface LLL {
		long f(long a, long b);
	}

	interface LDL {
		long f(long a, double b);
	}

	interface DBL {
		long f(double a, boolean b);
	}

	interface DIL {
		long f(double a, int b);
	}

	interface DLL {
		long f(double a, long b);
	}

	interface DDL {
		long f(double a, double b);
	}

	interface VD {
		double f();
	}

	interface BD {
		double f(boolean a);
	}

	interface BXD<A> {
		double f(boolean a, A b);
	}

	interface BXXD<A, B> {
		double f(boolean a, A b, B c);
	}

	interface BXXXD<A, B, C> {
		double f(boolean a, A b, B c, C d);
	}

	interface XBD<A> {
		double f(A a, boolean b);
	}

	interface XXBD<A, B> {
		double f(A a, B b, boolean c);
	}

	interface XXXBD<A, B, C> {
		double f(A a, B b, C c, boolean d);
	}

	interface ID {
		double f(int a);
	}

	interface IXD<A> {
		double f(int a, A b);
	}

	interface IXXD<A, B> {
		double f(int a, A b, B c);
	}

	interface IXXXD<A, B, C> {
		double f(int a, A b, B c, C d);
	}

	interface XID<A> {
		double f(A a, int b);
	}

	interface XXID<A, B> {
		double f(A a, B b, int c);
	}

	interface XXXID<A, B, C> {
		double f(A a, B b, C c, int d);
	}

	interface LD {
		double f(long a);
	}

	interface LXD<A> {
		double f(long a, A b);
	}

	interface LXXD<A, B> {
		double f(long a, A b, B c);
	}

	interface LXXXD<A, B, C> {
		double f(long a, A b, B c, C d);
	}

	interface XLD<A> {
		double f(A a, long b);
	}

	interface XXLD<A, B> {
		double f(A a, B b, long c);
	}

	interface XXXLD<A, B, C> {
		double f(A a, B b, C c, long d);
	}

	interface DD {
		double f(double a);
	}

	interface DXD<A> {
		double f(double a, A b);
	}

	interface DXXD<A, B> {
		double f(double a, A b, B c);
	}

	interface DXXXD<A, B, C> {
		double f(double a, A b, B c, C d);
	}

	interface XDD<A> {
		double f(A a, double b);
	}

	interface XXDD<A, B> {
		double f(A a, B b, double c);
	}

	interface XXXDD<A, B, C> {
		double f(A a, B b, C c, double d);
	}

	interface XD<A> {
		double f(A a);
	}

	interface XXD<A, B> {
		double f(A a, B b);
	}

	interface XXXD<A, B, C> {
		double f(A a, B b, C c);
	}

	interface XXXXD<A, B, C, D> {
		double f(A a, B b, C c, D d);
	}

	interface BBD {
		double f(boolean a, boolean b);
	}

	interface BID {
		double f(boolean a, int b);
	}

	interface BLD {
		double f(boolean a, long b);
	}

	interface BDD {
		double f(boolean a, double b);
	}

	interface IBD {
		double f(int a, boolean b);
	}

	interface IID {
		double f(int a, int b);
	}

	interface ILD {
		double f(int a, long b);
	}

	interface IDD {
		double f(int a, double b);
	}

	interface LBD {
		double f(long a, boolean b);
	}

	interface LID {
		double f(long a, int b);
	}

	interface LLD {
		double f(long a, long b);
	}

	interface LDD {
		double f(long a, double b);
	}

	interface DBD {
		double f(double a, boolean b);
	}

	interface DID {
		double f(double a, int b);
	}

	interface DLD {
		double f(double a, long b);
	}

	interface DDD {
		double f(double a, double b);
	}

	interface VX<A> {
		A f();
	}

	interface BX<A> {
		A f(boolean a);
	}

	interface BXX<A, B> {
		B f(boolean a, A b);
	}

	interface BXXX<A, B, C> {
		C f(boolean a, A b, B c);
	}

	interface BXXXX<A, B, C, D> {
		D f(boolean a, A b, B c, C d);
	}

	interface XBX<A, B> {
		B f(A a, boolean b);
	}

	interface XXBX<A, B, C> {
		C f(A a, B b, boolean c);
	}

	interface XXXBX<A, B, C, D> {
		D f(A a, B b, C c, boolean d);
	}

	interface IX<A> {
		A f(int a);
	}

	interface IXX<A, B> {
		B f(int a, A b);
	}

	interface IXXX<A, B, C> {
		C f(int a, A b, B c);
	}

	interface IXXXX<A, B, C, D> {
		D f(int a, A b, B c, C d);
	}

	interface XIX<A, B> {
		B f(A a, int b);
	}

	interface XXIX<A, B, C> {
		C f(A a, B b, int c);
	}

	interface XXXIX<A, B, C, D> {
		D f(A a, B b, C c, int d);
	}

	interface LX<A> {
		A f(long a);
	}

	interface LXX<A, B> {
		B f(long a, A b);
	}

	interface LXXX<A, B, C> {
		C f(long a, A b, B c);
	}

	interface LXXXX<A, B, C, D> {
		D f(long a, A b, B c, C d);
	}

	interface XLX<A, B> {
		B f(A a, long b);
	}

	interface XXLX<A, B, C> {
		C f(A a, B b, long c);
	}

	interface XXXLX<A, B, C, D> {
		D f(A a, B b, C c, long d);
	}

	interface DX<A> {
		A f(double a);
	}

	interface DXX<A, B> {
		B f(double a, A b);
	}

	interface DXXX<A, B, C> {
		C f(double a, A b, B c);
	}

	interface DXXXX<A, B, C, D> {
		D f(double a, A b, B c, C d);
	}

	interface XDX<A, B> {
		B f(A a, double b);
	}

	interface XXDX<A, B, C> {
		C f(A a, B b, double c);
	}

	interface XXXDX<A, B, C, D> {
		D f(A a, B b, C c, double d);
	}

	interface XX<A, B> {
		B f(A a);
	}

	interface XXX<A, B, C> {
		C f(A a, B b);
	}

	interface XXXX<A, B, C, D> {
		D f(A a, B b, C c);
	}

	interface XXXXX<A, B, C, D, E> {
		E f(A a, B b, C c, D d);
	}

	interface BBX<A> {
		A f(boolean a, boolean b);
	}

	interface BIX<A> {
		A f(boolean a, int b);
	}

	interface BLX<A> {
		A f(boolean a, long b);
	}

	interface BDX<A> {
		A f(boolean a, double b);
	}

	interface IBX<A> {
		A f(int a, boolean b);
	}

	interface IIX<A> {
		A f(int a, int b);
	}

	interface ILX<A> {
		A f(int a, long b);
	}

	interface IDX<A> {
		A f(int a, double b);
	}

	interface LBX<A> {
		A f(long a, boolean b);
	}

	interface LIX<A> {
		A f(long a, int b);
	}

	interface LLX<A> {
		A f(long a, long b);
	}

	interface LDX<A> {
		A f(long a, double b);
	}

	interface DBX<A> {
		A f(double a, boolean b);
	}

	interface DIX<A> {
		A f(double a, int b);
	}

	interface DLX<A> {
		A f(double a, long b);
	}

	interface DDX<A> {
		A f(double a, double b);
	}
}

class SA { // suffix array
	static int[] makeSA(String s) {
		int n = s.length() + 1;
		int[] cs = new int[n];
		cs[n - 1] = 0;
		for (int i = 0; i < n - 1; i++)
			cs[i] = s.charAt(i) + 1;
		ArrayList<Integer> acs = U.make(n, i -> cs[i]);
		TreeMap<Integer, Integer> tm = U.compress(acs).a;
		int k = tm.size();
		for (int i = 0; i < n; i++)
			cs[i] = tm.get(cs[i]);
		return makeSA(cs, n, k);
	}

	static int[] makeLCP(String s, int[] sa) { // lcp(i, i+1)
		int n = sa.length;
		int[] r = new int[n];
		for (int i = 0; i < n; i++)
			r[sa[i]] = i;
		int[] lcp = new int[n];
		int l = 0;
		for (int i = 0; i < n; i++) {
			int idx = r[i];
			if (idx == n - 1) {
				lcp[idx] = -1;
				l = 0;
				continue;
			}
			int p = sa[idx];
			int q = sa[idx + 1];
			if (l > 0)
				l--;
			while (p + l < n - 1 && q + l < n - 1 && s.charAt(p + l) == s.charAt(q + l))
				l++;
			lcp[idx] = l;
		}
		return lcp;
	}

	static F.III lcpQuery(String s) {
		int n = s.length() + 1;
		int[] sa = makeSA(s);
		int[] lcp = makeLCP(s, sa);
		int[] inv = new int[n];
		for (int i = 0; i < n; i++) {
			inv[sa[i]] = i;
		}
		ST<Integer> st = new ST<Integer>(n, (a, b) -> a < b ? a : b, Integer.MAX_VALUE);
		st.init(i -> i < n ? lcp[i] : Integer.MAX_VALUE);
		return (i, j) -> {
			if (i == j)
				return n - 1 - i;
			i = inv[i];
			j = inv[j];
			if (i > j) {
				i ^= j;
				j ^= i;
				i ^= j;
			}
			return st.query(i, j);
		};
	}

	private static int[] makeSA(int[] cs, int n, int k) {
		boolean[] isS = new boolean[n];
		boolean[] isLms = new boolean[n];
		int[] lmss = new int[n];
		int numLmss = 0;
		isS[n - 1] = true;
		for (int i = n - 2; i >= 0; i--)
			isS[i] = cs[i] < cs[i + 1] || cs[i] == cs[i + 1] && isS[i + 1];
		for (int i = 1; i < n; i++)
			if (!isS[i - 1] && isS[i]) {
				lmss[numLmss++] = i;
				isLms[i] = true;
			}
		int[] sa = inducedSort(cs, n, numLmss, k, lmss, isS);
		int[] lmss2 = new int[numLmss];
		numLmss = 0;
		for (int i = 0; i < n; i++)
			if (isLms[sa[i]])
				lmss2[numLmss++] = sa[i];
		int num = 0;
		sa[lmss2[0]] = 0;
		for (int i = 0; i < numLmss - 1; i++) {
			int p = lmss2[i];
			int q = lmss2[i + 1];
			for (int j = 0; j < n; j++) {
				if (cs[p] != cs[q] || isLms[p] != isLms[q]) {
					sa[lmss2[i + 1]] = ++num;
					break;
				} else if (j > 0 && (isLms[p] || isLms[q])) {
					sa[lmss2[i + 1]] = num;
					break;
				}
				p++;
				q++;
			}
		}
		if (num + 1 < numLmss) {
			numLmss = 0;
			for (int i = 0; i < n; i++)
				if (isLms[i])
					lmss2[numLmss++] = sa[i];
			lmss2 = makeSA(lmss2, numLmss, num + 1);
			for (int i = 0; i < numLmss; i++)
				lmss2[i] = lmss[lmss2[i]];
		}
		return inducedSort(cs, n, numLmss, k, lmss2, isS);
	}

	private static int[] inducedSort(int[] cs, int n, int numLmss, int k, int[] lmss, boolean[] isS) {
		int[] sa = new int[n];
		int[] bin = new int[k + 1];
		for (int i = 0; i < n; i++)
			bin[cs[i] + 1]++;
		for (int i = 0; i < k; i++)
			bin[i + 1] += bin[i];
		int[] counts = new int[k];
		for (int i = numLmss - 1; i >= 0; i--) { // put LMS backward
			int c = cs[lmss[i]];
			sa[bin[c + 1] - 1 - counts[c]++] = lmss[i];
		}
		for (int i = 0; i < k; i++)
			counts[i] = 0;
		for (int i = 0; i < n; i++) { // put L forward
			int s = sa[i] - 1;
			if (s < 0 || isS[s])
				continue;
			int c = cs[s];
			sa[bin[c] + counts[c]++] = s;
		}
		for (int i = 0; i < k; i++)
			counts[i] = 0;
		for (int i = n - 1; i >= 0; i--) { // put S backward
			int s = sa[i] - 1;
			if (s < 0 || !isS[s])
				continue;
			int c = cs[s];
			sa[bin[c + 1] - 1 - counts[c]++] = s;
		}
		return sa;
	}
}

class ST<A> { // Segment Tree
	private ArrayList<A> as;
	private int h;
	private int n;
	private F.XXX<A, A, A> merger;
	private A e;

	ST(int num, F.XXX<A, A, A> merger, A e) {
		this.merger = merger;
		this.e = e;
		h = 0;
		while ((1 << h) < num)
			h++;
		n = 1 << h;
		as = U.make(2 * n, i -> e);
	}

	void init(A a) {
		init(i -> a);
	}

	void init(A[] as) {
		init(i -> i < as.length ? as[i] : e);
	}

	void init(F.IX<A> maker) {
		for (int i = 0; i < n; i++)
			as.set(n + i, maker.f(i));
		for (int i = n - 1; i > 0; i--)
			as.set(i, merge(as.get(i << 1), as.get(i << 1 | 1)));
	}

	A get(int i) {
		return query(i, i + 1);
	}

	void set(int i, A a) {
		as.set(i += n, a);
		while ((i >>= 1) > 0)
			as.set(i, merge(as.get(i << 1), as.get(i << 1 | 1)));
	}

	A query(int l, int r) {
		l += n;
		r += n;
		A al = e;
		A ar = e;
		while (l < r) {
			if ((l & 1) != 0)
				al = merge(al, as.get(l++));
			if ((r & 1) != 0)
				ar = merge(as.get(--r), ar);
			l >>= 1;
			r >>= 1;
		}
		return merge(al, ar);
	}

	private A merge(A a, A b) {
		return a == e ? b : b == e ? a : merger.f(a, b);
	}
}

interface Magma<A> {
	A g(A a, A b);
}

interface Associative {
}

interface Unital<A> {
	A e();
}

interface Invertible<A> {
	A inv(A a);
}

interface Commutative {
}

interface SemiGroup<A> extends Magma<A>, Associative {
}

interface Monoid<A> extends SemiGroup<A>, Unital<A> {
	static <A> Monoid<A> make(F.XXX<A, A, A> g, A e) {
		return new Monoid<A>() {
			public A g(A a, A b) {
				return a.equals(e) ? b : b.equals(e) ? a : g.f(a, b);
			}

			public A e() {
				return e;
			}
		};
	}
}

interface CommutativeMonoid<A> extends Monoid<A>, Commutative {
	static <A> CommutativeMonoid<A> make(F.XXX<A, A, A> g, A e) {
		return new CommutativeMonoid<A>() {
			public A g(A a, A b) {
				return a.equals(e) ? b : b.equals(e) ? a : g.f(a, b);
			}

			public A e() {
				return e;
			}
		};
	}
}

interface Group<A> extends Monoid<A>, Invertible<A> {
	static <A> Group<A> make(F.XXX<A, A, A> g, F.XX<A, A> inv, A e) {
		return new Group<A>() {
			public A g(A a, A b) {
				return a.equals(e) ? b : b.equals(e) ? a : g.f(a, b);
			}

			public A e() {
				return e;
			}

			public A inv(A a) {
				return a.equals(e) ? e : inv.f(a);
			}
		};
	}
}

interface AbelianGroup<A> extends Group<A>, CommutativeMonoid<A> {
	static <A> AbelianGroup<A> make(F.XXX<A, A, A> g, F.XX<A, A> inv, A e) {
		return new AbelianGroup<A>() {
			public A g(A a, A b) {
				return a.equals(e) ? b : b.equals(e) ? a : g.f(a, b);
			}

			public A e() {
				return e;
			}

			public A inv(A a) {
				return a.equals(e) ? e : inv.f(a);
			}
		};
	}
}

interface Ring<A> {
	AbelianGroup<A> add();

	Monoid<A> mul();

	default A zero() {
		return add().e();
	}

	default A one() {
		return mul().e();
	}

	static <A> Ring<A> make(F.XXX<A, A, A> add, F.XX<A, A> neg, F.XXX<A, A, A> mul, A zero, A one) {
		return make(AbelianGroup.make(add, neg, zero), Monoid.make(mul, one));
	}

	static <A> Ring<A> make(AbelianGroup<A> add, Monoid<A> mul) {
		return new Ring<A>() {
			public AbelianGroup<A> add() {
				return add;
			}

			public Monoid<A> mul() {
				return mul;
			}
		};
	}
}

interface CommutativeRing<A> extends Ring<A> {
	CommutativeMonoid<A> mul();

	static <A> CommutativeRing<A> make(F.XXX<A, A, A> add, F.XX<A, A> neg, F.XXX<A, A, A> mul, A zero, A one) {
		return make(AbelianGroup.make(add, neg, zero), CommutativeMonoid.make(mul, one));
	}

	static <A> CommutativeRing<A> make(AbelianGroup<A> add, CommutativeMonoid<A> mul) {
		return new CommutativeRing<A>() {
			public AbelianGroup<A> add() {
				return add;
			}

			public CommutativeMonoid<A> mul() {
				return mul;
			}
		};
	}
}

interface EuclideanRing<A> extends CommutativeRing<A> {
	A div(A a, A b);

	A mod(A a, A b);

	static <A> EuclideanRing<A> make(F.XXX<A, A, A> add, F.XX<A, A> neg, F.XXX<A, A, A> mul, F.XXX<A, A, A> div,
			F.XXX<A, A, A> mod, A zero, A one) {
		return make(AbelianGroup.make(add, neg, zero), CommutativeMonoid.make(mul, one), div, mod);
	}

	static <A> EuclideanRing<A> make(AbelianGroup<A> add, CommutativeMonoid<A> mul, F.XXX<A, A, A> div,
			F.XXX<A, A, A> mod) {
		final A zero = add.e();
		final A one = mul.e();
		return new EuclideanRing<A>() {
			public AbelianGroup<A> add() {
				return add;
			}

			public CommutativeMonoid<A> mul() {
				return mul;
			}

			public A div(A a, A b) {
				if (b.equals(zero))
					throw new ArithmeticException("division by zero");
				return b.equals(one) ? a : div.f(a, b);
			}

			public A mod(A a, A b) {
				if (b.equals(zero))
					throw new ArithmeticException("division by zero");
				return b.equals(one) ? zero : mod.f(a, b);
			}
		};
	}
}

interface Field<A> extends EuclideanRing<A> {
	AbelianGroup<A> mul();

	static <A> Field<A> make(F.XXX<A, A, A> add, F.XX<A, A> neg, F.XXX<A, A, A> mul, F.XX<A, A> inv, A zero, A one) {
		return make(AbelianGroup.make(add, neg, zero), AbelianGroup.make(mul, inv, one));
	}

	static <A> Field<A> make(AbelianGroup<A> add, AbelianGroup<A> mul) {
		final A zero = add.e();
		final A one = mul.e();
		return new Field<A>() {
			public AbelianGroup<A> add() {
				return add;
			}

			public AbelianGroup<A> mul() {
				return mul;
			}

			public A div(A a, A b) {
				if (b.equals(zero))
					throw new ArithmeticException("division by zero");
				return b.equals(one) ? a : mul.g(a, mul.inv(b));
			}

			public A mod(A a, A b) {
				if (b.equals(zero))
					throw new ArithmeticException("division by zero");
				return zero;
			}
		};
	}
}

final class Alg {
	private Alg() {
	}

	static <A extends Comparable<? super A>> A gcd(A a, A b, EuclideanRing<A> ring) {
		AbelianGroup<A> add = ring.add();
		A zero = add.e();
		int sa = a.compareTo(zero);
		int sb = b.compareTo(zero);
		if (sa == 0)
			return b;
		if (sb == 0)
			return a;
		if (sa < 0)
			a = add.inv(a);
		if (sb < 0)
			b = add.inv(b);
		if (a.compareTo(b) < 0) {
			A tmp = a;
			a = b;
			b = tmp;
		}
		while (true) {
			A c = ring.mod(a, b);
			if (c.compareTo(zero) == 0)
				return b;
			a = b;
			b = c;
		}
	}

	static long gcd(long a, long b) {
		if (a == 0)
			return b;
		if (b == 0)
			return a;
		if (a < 0)
			a = -a;
		if (b < 0)
			b = -b;
		if (a < b) {
			a ^= b;
			b ^= a;
			a ^= b;
		}
		while (true) {
			long c = a % b;
			if (c == 0)
				return b;
			a = b;
			b = c;
		}
	}

	static int gcd(int a, int b) {
		return (int) gcd((long) a, (long) b);
	}

	static <A extends Comparable<A>> int[] lis(F.IX<A> access, int size) {
		Object[] dp = new Object[size];
		int[][] dpIndices = new int[size][2];
		dp[0] = access.f(0);
		int len = 1;
		int lidx = 0;
		for (int i = 1; i < size; i++) {
			A ai = access.f(i);
			@SuppressWarnings("unchecked")
			int idx = U.searchI(-1, len, j -> ai.compareTo((A) dp[j]) <= 0); // replace <= with < to return NLDS
			dp[idx] = ai;
			dpIndices[idx][0] = i;
			if (idx == len) {
				lidx = i;
				len++;
			}
			if (idx > 0)
				dpIndices[i][1] = dpIndices[idx - 1][0];
		}
		int[] res = new int[len];
		res[len - 1] = lidx;
		for (int i = len - 1; i >= 0; i--) {
			res[i] = lidx;
			lidx = dpIndices[lidx][1];
		}
		return res;
	}

	static <A> A pow(A a, long b, Monoid<A> monoid) {
		A res = monoid.e();
		while (b > 0) {
			if ((b & 1) != 0)
				res = monoid.g(res, a);
			a = monoid.g(a, a);
			b >>= 1;
		}
		return res;
	}

	static long pow(long a, long b) {
		long res = 1;
		while (b > 0) {
			if ((b & 1) != 0)
				res *= a;
			a *= a;
			b >>= 1;
		}
		return res;
	}

	static <A extends Comparable<? super A>> T<A, A, A> extgcd(A a, A b, EuclideanRing<A> ring) { // returns (x, y, d) s.t. ax + by = d
		AbelianGroup<A> add = ring.add();
		CommutativeMonoid<A> mul = ring.mul();
		A zero = add.e();
		A one = mul.e();
		A sa = a.compareTo(zero) < 0 ? add.inv(one) : one;
		A sb = b.compareTo(zero) < 0 ? add.inv(one) : one;
		a = mul.g(a, sa);
		b = mul.g(b, sb);
		A x = one;
		A y = zero;
		A z = zero;
		A w = one;
		while (b.compareTo(zero) > 0) {
			A q = ring.div(a, b);
			A t = z;
			z = add.g(x, add.inv(mul.g(q, z)));
			x = t;
			t = w;
			w = add.g(y, add.inv(mul.g(q, w)));
			y = t;
			t = b;
			b = add.g(a, add.inv(mul.g(q, b)));
			a = t;
		}
		return T.make(mul.g(x, sa), mul.g(y, sb), a);
	}

	static TL extgcd(long a, long b) {
		int sa = a < 0 ? -1 : 1;
		int sb = b < 0 ? -1 : 1;
		a *= sa;
		b *= sb;
		long x = 1;
		long y = 0;
		long z = 0;
		long w = 1;
		while (b > 0) {
			long q = a / b;
			long t = z;
			z = x - q * z;
			x = t;
			t = w;
			w = y - q * w;
			y = t;
			t = b;
			b = a - q * b;
			a = t;
		}
		return TL.make(x * sa, y * sb, a);
	}

	static TI extgcd(int a, int b) {
		return extgcd((long) a, (long) b).toInt();
	}

	static ArrayList<PI> factorize(int n) { // factor, exponent
		ArrayList<PI> res = new ArrayList<PI>();
		for (int i = 2; i * i <= n; i++) {
			int count = 0;
			while (n % i == 0) {
				n /= i;
				count++;
			}
			if (count > 0)
				res.add(PI.make(i, count));
		}
		if (n > 1)
			res.add(PI.make(n, 1));
		return res;
	}

	static <A> A arithSum(A a, A d, long num, Ring<A> ring) {
		return arithGeomSum(a, d, ring.one(), ring.one(), num, ring);
	}

	static <A> A geomSum(A b, A r, long num, Ring<A> ring) {
		return arithGeomSum(ring.one(), ring.zero(), b, r, num, ring);
	}

	static <A> A arithGeomSum(A a, A d, A b, A r, long num, Ring<A> ring) { // Σ(a+(i-1)d)br^(i-1)
		AbelianGroup<A> add = ring.add();
		Monoid<A> mul = ring.mul();
		Monoid<MN<A>> matMul = Mat.mulRing(3, ring);
		A zero = ring.zero();
		A one = ring.one();
		MN<A> mat = pow(Mat.make(new Object[][] { { r, d, a }, { zero, r, r }, { zero, zero, one } }), num - 1, matMul);
		return mul.g(add.g(add.g(mul.g(mat.at(0, 0), a), mul.g(mat.at(0, 1), r)), mat.at(0, 2)), b);
	}
}

class MN<A> {
	final int m;
	final int n;
	private final Object[][] as;

	static class Scalar<A> extends MN<A> {
		final long l;
		A a;

		Scalar(int m, int n, long l, A zero, A oneTimesL) {
			super(m, n, (i, j) -> i == j ? oneTimesL : zero);
			this.a = oneTimesL;
			this.l = l;
		}
	}

	MN(int m, int n, Mat.Accessor<A> accessor) {
		this.m = m;
		this.n = n;
		as = new Object[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				as[i][j] = accessor.at(i, j);
			}
		}
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < m; i++) {
			s += i == 0 ? "[[ " : " [ ";
			for (int j = 0; j < n; j++) {
				s += (j == 0 ? "" : ", ") + as[i][j];
			}
			s += i == m - 1 ? " ]]" : " ]\n";
		}
		return s;
	}

	@SuppressWarnings("unchecked")
	A at(int i, int j) {
		return (A) as[i][j];
	}

	@SuppressWarnings("unchecked")
	A[][] toArray() {
		A[][] res = (A[][]) Array.newInstance(as[0][0].getClass(), m, n);
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				res[i][j] = (A) as[i][j];
			}
		}
		return res;
	}

	int[][] toIntArray() {
		int[][] res = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				res[i][j] = (int) as[i][j];
			}
		}
		return res;
	}

	long[][] toLongArray() {
		long[][] res = new long[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				res[i][j] = (long) as[i][j];
			}
		}
		return res;
	}

	double[][] toDoubleArray() {
		double[][] res = new double[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				res[i][j] = (double) as[i][j];
			}
		}
		return res;
	}
}

class Mat<A> {
	interface Accessor<A> {
		A at(int i, int j);
	}

	private static <A> MN.Scalar<A> make(int m, int n, long l, A zero, A oneTimesL) {
		return new MN.Scalar<A>(m, n, l, zero, oneTimesL);
	}

	static <A> MN<A> make(int m, int n, Accessor<A> accessor) {
		return new MN<A>(m, n, accessor);
	}

	static <A> MN<A> make(int m, int n, A[][] as) {
		return new MN<A>(m, n, (i, j) -> as[i][j]);
	}

	static MN<Long> make(int[][] as) {
		return new MN<Long>(as.length, as.length == 0 ? 0 : as[0].length, (i, j) -> (long) as[i][j]);
	}

	static MN<Long> make(long[][] as) {
		return new MN<Long>(as.length, as.length == 0 ? 0 : as[0].length, (i, j) -> as[i][j]);
	}

	static MN<Double> make(double[][] as) {
		return new MN<Double>(as.length, as.length == 0 ? 0 : as[0].length, (i, j) -> as[i][j]);
	}

	static <A> MN<A> make(int[][] as, F.IX<A> toA) {
		return new MN<A>(as.length, as.length == 0 ? 0 : as[0].length, (i, j) -> toA.f(as[i][j]));
	}

	static <A> MN<A> make(long[][] as, F.LX<A> toA) {
		return new MN<A>(as.length, as.length == 0 ? 0 : as[0].length, (i, j) -> toA.f(as[i][j]));
	}

	static <A> MN<A> make(double[][] as, F.DX<A> toA) {
		return new MN<A>(as.length, as.length == 0 ? 0 : as[0].length, (i, j) -> toA.f(as[i][j]));
	}

	static <A, B> MN<A> make(B[][] as, F.XX<B, A> toA) {
		return new MN<A>(as.length, as.length == 0 ? 0 : as[0].length, (i, j) -> toA.f(as[i][j]));
	}

	@SuppressWarnings("unchecked")
	static <A> MN<A> make(Object[][] as) {
		return new MN<A>(as.length, as.length == 0 ? 0 : as[0].length, (i, j) -> (A) as[i][j]);
	}

	static <A> MN<A> eye(int n, Ring<A> ring) {
		return make(n, n, (i, j) -> i == j ? ring.mul().e() : ring.add().e());
	}

	static <A> AbelianGroup<MN<A>> add(int m, int n, Ring<A> ring) {
		return AbelianGroup.make((a, b) -> add(a, b, ring), a -> neg(a, ring), make(m, n, 0, ring.zero(), ring.zero()));
	}

	static <A> Monoid<MN<A>> mulRing(int n, Ring<A> ring) {
		return Monoid.make((a, b) -> mul(a, b, ring), make(n, n, 1, ring.zero(), ring.one()));
	}

	static <A> AbelianGroup<MN<A>> mulField(int n, Field<A> field) {
		return AbelianGroup.make((a, b) -> mul(a, b, field), a -> inv(a, field),
				make(n, n, 1, field.zero(), field.one()));
	}

	static <A> MN<A> add(MN<A> a, MN<A> b, Ring<A> ring) {
		int m = U.max(a.m, b.m);
		int n = U.max(a.n, b.n);
		AbelianGroup<A> add = ring.add();
		if (a instanceof MN.Scalar && b instanceof MN.Scalar) {
			MN.Scalar<A> as = ((MN.Scalar<A>) a);
			MN.Scalar<A> bs = ((MN.Scalar<A>) b);
			return make(m, n, as.l + bs.l, ring.zero(), add.g(as.a, bs.a));
		}
		return make(m, n, (i, j) -> add.g(a.at(i, j), b.at(i, j)));
	}

	static <A> MN<A> neg(MN<A> a, Ring<A> ring) {
		if (a instanceof MN.Scalar) {
			MN.Scalar<A> as = ((MN.Scalar<A>) a);
			return make(a.m, a.n, -as.l, ring.zero(), ring.add().inv(as.a));
		}
		return make(a.m, a.n, (i, j) -> ring.add().inv(a.at(i, j)));
	}

	static <A> MN<A> mul(MN<A> a, MN<A> b, Ring<A> ring) {
		int m = a.m;
		int u = U.max(a.n, b.m);
		int n = b.n;
		AbelianGroup<A> add = ring.add();
		Monoid<A> mul = ring.mul();
		if (a instanceof MN.Scalar && b instanceof MN.Scalar) {
			MN.Scalar<A> as = ((MN.Scalar<A>) a);
			MN.Scalar<A> bs = ((MN.Scalar<A>) b);
			return make(m, n, as.l * bs.l, ring.zero(), mul.g(as.a, bs.a));
		}
		return make(m, n, (i, j) -> {
			A res = ring.zero();
			for (int k = 0; k < u; k++)
				res = add.g(res, mul.g(a.at(i, k), b.at(k, j)));
			return res;
		});
	}

	static <A> A det(MN<A> a, Field<A> field) {
		return detInv(a, field).a;
	}

	static <A> MN<A> inv(MN<A> a, Field<A> field) {
		UP<A, MN<A>> detInv = detInv(a, field);
		if (detInv.a.equals(field.zero()))
			throw new ArithmeticException("inverse does not exist: det=0");
		return detInv.b;
	}

	@SuppressWarnings("unchecked")
	private static <A> UP<A, MN<A>> detInv(MN<A> a, Field<A> field) {
		if (a.m != a.n)
			throw new IllegalArgumentException("matrix not square");
		if (field.zero() instanceof Long) {
			UP<Long, MN<Long>> detInv = detInvLong((MN<Long>) a, (Field<Long>) field);
			return UP.make((A) detInv.a, (MN<A>) detInv.b);
		}
		int n = a.n;
		AbelianGroup<A> add = field.add();
		AbelianGroup<A> mul = field.mul();
		A zero = field.zero();
		A one = field.one();
		A[][] m1 = a.toArray();
		A[][] m2 = eye(n, field).toArray();
		A res = one;
		int sign = 1;
		for (int i = 0; i < n; i++) {
			int pivot = -1;
			for (int j = i; j < n; j++) {
				if (!m1[j][i].equals(zero)) {
					pivot = j;
					break;
				}
			}
			if (pivot == -1) {
				return UP.make(zero, null);
			}
			if (pivot != i) {
				sign = -sign;
				A tmp;
				for (int j = i; j < n; j++) { // [0, i) are zero
					tmp = m1[i][j];
					m1[i][j] = m1[pivot][j];
					m1[pivot][j] = tmp;
				}
				for (int j = 0; j < n; j++) {
					tmp = m2[i][j];
					m2[i][j] = m2[pivot][j];
					m2[pivot][j] = tmp;
				}
			}
			A d = m1[i][i];
			res = mul.g(res, d);
			d = mul.inv(d);
			m1[i][i] = one;
			for (int j = i + 1; j < n; j++) {
				m1[i][j] = mul.g(m1[i][j], d);
			}
			for (int j = 0; j < n; j++) {
				m2[i][j] = mul.g(m2[i][j], d);
			}
			for (int j = 0; j < n; j++) {
				if (i == j)
					continue;
				A mult = m1[j][i];
				m1[j][i] = zero;
				for (int k = i + 1; k < n; k++) {
					m1[j][k] = add.g(m1[j][k], add.inv(mul.g(m1[i][k], mult)));
				}
				for (int k = 0; k < n; k++) {
					m2[j][k] = add.g(m2[j][k], add.inv(mul.g(m2[i][k], mult)));
				}
			}
		}
		return UP.make(sign == 1 ? res : add.inv(res), make(m2));
	}

	private static UP<Long, MN<Long>> detInvLong(MN<Long> a, Field<Long> field) {
		if (a.m != a.n)
			throw new IllegalArgumentException("matrix not square");
		int n = a.n;
		AbelianGroup<Long> add = field.add();
		AbelianGroup<Long> mul = field.mul();
		long zero = field.zero();
		long one = field.one();
		long[][] m1 = a.toLongArray();
		long[][] m2 = eye(n, field).toLongArray();
		long res = one;
		int sign = 1;
		for (int i = 0; i < n; i++) {
			int pivot = -1;
			for (int j = i; j < n; j++) {
				if (m1[j][i] != zero) {
					pivot = j;
					break;
				}
			}
			if (pivot == -1) {
				return UP.make(zero, null);
			}
			if (pivot != i) {
				sign = -sign;
				long tmp;
				for (int j = i; j < n; j++) { // [0, i) are zero
					tmp = m1[i][j];
					m1[i][j] = m1[pivot][j];
					m1[pivot][j] = tmp;
				}
				for (int j = 0; j < n; j++) {
					tmp = m2[i][j];
					m2[i][j] = m2[pivot][j];
					m2[pivot][j] = tmp;
				}
			}
			long d = m1[i][i];
			res = mul.g(res, d);
			d = mul.inv(d);
			m1[i][i] = one;
			for (int j = i + 1; j < n; j++) {
				m1[i][j] = mul.g(m1[i][j], d);
			}
			for (int j = 0; j < n; j++) {
				m2[i][j] = mul.g(m2[i][j], d);
			}
			for (int j = 0; j < n; j++) {
				if (i == j)
					continue;
				long mult = m1[j][i];
				m1[j][i] = zero;
				for (int k = i + 1; k < n; k++) {
					m1[j][k] = add.g(m1[j][k], add.inv(mul.g(m1[i][k], mult)));
				}
				for (int k = 0; k < n; k++) {
					m2[j][k] = add.g(m2[j][k], add.inv(mul.g(m2[i][k], mult)));
				}
			}
		}
		return UP.make(sign == 1 ? res : add.inv(res), make(m2));
	}

	static <A> Ring<MN<A>> ring(int n, Ring<A> ring) {
		return Ring.make(add(n, n, ring), mulRing(n, ring));
	}

	static <A> Field<MN<A>> field(int n, Field<A> field) {
		return Field.make(add(n, n, field), mulField(n, field));
	}

	static <A> VM<MN<A>> vm(int n, Ring<A> ring) {
		if (ring instanceof Field)
			return vmField(n, (Field<A>) ring);
		return vmRing(n, ring);
	}

	private static <A> VM<MN<A>> vmRing(int n, Ring<A> ring) {
		Ring<MN<A>> matRing = ring(n, ring);
		Monoid<MN<A>> matMul = matRing.mul();
		AbelianGroup<A> add = ring.add();
		Monoid<A> mul = ring.mul();
		A zero = add.e();
		A one = mul.e();
		return new VM<MN<A>>(matRing, null, null, (a, b) -> {
			if (b instanceof MN.Scalar) {
				MN.Scalar<A> bs = ((MN.Scalar<A>) b);
				if (bs.l < 0)
					throw new RuntimeException("pow(MN, <0) is not defined");
				return Alg.pow(a, bs.l, matMul);
			}
			throw new RuntimeException("pow(MN, MN) is not defined");
		}, null, l -> make(n, n, l, zero, Alg.pow(one, l, add)), a -> a);
	}

	private static <A> VM<MN<A>> vmField(int n, Field<A> field) {
		Field<MN<A>> matField = field(n, field);
		AbelianGroup<MN<A>> matMul = matField.mul();
		A zero = field.zero();
		A one = field.one();
		return new VM<MN<A>>(matField, (a, b) -> {
			if (b instanceof MN.Scalar) {
				MN.Scalar<A> bs = ((MN.Scalar<A>) b);
				if (bs.l < 0)
					return Alg.pow(inv(a, field), -bs.l, matMul);
				return Alg.pow(a, bs.l, matMul);
			}
			throw new RuntimeException("pow(MN, MN) is not defined");
		}, a -> inv(a, field), l -> make(n, n, l, zero, Alg.pow(one, l, field.add())), a -> a);
	}
}

class VM<A> {
	private final HashMap<String, A> env;
	private final Evaluator<A> etor;
	private final F.XX<A, A> filter;

	VM(F.XXX<A, A, A> add, F.XXX<A, A, A> sub, F.XXX<A, A, A> mul, F.XXX<A, A, A> div, F.XXX<A, A, A> mod,
			F.XXX<A, A, A> pow, F.XX<A, A> neg, F.XX<A, A> fact, F.LX<A> fromInt, F.XX<A, A> filter) {
		env = new HashMap<String, A>();
		etor = SimpleLang.makeEvaluator((s, a) -> {
			env.put(s, a);
			return a;
		}, add, sub, mul, div, mod, pow, neg, fact, fromInt, s -> {
			if (env.containsKey(s))
				return env.get(s);
			throw new RuntimeException("no such variable: " + s);
		});
		this.filter = filter;
	}

	VM(Ring<A> ring, F.XXX<A, A, A> div, F.XXX<A, A, A> mod, F.XXX<A, A, A> pow, F.XX<A, A> fact, F.LX<A> fromInt,
			F.XX<A, A> filter) {
		this(ring.add()::g, (a, b) -> ring.add().g(a, ring.add().inv(b)), ring.mul()::g, div, mod, pow,
				ring.add()::inv, fact, fromInt, filter);
	}

	VM(EuclideanRing<A> ring, F.XXX<A, A, A> pow, F.XX<A, A> fact, F.LX<A> fromInt, F.XX<A, A> filter) {
		this(ring, ring::div, ring::mod, pow, fact, fromInt, filter);
	}

	void clear() {
		env.clear();
	}

	A get(String id) {
		return env.get(id);
	}

	void print(String id, F.XV<String> printer) {
		printer.f("" + get(id));
	}

	@SafeVarargs
	final void set(String idsSp, A... as) {
		String[] ids = idsSp.trim().split(" +");
		int n = ids.length;
		if (as.length != n)
			throw new IllegalArgumentException("argument size mismatch: " + n + " != " + as.length);
		for (int i = 0; i < n; i++)
			set(ids[i], as[i]);
	}

	void set(String id, A a) {
		env.put(id, filter.f(a));
	}

	A run(String expr) {
		return AST.eval(SimpleLang.parse(expr), etor);
	}
}

class AST { // Abstract Syntax Tree
	static class AssignOp extends AST {
		String id;
		AST r;

		AssignOp(String id, AST r) {
			this.id = id;
			this.r = r;
		}

		public String toString() {
			return "Assign(" + id + ", " + r + ")";
		}
	}

	static class Multi extends AST {
		ArrayList<AST> as;

		Multi(ArrayList<AST> as) {
			this.as = as;
		}

		public String toString() {
			String s = "";
			for (AST a : as)
				s += s.isEmpty() ? a : "; " + a;
			return "Multi(" + s + ")";
		}
	}

	static class BinOp extends AST {
		AST l;
		AST r;
		String op;

		BinOp(AST l, String op, AST r) {
			this.l = l;
			this.op = op;
			this.r = r;
		}

		public String toString() {
			return "BinOp(" + l + ", " + op + ", " + r + ")";
		}
	}

	static class UnOp extends AST {
		AST a;
		String op;

		UnOp(String op, AST a) {
			this.op = op;
			this.a = a;
		}

		public String toString() {
			return "UnOp(" + op + ", " + a + ")";
		}
	}

	static class Int extends AST {
		long v;

		Int(long v) {
			this.v = v;
		}

		public String toString() {
			return "Int(" + v + ")";
		}
	}

	static class Id extends AST {
		String s;

		Id(String s) {
			this.s = s;
		}

		public String toString() {
			return "Id(" + s + ")";
		}
	}

	static <A> A eval(AST a, Evaluator<A> etor) {
		if (a instanceof AssignOp)
			return etor.assign(((AssignOp) a).id, eval(((AssignOp) a).r, etor));
		if (a instanceof Multi) {
			A last = null;
			for (AST a2 : ((Multi) a).as)
				last = eval(a2, etor);
			return last;
		}
		if (a instanceof BinOp)
			return etor.binOp(((BinOp) a).op, eval(((BinOp) a).l, etor), eval(((BinOp) a).r, etor));
		if (a instanceof UnOp)
			return etor.unOp(((UnOp) a).op, eval(((UnOp) a).a, etor));
		if (a instanceof Int)
			return etor.fromInt(((Int) a).v);
		if (a instanceof Id)
			return etor.id(((Id) a).s);
		throw new RuntimeException("unexpected ast: " + a);
	}
}

interface Evaluator<A> {
	A assign(String s, A a);

	A binOp(String op, A a, A b);

	A unOp(String op, A a);

	A fromInt(long a);

	A id(String s);
}

class Seq<A> {
	ArrayList<A> as;
	int ptr;

	Seq(ArrayList<A> as) {
		this.as = as;
		ptr = 0;
	}

	boolean hasNext(int num) {
		return ptr + num < as.size();
	}

	boolean hasNext() {
		return hasNext(0);
	}

	A next(int num) {
		return ptr + num < as.size() ? as.get(ptr + num) : null;
	}

	A next() {
		return next(0);
	}

	A read() {
		return hasNext() ? as.get(ptr++) : null;
	}

	A read(A a) {
		if (!hasNext())
			throw new RuntimeException("unexpected EOF");
		if (!isNext(a))
			throw new RuntimeException("expected " + a + " but got" + next());
		return read();
	}

	A read(F.XX<A, Boolean> f) {
		if (!hasNext())
			throw new RuntimeException("unexpected EOF");
		if (!f.f(next()))
			throw new RuntimeException("f(" + next() + ") returned false");
		return read();
	}

	boolean isNext(A a) {
		return a.equals(next());
	}

	boolean isNext(@SuppressWarnings("unchecked") A... as) {
		for (A a : as)
			if (isNext(a))
				return true;
		return false;
	}

	boolean isNext(F.XX<A, Boolean> f) {
		return hasNext() && f.f(next());
	}

	A readIf(F.XX<A, Boolean> f) {
		if (isNext(f))
			return read();
		return null;
	}

	A readIf(@SuppressWarnings("unchecked") A... as) {
		for (A a : as)
			if (isNext(a)) {
				ptr++;
				return a;
			}
		return null;
	}

	public String toString() {
		return as.toString();
	}
}

class Token extends P<String, Integer> {
	private static final int ID = 1;
	private static final int SYM = 2;
	private static final int INT = 3;

	Token(String s, int type) {
		super(s, type);
	}

	boolean is(String s) {
		return a.equals(s);
	}

	static Token ofId(String s) {
		return new Token(s, ID);
	}

	static Token ofSym(String s) {
		return new Token(s, SYM);
	}

	static Token ofInt(String s) {
		return new Token(s, INT);
	}

	boolean isId() {
		return b == ID;
	}

	boolean isSym() {
		return b == SYM;
	}

	boolean isInt() {
		return b == INT;
	}
}

class SimpleLang {
	private static class Tokenizer {
		private static final String SYMS = "+-*/%^!()=;";

		Seq<Character> sc;
		ArrayList<Token> ts;

		Tokenizer(String s) {
			sc = new Seq<Character>(U.make(s.length(), i -> s.charAt(i)));
		}

		Seq<Token> parse() {
			ts = new ArrayList<Token>();
			parseAll();
			return new Seq<Token>(ts);
		}

		private static boolean isSpace(char c) {
			return c == ' ' || c == '\t' || c == '\r' || c == '\n';
		}

		private static boolean isDigit(char c) {
			return c >= '0' && c <= '9';
		}

		private static boolean isSymbol(char c) {
			return SYMS.indexOf(c) != -1;
		}

		private static boolean isAlpha(char c) {
			return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c == '_';
		}

		private void parseAll() {
			while (sc.hasNext()) {
				while (sc.isNext(Tokenizer::isSpace))
					sc.read();
				if (!sc.hasNext())
					break;
				if (sc.isNext(Tokenizer::isAlpha)) {
					parseId();
				} else if (sc.isNext(Tokenizer::isDigit)) {
					parseInt();
				} else if (sc.isNext(Tokenizer::isSymbol)) {
					parseSym();
				} else {
					throw new RuntimeException("invalid character: " + sc.next());
				}
			}
		}

		private void parseId() {
			String s = sc.read().toString();
			while (sc.isNext(Tokenizer::isAlpha) || sc.isNext(Tokenizer::isDigit))
				s += sc.read().toString();
			ts.add(Token.ofId(s));
		}

		private void parseInt() {
			String s = sc.read().toString();
			while (sc.isNext(Tokenizer::isDigit))
				s += sc.read().toString();
			ts.add(Token.ofInt(s));
		}

		private void parseSym() {
			String s = sc.read().toString();
			ts.add(Token.ofSym(s));
		}
	}

	private static class Parser {
		Seq<Token> ts;

		Parser(Seq<Token> ts) {
			this.ts = ts;
		}

		AST parse() {
			return parseExpr();
		}

		private AST parseExpr() {
			return parseMultiExpr();
		}

		private AST parseMultiExpr() {
			readSemicolons();
			AST a = parseAssignExpr();
			if (readSemicolons()) {
				ArrayList<AST> as = new ArrayList<AST>();
				as.add(a);
				do {
					if (!ts.hasNext())
						break;
					as.add(parseAssignExpr());
				} while (readSemicolons());
				if (as.size() == 1)
					return a;
				return new AST.Multi(as);
			}
			return a;
		}

		private boolean readSemicolons() {
			if (!ts.isNext(t -> t.is(";")))
				return false;
			do {
				ts.read();
			} while (ts.isNext(t -> t.is(";")));
			return true;
		}

		private AST parseAssignExpr() {
			AST a = parseAddSubOp();
			if (ts.isNext(t -> t.is("="))) {
				ts.read();
				if (!(a instanceof AST.Id))
					throw new RuntimeException("cannot assign to " + a);
				return new AST.AssignOp(((AST.Id) a).s, parseAssignExpr());
			}
			return a;
		}

		private AST parseAddSubOp() {
			AST a = parseMulDivModOp();
			while (ts.isNext(t -> t.is("+") || t.is("-")))
				a = new AST.BinOp(a, ts.read().a, parseMulDivModOp());
			return a;
		}

		private AST parseMulDivModOp() {
			AST a = parsePowOp();
			while (ts.isNext(t -> t.is("*") || t.is("/") || t.is("%")))
				a = new AST.BinOp(a, ts.read().a, parsePowOp());
			return a;
		}

		private AST parsePowOp() {
			AST a = parseNegateOp();
			if (ts.isNext(t -> t.is("^")))
				return new AST.BinOp(a, ts.read().a, parsePowOp());
			return a;
		}

		private AST parseNegateOp() {
			if (ts.isNext(t -> t.is("-")))
				return new AST.UnOp(ts.read().a, parseNegateOp());
			return parseFactOp();
		}

		private AST parseFactOp() {
			AST a = parsePrimary();
			while (ts.isNext(t -> t.is("!")))
				a = new AST.UnOp(ts.read().a, a);
			return a;
		}

		private AST parsePrimary() {
			if (ts.isNext(t -> t.isId()))
				return new AST.Id(ts.read().a);
			if (ts.isNext(t -> t.isInt()))
				return new AST.Int(Long.parseLong(ts.read().a));
			if (ts.readIf(t -> t.is("(")) != null) {
				AST e = parseExpr();
				ts.read(t -> t.is(")"));
				return e;
			}
			throw new RuntimeException("unexpected token: " + ts.next());
		}
	}

	static HashMap<String, AST> cache = new HashMap<String, AST>();

	static <A> Evaluator<A> makeEvaluator(F.XXX<String, A, A> assign, F.XXX<A, A, A> add, F.XXX<A, A, A> sub,
			F.XXX<A, A, A> mul, F.XXX<A, A, A> div, F.XXX<A, A, A> mod, F.XXX<A, A, A> pow, F.XX<A, A> neg,
			F.XX<A, A> fact, F.LX<A> fromInt, F.XX<String, A> id) {
		return new Evaluator<A>() {
			public A assign(String s, A a) {
				return assign.f(s, a);
			}

			public A binOp(String op, A a, A b) {
				switch (op) {
				case "+":
					return add.f(a, b);
				case "-":
					return sub.f(a, b);
				case "*":
					return mul.f(a, b);
				case "/":
					return div.f(a, b);
				case "%":
					return mod.f(a, b);
				case "^":
					return pow.f(a, b);
				}
				throw new RuntimeException("invalid binOp: " + op);
			}

			public A unOp(String op, A a) {
				switch (op) {
				case "-":
					return neg.f(a);
				case "!":
					return fact.f(a);
				}
				throw new RuntimeException("invalid unOp: " + op);
			}

			public A fromInt(long a) {
				return fromInt.f(a);
			}

			public A id(String s) {
				return id.f(s);
			}
		};
	}

	static AST parse(String s) {
		if (cache.containsKey(cache)) {
			return cache.get(s);
		}
		Tokenizer l = new Tokenizer(s);
		Seq<Token> ts = l.parse();
		Parser p = new Parser(ts);
		AST a = p.parse();
		cache.put(s, a);
		return a;
	}
}

class Mod {
	final long mod;
	final AbelianGroup<Long> add;
	final AbelianGroup<Long> mul;
	final Field<Long> field;
	final VM<Long> vm;
	private final boolean prime;
	private final HashMap<Long, Integer> logMap;
	private long[] facts;
	private long[] invs;
	private long[] invFacts;
	private long[] factors;

	Mod(long mod) {
		this.mod = mod;
		prepareFacts(0);
		prime = BigInteger.valueOf(mod).isProbablePrime(100);
		add = AbelianGroup.make((a, b) -> (a + b) % mod, a -> mod - a, 0l);
		mul = AbelianGroup.make((a, b) -> (a * b) % mod, a -> {
			if (prime)
				return pow(a, mod - 2);
			TL t = Alg.extgcd(a, mod);
			if (t.c != 1)
				throw new ArithmeticException("inv(" + a + ") does not exist");
			return (t.a % mod + mod) % mod;
		}, 1l);
		field = Field.make(add, mul);
		logMap = new HashMap<Long, Integer>();
		vm = new VM<Long>(field, this::pow, this::fact, a -> (a % mod + mod) % mod, a -> (a % mod + mod) % mod);
	}

	long fact(long a) {
		if (a >= Integer.MAX_VALUE)
			throw new RuntimeException("fact(" + a + ") too big");
		prepareFacts((int) a);
		return facts[(int) (a % mod)];
	}

	long invFact(int a) {
		prepareFacts(a);
		return invFacts[(int) (a % mod)];
	}

	long inv(long a) {
		return mul.inv(a);
	}

	long pow(long a, long b) {
		if (b == 0)
			return 1;
		if (b == 1)
			return a;
		if (b < 0) {
			a = inv(a);
			b = -b;
		}
		a %= mod;
		long res = 1;
		while (b > 0) {
			if ((b & 1) != 0)
				res = res * a % mod;
			a = a * a % mod;
			b >>= 1;
		}
		return res;
	}

	long order(long a) { // computes the order of `a` in O(sqrt(mod)) time
		a %= mod;
		if (a == 0)
			return 0;
		if (a == 1)
			return 1;
		if (factors == null) {
			ArrayList<Long> fs = new ArrayList<Long>();
			for (long i = 2; i * i < mod; i++) {
				if ((mod - 1) % i == 0)
					fs.add(i);
			}
			factors = new long[fs.size()];
			for (int i = 0; i < fs.size(); i++) {
				factors[i] = fs.get(i);
			}
		}
		for (long f : factors) {
			if (pow(a, f) == 1)
				return f;
		}
		return mod - 1;
	}

	PL log(long a, long b) { // log_b(a) in O(sqrt(mod)) time
		a %= mod;
		b %= mod;
		if (b == 1 || b == 0)
			return a == b ? PL.make(1, 1) : PL.make(-1, 0);
		if (a == 0)
			return PL.make(-1, 0);
		long order = order(b);
		if (a == 1)
			return PL.make(0, order);
		long orderSqrtL = sqrtCeil(order);
		if (orderSqrtL > Integer.MAX_VALUE)
			throw new RuntimeException("order(" + b + ") too big: " + order);
		int orderSqrt = (int) sqrtCeil(order);
		logMap.clear();
		logMap.put(1l, 0);
		long p = 1;
		for (int i = 1; i < orderSqrt; i++) {
			p = p * b % mod;
			logMap.put(p, i);
		}
		long ib = pow(b, mod - orderSqrt - 1);
		p = a;
		for (int i = 1; i < orderSqrt; i++) {
			p = p * ib % mod;
			if (logMap.containsKey(p))
				return PL.make((i * orderSqrt + logMap.get(p)) % order, order);
		}
		return PL.make(-1, 0);
	}

	private long sqrtCeil(long a) {
		return U.searchL((long) Math.sqrt(a * 0.9), (long) Math.sqrt(a * 1.1) + 1, mid -> mid * mid >= a);
	}

	private void prepareFacts(int n) {
		if (facts == null) {
			facts = new long[1024];
			invs = new long[1024];
			invFacts = new long[1024];
			prepareFactsIn(0, 1024);
		}
		if (n >= mod)
			n = (int) (mod - 1);
		while (facts.length <= n) {
			int prevL = facts.length;
			int newL = prevL << 1;
			facts = Arrays.copyOf(facts, newL);
			invs = Arrays.copyOf(invs, newL);
			invFacts = Arrays.copyOf(invFacts, newL);
			prepareFactsIn(prevL, newL);
		}
	}

	private void prepareFactsIn(int from, int until) {
		if (until > mod)
			until = (int) mod;
		for (int i = from; i < until; i++) {
			if (i == 0) {
				facts[0] = 1;
				invs[0] = 0;
				invFacts[0] = 1;
				continue;
			}
			if (i == 1) {
				facts[1] = 1;
				invs[1] = 1;
				invFacts[1] = 1;
				continue;
			}
			facts[i] = facts[i - 1] * i % mod;
			invs[i] = (mod - mod / i) * invs[(int) (mod % i)] % mod;
			invFacts[i] = invFacts[i - 1] * invs[i] % mod;
		}
	}
}
