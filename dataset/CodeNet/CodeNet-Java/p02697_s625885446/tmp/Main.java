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
                sb.append(o);
System.out.println("[INST]60;None;sb.append(o);"+sb.append(o));
                sb.append(" ");
System.out.println("[INST]61;None;sb.append(' ');"+sb.append(" "));
            }
            if (sb.length() > 0) {
System.out.println("[INST]63;None;sb.length();"+sb.length());
                sb.deleteCharAt(sb.length() - 1);
System.out.println("[INST]64;None;sb.deleteCharAt(sb.length() - 1);"+sb.deleteCharAt(sb.length() - 1));
System.out.println("[INST]64;None;sb.length();"+sb.length());
            }
            return sb.toString();
System.out.println("[INST]66;None;sb.toString();"+sb.toString());
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
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
System.out.println("[INST]84;None;tokenizer.hasMoreTokens();"+tokenizer.hasMoreTokens());
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
System.out.println("[INST]86;None;reader.readLine();"+reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
System.out.println("[INST]91;None;tokenizer.nextToken();"+tokenizer.nextToken());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

