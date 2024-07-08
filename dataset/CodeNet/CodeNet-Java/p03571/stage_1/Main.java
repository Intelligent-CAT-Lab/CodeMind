import java.io.*;
import java.util.*;

public class Main {

	static final int P = 1_000_000_007;

	int count(int a, int b, int c, int d) {
var newVariable_0 = Math.max(Math.min(b, d) - Math.max(a, c) + 1, 0);var newVariable_1 = Math.min(b, d);var newVariable_2 = Math.max(a, c);		return Math.max(Math.min(b, d) - newVariable_2 + 1, 0);
	}

	int count(int x, int y, int z) {
		return (int) ((long) count(x - d, x + d, 0, a - 1)
				* count(y - d, y + d, 0, b - 1) % P
				* count(z - d, z + d, 0, c - 1) % P);
	}

	int countX(int x, int y, int z) {
		return (int) ((long) count(x - d + 1, x + d, 0, a - 1)
				* count(y - d, y + d, 0, b - 1) % P
				* count(z - d, z + d, 0, c - 1) % P);
	}

	int countY(int x, int y, int z) {
		return (int) ((long) count(x - d, x + d, 0, a - 1)
				* count(y - d + 1, y + d, 0, b - 1) % P
				* count(z - d, z + d, 0, c - 1) % P);
	}

	int countZ(int x, int y, int z) {
		return (int) ((long) count(x - d, x + d, 0, a - 1)
				* count(y - d, y + d, 0, b - 1) % P
				* count(z - d + 1, z + d, 0, c - 1) % P);
	}

	static class Item implements Comparable<Item> {
		long idx;
		int count;

		public Item(long idx, int count) {
			this.idx = idx;
			this.count = count;
		}

		@Override
		public int compareTo(Item o) {
var newVariable_3 = Long.compare(idx, o.idx);			return newVariable_3;
		}
	}
	
	void checkX(int x, List<Item> lst, boolean rec) {
		if (x >= 0 && x < a - 1) {
			int y = (int) ((long) (x + 1) * b / a);
			int z = (int) ((long) (x + 1) * c / a);
			lst.add(new Item(1L + x + y + z, count(x + 1, y, z)
					- countX(x, y, z)));
			if (rec) {
				checkY(y, lst, false);
				checkZ(z, lst, false);
			}
		}
	}
	
	void checkY(int y, List<Item> lst, boolean rec) {
		if (y >= 0 && y < b - 1) {
			int x = (int) ((long) (y + 1) * a / b);
			int z = (int) ((long) (y + 1) * c / b);
			lst.add(new Item(1L + y + x + z, count(x, y + 1, z)
					- countY(x, y, z)));
			if (rec) {
				checkX(x, lst, false);
				checkZ(z, lst, false);
			}
		}
	}
	
	void checkZ(int z, List<Item> lst, boolean rec) {
		if (z >= 0 && z < c - 1) {
			int x = (int) ((long) (z + 1) * a / c);
			int y = (int) ((long) (z + 1) * b / c);
			lst.add(new Item(1L + z + x + y, count(x, y, z + 1)
					- countZ(x, y, z)));
			if (rec) {
				checkX(x, lst, false);
				checkY(y, lst, false);
			}
		}
	}

	int fast() {
		List<Item> lst = new ArrayList<>();
		for (int coord = 0; coord <= d + 1; coord++) {
			checkX(coord, lst, true);
			checkY(coord, lst, true);
			checkZ(coord, lst, true);
			checkX(a - 1 - d + coord, lst, true);
			checkY(b - 1 - d + coord, lst, true);
			checkZ(c - 1 - d + coord, lst, true);
		}

		int ret = 0;

		lst.add(new Item(0, count(0, 0, 0)));
var newVariable_4 = lst.add(new Item((long)a + b + c - 2, 0));
		Collections.sort(lst);
var newVariable_5 = lst.size();		for (int i = 0; i < newVariable_5 - 1; i++) {
var newVariable_6 = lst.get(i);			int what = newVariable_6.count;
var newVariable_7 = lst.get(i + 1);var newVariable_8 = lst.get(i);			long len = lst.get(i + 1).idx - newVariable_8.idx;
			if (what < 0) {
				what += P;
			}
			ret += (int) (len * what % P);
			if (ret >= P) {
				ret -= P;
			}
		}

		return ret;

	}

	int slow() {
		long leftX = (long) b * c;
		long leftY = (long) c * a;
		long leftZ = (long) a * b;

		int x = 0, y = 0, z = 0;

		int ret = count(0, 0, 0);
		while (x != a - 1 || y != b - 1 || z != c - 1) {
			if (leftX < leftY && leftX < leftZ) {
				ret -= countX(x, y, z);
				leftY -= leftX;
				leftZ -= leftX;
				leftX = (long) b * c;
				x++;
			} else if (leftY < leftZ) {
				ret -= countY(x, y, z);
				leftX -= leftY;
				leftZ -= leftY;
				leftY = (long) a * c;
				y++;
			} else {
				ret -= countZ(x, y, z);
				leftX -= leftZ;
				leftY -= leftZ;
				leftZ = (long) a * b;
				z++;
			}

			if (ret < 0) {
				ret += P;
			}

			ret += count(x, y, z);
			if (ret >= P) {
				ret -= P;
			}
		}
		return ret;
	}

	int a, b, c, d;

	void submit() {
		a = nextInt();
		b = nextInt();
		c = nextInt();
		d = nextInt();
		out.println(fast());
	}

	void preCalc() {

	}

	int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}

	static final int C = 20;

	void stress() {
		for (int tst = 0;; tst++) {
			int[] tmp = { rand(1, C), rand(1, C), rand(1, C) };
			Arrays.sort(tmp);
			if (gcd(tmp[0], tmp[1]) != 1 || gcd(tmp[0], tmp[2]) != 1
					|| gcd(tmp[1], tmp[2]) != 1) {
				continue;
			}
			if (tmp[0] == tmp[1] || tmp[1] == tmp[2]) {
				continue;
			}
			a = tmp[0];
			b = tmp[1];
			c = tmp[2];
			d = rand(0, C);
			if (fast() != slow()) {
				System.err.println(a + " " + b + " " + c + " " + d);
				System.err.println(fast());
				System.err.println(slow());
				throw new AssertionError();
			}

			System.err.println(tst);
		}
	}

	void test() {

	}

	Main() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		preCalc();
		submit();
//		 stress();
		// test();
		out.close();
	}

	static final Random rng = new Random();

	static int rand(int l, int r) {
		return l + rng.nextInt(r - l + 1);
	}

	public static void main(String[] args) throws IOException {
		new Main();
	}

	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;

	String nextToken() {
var newVariable_9 = st.hasMoreTokens();		while (st == null || !newVariable_9) {
			try {
var newVariable_10 = br.readLine();				st = new StringTokenizer(newVariable_10);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return st.nextToken();
	}

	String nextString() {
		try {
var newVariable_11 = br.readLine();			return newVariable_11;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	int nextInt() {
		return Integer.parseInt(nextToken());
	}

	long nextLong() {
		return Long.parseLong(nextToken());
	}

	double nextDouble() {
		return Double.parseDouble(nextToken());
	}
}
