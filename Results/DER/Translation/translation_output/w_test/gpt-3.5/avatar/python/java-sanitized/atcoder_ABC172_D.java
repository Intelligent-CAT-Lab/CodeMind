import java.util.*;
import java.io.*;
import java.math.*;

public class atcoder_ABC172_D {
    static final long MOD = 1000000007;
    
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        long n = sc.nextLong();
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            long x = n / i;
            ans += i * (1 + x) * x / 2;
        }
        System.out.println(ans);
    }

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

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}