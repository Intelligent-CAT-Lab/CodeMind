import java.util.*;
import java.io.*;

public class p01668 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int mod = 1000000007;
        int ans = 0;
        int pw10 = 1;
        for (int i = 0; i < 9; i++) {
            pw10 = (pw10 * 10) % mod;
        }
        int n = Math.max(a, b);
        n = Math.max(n, c);
        for (int i = 0; i < n; i++) {
            ans = (ans + (a % 10) * pw10) % mod;
            a /= 10;
            ans = (ans + (b % 10) * pw10) % mod;
            b /= 10;
            ans = (ans + (c % 10) * pw10) % mod;
            c /= 10;
        }
        System.out.println(ans);
    }
}