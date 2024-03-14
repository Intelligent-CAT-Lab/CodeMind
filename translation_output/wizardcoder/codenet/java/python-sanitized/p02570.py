import java.util.*;
import java.util.Map.Entry;

import java.io.*;

public class p02570 {
	static int[] a;
	static long[] memo;
	static long[] cum;

	static long dp(int idx) {
		if (idx == a.length)
			return 0;
		if (memo[idx]!= -1)
			return memo[idx];
		long ans = Long.MAX_VALUE / 2;
		if (idx!= a.length - 1) {
			ans = Math.min(a[idx] + a[idx + 1] + cum[idx + 2] + dp(idx + 2), cum[idx + 1] + dp(idx + 1));
		} else {
			ans = cum[idx + 1] + dp(idx + 1);
		}
		return