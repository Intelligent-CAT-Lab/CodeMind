import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static class Task {

        private static final int MOD = (int) (1e9 + 7);

        // 参考 https://www.cnblogs.com/zaq19970105/p/10775072.html
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int m = in.nextInt();
            int n = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();

            if (a == m || b == n) {
                out.println(0);
                return;
            }

            // 组合数
            CombinationInv combination = new CombinationInv(MOD, m + n);
            long ans = 0;
            for (int i = 0; i <= m - a - 1; i++) {
                // 从(0, 0)到(i, b - 1)的方案数就是C(i + b - 1, i)
                // 从(i, b)到(m-1, n-1)的方案数是C(n - b - 1 + (m - i - 1), n - b - 1)
                // 当前总的方案就是上面二者相乘
                long count1 = combination.c(i + b - 1, i);
                long count2 = combination.c(n - b - 1 + (m - i - 1), n - b - 1);
                ans = (ans + count1 * count2) % MOD;
            }

            out.println(ans);

        }
    }

    // 使用乘法逆元求组合数，当mod是素数且较大时
    public static class CombinationInv {

        private long mod;
        private long[] frac;
        private long[] inv;

        public CombinationInv(long mod, int MAXN) {
            this.mod = mod;
            frac = new long[MAXN + 10];
            inv = new long[MAXN + 10];
            frac[0] = inv[0] = 1;
            init(MAXN);
        }

        private void init(int m) {
            for (int i = 1; i <= m; i++) {
                frac[i] = frac[i - 1] * i % mod;
                inv[i] = pow(frac[i], mod - 2);
            }
        }

        // 快速pow 二分
        private long pow(long x, long n) {
            long res = 1;
            x %= mod;
            while (n > 0) {
                if ((n & 1) == 1) {
                    res = (res * x) % mod;
                }

                x = (x * x) % mod;
                n >>= 1;
            }
            return res % mod;
        }

        public long c(int n, int m) {
            if (m < 0 || n < m) {
                return 0;
            }

            if (m > n - m) {
                m = n - m;
            }

            return frac[n] * inv[m] % mod * inv[n - m] % mod;
        }

    }

    private static void sort(double[] arr) {
        Double[] objArr = Arrays.stream(arr).boxed().toArray(Double[]::new);
        Arrays.sort(objArr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = objArr[i];
        }
    }

    private static void sort(int[] arr) {
        Integer[] objArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(objArr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = objArr[i];
        }
    }

    private static void sort(long[] arr) {
        Long[] objArr = Arrays.stream(arr).boxed().toArray(Long[]::new);
        Arrays.sort(objArr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = objArr[i];
        }
    }

    private static void solve() {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task task = new Task();
        task.solve(1, in, out);
        out.close();
    }

    public static void main(String[] args) {
        new Thread(null, () -> solve(), "1", 1 << 26).start();
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

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

    }

}
