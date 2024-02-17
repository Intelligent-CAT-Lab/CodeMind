import java.io.*;
import java.util.*;

public class Main {
	FastScanner in;
	PrintWriter out;

	final String fest = "FESTIVAL";

	ArrayList<Long> generate(ArrayList<Long> need) {
		long[] a = new long[8];
		a[0] = 1;
		Random rnd = new Random(123);
		final long MAX = (long) 1e18;
		int fail = 0;
		int needIt = 0;
		ArrayList<Long> all = new ArrayList<Long>();
		for (int it = 0; it < 3333; it++) {
			int pos = 1 + rnd.nextInt(a.length - 1);
			if (it < 100) {
				pos = 1 + (it) % (a.length - 1);
			}
			if (fail > 100) {
				break;
			}
			if (a[pos] + a[pos - 1] > MAX) {
				fail++;
				it--;
				continue;
			} else {
				fail = 0;
			}
			a[pos] += a[pos - 1];
			if (need != null) {
				out.print(fest.charAt(pos - 1));
			}
			if (pos == a.length - 1) {
				all.add(a[pos]);
				while (need != null && need.get(needIt) - a[pos] == 0) {
					needIt++;
					out.print("L");
					if (needIt == need.size()) {
						return null;
					}
				}
			}
		}
		return all;
	}

	void solve() {
		long K = in.nextLong();
		ArrayList<Long> f = generate(null);
		ArrayList<Long> need = new ArrayList<Long>();
		for (int i = f.size() - 1; i >= 0; i--) {
			long val = f.get(i);
			while (K >= val) {
				need.add(val);
				K -= val;
			}
		}
		Collections.reverse(need);
		generate(need);

	}

	void run() {
		try {
			in = new FastScanner(new File("object.in"));
			out = new PrintWriter(new File("object.out"));

			solve();

			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	void runIO() {

		in = new FastScanner(System.in);
		out = new PrintWriter(System.out);

		solve();

		out.close();
	}

	class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner(File f) {
			try {
				br = new BufferedReader(new FileReader(f));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

		public FastScanner(InputStream f) {
			br = new BufferedReader(new InputStreamReader(f));
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				String s = null;
				try {
					s = br.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (s == null)
					return null;
				st = new StringTokenizer(s);
			}
			return st.nextToken();
		}

		boolean hasMoreTokens() {
			while (st == null || !st.hasMoreTokens()) {
				String s = null;
				try {
					s = br.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (s == null)
					return false;
				st = new StringTokenizer(s);
			}
			return true;
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}
	}

	public static void main(String[] args) {
		new Thread(null, new Runnable() {
			public void run() {
				new Main().runIO();
			}
		}, "1", 1 << 26).start();
	}
}