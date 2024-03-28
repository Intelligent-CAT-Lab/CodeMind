import java.util.*;
import java.io.*;

public class p01783 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = s.length();
        int[] dp = new int[l+1];
        dp[0] = -1;
        for(int i=0;i<l;i++) {
            dp[i+1] = -1;
        }
        for(int i=0;i<l;i++) {
            if(i+1<l && s.charAt(i+1)=='?' && s.charAt(i)=='?') {
                if(s.charAt(i-1)=='R') {
                    for(int j=i+2;j<l;j++) {
                        if(s.charAt(j)=='?') {
                            int tl = dp[i+2];
                            int tr = dp[j+1];
                            if(tl>=0 && tr>=0 && dp[i+1]<tr) {
                                dp[i+1] = tr;
                            }
                        }
                    }
                }
                if(s.charAt(i-1)=='L') {
                    for(int j=i+2;j<l;j++) {
                        if(s.charAt(j)=='?') {
                            int tl = dp[i+2];
                            int tr = dp[j+1];
                            if(tl>=0 && tr>=0 && dp[i+1]<tl) {
                                dp[i+1] = tl;
                            }
                        }
                    }
                }
            }
        }
        if(dp[l]>=0) {
            System.out.println(dp[l]);
        } else {
            System.out.println("invalid");
        }
    }
}