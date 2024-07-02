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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskG solver = new TaskG();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskG {
        public char[] c = "FESTIVA".toCharArray();
System.out.println("[INST]26;c;'FESTIVA'.toCharArray();"+c);

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            long k = in.nextLong();

            StringBuilder s = new StringBuilder();
            s.append("FESTIVA");
System.out.println("[INST]32;None;s.append('FESTIVA');"+s.append("FESTIVA"));
            int idx = 0;
            while (k > 0 && idx + 1 < c.length) {
                int base = idx * 25 + 100;
                for (int i = base; i >= 100; i--) {
                    if (k % i < k % base) {
                        base = i;
                    }
                }
                for (int i = 0; i < k % base; i++) {
                    s.append("L");
System.out.println("[INST]42;None;s.append('L');"+s.append("L"));
                }

                for (int pos = c.length - 1; pos >= idx; pos--) {
                    for (int i = 0; i < base - 1; i++) {
                        s.append(c[pos]);
System.out.println("[INST]47;None;s.append(c[pos]);"+s.append(c[pos]));
                    }
                }
                k /= base;
                idx++;
            }
            if (k > 0) {
                long sqrt = (long) (Math.sqrt(k));
System.out.println("[INST]54;None;Math.sqrt(k);"+Math.sqrt(k));
                for (int i = 0; i < k % sqrt; i++) s.append("L");
System.out.println("[INST]55;None;s.append('L');"+s.append("L"));
                for (int i = 0; i < sqrt - 1; i++) s.append(c[idx]);
System.out.println("[INST]56;None;s.append(c[idx]);"+s.append(c[idx]));
                k /= sqrt;
                while (k-- > 0) s.append("L");
System.out.println("[INST]58;None;s.append('L');"+s.append("L"));
            }
            out.println(s.toString());
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
System.out.println("[INST]75;None;tokenizer.hasMoreTokens();"+tokenizer.hasMoreTokens());
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
System.out.println("[INST]77;None;reader.readLine();"+reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
System.out.println("[INST]82;None;tokenizer.nextToken();"+tokenizer.nextToken());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

