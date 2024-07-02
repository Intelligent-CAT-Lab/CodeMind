import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	final int _intMax = Integer.MAX_VALUE; // =2147483647>10^9
	final int _intMin = Integer.MIN_VALUE;
	final long _longMax = Long.MAX_VALUE; // =9223372036854775807L>10^18
	final long _longMin = Long.MIN_VALUE;

	void solve() {
		Set<Character> set = new TreeSet<>();
		for (char ch = 'a'; ch <= 'z'; ch++)
			set.add(ch);
System.out.println("[INST]16;None;set.add(ch);"+set.add(ch));
		String line = readLine();
		for (int i = 0; i < line.length(); i++) {
System.out.println("[INST]18;None;line.length();"+line.length());
			char ch = line.charAt(i);
System.out.println("[INST]19;ch;line.charAt(i);"+ch);
			set.remove(ch);
System.out.println("[INST]20;None;set.remove(ch);"+set.remove(ch));
		}
		if (set.size() > 0) {
System.out.println("[INST]22;None;set.size();"+set.size());
			StringBuilder sb = new StringBuilder();
			sb.append(line);
System.out.println("[INST]24;None;sb.append(line);"+sb.append(line));
			sb.append(set.iterator().next());
System.out.println("[INST]25;None;set.iterator();"+set.iterator());
			pln(sb.toString());
System.out.println("[INST]26;None;sb.toString();"+sb.toString());
			return;
		}
		if ("zyxwvutsrqponmlkjihgfedcba".equals(line)) {
System.out.println("[INST]29;None;'zyxwvutsrqponmlkjihgfedcba'.equals(line);"+"zyxwvutsrqponmlkjihgfedcba".equals(line));
			pln(-1);
			return;
		}
		next(line, "");
	}

	boolean next(String line, String cur) {
		if (line.substring(0, cur.length()).compareTo(cur) > 0)
System.out.println("[INST]37;None;line.substring(0, cur.length()).compareTo(cur);"+line.substring(0, cur.length()).compareTo(cur));
System.out.println("[INST]37;None;line.substring(0, cur.length());"+line.substring(0, cur.length()));
System.out.println("[INST]37;None;cur.length();"+cur.length());
			return false;
		if (line.length() == cur.length()) {
System.out.println("[INST]39;None;line.length();"+line.length());
System.out.println("[INST]39;None;cur.length();"+cur.length());
			if (line.compareTo(cur) < 0) {
System.out.println("[INST]40;None;line.compareTo(cur);"+line.compareTo(cur));
				for (int i = 0; i < line.length(); i++) {
System.out.println("[INST]41;None;line.length();"+line.length());
					p(cur.charAt(i));
System.out.println("[INST]42;None;cur.charAt(i);"+cur.charAt(i));
					if (line.charAt(i) != cur.charAt(i)) {
System.out.println("[INST]43;None;line.charAt(i);"+line.charAt(i));
System.out.println("[INST]43;None;cur.charAt(i);"+cur.charAt(i));
						break;
					}
				}
				pln("");
				return true;
			} else
				return false;
		}
		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (cur.indexOf(ch) < 0) {
System.out.println("[INST]53;None;cur.indexOf(ch);"+cur.indexOf(ch));
				if (next(line, cur + String.valueOf(ch)))
System.out.println("[INST]54;None;String.valueOf(ch);"+String.valueOf(ch));
					return true;
			}
		}
		return false;
	}

	// -----------------------------------------------------
	// 2018/04/26 r2
	// -----------------------------------------------------
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

	int pint(String s) {
		return Integer.parseInt(s);
System.out.println("[INST]89;None;Integer.parseInt(s);"+Integer.parseInt(s));
	}

	long plong(String s) {
		return Long.parseLong(s);
System.out.println("[INST]93;None;Long.parseLong(s);"+Long.parseLong(s));
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
System.out.println("[INST]116;None;line.split(' ');"+line.split(" "));
	}

	int[] readNums() {
		String[] flds = readFlds();
		int[] nums = new int[flds.length];
		for (int i = 0; i < flds.length; i++)
			nums[i] = pint(flds[i]);
		return nums;
	}

	long[] readLongs() {
		String[] flds = readFlds();
		long[] nums = new long[flds.length];
		for (int i = 0; i < flds.length; i++)
			nums[i] = plong(flds[i]);
		return nums;
	}

	void p(char c) {
		_out.print(c);
	}

	void pln(char c) {
		_out.println(c);
	}

	void p(double d) {
		_out.print(d);
	}

	void pln(double d) {
		_out.println(d);
	}

	void p(long l) {
		_out.print(l);
	}

	void pln(long l) {
		_out.println(l);
	}

	void p(String s) {
		_out.print(s);
	}

	void pln(String s) {
		_out.println(s);
	}

	void pln(int[] ia) {
		for (int i = 0; i < ia.length; i++)
			pln(ia[i]);
	}

	void pln(long[] la) {
		for (int i = 0; i < la.length; i++)
			pln(la[i]);
	}

	static BufferedReader _in;
	static PrintWriter _out;
	static boolean _bElapsed = false;

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
System.out.println("[INST]182;start;System.currentTimeMillis();"+start);
		_in = new BufferedReader(new InputStreamReader(System.in));
		_out = new PrintWriter(System.out);
		new Main().solve();
		_out.flush();
System.out.println("[INST]186;None;_out.flush();"+_out.flush());
		long end = System.currentTimeMillis();
System.out.println("[INST]187;end;System.currentTimeMillis();"+end);
		if (_bElapsed)
			System.err.println((end - start) + "ms");
	}
}
