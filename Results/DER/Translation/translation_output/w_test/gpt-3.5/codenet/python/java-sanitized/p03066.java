import java.util.*;

public class p03066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int mod = 998244353;
        long[] fac = new long[N + 10];
        long[] inv = new long[N + 10];

        long f = 1;
        fac[0] = 1;
        for (int m = 1; m <= N; m++) {
            f = (f * m) % mod;
            fac[m] = f;
        }

        long invF = pow(f, mod - 2, mod);
        inv[N] = invF;
        for (int m = N; m >= 1; m--) {
            invF = (invF * m) % mod;
            inv[m - 1] = invF;
        }

        long ans = 0;

        for (int two = 0; two <= N; two++) {
            for (int one = 0; one <= N; one++) {
                if (one + two > N) {
                    break;
                }

                int dist = one + two * 2;
                long zero = modnCr(N, one + two, mod, fac, inv);

                long now = 0;
                if (dist < X) {
                    now = (modnCr(one + two, one, mod, fac, inv) * zero) % mod;
                } else if (dist == X) {
                    continue;
                } else if (dist < 2 * X) {
                    if ((dist - X) % 2 == 0) {
                        continue;
                    }
                    int dtwo = two - (dist - X + 1);
                    if (dtwo >= 0) {
                        now = (modnCr(one + dtwo, one, mod, fac, inv) * zero) % mod;
                    }
                } else if (X % 2 == 1 && one == 0) {
                    now = zero;
                }

                ans += now;
                ans %= mod;
            }
        }

        System.out.println(ans);
    }

    public static long pow(long base, long exponent, int mod) {
        long result = 1;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exponent /= 2;
        }
        return result;
    }

    public static long modnCr(int n, int r, int mod, long[] fac, long[] inv) {
        return (fac[n] * ((inv[n - r] * inv[r]) % mod)) % mod;
    }
}