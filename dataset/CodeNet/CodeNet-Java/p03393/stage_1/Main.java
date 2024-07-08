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
var newVariable_0 = set.add(ch);		String line = readLine();
var newVariable_1 = line.length();		for (int i = 0; i < newVariable_1; i++) {
			char ch = line.charAt(i);
var newVariable_2 = set.remove(ch);		}
var newVariable_3 = set.size();		if (newVariable_3 > 0) {
			StringBuilder sb = new StringBuilder();
var newVariable_4 = sb.append(line);var newVariable_5 = set.iterator();			sb.append(newVariable_5.next());
var newVariable_6 = sb.toString();			pln(newVariable_6);
			return;
		}
var newVariable_7 = "zyxwvutsrqponmlkjihgfedcba".equals(line);		if (newVariable_7) {
			pln(-1);
			return;
		}
		next(line, "");
	}

	boolean next(String line, String cur) {
var newVariable_8 = line.substring(0, cur.length()).compareTo(cur);var newVariable_9 = line.substring(0, cur.length());var newVariable_10 = cur.length();		if (line.substring(0, newVariable_10).compareTo(cur) > 0)
			return false;
var newVariable_11 = line.length();var newVariable_12 = cur.length();		if (line.length() == newVariable_12) {
var newVariable_13 = line.compareTo(cur);			if (newVariable_13 < 0) {
var newVariable_14 = line.length();				for (int i = 0; i < newVariable_14; i++) {
var newVariable_15 = cur.charAt(i);					p(newVariable_15);
var newVariable_16 = line.charAt(i);var newVariable_17 = cur.charAt(i);					if (line.charAt(i) != newVariable_17) {
						break;
					}
				}
				pln("");
				return true;
			} else
				return false;
		}
		for (char ch = 'a'; ch <= 'z'; ch++) {
var newVariable_18 = cur.indexOf(ch);			if (newVariable_18 < 0) {
var newVariable_19 = String.valueOf(ch);				if (next(line, cur + newVariable_19))
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
var newVariable_20 = Integer.parseInt(s);		return newVariable_20;
	}

	long plong(String s) {
var newVariable_21 = Long.parseLong(s);		return newVariable_21;
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
var newVariable_22 = line.split(" ");		return newVariable_22;
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
		_in = new BufferedReader(new InputStreamReader(System.in));
		_out = new PrintWriter(System.out);
		new Main().solve();
		_out.flush();
		long end = System.currentTimeMillis();
		if (_bElapsed)
			System.err.println((end - start) + "ms");
	}
}
