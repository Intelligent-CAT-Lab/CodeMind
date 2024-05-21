import java.util.*;

public class p02653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int p = 1000000007;
        long[] xs0 = new long[n+1];
        long[] os0 = new long[n+1];
        os0[0] = 1;
        for (int i = b; i < a; i++) {
            for (int j = b; j <= i; j++) {
                xs0[i] += os0[i-j];
                xs0[i] %= p;
            }
            for (int j = 1; j <= i; j++) {
                os0[i] += xs0[i-j];
                os0[i] %= p;
            }
        }
        long[] os = new long[a];
        for (int i = b; i < a; i++) {
            for (int j = 2; j < a-i; j++) {
                os[i+j] += xs0[i] * (j-1);
                os[i+j] %= p;
            }
        }
        long[] x = new long[n+1];
        long[] o = new long[n+1];
        x[0] = 1;
        o[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < Math.min(b, i+1); j++) {
                x[i] += o[i-j];
                x[i] %= p;
            }
            for (int j = 1; j < Math.min(a, i+1); j++) {
                o[i] += x[i-j];
                o[i] %= p;
            }
            for (int j = b+2; j < Math.min(a, i+1); j++) {
                o[i] += x[i-j] * os[j];
                o[i] %= p;
            }
        }
        long ans = o[n] + x[n];
        ans %= p;
        long[] beki2 = new long[5001];
        beki2[0] = 1;
        for (int i = 1; i <= 5000; i++) {
            beki2[i] = beki2[i-1] * 2;
            beki2[i] %= p;
        }
        ans = beki2[n] - ans;
        ans += p;
        ans %= p;
        System.out.println(ans);
    }
}