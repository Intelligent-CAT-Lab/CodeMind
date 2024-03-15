```java
import java.util.*;
import java.io.*;

public class Main {
    static final int mod = 1000000007;
    static final int inf = 1000000000;
    static final double eps = 1.0 / 10000000000.0;
    static final int[][] dd = new int[][]{ {-1, 0}, {0, 1}, {1, 0}, {0, -1} };
    static final int[][] ddn = new int[][]{ {-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1} };

    static int[] cm;
    static int cms = 1000000;

    static void combInit() {
        for (int i = 0; i < cms; i++) {
            cm[i] = 0;
        }
        cm[0] = 1;
        for (int i = 1; i < cms; i++) {
            cm[i] = (int)(((long)cm[i-1] * i) % mod);
        }
    }

    static int comb(int a, int b) {
        return (int)((((long)cm[a] * inv(cm[a - b]) % mod) * inv(cm[b])) % mod);
    }

    static int inv(int x) {
        return pow(x, mod - 2, mod);
    }

    static int pow(int x, int y, int m) {
        int res = 1;
        while (y > 0) {
            if (y % 2 == 1) {
                res = (int)(((long)res * x) % m);
            }
            x = (int)(((long)x * x) % m);
            y /= 2;
        }
        return res;
    }

    static int main() {
        List<Integer> rr = new ArrayList<>();

        int f(int n, int m, int k) {
            combInit();
            int r = 0;
            for (int i = 0; i <= k; i++) {
                int j = k - i;
                int mt = comb(n+m+k*2, n+i*2);
                int lk = 1, rk = 1;
                if (i > 0) {
                    lk = (comb(n+i*2, i) - comb(n+i*2, i-1) + mod) % mod;
                }
                if (j > 0) {
                    rk = (comb(m+j*2, j) - comb(m+j*2, j-1) + mod) % mod;
                }
                r = (int)(((long)r + (long)mt * (long)lk * (long)rk % mod) % mod);
            }
            return r;
        }

        while (true) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();
            if (n == 0) {
                break;
            }
            rr.add(f(n, m, k));
            break;
        }

        for (int res : rr) {
            System.out.println(res);
        }

        return 0;
    }

    public static void main(String[] args) {
        main();
    }
}
```
