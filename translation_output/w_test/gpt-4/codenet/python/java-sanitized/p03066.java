import java.util.Scanner;

public class p03066 {
    static final int MOD = 998244353;
    static long[] fac, inv;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        sc.close();
        
        prepareFactorials(N + 10);
        long ans = 0;

        for (int two = 0; two <= N; two++) {
            for (int one = 0; one <= N; one++) {
                if (one + two > N) {
                    break;
                }

                int dist = one + two * 2;
                long zero = modnCr(N, one + two);
                long now = 0;

                if (dist < X) {
                    now = modnCr(one + two, one) * zero % MOD;
                } else if (dist == X) {
                    continue;
                } else if (dist < 2 * X) {
                    if ((dist - X) % 2 == 0) {
                        continue;
                    }
                    int dtwo = two - (dist - X + 1);
                    if (dtwo >= 0) {
                        now = modnCr(one + dtwo, one) * zero % MOD;
                    }
                } else if (X % 2 == 1 && one == 0) {
                    now = zero;
                }

                ans += now;
                ans %= MOD;
            }
        }

        System.out.println(ans);
    }

    static void prepareFactorials(int n) {
        fac = new long[n+1];
        inv = new long[n+1];
        fac[0] = 1;
        for (int i = 1; i <= n; i++) {
            fac[i] = fac[i-1] * i % MOD;
        }
        inv[n] = modInverse(fac[n]);
        for (int i = n; i > 0; i--) {
            inv[i-1] = inv[i] * i % MOD;
        }
    }

    static long modInverse(long a) {
        return modPow(a, MOD - 2);
    }

    static long modPow(long base, int exp) {
        long res = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                res = res * base % MOD;
            }
            base = base * base % MOD;
            exp >>= 1;
        }
        return res;
    }

    static long modnCr(int n, int r) {
        return fac[n] * inv[n - r] % MOD * inv[r] % MOD;
    }
}