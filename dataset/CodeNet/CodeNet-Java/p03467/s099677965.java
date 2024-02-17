import java.io.*;
import java.util.*;

public class Main {

	static final int P = 998244353;

	HashMap<String, Integer> map = new HashMap<>();

	int go(String s) {
		if (s.isEmpty()) {
			return 1;
		}
		if (map.containsKey(s)) {
			return map.get(s);
		}

		long ret = (long) (1 + s.charAt(0) - '0') * go(s.substring(1)) % P;
		for (int x = 1; 2 * x <= s.length(); x++) {
			char[] buf = s.substring(0, x).toCharArray();
			for (int k = 2; x * k <= s.length(); k++) {
				for (int i = 0; i < x; i++) {
					if (s.charAt((k - 1) * x + i) == '0') {
						buf[i] = '0';
					}
				}
				ret += (long) go(new String(buf)) * go(s.substring(k * x)) % P;
			}
		}

		int iret = (int) (ret % P);
		map.put(s, iret);
		return iret;
	}

	void submit() {
		String s = nextToken();
		out.println(go(s));
	}

	void preCalc() {

	}

	void stress() {

	}

	void test() {

	}

	Main() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		preCalc();
		submit();
		// stress();
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
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return st.nextToken();
	}

	String nextString() {
		try {
			return br.readLine();
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
