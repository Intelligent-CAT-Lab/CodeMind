import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solver();
	}

	static void solver() {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
System.out.println("[INST]10;None;sc.hasNext();"+sc.hasNext());
			int n = sc.nextInt();
System.out.println("[INST]11;n;sc.nextInt();"+n);
			if (n == 0)
				return;
			String[] s = new String[n];
			for (int i = 0; i < n; i++) {
				s[i] = sc.next();
System.out.println("[INST]16;None;sc.next();"+sc.next());
			}
			int bit = (1 << n) - 1;
			boolean[] unvalid = new boolean[n];
			for (int i = 0; i < n; i++) {
				if (((bit >> i) & 1) == 0)
					continue;
				for (int j = 0; j < n; j++) {
					if (i == j)
						continue;
					if (((bit >> j) & 1) == 0)
						continue;
					out: for (int k = 0; k < s[j].length(); k++) {
System.out.println("[INST]28;None;s[j].length();"+s[j].length());
						if (s[i].length() > s[j].length())
System.out.println("[INST]29;None;s[i].length();"+s[i].length());
System.out.println("[INST]29;None;s[j].length();"+s[j].length());
							continue;
						if (k + s[i].length() > s[j].length())
System.out.println("[INST]31;None;s[i].length();"+s[i].length());
System.out.println("[INST]31;None;s[j].length();"+s[j].length());
							continue;
						String sj = s[j].substring(k, k + s[i].length());
System.out.println("[INST]33;sj;s[j].substring(k, k + s[i].length());"+sj);
System.out.println("[INST]33;None;s[i].length();"+s[i].length());
						if (sj.equals(s[i])) {
System.out.println("[INST]34;None;sj.equals(s[i]);"+sj.equals(s[i]));
							bit = ~((~(bit)) | (1 << i));
							break out;
						}
					}
				}
			}
			memo = new int[1 << n][n];
			for (int i = 0; i < memo.length; i++) {
				for (int j = 0; j < memo[0].length; j++) {
					memo[i][j] = -1;
				}
			}
			int min = Integer.MAX_VALUE/4;
			for (int i = 0; i < n; i++) {
				if (((bit >> i) & 1) == 1) {
					int d = ~((~bit) | (1 << i));
					min = Math.min(min, dp(d, i, n, unvalid, s));
				}
			}
			System.out.println(min);
		}
	}

	static int[][] memo;

	// state:0 indexed num is used
	// 1 indexed num is unused
	// return min value of the lenght of state + tail 
	static int dp(int state, int tail, int n, boolean[] unvalid, String[] s) {
		if (Integer.bitCount(state) == 0)
System.out.println("[INST]64;None;Integer.bitCount(state);"+Integer.bitCount(state));
			return s[tail].length();
System.out.println("[INST]65;None;s[tail].length();"+s[tail].length());
		if (memo[state][tail] != -1) {
			return memo[state][tail];
		}
		int min = Integer.MAX_VALUE/4;
		for (int i = 0; i < n; i++) {
			if ((((state >> i) & 1) == 1) && (!unvalid[i])) {
				int bit = ~((~state) | (1 << i));
				min = Math.min(min, dp(bit, i, n, unvalid, s) - same_length(s[i], s[tail]) + s[tail].length());
System.out.println("[INST]73;None;s[tail].length();"+s[tail].length());
			}
		}
		memo[state][tail] = min;
		return min;
	}

	static int same_length(String bottom, String tail) {
		int max = 0;
		for (int i = 0; i < bottom.length(); i++) {
System.out.println("[INST]82;None;bottom.length();"+bottom.length());
			int add = 0;
			while (bottom.charAt(i + add) == tail.charAt(add)) {
System.out.println("[INST]84;None;bottom.charAt(i + add);"+bottom.charAt(i + add));
System.out.println("[INST]84;None;tail.charAt(add);"+tail.charAt(add));
				if (i + add == bottom.length() - 1) {
System.out.println("[INST]85;None;bottom.length();"+bottom.length());
					max = Math.max(add + 1, max);
System.out.println("[INST]86;max;Math.max(add + 1, max);"+max);
					break;
				} else if (add == tail.length() - 1) {
System.out.println("[INST]88;None;tail.length();"+tail.length());
					break;
				} else {
					add++;
				}
			}
		}
		return max;
	}

	static void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}