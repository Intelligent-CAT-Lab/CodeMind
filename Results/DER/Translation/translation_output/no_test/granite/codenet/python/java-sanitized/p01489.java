import java.util.*;
import java.io.*;

public class p01489 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        int l = 0, r = k;
        while (r - l > 1) {
            int m = (l + r) / 2;
            if (m * (m + 1) < k) {
                l = m;
            } else {
                r = m;
            }
        }
        int b = l;
        int ad = k - (b * (b + 1));
        int d = ((ad - 1) % (b + 1)) + 1;
        int x = 2 * b + 1;
        int y = 1;
        if (ad - d > 0) {
            x += 1;
        }
        if (d <= (b + 1 + 1) / 2) {
            int dd = d * 2 - 1;
        } else {
            int dz = (b + 1 - d);
            int dd = dz * 2 + 2;
        }
        x -= (dd - 1);
        y += (dd - 1);
        int mod = 1000000007;
        int[][] bt = {{1, 1}, {1, 0}};
        int[][] r = {{1, 1}, {1, 0}};
        while (x > 0) {
            if (x % 2!= 0) {
                r = mul(r, bt);
            }
            bt = mul(bt, bt);
            x /= 2;
        }
        int ans = fib(x - 1) * fib(y - 1);
        ans %= mod;
        System.out.println(ans);
    }

    public static int[][] mul(int[][] a, int[][] b) {
        int[][] res = new int[2][2];
        int p = 2, q = 2, r = 2;
        for (int s = 0; s < p; s++) {
            for (int t = 0; t < q; t++) {
                res[s][t] = 0;
                for (int u = 0; u < r; u++) {
                    int y = a[s][u] * b[u][t];
                    res[s][t] += y;
                }
                res[s][t] %= 1000000007;
            }
        }
        return res;
    }

    public static int fib(int x) {
        int[][] bt = {{1, 1}, {1, 0}};
        int[][] r = {{1, 1}, {1, 0}};
        while (x > 0) {
            if (x % 2!= 0) {
                r = mul(r, bt);
            }
            bt = mul(bt, bt);
            x /= 2;
        }
        return r[0][0];
    }
}