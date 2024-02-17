import java.util.*;

public class Main {
    static long[][] dp;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		dp = new long[5][s.length() + 1];
		for (int i = 0; i < 5; i++) {
		    Arrays.fill(dp[i], -1L);
		}
		System.out.println(getCount(4, s));
	}
	
	static long getCount(int size, String s) {
	    if (dp[size][s.length()] != -1) {
	        return dp[size][s.length()];
	    }
	    if (size == 1) {
	        long ans = 0;
	        if (s.length() > 3 || s.length() <= 0) {
	        } else if (s.length() > 1 && s.charAt(0) == '0') {
	        } else {
    	        int x = Integer.parseInt(s);
    	        if (x > 255) {
    	            
    	        } else {
	                ans = 1;
    	        }
	        }
	        dp[size][s.length()] = ans;
	        return ans;
	    }
	    long ans = 0;
	    for (int i = 1; i <= 3 && i < s.length(); i++) {
	        if (i > 1 && s.charAt(0) == '0') {
	            break;
	        }
	        if (i == 3 && Integer.parseInt(s.substring(0, 3)) > 255) {
	            break;
	        }
	        ans += getCount(size - 1, s.substring(i, s.length()));
	    }
	    dp[size][s.length()] = ans;
	    return ans;
	}
}

