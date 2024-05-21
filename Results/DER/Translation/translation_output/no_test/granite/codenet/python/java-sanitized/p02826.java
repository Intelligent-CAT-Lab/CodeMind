import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p02826 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int mod = Integer.parseInt(in[1]);

        long[] fact = new long[n + 1];
        long[] factInv = new long[n + 1];
        fact[0] = 1;
        factInv[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i - 1] * i % mod;
            factInv[i] = pow(fact[i], mod - 2, mod);
        }

        long[] inv = new long[n + 1];
        inv[1] = 1;
        for (int i = 2; i <= n; i++) {
            inv[i] = (mod - mod / i) * inv[mod % i] % mod;
        }

        long[] f = new long[n + 1];
        for (int i = 1; i <= n / 2; i++) {
            for (int j = i; j <= n; j += i) {
                f[j] += 2 * inv[i] % mod;
                f[j] %= mod;
            }
        }
        if (n % 2 == 1) {
            int i = (n + 1) / 2;
            for (int j = i; j <= n; j += i) {
                f[j] += inv[i];
                f[j] %= mod;
            }
        }

        long[] g = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            g[i] = pow(f[i], n, mod);
        }

        long[] h = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j += i) {
                h[i] += f[j] * inv[j / i] % mod;
                h[i] %= mod;
            }
        }

        long[] ans = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            ans[i] = g[i] * h[i] % mod;
        }

        System.out.println(Arrays.stream(ans).sum() % mod);
    }

    static long pow(long a, long n, long mod) {
        long res = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                res = res * a % mod;
            }
            a = a * a % mod;
            n >>= 1;
        }
        return res;
    }
}