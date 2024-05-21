import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p03066 {
    static int N, X;
    static int MOD = 998244353;
    static long[] fac, inv;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        fac = new long[N + 10];
        inv = new long[N + 10];
        fac[0] = 1;
        fac[1] = 1;
        inv[1] = 1;
        for (int i = 2; i < N + 10; i++) {
            fac[i] = fac[i - 1] * i % MOD;
            inv[i] = power(fac[i], MOD - 2);
        }

        long ans = 0;
        for (int two = 0; two <= N; two++) {
            for (int one = 0; one <= N; one++) {
                if (one + two > N) {
                    break;
                }
                int dist = one + two * 2;
                long zero = nCr(N, one + two);
                long now = 0;
                if (dist < X) {
                    now = nCr(one + two, one) * zero % MOD;
                } else if (dist == X) {
                    continue;
                } else if (dist < 2 * X) {
                    if ((dist - X) % 2 == 0) {
                        continue;
                    }
                    int dtwo = two - (dist - X + 1);
                    if (dtwo >= 0) {
                        now = nCr(one + dtwo, one) * zero % MOD;
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

    static long nCr(int n, int r) {
        if (n < r) {
            return 0;
        }
        if (r < 0) {
            return 0;
        }
        return fac[n] * inv[r] % MOD * inv[n - r] % MOD;
    }

    static long power(long x, long n) {
        long ans = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                ans = ans * x % MOD;
            }
            x = x * x % MOD;
            n >>= 1;
        }
        return ans;
    }
}