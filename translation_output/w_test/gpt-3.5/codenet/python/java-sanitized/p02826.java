import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class p02826 {
    static int MOD;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        int N = sc.nextInt();
        MOD = sc.nextInt();

        long[] fact = makeFact(100000);
        long[] fact_inv = new long[100000+1];
        fact_inv[0] = 1;
        for (int i = 1; i <= 100000; i++) {
            fact_inv[i] = BigInteger.valueOf(fact[i - 1])
                    .modInverse(BigInteger.valueOf(MOD)).longValue();
        }

        long[] inv = new long[100000+1];
        for (int i = 1; i <= 100000; i++) {
            inv[i] = fact[i - 1] * fact_inv[i] % MOD;
        }

        int[] f = new int[N*2+10];
        for (int x = 1; x <= N/2; x++) {
            for (int i = x; i < f.length; i += x) {
                f[i] = (int)((f[i] + 2 * inv[1 + (f.length-1) / x]) % MOD);
            }
        }
        if (N % 2 == 1) {
            int x = (N+1) / 2;
            for (int i = x; i < f.length; i += x) {
                f[i] = (int)((f[i] + inv[1 + (f.length-1) / x]) % MOD);
            }
        }

        int[] g = fpsExp(f, N);
        long answer = 0;
        for (int i = 0; i < N; i++) {
            answer = (answer + g[i]) % MOD;
        }

        System.out.println(answer);
    }

    static long[] cumprod(long[] A) {
        int L = A.length;
        int Lsq = (int)Math.sqrt(L) + 1;
        long[] Aresized = Arrays.copyOf(A, Lsq * Lsq);
        long[][] A2D = new long[Lsq][Lsq];
        for (int i = 0; i < L; i++) {
            A2D[i / Lsq][i % Lsq] = Aresized[i];
        }

        for (int n = 1; n < Lsq; n++) {
            for (int row = 0; row < Lsq; row++) {
                A2D[row][n] = (A2D[row][n] * A2D[row][n - 1]) % MOD;
            }
        }

        for (int n = 1; n < Lsq; n++) {
            for (int col = 0; col < Lsq; col++) {
                A2D[n][col] = (A2D[n][col] * A2D[n - 1][Lsq - 1]) % MOD;
            }
        }

        long[] res = new long[L];
        for (int i = 0; i < L; i++) {
            res[i] = A2D[i / Lsq][i % Lsq];
        }
        return res;
    }

    static long[] makeFact(int U) {
        long[] fact = new long[U+1];
        fact[0] = 1;
        for (int i = 1; i <= U; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }
        return fact;
    }

    static int[] fftConvolve(int[] f, int[] g) {
        int Lf = f.length;
        int Lg = g.length;
        int L = Lf + Lg - 1;
        int fftLen = Integer.highestOneBit(L) << 1;

        int[] fl = new int[fftLen];
        int[] fh = new int[fftLen];
        int[] gl = new int[fftLen];
        int[] gh = new int[fftLen];
        for (int i = 0; i < Lf; i++) {
            fl[i] = f[i] & ((1 << 15) - 1);
            fh[i] = f[i] >> 15;
        }
        for (int i = 0; i < Lg; i++) {
            gl[i] = g[i] & ((1 << 15) - 1);
            gh[i] = g[i] >> 15;
        }

        long[] convFl = fft(fl, fftLen);
        long[] convGl = fft(gl, fftLen);

        int[] x = Arrays.copyOf(convolute(convFl, convGl, fftLen), L);
        return Arrays.stream(x).map(a -> a % MOD).toArray();
    }

    static long[] fft(int[] a, int len) {
        long[] res = new long[len];
        for (int i = 0; i < a.length; i++) {
            res[i] = a[i];
        }
        for (int shift = 0; 1 << shift < len; shift++) {
            int basis = len >> (shift + 1);
            for (int now = 0; now < len; now += 1 << (shift + 1)) {
                for (int i = now, j = 0; i < now + basis; i++, j++) {
                    long X = res[i];
                    long Y = res[i + basis] << 15;
                    long Z = res[i + basis * 2] << 30;
                    long A = X + Y + Z;
                    long B = X + 2 * MOD - Y - Z;
                    res[i] = A % MOD;
                    res[i + basis] = B % MOD;
                }
            }
        }
        return res;
    }

    static int[] convolute(long[] a, long[] b, int len) {
        for (int i = 0; i < len; i++)
            a[i] = a[i] * b[i] % MOD;
        Arrays.fill(b, 0);
        for (int diff = 1; diff < len; diff *= 2) {
            for (int i = 0; i < len; i += diff * 2) {
                long[] add = Arrays.copyOfRange(a, i, i + 2 * diff);
                for (int j = 0; j < diff; j++) {
                    a[i + j] = (a[i + j] + add[j]) % MOD;
                    a[i + j + diff] = (a[i + j + diff] + MOD - add[j]) % MOD;
                }
            }
        }
        for (int i = 0; i < len; i++)
            b[i] = a[i];
        return Arrays.stream(b).mapToInt(a -> (int)a).toArray();
    }

    static int[] fpsExp(int[] h, int N) {
        int L = h.length;
        int i = Integer.highestOneBit(L - 1) << 1;
        while (i <= L / 2) i <<= 1;
        int N2 = i;

        int[] f = new int[N2];
        int[] g = new int[N2];
        long[] dh = new long[N2];
        g[0] = 1;
        f[0] = 1; f[1] = h[1];
        for (int m = 2; m <= N2; m *= 2) {
            int[] fg = fftConvolve(Arrays.copyOf(f, m), Arrays.copyOf(g, m));
            int[] fgg = fftConvolve(Arrays.copyOf(fg, m), Arrays.copyOf(g, m));
            for (int j = 0; j < m; j++) {
                g[j] *= 2;
                g[j] -= fgg[j];
                g[j] %= MOD;
                if (g[j] < 0) g[j] += MOD;
            }
            dh[0] = 0;
            for (int j = 1; j < m-1; j++) dh[j] = h[j+1] * j % MOD;
            int[] s = new int[m * 2];
            System.arraycopy(f, 0, s, 0, m);
            for (int j = 1; j < m; j++) s[j] = (int)((s[j] * (j + 1)) % MOD);
            int[] r = fftConvolve(Arrays.copyOf(f, m), dh);
            for (int j = 1; j <= r.length; j++) s[j] -= r[j-1];
            for (int j = 1; j < s.length; j++) {
                s[j-1] += s[j];
                s[j-1] %= MOD;
            }
            int[] t = fftConvolve(Arrays.copyOf(g, m), Arrays.copyOf(s, m));
            for (int j = 0; j < m; j++) {
                t[j] = (int)((t[j] * inv[m+j] % MOD) + MOD) % MOD;
            }
            long[] u = Arrays.stream(Arrays.copyOfRange(h, m, m*2))
                    .mapToLong(x -> x).toArray();
            for (int j = 0; j < m; j++) u[j] = (u[j] - t[j] + MOD) % MOD;
            int[] v = fftConvolve(Arrays.copyOf(f, m), u);
            for (int j = 0; j < m; j++) {
                f[j + m] += v[j];
                f[j + m] %= MOD;
            }
        }
        return Arrays.copyOf(f, L);
    }

    static class FastScanner {
        final private int BUFFER_SIZE = 1 << 12;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public FastScanner(InputStream in) {
            din = new DataInputStream(in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public int nextInt() {
            int ret = 0;
            byte c = nextChar();
            while (c <= ' ') c = nextChar();
            boolean neg = (c == '-');
            if (neg) c = nextChar();
            do { ret = ret * 10 + c - '0'; } while ((c = nextChar()) >= '0' && c <= '9');
            if (neg) return -ret;
            return ret;
        }

        private byte nextChar() {
            if (bufferPointer == bytesRead) fillBuffer();
            return buffer[bufferPointer++];
        }

        private void fillBuffer() {
            try {
                bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
                if (bytesRead == -1) buffer[0] = -1;
            } catch (Exception e) { e.printStackTrace(); }
        }
    }
}