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
System.out.println("[INST]35;lo;BigInteger.valueOf(2);"+lo);
                if (lo.pow(take).compareTo(BigInteger.valueOf(2 * n)) > 0) break;
System.out.println("[INST]36;None;lo.pow(take).compareTo(BigInteger.valueOf(2 * n));"+lo.pow(take).compareTo(BigInteger.valueOf(2 * n)));
System.out.println("[INST]36;None;lo.pow(take);"+lo.pow(take));
System.out.println("[INST]36;None;BigInteger.valueOf(2 * n);"+BigInteger.valueOf(2 * n));
                BigInteger hi = BigInteger.valueOf(n);
System.out.println("[INST]37;hi;BigInteger.valueOf(n);"+hi);
                while (lo.compareTo(hi) < 0) {
System.out.println("[INST]38;None;lo.compareTo(hi);"+lo.compareTo(hi));
                    BigInteger mid = (lo.add(hi).shiftRight(1));
System.out.println("[INST]39;None;lo.add(hi).shiftRight(1);"+lo.add(hi).shiftRight(1));
System.out.println("[INST]39;None;lo.add(hi);"+lo.add(hi));
                    if (mid.pow(take + 1).compareTo(BigInteger.valueOf(n)) < 0) lo = mid.add(BigInteger.ONE);
System.out.println("[INST]40;None;mid.pow(take + 1).compareTo(BigInteger.valueOf(n));"+mid.pow(take + 1).compareTo(BigInteger.valueOf(n)));
System.out.println("[INST]40;None;mid.pow(take + 1);"+mid.pow(take + 1));
System.out.println("[INST]40;None;BigInteger.valueOf(n);"+BigInteger.valueOf(n));
System.out.println("[INST]40;lo;mid.add(BigInteger.ONE);"+lo);
                    else hi = mid;
                }
                long same = lo.longValue() - 1;
System.out.println("[INST]43;None;lo.longValue();"+lo.longValue());
                BigInteger total = BigInteger.ONE;
                for (int i = 0; i <= take; i++) total = total.multiply(BigInteger.valueOf(same));
System.out.println("[INST]45;total;total.multiply(BigInteger.valueOf(same));"+total);
System.out.println("[INST]45;None;BigInteger.valueOf(same);"+BigInteger.valueOf(same));
                long tmp = a * take + same * (take + 1);
                while (total.compareTo(BigInteger.valueOf(n)) < 0) {
System.out.println("[INST]47;None;total.compareTo(BigInteger.valueOf(n));"+total.compareTo(BigInteger.valueOf(n)));
System.out.println("[INST]47;None;BigInteger.valueOf(n);"+BigInteger.valueOf(n));
                    total = total.divide(BigInteger.valueOf(same));
System.out.println("[INST]48;total;total.divide(BigInteger.valueOf(same));"+total);
System.out.println("[INST]48;None;BigInteger.valueOf(same);"+BigInteger.valueOf(same));
                    total = total.multiply(BigInteger.valueOf(same + 1));
System.out.println("[INST]49;total;total.multiply(BigInteger.valueOf(same + 1));"+total);
System.out.println("[INST]49;None;BigInteger.valueOf(same + 1);"+BigInteger.valueOf(same + 1));
                    tmp++;
                }
                ans = Math.min(ans, tmp);
System.out.println("[INST]52;ans;Math.min(ans, tmp);"+ans);
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
System.out.println("[INST]70;None;tokenizer.hasMoreTokens();"+tokenizer.hasMoreTokens());
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
System.out.println("[INST]72;None;reader.readLine();"+reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
System.out.println("[INST]77;None;tokenizer.nextToken();"+tokenizer.nextToken());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

