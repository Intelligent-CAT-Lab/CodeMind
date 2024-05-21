import java.util.*;
import java.io.*;

public class p01489 {
    static long mod = 1000000007;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        long l = 0, r = k;
        while (r - l > 1) {
            long m = (l + r) / 2;
            if (m * (m + 1) < k) {
                l = m;
            } else {
                r = m;
            }
        }
        long b = l;
        long ad = k - (b * (b + 1));
        long d = ((ad - 1) % (b + 1)) + 1;
        long x = 2 * b + 1;
        long y = 1;
        if (ad - d > 0) {
            x += 1;
        }
        if (d <= (b + 1 + 1) / 2) {
            long dd = d * 2 - 1;
        } else {
            long dz = (b + 1 - d);
            long dd = dz * 2 + 2;
        }
        x -= (dd - 1);
        y += (dd - 1);
        long[][] ans = fib(x - 1);
        long[][] ans2 = fib(y - 1);
        long res = (ans[0][0] * ans2[0][0]) % mod;
        System.out.println(res);
    }

    static long[][] mul(long[][] a, long[][] b) {
        long[][] res = new long[2][2];
        for (int s = 0; s < 2; s++) {
            for (int t = 0; t < 2; t++) {
                res[s][t] = 0;
                for (int u = 0; u < 2; u++) {
                    long y = a[s][u] * b[u][t];
                    res[s][t] += y;
                    res[s][t] %= mod;
                }
            }
        }
        return res;
    }

    static long[][] fib(long x) {
        long[][] bt = new long[2][2];
        long[][] r = new long[2][2];
        bt[0][0] = 1;
        bt[0][1] = 1;
        bt[1][0] = 1;
        bt[1][1] = 0;
        r[0][0] = 1;
        r[0][1] = 1;
        r[1][0] = 1;
        r[1][1] = 0;
        while (x > 0) {
            if (x % 2!= 0) {
                r = mul(r, bt);
            }
            bt = mul(bt, bt);
            x /= 2;
        }
        return r;
    }
}