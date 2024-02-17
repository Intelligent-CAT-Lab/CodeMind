import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;


public class Main {
    public static void main(String[] args) throws Exception {
        Field f = System.out.getClass().getDeclaredField("autoFlush");
        f.setAccessible(true);
        f.set(System.out, false);
        execute(System.in, System.out);
    }

    public static void execute(InputStream in, OutputStream out) {
        ExtendedScanner s = new ExtendedScanner(in);
        Out o = new Out(out);
        solve(s, o);
        o.flush();
        o.close();
    }

    public static void solve(ExtendedScanner sc, Out out) {
        int n = sc.nextInt();
        var ma = new ModArithmetic(TypicalMods.MOD1000000007);
        long a = ma.power(10, n) - 2 * ma.power(9, n) + ma.power(8, n);
        out.writeln(ma.mod(a));
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
class BasicScanner {
    private final InputStream in;
    private final byte[] buf = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    public BasicScanner(InputStream in) {this.in = in;}
    private boolean hasNextByte() {
        if (ptr < buflen) return true;
        ptr = 0;
        try {buflen = in.read(buf);}
        catch (final IOException e) {e.printStackTrace();}
        return buflen > 0;
    }
    private int readByte() {return hasNextByte() ? buf[ptr++] : -1;}
    public boolean hasNext() {
        while (hasNextByte() && !(33 <= buf[ptr] && buf[ptr] <= 126)) ptr++;
        return hasNextByte();
    }
    private StringBuilder nextSequence() {
        if (!hasNext()) throw new NoSuchElementException();
        final StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (33 <= b && b <= 126) {sb.appendCodePoint(b); b = readByte();}
        return sb;
    }
    public char nextChar() {
        return (char) readByte();
    }
    public String next() {
        return nextSequence().toString();
    }
    public String next(int len) {
        return new String(nextChars(len));
    }
    public char[] nextChars() {
        final StringBuilder sb = nextSequence();
        int l = sb.length();
        char[] dst = new char[l];
        sb.getChars(0, l, dst, 0);
        return dst;
    }
    public char[] nextChars(int len) {
        if (!hasNext()) throw new NoSuchElementException();
        char[] s = new char[len];
        int i = 0;
        int b = readByte();
        while (33 <= b && b <= 126 && i < len) {s[i++] = (char) b; b = readByte();}
        if (i != len) throw new NoSuchElementException(String.format("length %d is longer than the sequence.", len));
        return s;
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {minus = true; b = readByte();}
        if (b < '0' || '9' < b) throw new NumberFormatException();
        while (true) {
            if ('0' <= b && b <= '9') n = n * 10 + b - '0';
            else if (b == -1 || !(33 <= b && b <= 126)) return minus ? -n : n;
            else throw new NumberFormatException();
            b = readByte();
        }
    }
    public int nextInt() {return Math.toIntExact(nextLong());}
    public double nextDouble() {return Double.parseDouble(next());}
}


/**
 * @author https://atcoder.jp/users/suisen
 */
class Out {
    private final OutputStream out;
    private byte[] buf = new byte[1024];
    private int ptr = 0;
    private static final int AUTO_FLUSH_THRETHOLD = 1 << 17;

    public Out(OutputStream out) {
        this.out = out;
    }

    public void flush() {
        try {
            out.write(buf, 0, ptr);
            out.flush();
            ptr = 0;
        } catch (IOException e) {e.printStackTrace();}
    }

    public void close() {
        try {out.close();} catch (IOException e) {e.printStackTrace();}
    }

    public Out writeln() {return write('\n');}
    public Out writeln(Object o) {return write(o).write('\n');}
    public Out writeln(String s) {return write(s).write('\n');}
    public Out writeln(char[] c) {return write(c).write('\n');}
    public Out writeln(char   c) {return write(c).write('\n');}
    public Out writeln(byte   b) {return write(b).write('\n');}
    public Out writeln(int    x) {return write(x).write('\n');}
    public Out writeln(long   x) {return write(x).write('\n');}
    public Out writeln(double d) {return write(d).write('\n');}

    public Out writeSpace() {return write(' ');}
    
    public Out write(Object o) {
        return write(o.toString());
    }

    public Out write(String s) {
        try {
            Field strValueField = s.getClass().getDeclaredField("value");
            strValueField.setAccessible(true);
            byte[] b = (byte[]) strValueField.get(s);
            int l = s.length();
            if (l > AUTO_FLUSH_THRETHOLD) {
                flush();
                int i = 0;
                while (i + AUTO_FLUSH_THRETHOLD < l) {
                    out.write(b, i, AUTO_FLUSH_THRETHOLD);
                    out.flush();
                    i += AUTO_FLUSH_THRETHOLD;
                }
                ensureCapacity(l - i);
                System.arraycopy(b, i, buf, 0, l - i);
                ptr = l - i;
            } else {
                ensureCapacity(ptr + l);
                System.arraycopy(b, 0, buf, ptr, l);
                ptr += l;
            }
        } catch (Exception e) {e.printStackTrace();}
        return this;
    }

    public Out write(char[] c) {
        int l = c.length;
        if (l > AUTO_FLUSH_THRETHOLD) {
            flush();
            ensureCapacity(AUTO_FLUSH_THRETHOLD);
            int i = 0;
            while (i + AUTO_FLUSH_THRETHOLD < l) {
                for (int j = 0; j < AUTO_FLUSH_THRETHOLD; j++) {
                    buf[ptr++] = (byte) c[i + j];
                }
                flush();
                i += AUTO_FLUSH_THRETHOLD;
            }
            for (; i < l; i++) {
                buf[ptr++] = (byte) c[i];
            }
        } else {
            ensureCapacity(ptr + l);
            for (char ch : c) buf[ptr++] = (byte) ch;
        }
        return this;
    }

    public Out write(char c) {
        ensureCapacity(ptr + 1);
        buf[ptr++] = (byte) c;
        return this;
    }

    public Out write(byte b) {
        ensureCapacity(ptr + 1);
        buf[ptr++] = b;
        return this;
    }

    public Out write(int x) {
        if (x == 0) {
            ensureCapacity(ptr + 1);
            buf[ptr++] = '0';
            return this;
        }
        int d = stringSize(x);
        ensureCapacity(ptr + d);
        if (x < 0) {
            buf[ptr++] = '-';
            x = -x;
            d--;
        }
        int j = ptr + d; 
        while (x > 0) {
            buf[--j] = (byte) ('0' + (x % 10));
            x /= 10;
        }
        ptr += d;
        return this;
    }

    public Out write(long x) {
        if (x == 0) {
            ensureCapacity(ptr + 1);
            buf[ptr++] = '0';
            return this;
        }
        int d = stringSize(x);
        ensureCapacity(ptr + d);
        if (x < 0) {
            buf[ptr++] = '-';
            x = -x;
            d--;
        }
        int j = ptr + d; 
        while (x > 0) {
            buf[--j] = (byte) ('0' + (x % 10));
            x /= 10;
        }
        ptr += d;
        return this;
    }

    public Out write(double d) {
        return write(Double.toString(d));
    }

    private void ensureCapacity(int cap) {
        if (cap > AUTO_FLUSH_THRETHOLD) {
            flush();
        }
        if (cap >= buf.length) {
            int newLength = buf.length;
            while (newLength < cap) newLength <<= 1;
            byte[] newBuf = new byte[newLength];
            System.arraycopy(buf, 0, newBuf, 0, buf.length);
            buf = newBuf;
        }
    }
    private static int stringSize(long x) {
        int d = 1;
        if (x >= 0) {d = 0; x = -x;}
        long p = -10;
        for (int i = 1; i < 19; i++, p *= 10) if (x > p) return i + d;
        return 19 + d;
    }
    private static int stringSize(int x) {
        int d = 1;
        if (x >= 0) {d = 0; x = -x;}
        int p = -10;
        for (int i = 1; i < 10; i++, p *= 10) if (x > p) return i + d;
        return 10 + d;
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
final class ExtendedScanner extends BasicScanner {
    public ExtendedScanner(InputStream in) {super(in);}
    public int[] ints(final int n) {
        final int[] a = new int[n];
        Arrays.setAll(a, $ -> nextInt());
        return a;
    }
    public int[] ints(final int n, final IntUnaryOperator f) {
        final int[] a = new int[n];
        Arrays.setAll(a, $ -> f.applyAsInt(nextInt()));
        return a;
    }
    public int[][] ints(final int n, final int m) {
        final int[][] a = new int[n][];
        Arrays.setAll(a, $ -> ints(m));
        return a;
    }
    public int[][] ints(final int n, final int m, final IntUnaryOperator f) {
        final int[][] a = new int[n][];
        Arrays.setAll(a, $ -> ints(m, f));
        return a;
    }
    public long[] longs(final int n) {
        final long[] a = new long[n];
        Arrays.setAll(a, $ -> nextLong());
        return a;
    }
    public long[] longs(final int n, final LongUnaryOperator f) {
        final long[] a = new long[n];
        Arrays.setAll(a, $ -> f.applyAsLong(nextLong()));
        return a;
    }
    public long[][] longs(final int n, final int m) {
        final long[][] a = new long[n][];
        Arrays.setAll(a, $ -> longs(m));
        return a;
    }
    public long[][] longs(final int n, final int m, final LongUnaryOperator f) {
        final long[][] a = new long[n][];
        Arrays.setAll(a, $ -> longs(m, f));
        return a;
    }
    public char[][] charArrays(final int n) {
        final char[][] c = new char[n][];
        Arrays.setAll(c, $ -> nextChars());
        return c;
    }
    public char[][] charArrays(final int n, final int m) {
        final char[][] c = new char[n][];
        Arrays.setAll(c, $ -> nextChars(m));
        return c;
    }
    public double[] doubles(final int n) {
        final double[] a = new double[n];
        Arrays.setAll(a, $ -> nextDouble());
        return a;
    }
    public double[][] doubles(final int n, final int m) {
        final double[][] a = new double[n][];
        Arrays.setAll(a, $ -> doubles(m));
        return a;
    }
    public String[] strings(final int n) {
        final String[] s = new String[n];
        Arrays.setAll(s, $ -> next());
        return s;
    }
    public String[] strings(final int n, final int m) {
        final String[] s = new String[n];
        Arrays.setAll(s, $ -> next(m));
        return s;
    }
}

/**
 * Minimum modulo operations.
 * 
 * @author https://atcoder.jp/users/suisen
 */
class ModArithmetic {
    public final long MOD;

    /**
     * support modulo p arithmetic
     * 
     * @param p p s.t. p is a prime number.
     */
    public ModArithmetic(final long p) {
        this.MOD = p;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a mod p.
     */
    public static long mod(long a, final long MOD) {
        a %= MOD;
        return a < 0 ? a + MOD : a;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a + b mod p.
     */
    public static long add(final long a, final long b, final long MOD) {
        final long s = a + b;
        return s < 0 ? s + MOD : s >= MOD ? s - MOD : s;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a - b mod p.
     */
    public static long sub(final long a, final long b, final long MOD) {
        final long s = a - b;
        return s < 0 ? s + MOD : s >= MOD ? s - MOD : s;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a * b mod p.
     */
    public static long mul(final long a, final long b, final long MOD) {
        final long ret = (a * b) % MOD;
        return ret < 0 ? ret + MOD : ret;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ b * x = a mod p.
     */
    public static long div(final long a, final long b, final long MOD) {
        return mul(a, inv(b, MOD), MOD);
    }

    /**
     * Calculate the value b s.t. a * b mod p = 1.
     */
    public static long inv(long a, final long MOD) {
        long b = MOD;
        long u = 1, v = 0;
        while (b >= 1) {
            final long t = a / b;
            a -= t * b;
            final long tmp1 = a; a = b; b = tmp1;
            u -= t * v;
            final long tmp2 = u; u = v; v = tmp2;
        }
        u %= MOD;
        return u < 0 ? u + MOD : u;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a mod p.
     */
    public long mod(long a) {
        a %= MOD;
        return a < 0 ? a + MOD : a;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a + b mod p.
     */
    public long add(final long a, final long b) {
        final long s = a + b;
        return s < 0 ? s + MOD : s >= MOD ? s - MOD : s;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a - b mod p.
     */
    public long sub(final long a, final long b) {
        final long s = a - b;
        return s < 0 ? s + MOD : s >= MOD ? s - MOD : s;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a * b mod p.
     */
    public long mul(final long a, final long b) {
        final long s = (a * b) % MOD;
        return s < 0 ? s + MOD : s;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ b * x = a mod p.
     */
    public long div(final long a, final long b) {
        return mul(a, inv(b));
    }

    /**
     * Calculate the value b s.t. a*b mod MOD = 1.
     */
    public long inv(long a) {
        long b = MOD;
        long u = 1, v = 0;
        while (b >= 1) {
            final long t = a / b;
            a -= t * b;
            final long tmp1 = a; a = b; b = tmp1;
            u -= t * v;
            final long tmp2 = u; u = v; v = tmp2;
        }
        return mod(u);
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a_1 + 1_2 + ... + a_k mod p.
     */
    public long sum(final long... a) {
        long ret = 0;
        for (final long c : a) ret += c;
        return mod(ret);
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a_1 * 1_2 * ... * a_k mod p.
     */
    public long prod(final long... a) {
        long ret = 1;
        for (final long c : a) ret = (ret * c) % MOD;
        return ret < 0 ? ret + MOD : ret;
    }

    /**
     * calculate the inverse of [1,n] mod MOD in O(n).
     * 
     * @param n
     * @param MOD
     * @return the array that contains the inverse of [1,n]. (array[0] = 0)
     */
    public static long[] invMemo(int n, long MOD) {
        final long[] memo = new long[n + 1];
        memo[1] = 1;
        for (int i = 2; i <= n; i++) {
            long q = MOD - MOD / i;
            long r = memo[(int) (MOD % i)];
            memo[i] = (q * r) % MOD;
        }
        return memo;
    }

    /**
     * calculate the inverse of a[0], ..., a[n - 1] mod MOD in O(n).
     * 
     * @param a
     * @param MOD
     * @return the array that contains the inverse of a[0], ..., a[n - 1].
     */
    public static long[] invAll(long[] a, long MOD) {
        int n = a.length;
        final long[] dp = new long[n + 1];
        final long[] pd = new long[n + 1];
        dp[0] = pd[n] = 1;
        for (int i = 0; i < n; i++) dp[i + 1] = (dp[i] * a[i]) % MOD;
        for (int i = n; i > 0; i--) pd[i - 1] = (pd[i] * a[i]) % MOD;
        long inv = ModArithmetic.inv(dp[n], MOD);
        long[] ret = new long[n];
        for (int i = 0; i < n; i++) ret[i] = (((dp[i] * pd[i]) % MOD) * inv) % MOD;
        return ret;
    }

    /**
     * calculate 0!, ..., n! (mod MOD) in O(n).
     * 
     * @param n
     * @param MOD
     * @return the array that contains 0!, ..., n! (mod MOD).
     */
    public static long[] factorialMemo(int n, long MOD) {
        final long[] memo = new long[n + 1];
        memo[0] = 1;
        for (int i = 1; i <= n; i++) memo[i] = (memo[i - 1] * i) % MOD;
        return memo;
    }

    /**
     * calculate the inverse of 0!, ..., n! (mod MOD) in O(n).
     * 
     * @param factorial [0!, ..., n!] (mod MOD).
     * @param MOD
     * @return the array that contains the inverse of 0!, ..., n! (mod MOD).
     */
    public static long[] invFactorialMemo(long[] factorial, long MOD) {
        final int n = factorial.length - 1;
        final long[] memo = new long[n + 1];
        memo[n] = ModArithmetic.inv(factorial[n], MOD);
        for (int i = n; i > 0; i--) memo[i - 1] = (memo[i] * i) % MOD;
        return memo;
    }

    /**
     * calculate a^0, ..., a^n (mod MOD) in O(n).
     * 
     * @param a   base
     * @param n   maximum index.
     * @param MOD
     * @return the array that contains the a^0, ..., a^n (mod MOD).
     */
    public static long[] powerMemo(long a, int n, long MOD) {
        if (a == 2) return powerMemo(n, MOD);
        long[] memo = new long[n + 1];
        memo[0] = 1;
        for (int i = 1; i <= n; i++) memo[i] = (memo[i - 1] * a) % MOD;
        return memo;
    }

    /**
     * calculate 2^0, ..., 2^n (mod MOD) in O(n).
     * 
     * @param n   maximum index.
     * @param MOD
     * @return the array that contains the 2^0, ..., 2^n (mod MOD).
     */
    public static long[] powerMemo(int n, long MOD) {
        long[] memo = new long[n + 1];
        memo[0] = 1;
        for (int i = 1; i <= n; i++) memo[i] = (memo[i - 1] << 1) % MOD;
        return memo;
    }

    /**
     * calculate a^b (mod MOD) in O(max{MOD, b}).
     * 
     * @param a   base
     * @param b   index
     * @param MOD
     * @return a^b (mod MOD)
     */
    public static long power(long a, long b, long MOD) {
        a %= MOD;
        if (b == 0 || a == 1) return 1;
        long res = 1, p = a, c = 1;
        while (b > 0) {
            long lsb = b & -b;
            for (; lsb != c; c <<= 1, p = (p * p) % MOD);
            res = (res * p) % MOD;
            b ^= lsb;
        }
        return res;
    }

    /**
     * calculate the inverse of [1,n] mod MOD in O(n).
     * 
     * @param n
     * @return the array that contains the inverse of [1,n]. (array[0] = 0)
     */
    public long[] invMemo(int n) {
        final long[] memo = new long[n + 1];
        memo[1] = 1;
        for (int i = 2; i <= n; i++) {
            long q = MOD - MOD / i;
            long r = memo[(int) (MOD % i)];
            memo[i] = (q * r) % MOD;
        }
        return memo;
    }

    /**
     * calculate the inverse of a[0], ..., a[n - 1] mod MOD in O(n).
     * 
     * @param a
     * @return the array that contains the inverse of a[0], ..., a[n - 1].
     */
    public long[] invAll(long[] a) {
        int n = a.length;
        long[] dp = new long[n + 1];
        long[] pd = new long[n + 1];
        dp[0] = pd[n] = 1;
        for (int i = 0; i < n; i++) dp[i + 1] = (dp[i] * a[i    ]) % MOD;
        for (int i = n; i > 0; i--) pd[i - 1] = (pd[i] * a[i - 1]) % MOD;
        long inv = inv(dp[n], MOD);
        long[] invs = new long[n];
        for (int i = 0; i < n; i++) {
            long lr = (dp[i] * pd[i + 1]) % MOD;
            invs[i] = (lr * inv) % MOD;
        }
        return invs;
    }

    /**
     * calculate 0!, ..., n! (mod MOD) in O(n).
     * 
     * @param n
     * @return the array that contains 0!, ..., n! (mod MOD).
     */
    public long[] factorialMemo(int n) {
        final long[] memo = new long[n + 1];
        memo[0] = 1;
        for (int i = 1; i <= n; i++) memo[i] = (memo[i - 1] * i) % MOD;
        return memo;
    }

    /**
     * calculate the inverse of 0!, ..., n! (mod MOD) in O(n).
     * 
     * @param factorial [0!, ..., n!] (mod MOD).
     * @return the array that contains the inverse of 0!, ..., n! (mod MOD).
     */
    public long[] invFactorialMemo(long[] factorial) {
        final int n = factorial.length - 1;
        final long[] memo = new long[n + 1];
        memo[n] = ModArithmetic.inv(factorial[n], MOD);
        for (int i = n; i > 0; i--) memo[i - 1] = (memo[i] * i) % MOD;
        return memo;
    }

    /**
     * calculate a^0, ..., a^n (mod MOD) in O(n).
     * 
     * @param a   base
     * @param n   maximum index.
     * @return the array that contains the a^0, ..., a^n (mod MOD).
     */
    public long[] powerMemo(long a, int n) {
        if (a == 2) return powerMemo(n, MOD);
        final long[] memo = new long[n + 1];
        memo[0] = 1;
        for (int i = 1; i <= n; i++) memo[i] = (memo[i - 1] * a) % MOD;
        return memo;
    }

    /**
     * calculate 2^0, ..., 2^n (mod MOD) in O(n).
     * 
     * @param n   maximum index.
     * @return the array that contains the 2^0, ..., 2^n (mod MOD).
     */
    public long[] powerMemo(int n) {
        final long[] memo = new long[n + 1];
        memo[0] = 1;
        for (int i = 1; i <= n; i++) memo[i] = (memo[i - 1] << 1) % MOD;
        return memo;
    }

    /**
     * calculate a^b (mod MOD) in O(max{MOD, b}).
     * 
     * @param a   base
     * @param b   index
     * @return a^b (mod MOD)
     */
    public long power(long a, long b) {
        a %= MOD;
        if (b == 0 || a == 1) return 1;
        long res = 1, p = a, c = 1;
        while (b > 0) {
            long lsb = b & -b;
            for (; lsb != c; c <<= 1, p = (p * p) % MOD);
            res = (res * p) % MOD;
            b ^= lsb;
        }
        return res;
    }
}

class TypicalMods {
    public static final long MOD1000000007 = 1000000007;
    public static final long MOD1000000009 = 1000000009;
    public static final long MOD998244353  = 998244353 ;
    private TypicalMods() {}
}
