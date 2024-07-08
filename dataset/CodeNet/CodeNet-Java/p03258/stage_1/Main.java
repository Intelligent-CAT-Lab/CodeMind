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
var newVariable_0 = s.length();var newVariable_1 = s.charAt(i);var newVariable_2 = s.charAt(i + 1);            for (int i = 0; i + 1 < s.length(); ++i) if (s.charAt(i) == newVariable_2) alternating = false;
            if (alternating) {
                out.println(1);
                return;
            }
var newVariable_3 = s.length();            int[] sum = new int[newVariable_3 + 1];
var newVariable_4 = s.length();            for (int i = 0; i < newVariable_4; ++i) {
                sum[i + 1] = sum[i];
var newVariable_5 = s.charAt(i);                if (newVariable_5 == 'a')
                    sum[i + 1] += 1;
var newVariable_6 = s.charAt(i);                else if (newVariable_6 == 'b')
                    sum[i + 1] += 2;
                else
                    throw new RuntimeException();
                sum[i + 1] %= 3;
            }
var newVariable_7 = s.length();            int[][] next = new int[3][newVariable_7 + 2];
            for (int i = 0; i < 3; ++i) {
var newVariable_8 = s.length();var newVariable_9 = s.length();                next[i][newVariable_9 + 1] = newVariable_9 + 1;
            }
            for (int pos = s.length(); pos >= 0; --pos) {
                for (int i = 0; i < 3; ++i) {
                    next[i][pos] = next[i][pos + 1];
                }
                next[sum[pos]][pos] = pos;
            }
var newVariable_10 = s.length();            int total = sum[newVariable_10];
var newVariable_11 = s.length();            long[] ways = new long[newVariable_11 + 2];
            ways[0] = 1;
var newVariable_12 = s.length();            for (int i = 0; i <= newVariable_12; ++i) {
                int need = (sum[i] + 1) % 3;
                ways[next[need][i]] += ways[i];
                ways[next[need][i]] %= MODULO;
                need = (sum[i] + 2) % 3;
                ways[next[need][i]] += ways[i];
                ways[next[need][i]] %= MODULO;
            }
            long res = 0;
var newVariable_13 = s.length();            for (int i = 1; i <= newVariable_13; ++i)
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
var newVariable_14 = tokenizer.hasMoreTokens();            while (tokenizer == null || !newVariable_14) {
                try {
var newVariable_15 = reader.readLine();                    tokenizer = new StringTokenizer(newVariable_15);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
var newVariable_16 = tokenizer.nextToken();            return newVariable_16;
        }

    }
}

