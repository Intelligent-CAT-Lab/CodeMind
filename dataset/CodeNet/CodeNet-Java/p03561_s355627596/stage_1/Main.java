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
var newVariable_0 = list.add((k + 1) / 2);            }
            for (int i = 0; i < n / 2; i++) {
var newVariable_1 = list.get(list.size() - 1);var newVariable_2 = list.size();                if (list.get(newVariable_2 - 1) == 1) {
var newVariable_3 = list.remove(list.size() - 1);var newVariable_4 = list.size();                    list.remove(newVariable_4 - 1);
                } else {
var newVariable_5 = list.set(list.size() - 1, list.get(list.size() - 1) - 1);var newVariable_6 = list.size();var newVariable_7 = list.get(list.size() - 1);var newVariable_8 = list.size();                    list.set(newVariable_8 - 1, list.get(newVariable_8 - 1) - 1);
var newVariable_9 = list.size();var newVariable_10 = list.add(k);                    while (list.size() < n) newVariable_10;
                }
            }
var newVariable_11 = list.size();            for (int i = 0; i < newVariable_11; i++) {
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
var newVariable_12 = tok.hasMoreTokens();            while (!newVariable_12) {
                try {
var newVariable_13 = in.readLine();                    tok = new StringTokenizer(newVariable_13, " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
var newVariable_14 = tok.nextToken();            return newVariable_14;
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

