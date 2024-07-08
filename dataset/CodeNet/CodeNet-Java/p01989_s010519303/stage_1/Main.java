import java.util.*;

public class Main {
    static long[][] dp;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
var newVariable_0 = s.length();		dp = new long[5][newVariable_0 + 1];
		for (int i = 0; i < 5; i++) {
		    Arrays.fill(dp[i], -1L);
		}
		System.out.println(getCount(4, s));
	}
	
	static long getCount(int size, String s) {
var newVariable_1 = s.length();	    if (dp[size][newVariable_1] != -1) {
var newVariable_2 = s.length();	        return dp[size][newVariable_2];
	    }
	    if (size == 1) {
	        long ans = 0;
var newVariable_3 = s.length();var newVariable_4 = s.length();	        if (newVariable_4 > 3 || newVariable_4 <= 0) {
var newVariable_5 = s.length();var newVariable_6 = s.charAt(0);	        } else if (s.length() > 1 && newVariable_6 == '0') {
	        } else {
    	        int x = Integer.parseInt(s);
    	        if (x > 255) {
    	            
    	        } else {
	                ans = 1;
    	        }
	        }
var newVariable_7 = s.length();	        dp[size][newVariable_7] = ans;
	        return ans;
	    }
	    long ans = 0;
var newVariable_8 = s.length();	    for (int i = 1; i <= 3 && i < newVariable_8; i++) {
var newVariable_9 = s.charAt(0);	        if (i > 1 && newVariable_9 == '0') {
	            break;
	        }
var newVariable_10 = Integer.parseInt(s.substring(0, 3));var newVariable_11 = s.substring(0, 3);	        if (i == 3 && Integer.parseInt(newVariable_11) > 255) {
	            break;
	        }
var newVariable_12 = s.substring(i, s.length());var newVariable_13 = s.length();	        ans += getCount(size - 1, s.substring(i, newVariable_13));
	    }
var newVariable_14 = s.length();	    dp[size][newVariable_14] = ans;
	    return ans;
	}
}

