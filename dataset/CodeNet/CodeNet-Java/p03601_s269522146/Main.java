import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
	final int _intMax = Integer.MAX_VALUE; // =2147483647>10^9
	final int _intMin = Integer.MIN_VALUE;
	final long _longMax = Long.MAX_VALUE; // =9223372036854775807L>10^18
	final long _longMin = Long.MIN_VALUE;
	final char[] _azAry = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
			's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

	void solve() {
		int[] ia = readNums();
		int a = ia[0];
		int b = ia[1];
		int c = ia[2];
		int d = ia[3];
		int e = ia[4];
		int f = ia[5];
		double maxD = -1.0;
		int maxW = 0;
		int maxS = 0;
		for (int na = 0; true; na += a) {
			if (weight(na, 0, 0, 0, f))
				break;
			for (int nb = 0; true; nb += b) {
				if (weight(na, nb, 0, 0, f))
					break;
				for (int nc = 0; true; nc += c) {
					if (weight(na, nb, nc, 0, f))
						break;
					for (int nd = 0; true; nd += d) {
						if (weight(na, nb, nc, nd, f))
							break;
						if (density(na, nb, nc, nd, e))
							break;
						int weight = 100 * na + 100 * nb + nc + nd;
						if (weight == 0)
							continue;
						double density = 100.0 * (nc + nd) / weight;
						if (maxD < density) {
							maxD = density;
							maxW = weight;
							maxS = nc + nd;
						}
					}
				}
			}
		}
		pln(maxW + " " + maxS);
	}

	boolean weight(int a, int b, int c, int d, int f) {
		int w = 100 * a + 100 * b + c + d;
		return w > f;
	}

	boolean density(int a, int b, int c, int d, int e) {
		int w = (a + b) * e;
		int s = c + d;
		return s > w;
	}

	// -----------------------------------------------------
	// 2018/04/29 r14
	// -----------------------------------------------------
	List<Character> getazList() {
		List<Character> list = new ArrayList<>();
		for (char ch : _azAry)
			list.add(ch);
		return list;
	}

	int getDx(int idx) {
		int[] dx = { 0, 1, 1, 1, 0, -1, -1, -1 };
		return dx[idx];
	}

	int getDy(int idx) {
		int[] dy = { -1, -1, 0, 1, 1, 1, 0, -1 };
		return dy[idx];
	}

	class Counter<K> {
		Map<K, Integer> map = new HashMap<>();

		public void add(K key) {
			Integer cnt = map.get(key);
			if (cnt == null)
				map.put(key, 1);
			else
				map.put(key, cnt + 1);
		}

		public int get(K key) {
			Integer cnt = map.get(key);
			if (cnt == null)
				return 0;
			else
				return cnt;
		}

		public Set<K> keySet() {
			return map.keySet();
		}
	}

	class IntList {
		class Info {
			int idx;
			int val;

			public Info(int idx, int val) {
				this.idx = idx;
				this.val = val;
			}

			public String toString() {
				return "(" + idx + ", " + val + ")";
			}
		}

		class InfoComparator implements Comparator<Info> {
			boolean bAsc;

			public InfoComparator(boolean bAsc) {
				this.bAsc = bAsc;
			}

			public int compare(Info o1, Info o2) {
				int sign = bAsc ? 1 : -1;
				if (o1.val < o2.val)
					return -1 * sign;
				else if (o1.val > o2.val)
					return 1 * sign;
				return 0;
			}
		}

		List<Info> list = new ArrayList<>();
		InfoComparator asc = new InfoComparator(true);
		InfoComparator desc = new InfoComparator(false);

		public void add(int val) {
			list.add(new Info(list.size(), val));
		}

		public void add(int idx, int val) {
			list.add(new Info(idx, val));
		}

		public int getIdx(int idx) {
			return list.get(idx).idx;
		}

		public int getVal(int idx) {
			return list.get(idx).val;
		}

		public int getLastVal() {
			return list.get(list.size() - 1).val;
		}

		public void remove(int idx) {
			list.remove(idx);
		}

		public void removeLast() {
			list.remove(list.size() - 1);
		}

		public int size() {
			return list.size();
		}

		public void sort(boolean bAsc) {
			if (bAsc)
				Collections.sort(list, asc);
			else
				Collections.sort(list, desc);
		}
	}

	class Point {
		int x;
		int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public Point(Point pt) {
			this.x = pt.x;
			this.y = pt.y;
		}

		public boolean equals(Object o) {
			if (o instanceof Point) {
				Point that = (Point) o;
				return (x == that.x) && (y == that.y);
			}
			return false;
		}

		public int hashCode() {
			return x + (y * 31);
		}

		public String toString() {
			return "(" + x + ", " + y + ")";
		}
	}

	class PointComparator implements Comparator<Point> {
		int mode;

		public PointComparator(int prop, boolean bAsc) {
			switch (prop) {
			case 1:
				if (bAsc)
					this.mode = 11;
				else
					this.mode = 12;
				break;
			case 2:
				if (bAsc)
					this.mode = 21;
				else
					this.mode = 22;
				break;
			default:
				throw new RuntimeException();
			}
		}

		public int compare(Point p1, Point p2) {
			switch (mode) {
			case 11:
				return 1 * Integer.compare(p1.x, p2.x);
			case 12:
				return -1 * Integer.compare(p1.x, p2.x);
			case 21:
				return 1 * Integer.compare(p1.y, p2.y);
			case 22:
				return -1 * Integer.compare(p1.y, p2.y);
			}
			throw new IllegalStateException();
		}
	}

	int abs(int a) {
		return (a >= 0) ? a : -a;
	}

	long abs(long a) {
		return (a >= 0) ? a : -a;
	}

	int max(int a, int b) {
		return (a > b) ? a : b;
	}

	long max(long a, long b) {
		return (a > b) ? a : b;
	}

	int min(int a, int b) {
		return (a < b) ? a : b;
	}

	long min(long a, long b) {
		return (a < b) ? a : b;
	}

	int reed(long a, int n) {
		while (n-- > 0)
			a /= 10;
		return (int) (a % 10);
	}

	int sqrt(long a) {
		return (int) Math.sqrt(a);
	}

	int pint(String s) {
		return Integer.parseInt(s);
	}

	long plong(String s) {
		return Long.parseLong(s);
	}

	String readLine() {
		try {
			return _in.readLine();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	int readNum() {
		String line = readLine();
		return pint(line);
	}

	long readLong() {
		String line = readLine();
		return plong(line);
	}

	String[] readFlds() {
		String line = readLine();
		return line.split(" ");
	}

	int[] readNums() {
		String[] flds = readFlds();
		int[] nums = new int[flds.length];
		for (int i = 0; i < flds.length; i++)
			nums[i] = pint(flds[i]);
		return nums;
	}

	int[] readNums(int n) {
		int[] nums = new int[n];
		for (int i = 0; i < n; i++)
			nums[i] = readNum();
		return nums;
	}

	long[] readLongs() {
		String[] flds = readFlds();
		long[] nums = new long[flds.length];
		for (int i = 0; i < flds.length; i++)
			nums[i] = plong(flds[i]);
		return nums;
	}

	long[] readLongs(int n) {
		long[] nums = new long[n];
		for (int i = 0; i < n; i++)
			nums[i] = readLong();
		return nums;
	}

	Main pln() {
		_out.println();
		return this;
	}

	Main p(char c) {
		_out.print(c);
		return this;
	}

	Main p(char c, int n) {
		for (int i = 0; i < n; i++)
			p(c);
		return this;
	}

	Main pln(char c) {
		_out.println(c);
		return this;
	}

	Main p(double d) {
		_out.print(d);
		return this;
	}

	Main pln(double d) {
		_out.println(d);
		return this;
	}

	Main p(long l) {
		_out.print(l);
		return this;
	}

	Main pln(long l) {
		_out.println(l);
		return this;
	}

	Main p(String s) {
		_out.print(s);
		return this;
	}

	Main p(String s, int idx) {
		_out.print(s.charAt(idx));
		return this;
	}

	Main pln(String s) {
		_out.println(s);
		return this;
	}

	Main pln(int[] ia) {
		for (int i = 0; i < ia.length; i++)
			_out.println(ia[i]);
		return this;
	}

	Main pln(long[] la) {
		for (int i = 0; i < la.length; i++)
			_out.println(la[i]);
		return this;
	}

	static BufferedReader _in;
	static PrintWriter _out;
	static boolean _bElapsed = false;

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		_in = new BufferedReader(new InputStreamReader(System.in));
		_out = new PrintWriter(System.out);
		new Main().solve();
		_out.flush();
		long end = System.currentTimeMillis();
		if (_bElapsed)
			System.err.println((end - start) + "ms");
	}
}
