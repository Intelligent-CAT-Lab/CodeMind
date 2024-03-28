import java.io.*;
import java.util.*;
import java.math.*;

public class atcoder_ABC172_D {
    static final int MOD = 1000000007;
    static final double INF = Double.POSITIVE_INFINITY;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        solve(sc);
    }

    static void solve(FastScanner sc) {
        long n = sc.nextLong();
        long ans = 0;
        for (long i = 1; i <= n; i++) {
            long x = n / i;
            ans += i * (1 + x) * x / 2;
        }
        System.out.println(ans);
    }

    // FastScanner
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        long nextLong() {
            return Long.parseLong(next());
        }
        
        int nextInt() {
            return Integer.parseInt(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String line = "";
            try {
                line = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return line;
        }
    }
}