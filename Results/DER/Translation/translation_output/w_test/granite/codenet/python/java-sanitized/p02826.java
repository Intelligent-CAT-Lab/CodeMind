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
        long[] inv = new long[n + 1];
        fact[0] = 1;
        inv[1] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i - 1] * i % mod;
        }
        for (int i = 2; i <= n; i++) {
            inv[i] = mod - inv[mod % i] * (mod / i) % mod;
        }
        long[] f = new long[n + 1];
        for (int i = 1; i <= n / 2; i++) {
            for (int j = i; j <= n; j += i) {
                f[j] += inv[i] * 2;
                f[j] %= mod;
            }
        }
        if (n % 2 == 1) {
            for (int i = 1; i <= n; i += i) {
                f[i] += inv[i];
                f[i] %= mod;
            }
        }
        long[] g = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            g[i] = inv[i];
        }
        long[] h = multiply(f, g, mod);
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += h[i];
            ans %= mod;
        }
        System.out.println(ans);
    }

    static long[] multiply(long[] a, long[] b, int mod) {
        int n = 1;
        while (n < a.length + b.length - 1) {
            n *= 2;
        }
        long[] fa = new long[n];
        long[] fb = new long[n];
        for (int i = 0; i < a.length; i++) {
            fa[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            fb[i] = b[i];
        }
        fft(fa, false, mod);
        fft(fb, false, mod);
        for (int i = 0; i < n; i++) {
            fa[i] = fa[i] * fb[i] % mod;
        }
        fft(fa, true, mod);
        long[] ret = new long[a.length + b.length - 1];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = fa[i];
        }
        return ret;
    }

    static void fft(long[] a, boolean inverse, int mod) {
        int n = a.length;
        int m = Integer.numberOfTrailingZeros(n);
        for (int i = 0; i < n; i++) {
            int j = Integer.reverse(i) >>> (32 - m);
            if (i < j) {
                long temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        for (int len = 2; len <= n; len *= 2) {
            long w = inverse? pow(3, mod - 1 - (mod - 1) / len, mod) : pow(3, (mod - 1) / len, mod);
            for (int i = 0; i < n; i += len) {
                long wn = 1;
                for (int j = 0; j < len / 2; j++) {
                    long u = a[i + j];
                    long v = a[i + j + len / 2] * wn % mod;
                    a[i + j] = u + v;
                    a[i + j] %= mod;
                    a[i + j + len / 2] = u - v;
                    a[i + j + len / 2] += mod;
                    a[i + j + len / 2] %= mod;
                    wn = wn * w % mod;
                }
            }
        }
        if (inverse) {
            long invn = pow(n, mod - 2, mod);
            for (int i = 0; i < n; i++) {
                a[i] = a[i] * invn % mod;
            }
        }
    }

    static long pow(long a, long b, int mod) {
        long ret = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                ret = ret * a % mod;
            }
            a = a * a % mod;
            b /= 2;
        }
        return ret;
    }
}