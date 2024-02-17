import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    final static long MOD07 = 1_000_000_007;
    final static long MOD09 = 1_000_000_009;

    public static void main(String[] args) {
        final FastScanner fs = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int X = fs.nextInt();
        int[] a = { 100, 101, 102, 103, 104, 105};

        boolean[] dp = new boolean[X+1];
        Arrays.fill(dp, false);
        dp[0] = true;

        for (int i = 1; i <= X; i++) {
            for (int j = 0; j < a.length; j++) {
                int yen = a[j];
                if (i - yen >= 0) {
                    dp[i] = dp[i] || dp[i-yen];
                }
            }
        }
        if (dp[X]) {
            out.println('1');
        } else {
            out.println('0');
        }

        out.flush();
    }

    static void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    // Execute func for all patterns can be represented with n bit.
    // O(n2^n)
    static void forAllBit(int n, Consumer<List<Boolean>> func) {
        for (int i = 0; i < (1 << n); i++) {
            List<Boolean> arg = new ArrayList();
            for (int j = 0; j < n; j++) {
                boolean isJthBitSet = ((i >> j) & 1) == 1;
                arg.add(isJthBitSet);
            }
            func.accept(arg);
        }
    }

    public static int[] swap(int data[], int left, int right)
    {

        // Swap the data
        int temp = data[left];
        data[left] = data[right];
        data[right] = temp;

        // Return the updated array
        return data;
    }

    // Function to reverse the sub-array
    // starting from left to the right
    // both inclusive
    public static int[] reverse(int data[], int left, int right)
    {

        // Reverse the sub-array
        while (left < right) {
            int temp = data[left];
            data[left++] = data[right];
            data[right--] = temp;
        }

        // Return the updated array
        return data;
    }

    // Function to find the next permutation
    // of the given integer array
    public static boolean findNextPermutation(int data[])
    {

        // If the given dataset is empty
        // or contains only one element
        // next_permutation is not possible
        if (data.length <= 1)
            return false;

        int last = data.length - 2;

        // find the longest non-increasing suffix
        // and find the pivot
        while (last >= 0) {
            if (data[last] < data[last + 1]) {
                break;
            }
            last--;
        }

        // If there is no increasing pair
        // there is no higher order permutation
        if (last < 0)
            return false;

        int nextGreater = data.length - 1;

        // Find the rightmost successor to the pivot
        for (int i = data.length - 1; i > last; i--) {
            if (data[i] > data[last]) {
                nextGreater = i;
                break;
            }
        }

        // Swap the successor and the pivot
        data = swap(data, nextGreater, last);

        // Reverse the suffix
        data = reverse(data, last + 1, data.length - 1);

        // Return true as the next_permutation is done
        return true;
    }

    static class Pair<F extends Comparable<F>, S extends Comparable<S>> implements Comparable<Pair<F, S>> {
        F f;
        S s;

        Pair() {
        }

        Pair(F f, S s) {
            this.f = f;
            this.s = s;
        }

        Pair(Pair<F, S> p) {
            f = p.f;
            s = p.s;
        }

        @Override
        public int compareTo(Pair<F, S> p) {
            if (f.compareTo(p.f) != 0) {
                return f.compareTo(p.f);
            }
            return s.compareTo(p.s);
        }

        @Override
        public int hashCode() {
            return f.hashCode() ^ s.hashCode();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || this.f == null || this.s == null) {
                return false;
            }
            if (this.getClass() != o.getClass()) {
                return false;
            }
            Pair p = (Pair) o;
            return this.f.equals(p.f) && this.s.equals(p.s);
        }

        @Override
        public String toString() {
            return "{" + f.toString() + ", " + s.toString() + "}";
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= ((int) Math.sqrt(n)); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n != 1;
    }

    public static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public static void reverse(long[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            long temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public static boolean isPrime(long n) {
        for (long i = 2; i <= ((long) Math.sqrt(n)); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n != 1;
    }

    public static Map<Long, Long> primeFactor(long n) {
        Map<Long, Long> map = new HashMap<>();
        long num = n;
        for (long i = 2; i <= ((long) Math.sqrt(n)); i++) {
            while (num % i == 0L) {
                map.put(i, map.getOrDefault(i, 0L) + 1L);
                num /= i;
            }
        }
        if (num != 1) {
            map.put(num, 1L);
        }

        return map;
    }

    public static List<Long> divisors(long n) {
        List<Long> list = new ArrayList<>();
        for (long i = 1; i <= ((long) Math.sqrt(n)); i++) {
            if (n % i == 0) {
                list.add(i);
                if (i != n / i) {
                    list.add(n / i);
                }
            }
        }

        return list;
    }

    public static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }

    public static int nCk(int n, int k, int M) {
        long ret = 1;
        int min = Math.min(k, n - k);
        for (int i = 1; i <= min; i++) {
            ret = (ret * pow(i, M - 2, M)) % M;
        }
        for (int i = n - min + 1; i <= n; i++) {
            ret = (ret * i) % M;
        }
        return (int) ret;
    }

    //return a^b mod M O(logB)
    public static long pow(long a, long b, int M) {
        long ret = 1;
        long tmp = a;
        while (b > 0) {
            if ((b & 1) == 1) ret = (ret * tmp) % M;
            tmp = (tmp * tmp) % M;
            b = b >> 1;
        }
        return ret;
    }


    public static int find(int[] tree, int idx) {
        if (tree[idx] == idx) return idx;
        else return tree[idx] = find(tree, tree[idx]);
    }

    public static void union(int[] tree, int idx1, int idx2) {
        int root1 = find(tree, idx1);
        int root2 = find(tree, idx2);
        tree[root2] = root1;
    }

    public static int lowerBound(int[] list, int target) {
        int ok = list.length;
        int ng = -1;
        while (Math.abs(ok - ng) > 1) {
            int mid = (ok + ng) / 2;
            if (list[mid] >= target) {
                ok = mid;
            } else {
                ng = mid;
            }
        }
        return ok;
    }

    public static int lowerBound(long[] list, long target) {
        int ok = list.length;
        int ng = -1;
        while (Math.abs(ok - ng) > 1) {
            int mid = (ok + ng) / 2;
            if (list[mid] >= target) {
                ok = mid;
            } else {
                ng = mid;
            }
        }
        return ok;
    }

    public static <T extends Comparable<? super T>> int lowerBound(List<T> list, T target) {
        return ~Collections.binarySearch(list, target, (x, y) -> (x.compareTo(y) >= 0) ? 1 : -1);
    }

    public static <T extends Comparable<? super T>> int upperBound(List<T> list, T target) {
        return ~Collections.binarySearch(list, target, (x, y) -> (x.compareTo(y) > 0) ? 1 : -1);
    }
}


class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        } else {
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }

    private int readByte() {
        if (hasNextByte()) return buffer[ptr++];
        else return -1;
    }

    private boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        return hasNextByte();
    }

    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }

    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}

class BIT<T> {
    int n;
    ArrayList<T> bit;
    BiFunction<T, T, T> bif;

    /**
     * 1-indexed なBinary Indexed Treeを構築する
     *
     * @param n   容量
     * @param bif 適用させる関数
     * @param sup 初期値
     */
    BIT(int n, BiFunction<T, T, T> bif, Supplier<T> sup) {
        this.n = n;
        bit = new ArrayList<>(n + 1);
        for (int i = 0; i < n + 1; ++i) {
            bit.add(sup.get());
        }
        this.bif = bif;
    }

    /**
     * iの位置の値をvで更新する
     *
     * @param i index
     * @param v 新しい値
     */
    void set(int i, T v) {
        for (int x = i; x <= n; x += x & -x) {
            bit.set(x, bif.apply(bit.get(x), v));
        }
    }

    /**
     * クエリー
     *
     * @param defaultValue 初期値
     * @param i            index
     * @return [1, i]までfを適用した結果
     */
    T reduce(T defaultValue, int i) {
        T ret = defaultValue;
        for (int x = i; x > 0; x -= x & -x) {
            ret = bif.apply(ret, bit.get(x));
        }
        return ret;
    }
}

class SegmentTree<T> {
    int n;
    ArrayList<T> dat;
    BiFunction<T, T, T> bif;
    Supplier<T> sup;

    /**
     * 0-indexed なSegment Treeを構築する
     *
     * @param n_  要求容量
     * @param bif 適用させる関数
     * @param sup 初期値
     */
    SegmentTree(int n_, BiFunction<T, T, T> bif, Supplier<T> sup) {
        n = 1;
        while (n < n_) n *= 2;

        dat = new ArrayList<>(2 * n - 1);
        for (int i = 0; i < 2 * n - 1; ++i) {
            dat.add(sup.get());
        }
        this.bif = bif;
        this.sup = sup;
    }

    /**
     * kの位置の値をvで更新する
     *
     * @param k index
     * @param v 新しい値
     */
    void set(int k, T v) {
        k += n - 1;
        dat.set(k, v);
        while (k > 0) {
            k = (k - 1) / 2;
            dat.set(k, bif.apply(dat.get(k * 2 + 1), dat.get(k * 2 + 2)));
        }
    }

    /**
     * クエリー
     *
     * @param l はじめ
     * @param r おわり
     * @return [l, r)での演算bifを適用した結果を返す
     */
    T reduce(int l, int r) {
        return _reduce(l, r, 0, 0, n);
    }

    T _reduce(int a, int b, int k, int l, int r) {
        if (r <= a || b <= l) return sup.get();
        if (a <= l && r <= b) return dat.get(k);
        T vl = _reduce(a, b, k * 2 + 1, l, (l + r) / 2);
        T vr = _reduce(a, b, k * 2 + 2, (l + r) / 2, r);
        return bif.apply(vl, vr);
    }
}

class UnionFind {
    int[] par;

    UnionFind(int n) {
        par = new int[n];
        for (int i = 0; i < n; ++i) {
            par[i] = i;
        }
    }

    int find(int x) {
        if (par[x] == x) {
            return x;
        }
        return par[x] = find(par[x]);
    }

    boolean same(int x, int y) {
        return find(x) == find(y);
    }

    void union(int x, int y) {
        x = find(x);
        y = find(y);
        if (x == y) {
            return;
        }
        par[x] = y;
    }
}