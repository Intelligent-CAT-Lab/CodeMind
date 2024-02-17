import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Objects;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.util.regex.Pattern;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        LightWriter out = new LightWriter(outputStream);
        FRedBlackSoulGem solver = new FRedBlackSoulGem();
        solver.solve(1, in, out);
        out.close();
    }

    static class FRedBlackSoulGem {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            Debug.enable("src");
            int n = in.ints(), m = in.ints();
            ModMath mod = new ModMath(m);
            long ans = 0;
            Exponentiation exp2 = mod.getExponentiation(2, n);
            for (int r = 1; r < n; r++) {
                int b = n - r;

                long t = mod.ncr(n, r);
                t *= mod.pow(2, r * (r - 1L) / 2);
                t %= m;

                t *= mod.pow(2, b * (b - 1L) / 2);
                t %= m;

                long p = 0;
                Factorial fact = mod.getFactorial(b + 1);
                for (int i = 0; i <= b; i++) {
                    if (i % 2 == 0) {
                        p += fact.ncr(b, i) * mod.pow(exp2.pow(b - i) - 1, r) % m;
                        p %= m;
                    } else {
                        p -= fact.ncr(b, i) * mod.pow(exp2.pow(b - i) - 1, r) % m;
                        p %= m;
                    }
                }
                if (p < 0) {
                    p += m;
                }

                //System.out.println("r="+r+" b="+b +" p="+p);
                t *= p;
                t %= m;

                ans += t;
                ans %= m;
            }
            out.ans(ans).ln();
        }

    }

    static class LightWriter implements AutoCloseable {
        private final Writer out;
        private boolean autoflush = false;
        private boolean breaked = true;

        public LightWriter(Writer out) {
            this.out = out;
        }

        public LightWriter(OutputStream out) {
            this(new BufferedWriter(new OutputStreamWriter(out, Charset.defaultCharset())));
        }

        public LightWriter print(char c) {
            try {
                out.write(c);
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter print(String s) {
            try {
                out.write(s, 0, s.length());
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter ans(String s) {
            if (!breaked) {
                print(' ');
            }
            return print(s);
        }

        public LightWriter ans(long l) {
            return ans(Long.toString(l));
        }

        public LightWriter ln() {
            print(System.lineSeparator());
            breaked = true;
            if (autoflush) {
                try {
                    out.flush();
                } catch (IOException ex) {
                    throw new UncheckedIOException(ex);
                }
            }
            return this;
        }

        public void close() {
            try {
                out.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }

    }

    static class Exponentiation {
        private final ModMath mod;
        private final long base;
        private final int max;
        private final long[] natural;
        private final long[] reverse;

        public Exponentiation(ModMath mod, long base, int max) {
            this.mod = mod;
            this.base = base;
            this.max = max;
            this.natural = new long[max];
            this.reverse = new long[max];
            natural[0] = 1;
            for (int i = 1; i < max; i++) {
                natural[i] = mod.mod(natural[i - 1] * base);
            }
            reverse[max - 1] = mod.inv(natural[max - 1]);
            for (int i = max - 1; i > 0; i--) {
                reverse[i - 1] = mod.mod(reverse[i] * base);
            }
        }

        public long pow(int x) {
            if (x >= 0) {
                return natural[x];
            } else {
                return reverse[-x];
            }
        }

        public String toString() {
            return "Exponentiation{" +
                    "natural=" + Arrays.toString(natural) +
                    ", reverse=" + Arrays.toString(reverse) +
                    '}';
        }

    }

    static class Vec3l implements Comparable<Vec3l> {
        public long x;
        public long y;
        public long z;

        public Vec3l(long x, long y, long z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Vec3i vec3i = (Vec3i) o;
            return x == vec3i.x &&
                    y == vec3i.y &&
                    z == vec3i.z;
        }

        public int hashCode() {
            return Objects.hash(x, y, z);
        }

        public String toString() {
            return "(" + x + ", " + y + ", " + z + ")";
        }

        public int compareTo(Vec3l o) {
            if (x == o.x) {
                if (y == o.y) {
                    return Long.compare(z, o.z);
                }
                return Long.compare(y, o.z);
            }
            return Long.compare(x, o.x);
        }

    }

    static class ModMath {
        private static final int DEFAULT_MOD = 1_000_000_007;
        private final long mod;

        public ModMath(long mod) {
            this.mod = mod;
        }

        public ModMath() {
            this(DEFAULT_MOD);
        }

        public long mod(long x) {
            x %= mod;
            return x < 0 ? x + mod : x;
        }

        public long inv(long x) {
            return mod(LongEuclidSolver.solve(x, -mod).x);
        }

        public long pow(long x, long y) {
            if (y < 0) {
                return pow(inv(x), -y);
            } else if (y == 0) {
                return 1;
            } else if (y % 2 == 0) {
                long z = pow(x, y / 2);
                return (z * z) % mod;
            } else {
                return (x % mod) * pow(x, y - 1) % mod;
            }
        }

        public long npr(int n, int r) {
            if (n < r) {
                return 0;
            }
            long ans = 1;
            for (int i = 0; i < r; i++) {
                ans *= (n - i);
                ans %= mod;
            }
            return ans;
        }

        public long ncr(int n, int r) {
            long div = 1;
            for (int i = 2; i <= r; i++) {
                div *= i;
                div %= mod;
            }
            return mod(npr(n, r) * inv(div));
        }

        public Factorial getFactorial(int n) {
            return new Factorial(this, n);
        }

        public Exponentiation getExponentiation(long base, int max) {
            return new Exponentiation(this, base, max);
        }

    }

    static class LongEuclidSolver {
        private LongEuclidSolver() {
        }

        public static Vec3l solve(long p, long q) {
            if (q == 0) {
                return new Vec3l(p, 1, p);
            }
            Vec3l vals = solve(q, p % q);
            long a = vals.y;
            long b = vals.x - (p / q) * a;
            return new Vec3l(a, b, vals.z);
        }

    }

    static class Factorial {
        private final ModMath mod;
        private final int max;
        private final long[] natural;
        private final long[] reverse;

        public Factorial(ModMath mod, int max) {
            this.mod = mod;
            this.max = max;
            this.natural = new long[max];
            this.reverse = new long[max];
            natural[0] = 1;
            for (int i = 1; i < max; i++) {
                natural[i] = mod.mod(natural[i - 1] * i);
            }
            reverse[max - 1] = mod.inv(natural[max - 1]);
            for (int i = max - 1; i > 0; i--) {
                reverse[i - 1] = mod.mod(reverse[i] * i);
            }
        }

        public long npr(int n, int r) {
            return n < r ? 0 : mod.mod(natural[n] * reverse[n - r]);
        }

        public long ncr(int n, int r) {
            return mod.mod(npr(n, r) * reverse[r]);
        }

        public String toString() {
            return "Factorial{" +
                    "natural=" + Arrays.toString(natural) +
                    ", reverse=" + Arrays.toString(reverse) +
                    '}';
        }

    }

    static class LightScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int ints() {
            return Integer.parseInt(string());
        }

    }

    static class Debug {
        private static final String DEBUG_CALL_PATTERN = "^.+\\.debug\\((.+)\\);.*$";
        private static Pattern debugRegex;
        private static boolean enabled = false;
        private static String src;

        public static void enable(String s) {
            enabled = true;
            src = s;
            if (debugRegex == null) {
                debugRegex = Pattern.compile(DEBUG_CALL_PATTERN);
            }
        }

    }

    static class Vec3i implements Comparable<Vec3i> {
        public int x;
        public int y;
        public int z;

        public Vec3i(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Vec3i vec3i = (Vec3i) o;
            return x == vec3i.x &&
                    y == vec3i.y &&
                    z == vec3i.z;
        }

        public int hashCode() {
            return Objects.hash(x, y, z);
        }

        public String toString() {
            return "(" + x + ", " + y + ", " + z + ")";
        }

        public int compareTo(Vec3i o) {
            if (x == o.x) {
                if (y == o.y) {
                    return Integer.compare(z, o.z);
                }
                return Integer.compare(y, o.z);
            }
            return Integer.compare(x, o.x);
        }

    }
}


