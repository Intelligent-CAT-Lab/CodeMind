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
var newVariable_0 = lo.pow(take).compareTo(BigInteger.valueOf(2 * n));var newVariable_1 = lo.pow(take);var newVariable_2 = BigInteger.valueOf(2 * n);                if (lo.pow(take).compareTo(newVariable_2) > 0) break;
                BigInteger hi = BigInteger.valueOf(n);
var newVariable_3 = lo.compareTo(hi);                while (newVariable_3 < 0) {
var newVariable_4 = lo.add(hi).shiftRight(1);var newVariable_5 = lo.add(hi);                    BigInteger mid = (newVariable_5.shiftRight(1));
var newVariable_6 = mid.pow(take + 1).compareTo(BigInteger.valueOf(n));var newVariable_7 = mid.pow(take + 1);var newVariable_8 = BigInteger.valueOf(n);                    if (mid.pow(take + 1).compareTo(BigInteger.valueOf(n)) < 0) lo = mid.add(BigInteger.ONE);
                    else hi = mid;
                }
var newVariable_9 = lo.longValue();                long same = newVariable_9 - 1;
                BigInteger total = BigInteger.ONE;
var newVariable_10 = BigInteger.valueOf(same);                for (int i = 0; i <= take; i++) total = total.multiply(newVariable_10);
                long tmp = a * take + same * (take + 1);
var newVariable_11 = total.compareTo(BigInteger.valueOf(n));var newVariable_12 = BigInteger.valueOf(n);                while (total.compareTo(newVariable_12) < 0) {
var newVariable_13 = BigInteger.valueOf(same);                    total = total.divide(newVariable_13);
var newVariable_14 = BigInteger.valueOf(same + 1);                    total = total.multiply(newVariable_14);
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
var newVariable_15 = tokenizer.hasMoreTokens();            while (tokenizer == null || !newVariable_15) {
                try {
var newVariable_16 = reader.readLine();                    tokenizer = new StringTokenizer(newVariable_16);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
var newVariable_17 = tokenizer.nextToken();            return newVariable_17;
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

