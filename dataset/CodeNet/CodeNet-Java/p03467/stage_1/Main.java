import java.io.*;
import java.util.*;

public class Main {

	static final int P = 998244353;

	HashMap<String, Integer> map = new HashMap<>();

	int go(String s) {
var newVariable_0 = s.isEmpty();		if (newVariable_0) {
			return 1;
		}
var newVariable_1 = map.containsKey(s);		if (newVariable_1) {
var newVariable_2 = map.get(s);			return newVariable_2;
		}

var newVariable_3 = s.charAt(0);var newVariable_4 = s.substring(1);		long ret = (long) (1 + s.charAt(0) - '0') * go(newVariable_4) % P;
var newVariable_5 = s.length();		for (int x = 1; 2 * x <= newVariable_5; x++) {
var newVariable_6 = s.substring(0, x);			char[] buf = newVariable_6.toCharArray();
var newVariable_7 = s.length();			for (int k = 2; x * k <= newVariable_7; k++) {
				for (int i = 0; i < x; i++) {
var newVariable_8 = s.charAt((k - 1) * x + i);					if (newVariable_8 == '0') {
						buf[i] = '0';
					}
				}
var newVariable_9 = s.substring(k * x);				ret += (long) go(new String(buf)) * go(newVariable_9) % P;
			}
		}

		int iret = (int) (ret % P);
var newVariable_10 = map.put(s, iret);		return iret;
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
var newVariable_11 = st.hasMoreTokens();		while (st == null || !newVariable_11) {
			try {
var newVariable_12 = br.readLine();				st = new StringTokenizer(newVariable_12);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return st.nextToken();
	}

	String nextString() {
		try {
var newVariable_13 = br.readLine();			return newVariable_13;
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
