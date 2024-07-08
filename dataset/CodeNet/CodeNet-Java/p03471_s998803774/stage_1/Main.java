import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.InputMismatchException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author amotoma3
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            long n = in.nextLong();
            long y = in.nextLong();
            for (int i = 0; i <= 2000; i++) {
                for (int j = 0; j <= 2000; j++) {
                    if (n - i - j < 0) continue;

                    if (10000L * i + 5000L * j + 1000L * (n - i - j) == y) {
                        out.println(i + " " + j + " " + (n - i - j));
                        return;
                    }
                }
            }

            out.println("-1 -1 -1");
        }

    }

    static class InputReader {
        BufferedReader in;
        StringTokenizer tok;

        public String nextString() {
var newVariable_0 = tok.hasMoreTokens();            while (!newVariable_0) {
                try {
var newVariable_1 = in.readLine();                    tok = new StringTokenizer(newVariable_1, " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
var newVariable_2 = tok.nextToken();            return newVariable_2;
        }

        public long nextLong() {
            return Long.parseLong(nextString());
        }

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
            tok = new StringTokenizer("");
        }

    }
}

