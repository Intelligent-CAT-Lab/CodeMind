import java.math.BigInteger;
import java.util.Scanner;

public class p03016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l, a, b, m;
        l = scanner.nextInt();
        a = scanner.nextInt();
        b = scanner.nextInt();
        m = scanner.nextInt();

        int first_d = String.valueOf(a).length();
        int tail = a + b * (l - 1);

        int lo = -1;
        int[][] state = {{0, a % m, 1}};

        for (int d = first_d; d < 19; d++) {
            int hi = (int) Math.pow(10, d, m) - a / b - 1;
            int cnt = hi - lo;
            int[][] coe = {{Math.pow(10, d, m), 0, 0},
                            {1, 1, 0},
                            {0, b % m, 1}};

            coe = exp_np(coe, cnt, m);
            state = multiply(state, coe);

            lo = hi;
            if (hi == l - 1) {
                break;
            }
        }

        System.out.println(state[0][0]);
    }

    public static int[][] exp_np(int[][] coe, int cnt, int mod) {
        int[][] r = new int[coe[0].length][mod];
        int[][] t = new int[coe.length][mod];
        for (int i = 0; i < coe.length; i++) {
            System.arraycopy(coe[i], 0, t[i], 0, coe[i].length);
        }
        while (cnt > 0) {
            if (cnt % 2 == 1) {
                multiply(r, t);
                int powMod = (int) Math.pow(mod, 2, mod);
                for (int i = 0; i < r.length; i++) {
                    for (int j = 0; j < r[i].length; j++) {
                        r[i][j] = (r[i][j] + t[i][j] * powMod) % mod;
                    }
                }
            }
            multiply(t, t);
            cnt >>= 1;
        }
        return r;
    }

    public static void multiply(int[][] a, int[][] b) {
        int[][] result = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < b.length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] %= mod;
            }
        }
    }

    private static final int mod = 1000000007;
}