import java.util.*;
import java.io.*;

public class p01783 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = s.length();
        Map<String, Integer> fm = new HashMap<>();
        fm.put("", -1);
        int[] dp = new int[l+1];
        dp[0] = -1;
        for (int i = 0; i < l; i++) {
            dp[i+1] = -1;
        }
        for (int i = 0; i < l; i++) {
            if (dp[i] >= 0) {
                continue;
            }
            if (i > 5 && s.charAt(i-1) == '?' && s.charAt(i+1) == '?') {
                if (s.charAt(i-2) == 'R') {
                    for (int j = i+2; j < l; j++) {
                        if (s.charAt(j) == ',') {
                            continue;
                        }
                        String t = s.substring(i+2, j);
                        int tl = dp[i+2];
                        int tr = dp[j+1];
                        if (tl >= 0 && tr >= 0 && dp[i] < tr) {
                            dp[i] = tr;
                        }
                    }
                }
                if (s.charAt(i-2) == 'L') {
                    for (int j = i+2; j < l; j++) {
                        if (s.charAt(j) == ',') {
                            continue;
                        }
                        String t = s.substring(i+2, j);
                        int tl = dp[i+2];
                        int tr = dp[j+1];
                        if (tl >= 0 && tr >= 0 && dp[i] < tl) {
                            dp[i] = tl;
                        }
                    }
                }
            }
            if (s.charAt(i) == '0' && i < l-1) {
                dp[i+1] = -1;
                continue;
            }
            boolean ff = true;
            for (char tc : "RL,()".toCharArray()) {
                if (tc == s.charAt(i)) {
                    ff = false;
                    break;
                }
            }
            if (ff) {
                dp[i+1] = Integer.parseInt(s.substring(0, i+1).replace("?", "9"));
            }
        }
        int r = dp[l];
        if (r < 0) {
            System.out.println("invalid");
            return;
        }
        System.out.println(r);
    }
}