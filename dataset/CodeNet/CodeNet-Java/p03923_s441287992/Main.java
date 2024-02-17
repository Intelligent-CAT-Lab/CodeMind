import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.math.BigInteger;
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
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        public long n;
        public long a;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            n = in.nextLong();
            a = in.nextLong();
            long ans = n;
            for (int take = 1; take <= 40; take++) {
                BigInteger lo = BigInteger.valueOf(2);
                if (lo.pow(take).compareTo(BigInteger.valueOf(2 * n)) > 0) break;
                BigInteger hi = BigInteger.valueOf(n);
                while (lo.compareTo(hi) < 0) {
                    BigInteger mid = (lo.add(hi).shiftRight(1));
                    if (mid.pow(take + 1).compareTo(BigInteger.valueOf(n)) < 0) lo = mid.add(BigInteger.ONE);
                    else hi = mid;
                }
                long same = lo.longValue() - 1;
                BigInteger total = BigInteger.ONE;
                for (int i = 0; i <= take; i++) total = total.multiply(BigInteger.valueOf(same));
                long tmp = a * take + same * (take + 1);
                while (total.compareTo(BigInteger.valueOf(n)) < 0) {
                    total = total.divide(BigInteger.valueOf(same));
                    total = total.multiply(BigInteger.valueOf(same + 1));
                    tmp++;
                }
                ans = Math.min(ans, tmp);
            }

            out.println(ans);
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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

