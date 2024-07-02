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
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        static final long MODULO = (long) (1e9 + 7);

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            String s = in.next();
            boolean alternating = true;
            for (int i = 0; i + 1 < s.length(); ++i) if (s.charAt(i) == s.charAt(i + 1)) alternating = false;
System.out.println("[INST]31;None;s.length();"+s.length());
System.out.println("[INST]31;None;s.charAt(i);"+s.charAt(i));
System.out.println("[INST]31;None;s.charAt(i + 1);"+s.charAt(i + 1));
            if (alternating) {
                out.println(1);
                return;
            }
            int[] sum = new int[s.length() + 1];
System.out.println("[INST]36;None;s.length();"+s.length());
            for (int i = 0; i < s.length(); ++i) {
System.out.println("[INST]37;None;s.length();"+s.length());
                sum[i + 1] = sum[i];
                if (s.charAt(i) == 'a')
System.out.println("[INST]39;None;s.charAt(i);"+s.charAt(i));
                    sum[i + 1] += 1;
                else if (s.charAt(i) == 'b')
System.out.println("[INST]41;None;s.charAt(i);"+s.charAt(i));
                    sum[i + 1] += 2;
                else
                    throw new RuntimeException();
                sum[i + 1] %= 3;
            }
            int[][] next = new int[3][s.length() + 2];
System.out.println("[INST]47;None;s.length();"+s.length());
            for (int i = 0; i < 3; ++i) {
                next[i][s.length() + 1] = s.length() + 1;
System.out.println("[INST]49;None;s.length();"+s.length());
System.out.println("[INST]49;None;s.length();"+s.length());
            }
            for (int pos = s.length(); pos >= 0; --pos) {
System.out.println("[INST]51;pos;s.length();"+pos);
                for (int i = 0; i < 3; ++i) {
                    next[i][pos] = next[i][pos + 1];
                }
                next[sum[pos]][pos] = pos;
            }
            int total = sum[s.length()];
System.out.println("[INST]57;None;s.length();"+s.length());
            long[] ways = new long[s.length() + 2];
System.out.println("[INST]58;None;s.length();"+s.length());
            ways[0] = 1;
            for (int i = 0; i <= s.length(); ++i) {
System.out.println("[INST]60;None;s.length();"+s.length());
                int need = (sum[i] + 1) % 3;
                ways[next[need][i]] += ways[i];
                ways[next[need][i]] %= MODULO;
                need = (sum[i] + 2) % 3;
                ways[next[need][i]] += ways[i];
                ways[next[need][i]] %= MODULO;
            }
            long res = 0;
            for (int i = 1; i <= s.length(); ++i)
System.out.println("[INST]69;None;s.length();"+s.length());
                if (sum[i] == total) {
                    res = (res + ways[i]) % MODULO;
                }
            out.println(res);
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
System.out.println("[INST]88;None;tokenizer.hasMoreTokens();"+tokenizer.hasMoreTokens());
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
System.out.println("[INST]90;None;reader.readLine();"+reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
System.out.println("[INST]95;None;tokenizer.nextToken();"+tokenizer.nextToken());
        }

    }
}

