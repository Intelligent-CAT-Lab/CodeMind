import java.util.*;

public class p01489 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

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

        //print b
        int ad = k - (b * (b + 1));
        int d = ((ad - 1) % (b + 1)) + 1;

        //print ad,d
        int x = 2 * b + 1;
        int y = 1;
        if (ad - d > 0) {
            x += 1;
        }
        if (d <= (b + 1 + 1) / 2) {
            int dd = d * 2 - 1;
        } else {
            int dz = (b + 1 - d);
            dd = dz * 2 + 2;
        }

        x -= (dd - 1);
        y += (dd - 1);

        int mod = 1000000007;

        int[][] mul(int[][] a, int[][] b) {
            int[][] res = new int[2][2];
            for (int s = 0; s < 2; s++) {
                for (int t = 0; t < 2; t++) {
                    res[s][t] = 0;
                    for (int u = 0; u < 2; u++) {
                        int y = a[s][u] * b[u][t];
                        res[s][t] += y;
                    }
                    res[s][t] %= mod;
                }
            }
            return res;
        }

        int fib(int x) {
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

        //print x,y

        int ans = fib(x - 1) * fib(y - 1);
        ans %= mod;
        System.out.println(ans);
    }
}