import java.io.*;
import java.util.*;

public class Main {

	static final int P = 998244353;

	HashMap<String, Integer> map = new HashMap<>();

	int go(String s) {
		if (s.isEmpty()) {
System.out.println("[INST]10;None;s.isEmpty();"+s.isEmpty());
			return 1;
		}
		if (map.containsKey(s)) {
System.out.println("[INST]13;None;map.containsKey(s);"+map.containsKey(s));
			return map.get(s);
System.out.println("[INST]14;None;map.get(s);"+map.get(s));
		}

		long ret = (long) (1 + s.charAt(0) - '0') * go(s.substring(1)) % P;
System.out.println("[INST]17;None;s.charAt(0);"+s.charAt(0));
System.out.println("[INST]17;None;s.substring(1);"+s.substring(1));
		for (int x = 1; 2 * x <= s.length(); x++) {
System.out.println("[INST]18;None;s.length();"+s.length());
			char[] buf = s.substring(0, x).toCharArray();
System.out.println("[INST]19;buf;s.substring(0, x).toCharArray();"+buf);
System.out.println("[INST]19;None;s.substring(0, x);"+s.substring(0, x));
			for (int k = 2; x * k <= s.length(); k++) {
System.out.println("[INST]20;None;s.length();"+s.length());
				for (int i = 0; i < x; i++) {
					if (s.charAt((k - 1) * x + i) == '0') {
System.out.println("[INST]22;None;s.charAt((k - 1) * x + i);"+s.charAt((k - 1) * x + i));
						buf[i] = '0';
					}
				}
				ret += (long) go(new String(buf)) * go(s.substring(k * x)) % P;
System.out.println("[INST]26;None;s.substring(k * x);"+s.substring(k * x));
			}
		}

		int iret = (int) (ret % P);
		map.put(s, iret);
System.out.println("[INST]31;None;map.put(s, iret);"+map.put(s, iret));
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
System.out.println("[INST]77;None;st.hasMoreTokens();"+st.hasMoreTokens());
			try {
				st = new StringTokenizer(br.readLine());
System.out.println("[INST]79;None;br.readLine();"+br.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return st.nextToken();
	}

	String nextString() {
		try {
			return br.readLine();
System.out.println("[INST]89;None;br.readLine();"+br.readLine());
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
