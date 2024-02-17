import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ECellDistance solver = new ECellDistance();
        solver.solve(1, in, out);
        out.close();
    }

    static class ECellDistance {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            long n = in.nextInt();
            long m = in.nextInt();
            long k = in.nextInt();
            long mod = 10000_0000_7;
            long dist = 0;
            long temp = 0;
            for (long i = 1; i <= n; i++) {
//            for(int j=i+1;j<=n;j++){
//                temp += Math.abs(j-i);
//                temp%=mod;
//            }
                temp += i * (n - i);
                temp %= mod;
            }
            dist += (temp * ((m * m) % mod)) % mod;
            temp = 0;
            for (long i = 1; i <= m; i++) {
//            for(int j=i+1;j<=m;j++){
//                temp += Math.abs(j-i);
//                temp%=mod;
//            }
                temp += i * (m - i);
                temp %= mod;
            }
            dist += (temp * ((n * n) % mod)) % mod;
//        dist = (dist * Maths.power(2,mod-2,mod))%mod;
            long up = 1;
            long down = 1;
            for (int i = 1; i <= n * m - 2; i++) {
                up *= i;
                up %= mod;
            }
            for (int i = 1; i <= k - 2; i++) {
                down *= i;
                down %= mod;
            }
            for (int i = 1; i <= n * m - k; i++) {
                down *= i;
                down %= mod;
            }
            long downinv = Maths.power(down, mod - 2, mod);
            out.println((dist * ((up * downinv) % mod)) % mod);
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

    static class Maths {
        static long power(long x, long y, long p) {
            long res = 1;
            x = x % p;
            while (y > 0) {
                if ((y & 1) == 1)
                    res = (res * x) % p;
                y = y >> 1;
                x = (x * x) % p;
            }
            return res;
        }

    }
}

