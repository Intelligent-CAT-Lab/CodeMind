
import java.io.*;
import java.util.*;

/**
 * @author baito
 */

public class Main
{
    static StringBuilder sb = new StringBuilder();
    static FastScanner sc = new FastScanner(System.in);
    static int INF = 12345678;
    static long LINF = 123456789123456789L;
    static long MINF = -123456789123456789L;
    static long MOD = 1000000007;
    static int[] y4 = {0, 1, 0, -1};
    static int[] x4 = {1, 0, -1, 0};
    static int[] y8 = {0, 1, 0, -1, -1, 1, 1, -1};
    static int[] x8 = {1, 0, -1, 0, 1, -1, 1, -1};
    static long[] F;//factorial
    static boolean[] isPrime;
    static int[] primes;
    static char[][] map;

    static int N, M, K;
    static int[] A;


    public static void main(String[] args)
    {
        //longを忘れるなオーバーフローするぞ
        long X = sc.nextLong();
        long Y = sc.nextLong();
        long cou = 0;
        while(X <= Y){
            Y/=2;
            cou++;
        }
        System.out.println(cou);
    }

    public static Integer[] toIntegerArray(int[] ar)
    {
        Integer[] res = new Integer[ar.length];
        for (int i = 0; i < ar.length; i++)
        {
            res[i] = ar[i];
        }
        return res;
    }

    //k個の次の組み合わせをビットで返す 大きさに上限はない 110110 -> 111001
    public static int nextCombSizeK(int comb, int k)
    {
        int x = comb & -comb; //最下位の1
        int y = comb + x; //連続した下の1を繰り上がらせる
        return ((comb & ~y) / x >> 1) | y;
    }

    public static int keta(long num)
    {
        int res = 0;
        while (num > 0)
        {
            num /= 10;
            res++;
        }
        return res;
    }

    public static long getHashKey(int a, int b)
    {
        return (long) a << 32 | b;
    }

    public static boolean isOutofIndex(int x, int y)
    {
        if (x < 0 || y < 0) return true;
        if (map[0].length <= x || map.length <= y) return true;
        return false;
    }

    public static void setPrimes()
    {
        int n = 100001;
        isPrime = new boolean[n];
        List<Integer> prs = new ArrayList<>();
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= n; i++)
        {
            if (!isPrime[i]) continue;
            prs.add(i);
            for (int j = i * 2; j < n; j += i)
            {
                isPrime[j] = false;
            }
        }
        primes = new int[prs.size()];
        for (int i = 0; i < prs.size(); i++)
            primes[i] = prs.get(i);
    }

    public static void revSort(int[] a)
    {
        Arrays.sort(a);
        reverse(a);
    }

    public static void revSort(long[] a)
    {
        Arrays.sort(a);
        reverse(a);
    }

    public static int[][] copy(int[][] ar)
    {
        int[][] nr = new int[ar.length][ar[0].length];
        for (int i = 0; i < ar.length; i++)
            for (int j = 0; j < ar[0].length; j++)
                nr[i][j] = ar[i][j];
        return nr;
    }

    /**
     * <h1>指定した値以上の先頭のインデクスを返す</h1>
     * <p>配列要素が０のときは、０が返る。</p>
     *
     * @return<b>int</b> ： 探索した値以上で、先頭になるインデクス
     * 値が無ければ、挿入できる最小のインデックス
     */
    public static int lowerBound(final int[] arr, final int value)
    {
        int low = 0;
        int high = arr.length;
        int mid;

        while (low < high)
        {
            mid = ((high - low) >>> 1) + low;    //(low + high) / 2 (オーバーフロー対策)
            if (arr[mid] < value)
            {
                low = mid + 1;
            }
            else
            {
                high = mid;
            }
        }
        return low;
    }

    /**
     * <h1>指定した値より大きい先頭のインデクスを返す</h1>
     * <p>配列要素が０のときは、０が返る。</p>
     *
     * @return<b>int</b> ： 探索した値より上で、先頭になるインデクス
     * 値が無ければ、挿入できる最小のインデックス
     */
    public static int upperBound(final int[] arr, final int value)
    {
        int low = 0;
        int high = arr.length;
        int mid;
        while (low < high)
        {
            mid = ((high - low) >>> 1) + low;    //(low + high) / 2 (オーバーフロー対策)
            if (arr[mid] <= value)
            {
                low = mid + 1;
            }
            else
            {
                high = mid;
            }
        }
        return low;
    }

    /**
     * <h1>指定した値以上の先頭のインデクスを返す</h1>
     * <p>配列要素が０のときは、０が返る。</p>
     *
     * @return<b>int</b> ： 探索した値以上で、先頭になるインデクス
     * 値がなければ挿入できる最小のインデックス
     */
    public static long lowerBound(final long[] arr, final long value)
    {
        int low = 0;
        int high = arr.length;
        int mid;
        while (low < high)
        {
            mid = ((high - low) >>> 1) + low;    //(low + high) / 2 (オーバーフロー対策)
            if (arr[mid] < value)
            {
                low = mid + 1;
            }
            else
            {
                high = mid;
            }
        }
        return low;
    }

    /**
     * <h1>指定した値より大きい先頭のインデクスを返す</h1>
     * <p>配列要素が０のときは、０が返る。</p>
     *
     * @return<b>int</b> ： 探索した値より上で、先頭になるインデクス
     * 値がなければ挿入できる最小のインデックス
     */
    public static long upperBound(final long[] arr, final long value)
    {
        int low = 0;
        int high = arr.length;
        int mid;
        while (low < high)
        {
            mid = ((high - low) >>> 1) + low;    //(low + high) / 2 (オーバーフロー対策)
            if (arr[mid] <= value)
            {
                low = mid + 1;
            }
            else
            {
                high = mid;
            }
        }
        return low;
    }

    //次の順列に書き換える、最大値ならfalseを返す
    public static boolean nextPermutation(int A[])
    {
        int len = A.length;
        int pos = len - 2;
        for (; pos >= 0; pos--)
        {
            if (A[pos] < A[pos + 1]) break;
        }
        if (pos == -1) return false;

        //posより大きい最小の数を二分探索
        int ok = pos + 1;
        int ng = len;
        while (Math.abs(ng - ok) > 1)
        {
            int mid = (ok + ng) / 2;
            if (A[mid] > A[pos]) ok = mid;
            else ng = mid;

        }

        swap(A, pos, ok);
        reverse(A, pos + 1, len - 1);


        return true;
    }

    //次の順列に書き換える、最小値ならfalseを返す
    public static boolean prevPermutation(int A[])
    {
        int len = A.length;
        int pos = len - 2;
        for (; pos >= 0; pos--)
        {
            if (A[pos] > A[pos + 1]) break;
        }
        if (pos == -1) return false;

        //posより小さい最大の数を二分探索
        int ok = pos + 1;
        int ng = len;
        while (Math.abs(ng - ok) > 1)
        {
            int mid = (ok + ng) / 2;
            if (A[mid] < A[pos]) ok = mid;
            else ng = mid;

        }

        swap(A, pos, ok);
        reverse(A, pos + 1, len - 1);


        return true;
    }

    //↓nCrをmod計算するために必要。　***factorial(N)を呼ぶ必要がある***
    static long ncr(int n, int r)
    {
        if (n < r) return 0;
        else if (r == 0) return 1;

        factorial(n);
        return F[n] / (F[n - r] * F[r]);
    }

    static long ncr2(int a, int b)
    {
        if (b == 0) return 1;
        else if (a < b) return 0;
        long res = 1;
        for (int i = 0; i < b; i++)
        {
            res *= a - i;
            res /= i + 1;
        }
        return res;
    }

    static long ncrdp(int n, int r)
    {
        if (n < r) return 0;
        long[][] dp = new long[n + 1][r + 1];
        for (int ni = 0; ni < n + 1; ni++)
        {
            dp[ni][0] = dp[ni][ni] = 1;
            for (int ri = 1; ri < ni; ri++)
            {
                dp[ni][ri] = dp[ni - 1][ri - 1] + dp[ni - 1][ri];
            }
        }
        return dp[n][r];
    }

    static long modNcr(int n, int r)
    {
        if (n < r) return 0;
        long result = F[n];
        result = result * modInv(F[n - r]) % MOD;
        result = result * modInv(F[r]) % MOD;
        return result;
    }

    public static long modSum(long... lar)
    {
        long res = 0;
        for (long l : lar)
            res = (res + l % MOD) % MOD;
        if (res < 0) res += MOD;
        res %= MOD;
        return res;
    }

    public static long modDiff(long a, long b)
    {
        long res = a % MOD - b % MOD;
        if (res < 0) res += MOD;
        res %= MOD;
        return res;
    }

    public static long modMul(long... lar)
    {
        long res = 1;
        for (long l : lar)
            res = (res * l % MOD) % MOD;
        if (res < 0) res += MOD;
        res %= MOD;
        return res;
    }

    public static long modDiv(long a, long b)
    {
        long x = a % MOD;
        long y = b % MOD;
        long res = (x * modInv(y)) % MOD;
        return res;
    }

    static long modInv(long n)
    {
        return modPow(n, MOD - 2);
    }

    static void factorial(int n)
    {
        F = new long[n + 1];
        F[0] = F[1] = 1;
//        for (int i = 2; i <= n; i++)
//        {
//            F[i] = (F[i - 1] * i) % MOD;
//        }
        //
        for (int i = 2; i <= 100000; i++)
        {
            F[i] = (F[i - 1] * i) % MOD;
        }
        for (int i = 100001; i <= n; i++)
        {
            F[i] = (F[i - 1] * i) % MOD;
        }
    }

    static long modPow(long x, long n)
    {
        long res = 1L;
        while (n > 0)
        {
            if ((n & 1) == 1)
            {
                res = res * x % MOD;
            }
            x = x * x % MOD;
            n >>= 1;
        }
        return res;
    }

    //↑nCrをmod計算するために必要

    static int gcd(int n, int r)
    {
        return r == 0 ? n : gcd(r, n % r);
    }

    static long gcd(long n, long r)
    {
        return r == 0 ? n : gcd(r, n % r);
    }

    static <T> void swap(T[] x, int i, int j)
    {
        T t = x[i];
        x[i] = x[j];
        x[j] = t;
    }

    static void swap(int[] x, int i, int j)
    {
        int t = x[i];
        x[i] = x[j];
        x[j] = t;
    }

    public static void reverse(int[] x)
    {
        int l = 0;
        int r = x.length - 1;
        while (l < r)
        {
            int temp = x[l];
            x[l] = x[r];
            x[r] = temp;
            l++;
            r--;
        }
    }

    public static void reverse(long[] x)
    {
        int l = 0;
        int r = x.length - 1;
        while (l < r)
        {
            long temp = x[l];
            x[l] = x[r];
            x[r] = temp;
            l++;
            r--;
        }
    }

    public static void reverse(char[] x)
    {
        int l = 0;
        int r = x.length - 1;
        while (l < r)
        {
            char temp = x[l];
            x[l] = x[r];
            x[r] = temp;
            l++;
            r--;
        }
    }

    public static void reverse(int[] x, int s, int e)
    {
        int l = s;
        int r = e;
        while (l < r)
        {
            int temp = x[l];
            x[l] = x[r];
            x[r] = temp;
            l++;
            r--;
        }
    }

    static int length(int a)
    {
        int cou = 0;
        while (a != 0)
        {
            a /= 10;
            cou++;
        }
        return cou;
    }

    static int length(long a)
    {
        int cou = 0;
        while (a != 0)
        {
            a /= 10;
            cou++;
        }
        return cou;
    }

    static int cou(boolean[] a)
    {
        int res = 0;
        for (boolean b : a)
        {
            if (b) res++;
        }
        return res;
    }

    static int cou(String s, char c)
    {
        int res = 0;
        for (char ci : s.toCharArray())
        {
            if (ci == c) res++;
        }
        return res;
    }

    static int countC2(char[][] a, char c)
    {
        int co = 0;
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                if (a[i][j] == c) co++;
        return co;
    }

    static int countI(int[] a, int key)
    {
        int co = 0;
        for (int i = 0; i < a.length; i++)
            if (a[i] == key) co++;
        return co;
    }

    static int countI(int[][] a, int key)
    {
        int co = 0;
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                if (a[i][j] == key) co++;
        return co;
    }

    static void fill(int[][] a, int v)
    {
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                a[i][j] = v;
    }


    static void fill(long[][] a, long v)
    {
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                a[i][j] = v;
    }

    static void fill(int[][][] a, int v)
    {
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                for (int k = 0; k < a[0][0].length; k++)
                    a[i][j][k] = v;
    }

    static int max(int... a)
    {
        int res = Integer.MIN_VALUE;
        for (int i : a)
        {
            res = Math.max(res, i);
        }
        return res;
    }

    static long min(long... a)
    {
        long res = Long.MAX_VALUE;
        for (long i : a)
        {
            res = Math.min(res, i);
        }
        return res;
    }

    static int max(int[][] ar)
    {
        int res = Integer.MIN_VALUE;
        for (int i[] : ar)
            res = Math.max(res, max(i));
        return res;
    }

    static int min(int... a)
    {
        int res = Integer.MAX_VALUE;
        for (int i : a)
        {
            res = Math.min(res, i);
        }
        return res;
    }


    static int min(int[][] ar)
    {
        int res = Integer.MAX_VALUE;
        for (int i[] : ar)
            res = Math.min(res, min(i));
        return res;
    }

    static int sum(int[] a)
    {
        int cou = 0;
        for (int i : a)
            cou += i;
        return cou;
    }

    static int abs(int a)
    {
        return Math.abs(a);
    }

    static class FastScanner
    {

        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public FastScanner(InputStream in)
        {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        public String next()
        {
            if (tokenizer == null || !tokenizer.hasMoreTokens())
            {
                try
                {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e)
                {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        /*public String nextChar(){
            return (char)next()[0];
        }*/
        public String nextLine()
        {
            if (tokenizer == null || !tokenizer.hasMoreTokens())
            {
                try
                {
                    return reader.readLine();
                } catch (IOException e)
                {
                    throw new RuntimeException(e);
                }
            }

            return tokenizer.nextToken("\n");
        }

        public long nextLong()
        {
            return Long.parseLong(next());
        }

        public int nextInt()
        {
            return Integer.parseInt(next());
        }

        public double nextDouble()
        {
            return Double.parseDouble(next());
        }

        public int[] nextIntArray(int n)
        {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
            {
                a[i] = nextInt();
            }
            return a;
        }

        public int[] nextIntArrayDec(int n)
        {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
            {
                a[i] = nextInt() - 1;
            }
            return a;
        }

        public int[][] nextIntArray2(int h, int w)
        {
            int[][] a = new int[h][w];
            for (int hi = 0; hi < h; hi++)
            {
                for (int wi = 0; wi < w; wi++)
                {
                    a[hi][wi] = nextInt();
                }
            }
            return a;
        }

        public int[][] nextIntArray2Dec(int h, int w)
        {
            int[][] a = new int[h][w];
            for (int hi = 0; hi < h; hi++)
            {
                for (int wi = 0; wi < w; wi++)
                {
                    a[hi][wi] = nextInt() - 1;
                }
            }
            return a;
        }

        //複数の配列を受け取る
        public void nextIntArrays2ar(int[] a, int[] b)
        {
            for (int i = 0; i < a.length; i++)
            {
                a[i] = sc.nextInt();
                b[i] = sc.nextInt();
            }
        }

        public void nextIntArrays2arDec(int[] a, int[] b)
        {
            for (int i = 0; i < a.length; i++)
            {
                a[i] = sc.nextInt() - 1;
                b[i] = sc.nextInt() - 1;
            }
        }

        //複数の配列を受け取る
        public void nextIntArrays3ar(int[] a, int[] b, int[] c)
        {
            for (int i = 0; i < a.length; i++)
            {
                a[i] = sc.nextInt();
                b[i] = sc.nextInt();
                c[i] = sc.nextInt();
            }
        }

        //複数の配列を受け取る
        public void nextIntArrays3arDecLeft2(int[] a, int[] b, int[] c)
        {
            for (int i = 0; i < a.length; i++)
            {
                a[i] = sc.nextInt() - 1;
                b[i] = sc.nextInt() - 1;
                c[i] = sc.nextInt();
            }
        }

        public Integer[] nextIntegerArray(int n)
        {
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++)
            {
                a[i] = nextInt();
            }
            return a;
        }

        public char[] nextCharArray(int n)
        {
            char[] a = next().toCharArray();

            return a;
        }

        public char[][] nextCharArray2(int h, int w)
        {
            char[][] a = new char[h][w];
            for (int i = 0; i < h; i++)
            {
                a[i] = next().toCharArray();
            }
            return a;
        }

        //スペースが入っている場合
        public char[][] nextCharArray2s(int h, int w)
        {
            char[][] a = new char[h][w];
            for (int i = 0; i < h; i++)
            {
                a[i] = nextLine().replace(" ", "").toCharArray();
            }
            return a;
        }

        public char[][] nextWrapCharArray2(int h, int w, char c)
        {
            char[][] a = new char[h + 2][w + 2];
            //char c = '*';
            int i;
            for (i = 0; i < w + 2; i++)
                a[0][i] = c;
            for (i = 1; i < h + 1; i++)
            {
                a[i] = (c + next() + c).toCharArray();
            }
            for (i = 0; i < w + 2; i++)
                a[h + 1][i] = c;
            return a;
        }

        //スペースが入ってる時用
        public char[][] nextWrapCharArray2s(int h, int w, char c)
        {
            char[][] a = new char[h + 2][w + 2];
            //char c = '*';
            int i;
            for (i = 0; i < w + 2; i++)
                a[0][i] = c;
            for (i = 1; i < h + 1; i++)
            {
                a[i] = (c + nextLine().replace(" ", "") + c).toCharArray();
            }
            for (i = 0; i < w + 2; i++)
                a[h + 1][i] = c;
            return a;
        }

        public long[] nextLongArray(int n)
        {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
            {
                a[i] = nextLong();
            }
            return a;
        }

        public long[][] nextLongArray2(int h, int w)
        {
            long[][] a = new long[h][w];
            for (int hi = 0; hi < h; hi++)
            {
                for (int wi = 0; wi < w; wi++)
                {
                    a[hi][wi] = nextLong();
                }
            }
            return a;
        }
    }
}
