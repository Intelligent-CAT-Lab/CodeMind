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
 * @author AnandOza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ERotationMatching solver = new ERotationMatching();
        solver.solve(1, in, out);
        out.close();
    }

    static class ERotationMatching {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt(), m = in.nextInt();

            if (n % 2 == 1) {
                for (int i = 0; i < m; i++) {
                    out.println(Util.join(i + 1, 2 * m - i));
                }
                return;
            }

            int i = n / 2, j = n / 2 + 1;
            while ((j - i) < n / 2 && m > 0) {
                out.println(Util.join(i, j));
                i--;
                j++;
                m--;
            }
            j++;
            while (m > 0) {
                out.println(Util.join(i, j));
                i--;
                j++;
                m--;
            }
        }

    }

    static class Util {
        public static String join(int... i) {
            StringBuilder sb = new StringBuilder();
            for (int o : i) {
var newVariable_0 = sb.append(o);var newVariable_1 = sb.append(" ");            }
var newVariable_2 = sb.length();            if (newVariable_2 > 0) {
var newVariable_3 = sb.deleteCharAt(sb.length() - 1);var newVariable_4 = sb.length();                sb.deleteCharAt(newVariable_4 - 1);
            }
var newVariable_5 = sb.toString();            return newVariable_5;
        }

        private Util() {
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
var newVariable_6 = tokenizer.hasMoreTokens();            while (tokenizer == null || !newVariable_6) {
                try {
var newVariable_7 = reader.readLine();                    tokenizer = new StringTokenizer(newVariable_7);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
var newVariable_8 = tokenizer.nextToken();            return newVariable_8;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

