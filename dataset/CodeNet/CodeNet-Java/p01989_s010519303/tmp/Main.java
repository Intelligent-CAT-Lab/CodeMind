import java.util.*;

public class Main {
    static long[][] dp;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
System.out.println("[INST]6;s;sc.next();"+s);
		dp = new long[5][s.length() + 1];
System.out.println("[INST]7;None;s.length();"+s.length());
		for (int i = 0; i < 5; i++) {
		    Arrays.fill(dp[i], -1L);
System.out.println("[INST]9;None;Arrays.fill(dp[i], -1L);"+Arrays.fill(dp[i], -1L));
		}
		System.out.println(getCount(4, s));
	}
	
	static long getCount(int size, String s) {
	    if (dp[size][s.length()] != -1) {
System.out.println("[INST]15;None;s.length();"+s.length());
	        return dp[size][s.length()];
System.out.println("[INST]16;None;s.length();"+s.length());
	    }
	    if (size == 1) {
	        long ans = 0;
	        if (s.length() > 3 || s.length() <= 0) {
System.out.println("[INST]20;None;s.length();"+s.length());
System.out.println("[INST]20;None;s.length();"+s.length());
	        } else if (s.length() > 1 && s.charAt(0) == '0') {
System.out.println("[INST]21;None;s.length();"+s.length());
System.out.println("[INST]21;None;s.charAt(0);"+s.charAt(0));
	        } else {
    	        int x = Integer.parseInt(s);
System.out.println("[INST]23;x;Integer.parseInt(s);"+x);
    	        if (x > 255) {
    	            
    	        } else {
	                ans = 1;
    	        }
	        }
	        dp[size][s.length()] = ans;
System.out.println("[INST]30;None;s.length();"+s.length());
	        return ans;
	    }
	    long ans = 0;
	    for (int i = 1; i <= 3 && i < s.length(); i++) {
System.out.println("[INST]34;None;s.length();"+s.length());
	        if (i > 1 && s.charAt(0) == '0') {
System.out.println("[INST]35;None;s.charAt(0);"+s.charAt(0));
	            break;
	        }
	        if (i == 3 && Integer.parseInt(s.substring(0, 3)) > 255) {
System.out.println("[INST]38;None;Integer.parseInt(s.substring(0, 3));"+Integer.parseInt(s.substring(0, 3)));
System.out.println("[INST]38;None;s.substring(0, 3);"+s.substring(0, 3));
	            break;
	        }
	        ans += getCount(size - 1, s.substring(i, s.length()));
System.out.println("[INST]41;None;s.substring(i, s.length());"+s.substring(i, s.length()));
System.out.println("[INST]41;None;s.length();"+s.length());
	    }
	    dp[size][s.length()] = ans;
System.out.println("[INST]43;None;s.length();"+s.length());
	    return ans;
	}
}

