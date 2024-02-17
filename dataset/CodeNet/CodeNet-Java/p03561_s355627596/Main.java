import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.InputMismatchException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int k = in.nextInt();
            int n = in.nextInt();

            if (k % 2 == 0) {
                out.print(k / 2);
                for (int i = 0; i < n - 1; i++) {
                    out.print(" " + k);
                }
                out.println();
                return;
            }

            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add((k + 1) / 2);
            }
            for (int i = 0; i < n / 2; i++) {
                if (list.get(list.size() - 1) == 1) {
                    list.remove(list.size() - 1);
                } else {
                    list.set(list.size() - 1, list.get(list.size() - 1) - 1);
                    while (list.size() < n) list.add(k);
                }
            }
            for (int i = 0; i < list.size(); i++) {
                if (i > 0) out.print(" ");
                out.print(list.get(i));
            }
            out.println();
        }

    }

    static class InputReader {
        BufferedReader in;
        StringTokenizer tok;

        public String nextString() {
            while (!tok.hasMoreTokens()) {
                try {
                    tok = new StringTokenizer(in.readLine(), " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
            return tok.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
            tok = new StringTokenizer("");
        }

    }
}

