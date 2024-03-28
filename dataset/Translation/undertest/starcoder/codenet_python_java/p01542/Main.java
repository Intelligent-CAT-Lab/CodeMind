import java.util.*;
import java.io.*;

public class p01542 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.next();
            if (s.equals("0")) break;
            int[] dp = new int[1024];
            dp[0] = 0;
            for (int i = 1; i < 1024; i++) {
                dp[i] = -1;
            }
            int res = -1;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '*') {
                    int l = i;
                    while (l > 0 && s.charAt(l - 1) == '0') l--;
                    int r = i;
                    while (r < s.length() - 1 && s.charAt(r + 1) == '0') r++;
                    if (l == 0 || r == s.length() - 1) {
                        dp[i] = -1;
                        continue;
                    }
                    int t = Integer.parseInt(s.substring(l, i), 2);
                    int u = Integer.parseInt(s.substring(i + 1, r + 1), 2);
                    int tu = t * u;
                    if (t < 0 || t >= 1024 || u < 0 || u >= 1024 || tu < 0 || tu >= 1024) {
                        dp[i] = -1;
                        continue;
                    }
                    String ts = Integer.toBinaryString(tu);
                    for (int j = 0; j < ts.length(); j++) {
                        if (ts.charAt(j) == '1') {
                            if (dp[l - 1] == -1) {
                                dp[i] = -1;
                                break;
                            }
                            dp[i] = dp[l - 1] + 1;
                            break;
                        }
                    }
                } else if (s.charAt(i) == '+') {
                    int l = i;
                    while (l > 0 && s.charAt(l - 1) == '0') l--;
                    int r = i;
                    while (r < s.length() - 1 && s.charAt(r + 1) == '0') r++;
                    if (l == 0 || r == s.length() - 1) {
                        dp[i] = -1;
                        continue;
                    }
                    int t = Integer.parseInt(s.substring(l, i), 2);
                    int u = Integer.parseInt(s.substring(i + 1, r + 1), 2);
                    int tu = t + u;
                    if (t <