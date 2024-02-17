import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskF solver = new TaskF();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskF {
        static final int MODULO = 998244353;
        static int[] invs;
        static int[] facts;
        static int[] invfacts;

        static {
            int k = (int) 8010;
            invs = new int[k + 2];
            invs[1] = 1;
            for (int i = 2; i <= k + 1; ++i) {
                invs[i] = (int) ((MODULO - (MODULO / i) * (long) invs[(int) (MODULO % i)] % MODULO) % MODULO);
            }
            facts = new int[k + 2];
            invfacts = new int[k + 2];
            facts[0] = 1;
            invfacts[0] = 1;
            for (int i = 1; i <= k + 1; ++i) {
                facts[i] = (int) (facts[i - 1] * (long) i % MODULO);
                invfacts[i] = (int) (invfacts[i - 1] * (long) invs[i] % MODULO);
            }
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int m = in.nextInt();
            int n = in.nextInt();
            int[] w = new int[m + 1];
            int[] nw = new int[m + 1];
            int[] tw = new int[m + 1];
            for (int i = 0; i <= m; ++i) {
                w[i] = (int) ((long) facts[m] * invfacts[m - i] % MODULO);
            }
            int[] other = new int[m + 1];
            for (int i = 3; i <= m + 2; ++i) {
                other[m + 2 - i] = invfacts[i];
            }
            FastFourierTransformModulo fftm = new FastFourierTransformModulo(MODULO);
            for (int step = 0; step < n; ++step) {
                Arrays.fill(nw, 0);
                for (int j = 0; j <= m; ++j) {
                    tw[j] = (int) (w[j] * (long) (j + 1) % MODULO * (long) (j + 2) % MODULO);
                }
                int[] prod = fftm.mul(tw, other);
                for (int i = 0; i <= m; ++i) {
                    long s = prod[m + i];
                /*long s = 0;
                for (int j = i + 1; j <= m; ++j) {
                    s += w[j] * (long) (j + 1) % MODULO * (long) (j + 2) % MODULO * invfacts[j + 2 - i] % MODULO;
                }
                if (s != s1) {
                    throw new RuntimeException();
                }*/
                    s = s % MODULO;
                    s = (s + w[i] * (long) (1 + i * (i + 1) / 2)) % MODULO;
                    nw[i] = (int) s;
                }
                int[] tmp = w;
                w = nw;
                nw = tmp;
            }
            long res = w[0];
            out.println(res);
        }

    }

    static class FastFourierTransformModulo {
        final int MODULO;
        final int[] roots;
        final int[][] allpows;
        final int[][] allinvpows;

        public FastFourierTransformModulo(int MODULO) {
            for (int i = 2; i * i <= MODULO; ++i) if (MODULO % i == 0) throw new RuntimeException();
            this.MODULO = MODULO;
            int p2 = getP2(MODULO);
            if (p2 == 0) throw new RuntimeException();
            roots = new int[p2 + 1];
            allpows = new int[p2 + 1][];
            allinvpows = new int[p2 + 1][];
            int start;
            for (start = 2; ; ++start)
                if (pow(start, (MODULO - 1) / 2) != 1) break;
            int pw = MODULO - 1;
            for (int i = 0; i <= p2; ++i) {
                roots[i] = pow(start, pw);
                allpows[i] = makePows(roots[i], (MODULO - 1) / pw);
                allinvpows[i] = makePows(pow(roots[i], MODULO - 2), (MODULO - 1) / pw);
                pw /= 2;
            }
        }

        public static int getP2(int MODULO) {
            int t = MODULO - 1;
            int p2 = 0;
            while (t % 2 == 0) {
                t /= 2;
                ++p2;
            }
            return p2;
        }

        private int[] makePows(int a, int k) {
            int[] res = new int[k + 1];
            res[0] = 1;
            for (int i = 1; i <= k; ++i) {
                res[i] = (int) (a * (long) res[i - 1] % MODULO);
            }
            return res;
        }

        public int[] mul(int[] a, int[] b) {
            int len = MathUtils.nextPowerOfTwo(a.length + b.length - 1);
        /*CacheKey ca = new CacheKey(a, len);
        if (cache.containsKey(ca)) {
            a = cache.get(ca).clone();
        } else {
            a = Arrays.copyOf(a, len);
            fft(a, false);
            cache.put(ca, a.clone());
        }
        CacheKey cb = new CacheKey(b, len);
        if (cache.containsKey(cb)) {
            b = cache.get(cb).clone();
        } else {
            b = Arrays.copyOf(b, len);
            fft(b, false);
            cache.put(cb, b.clone());
        }*/
            a = Arrays.copyOf(a, len);
            fft(a, false);
            b = Arrays.copyOf(b, len);
            fft(b, false);
            int[] c = pointwiseMultiply(a, b);
            fft(c, true);
            {
                int mult = pow(c.length, MODULO - 2);
                for (int i = 0; i < c.length; ++i) {
                    c[i] = (int) (c[i] * (long) mult % MODULO);
                }
            }
            return c;
        }

        public int[] pointwiseMultiply(int[] a, int[] b) {
            if (a.length != b.length) throw new RuntimeException();
            int[] c = new int[a.length];
            for (int i = 0; i < a.length; ++i) {
                c[i] = (int) (a[i] * (long) b[i] % MODULO);

            }
            return c;
        }

        private int pow(int a, int k) {
            if (k == 0) return 1;
            if (k % 2 == 0)
                return pow((int) (a * (long) a % MODULO), k / 2);
            return (int) (a * (long) pow(a, k - 1) % MODULO);
        }

        public void fft(int[] arr, boolean inv) {
            if (MathUtils.nextPowerOfTwo(arr.length) != arr.length) throw new RuntimeException();
            int n = arr.length;
            int[] invbits = FastFourierTransformModulo.InvBitsCache.INSTANCE.getInvBits(n);
            for (int i = 0; i < n; ++i) {
                int j = invbits[i];
                if (j > i) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            for (int p2 = 1, pow2 = 1; p2 < n; p2 *= 2, pow2 += 1) {
                int w = roots[pow2];
                int[] ap = allpows[pow2];
                if (inv) {
                    w = pow(w, MODULO - 2);
                    ap = allinvpows[pow2];
                }
                for (int big = 0; big < n; big += 2 * p2) {
                    int cur = 1;
                    int curp = 0;
                    for (int small = big; small < big + p2; ++small) {
                        int i = small;
                        int j = small + p2;
                        int u = arr[i];
                        int o = arr[j];
                        int v = (int) (o * (long) cur % MODULO);
                        arr[i] = u + v;
                        if (arr[i] >= MODULO) arr[i] -= MODULO;
                        arr[j] = u - v;
                        if (arr[j] < 0) arr[j] += MODULO;
                        ++curp;
                    /*if (ap[curp] != (int) (cur * (long) w % MODULO)) {
                        throw new RuntimeException();
                    }*/
                        cur = ap[curp];
                    }
                }
            }
        }

        public static int calcInvBits(int at, int total) {
            int res = 0;
            int rev = total >> 1;
            for (int p2 = 1; p2 < total; p2 <<= 1, rev >>= 1)
                if ((at & p2) != 0)
                    res |= rev;
            return res;
        }

        static class InvBitsCache {
            int[][] cache = new int[0][];
            static FastFourierTransformModulo.InvBitsCache INSTANCE = new FastFourierTransformModulo.InvBitsCache();

            private InvBitsCache() {
            }

            synchronized int[] getInvBits(int size) {
                int logsize = MathUtils.log2(size);
                if (logsize >= cache.length) {
                    cache = Arrays.copyOf(cache, logsize + 1);
                }
                if (cache[logsize] == null) {
                    cache[logsize] = new int[size];
                    for (int i = 0; i < size; ++i) cache[logsize][i] = calcInvBits(i, size);
                }
                return cache[logsize];
            }

        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }

    static class MathUtils {
        public static int nextPowerOfTwo(int x) {
            if (x < 0 || x > (1 << 30)) throw new RuntimeException();
            if (x == 0) return 1;
            if ((x & (x - 1)) == 0) return x;
            return Integer.highestOneBit(x) << 1;
        }

        static int log2(int x) {
            if (x <= 0 || (x & (x - 1)) != 0) throw new RuntimeException();
            return Integer.numberOfTrailingZeros(x);
        }

    }
}

