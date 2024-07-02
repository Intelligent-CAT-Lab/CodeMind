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
System.out.println("[INST]44;None;list.add((k + 1) / 2);"+list.add((k + 1) / 2));
            }
            for (int i = 0; i < n / 2; i++) {
                if (list.get(list.size() - 1) == 1) {
System.out.println("[INST]47;None;list.get(list.size() - 1);"+list.get(list.size() - 1));
System.out.println("[INST]47;None;list.size();"+list.size());
                    list.remove(list.size() - 1);
System.out.println("[INST]48;None;list.remove(list.size() - 1);"+list.remove(list.size() - 1));
System.out.println("[INST]48;None;list.size();"+list.size());
                } else {
                    list.set(list.size() - 1, list.get(list.size() - 1) - 1);
System.out.println("[INST]50;None;list.set(list.size() - 1, list.get(list.size() - 1) - 1);"+list.set(list.size() - 1, list.get(list.size() - 1) - 1));
System.out.println("[INST]50;None;list.size();"+list.size());
System.out.println("[INST]50;None;list.get(list.size() - 1);"+list.get(list.size() - 1));
System.out.println("[INST]50;None;list.size();"+list.size());
                    while (list.size() < n) list.add(k);
System.out.println("[INST]51;None;list.size();"+list.size());
System.out.println("[INST]51;None;list.add(k);"+list.add(k));
                }
            }
            for (int i = 0; i < list.size(); i++) {
System.out.println("[INST]54;None;list.size();"+list.size());
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
System.out.println("[INST]68;None;tok.hasMoreTokens();"+tok.hasMoreTokens());
                try {
                    tok = new StringTokenizer(in.readLine(), " ");
System.out.println("[INST]70;None;in.readLine();"+in.readLine());
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
            return tok.nextToken();
System.out.println("[INST]75;None;tok.nextToken();"+tok.nextToken());
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

