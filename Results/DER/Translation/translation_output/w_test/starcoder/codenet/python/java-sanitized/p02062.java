import java.util.*;
import java.io.*;

public class p02062 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = s.length();
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2; i<=n; i++) {
            if(s.charAt(i-1) == '?') {
                dp[i] = 1;
            } else if(s.charAt(i-1) == '|') {
                dp[i] = Math.min(dp[i-1], dp[i-2]+1);
            } else if(s.charAt(i-1) == '&') {
                dp[i] = Math.min(dp[i-1], dp[i-2]);
            }
        }
        System.out.println(dp[n]);
    }
}