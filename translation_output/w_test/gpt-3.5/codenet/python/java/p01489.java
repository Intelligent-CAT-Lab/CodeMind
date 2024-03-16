```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        int l = 0;
        int r = k;
        while ((r - l) > 1) {
            int m = (l + r) / 2;
            if ((m * (m + 1)) < k) {
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
        if ((ad - d) > 0) {
            x += 1;
        }

        int dd;
        if (d <= (b + 1 + 1) / 2) {
            dd = d * 2 - 1;
        } else {
            int dz = (b + 1 - d);
            dd = dz * 2 + 2;
        }

        x -= (dd - 1);
        y += (dd - 1);

        int mod = 1000000007;

        int[][] mul(int[][] a, int[][] b) {
            int[][] res = new int[2][2];
            int p = 2;
            int q = 2;
            int r = 2;
            for (int s = 0; s < p; s++) {
                for (int t = 0; t < q; t++) {
                    res[s][t] = 0;
                    for (int u = 0; u < r; u++) {
                        int y = a[s][u] * b[u][t];
                        res[s][t] += y;
                    }
                    res[s][t] %= mod;
                }
            }
            return res;
        }

        int[][] fib(int x) {
            int[][] bt = {{1, 1}, {1, 0}};
            int[][] r = {{1, 1}, {1, 0}};
            while (x > 0) {
                if (x % 2 != 0) {
                    r = mul(r, bt);
                }
                bt = mul(bt, bt);
                x /= 2;
            }
            return r;
        }

        int[][] result = fib(x - 1);
        long ans = (long) result[0][0] * fib(y - 1)[0][0] % mod;

        System.out.println(ans);
    }
}
```
