import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Set;
import java.util.TreeSet;

public class p03393 {
	final int _intMax = Integer.MAX_VALUE; // =2147483647>10^9
	final int _intMin = Integer.MIN_VALUE;
	final long _longMax = Long.MAX_VALUE; // =9223372036854775807L>10^18
	final long _longMin = Long.MIN_VALUE;

	void solve() {
		Set<Character> set = new TreeSet<>();
		for (char ch = 'a'; ch <= 'z'; ch++)
			set.add(ch);
		String line = readLine();
		for (int i = 0; i < line.length(); i++) {
			char ch = line.charAt(i);
			set.remove(ch);
		}
		if (set.size() > 0) {
			StringBuilder sb = new StringBuilder();
			sb.append(line);
			sb.append(set.iterator().next());
			pln(sb.toString());
			return;
		}
		if ("zyxwvutsrqponmlkjihgfedcba".equals(line)) {
			pln(-1);
			return;
		}
		next(line, "");
	}

	boolean next(String line, String cur) {
		if (line.substring(0, cur.length()).compareTo(cur) > 0)
			return false;
		if (line.length() == cur.length()) {
			if (line.compareTo(cur) < 0) {
				for (int i = 0; i < line.length(); i++) {
					p(cur.charAt(i));
					if (line.charAt(i)!= cur.charAt(i)) {
						break;
					}
				}
				pln("");
				return true;
			} else
				return false;
		}
		for (char ch = 'a'; ch <= 'z'; ch++) {