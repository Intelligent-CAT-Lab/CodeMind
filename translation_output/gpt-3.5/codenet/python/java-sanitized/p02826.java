import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p02826 {
    
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }

    static int MOD;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();

        int N = sc.nextInt();
        MOD = sc.nextInt();

        int U = 100000;
        long[] fact = makeFact(U);
        long[] factInv = new long[U + 1];
        factInv[0] = 1;
        for (int i = 1; i <= U; i++) {
            factInv[i] = pow(fact[i], MOD - 2, MOD);
        }

        long[] inv = new long[U + 1];
        for (int i = 1; i <= U; i++) {
            inv[i] = fact[i - 1] * factInv[i] % MOD;
        }

        long[] f = new long[N + N + 10];
        for (int x = 1; x <= N / 2; x++) {
            for (int j = x; j < f.length; j += x) {
                f[j] += 2 * inv[(f.length - 1) / x + 1];
            }
        }
        if ((N & 1) == 1) {
            int x = (N + 1) / 2;
            for (int j=x; j < f.length; j += x) {
                f[j] += inv[(f.length - 1) / x + 1];
            }
        }

        long[] g = fpsExp(f);
        long answer = 0;
        for (int i = 0; i < N; i++) {
            answer += g[i];
            answer %= MOD;
        }
        System.out.println(answer);
    }

    static long[] makeFact(int U) {
        long[] fact = new long[U + 1];
        fact[0] = 1;
        for (int i = 1; i <= U; i++) {
            fact[i] = fact[i - 1] * i % MOD;
        }
        return fact;
    }

    static long pow(long base, int exp, int MOD) {
        long result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exp >>= 1;
        }
        return result;
    }

    static long[] fftConvolve(long[] f, long[] g) {
        int Lf = f.length;
        int Lg = g.length;
        int L = Lf + Lg - 1;
        int fftLen = Integer.highestOneBit(L) << 1;
        long[] fl = new long[fftLen];
        long[] fh = new long[fftLen];
        long[] gl = new long[fftLen];
        long[] gh = new long[fftLen];

        for (int i = 0; i < Lf; i++) {
            fl[i] = f[i] & ((1 << 15) - 1);
            fh[i] = f[i] >> 15;
        }
        for (int i = 0; i < Lg; i++) {
            gl[i] = g[i] & ((1 << 15) - 1);
            gh[i] = g[i] >> 15;
        }

        long[] x = convolute(fl, gl, fftLen);
        long[] y = convolute(add(fl, fh), add(gl, gh), fftLen);
        long[] z = convolute(fh, gh, fftLen);

        long[] a = new long[L];
        long[] b = new long[L];
        long[] c = new long[L];

        for (int i = 0; i < L; i++) {
            a[i] = (x[i] + 0.5) % MOD;
            b[i] = (y[i] + 0.5) % MOD;
            c[i] = (z[i] + 0.5) % MOD;
        }

        long[] result = new long[L];
        for (int i = 0; i < L; i++) {
            result[i] = (a[i] + ((b[i] - a[i] - c[i]) << 15) + (c[i] << 30)) % MOD;
        }

        return result;
    }

    static long[] convolute(long[] a, long[] b, int fftLen) {
        long[] fa = new long[fftLen];
        long[] fb = new long[fftLen];
        System.arraycopy(a, 0, fa, 0, a.length);
        System.arraycopy(b, 0, fb, 0, b.length);

        fft(fa, false);
        fft(fb, false);

        for (int i = 0; i < fftLen; i++) {
            fa[i] = (fa[i] * fb[i]) % MOD;
        }

        fft(fa, true);

        return fa;
    }

    static long[] add(long[] a, long[] b) {
        long[] result = new long[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = (a[i] + b[i]) % MOD;
        }
        return result;
    }

    static void fft(long[] a, boolean invert) {
        int n = a.length;
        for (int i = 1, j = 0; i < n - 1; i++) {
            for (int k = n >> 1; (j ^= k) < k; k >>= 1);
            if (i < j) {
                long temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        for (int len = 2; len <= n; len <<= 1) {
            long wlen = invert ? pow(MOD - 1, (MOD - 1) / len, MOD) : pow(3, (MOD - 1) / len, MOD);
            for (int i = 0; i < n; i += len) {
                long w = 1;
                for (int j = 0; j < len / 2; j++) {
                    long u = a[i + j];
                    long v = a[i + j + len / 2] * w % MOD;
                    a[i + j] = (u + v) % MOD;
                    a[i + j + len / 2] = (u - v + MOD) % MOD;
                    w = (w * wlen) % MOD;
                }
            }
        }

        if (invert) {
            long nInv = pow(n, MOD - 2, MOD);
            for (int i = 0; i < n; i++) {
                a[i] = (a[i] * nInv) % MOD;
            }
        }
    }

    static long[] fpsExp(long[] h) {
        int L = h.length;
        int i = Integer.highestOneBit(L - 1);
        int N = 1 << i;
        long[] hh = new long[N];
        System.arraycopy(h, 0, hh, 0, L);

        long[] dh = new long[N];
        for (int j = 0; j < N - 1; j++) {
            dh[j] = hh[j + 1] * (j + 1) % MOD;
        }

        long[] f = new long[N];
        f[0] = 1;
        f[1] = hh[1];
        long g = 1;
        int m = 2;
        while (m <= N / 2) {
            long[] fg = fftConvolve(Arrays.copyOf(f, m), Arrays.copyOf(g, m));
            long[] fgg = fftConvolve(fg, Arrays.copyOf(g, m));
            for (int j = 0; j < m; j++) {
                g[j] *= 2;
                g[j] -= fgg[j];
                g[j] %= MOD;
                if (g[j] < 0) g[j] += MOD;
            }

            long[] q = Arrays.copyOf(dh, m - 1);
            long[] s = new long[m + m];
            for (int l = 1; l < m; l++) {
                s[l] = f[l] * l % MOD;
            }

            long[] r = fftConvolve(Arrays.copyOf(f, m), q);
            for (int j = 0; j < r.length && j + 1 < s.length; j++) {
                s[j + 1] -= r[j];
                s[j + 1] %= MOD;
                if (s[j + 1] < 0) s[j + 1] += MOD;
            }
            for (int j = 0; j < m; j++) {
                s[j] += s[m + j];
                s[j] %= MOD;
                if (s[j] < 0) s[j] += MOD;
            }

            long[] t = fftConvolve(Arrays.copyOf(g, m), Arrays.copyOf(s, m));
            for (int j = 0; j < m; j++) {
                t[j] *= inv[m + j];
                t[j] %= MOD;
            }

            long[] u = Arrays.copyOfRange(hh, m, m + m);
            for (int j = 0; j < m; j++) {
                u[j] -= t[j];
                u[j] %= MOD;
                if (u[j] < 0) u[j] += MOD;
            }

            long[] v = fftConvolve(Arrays.copyOf(f, m), u);
            for (int j = 0; j < m; j++) {
                f[m + j] += v[j];
                f[m + j] %= MOD;
            }

            m *= 2;
        }

        return Arrays.copyOf(f, L);
    }

}