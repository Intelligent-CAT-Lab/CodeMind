import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author ZYCSwing
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int k = in.nextInt();
            int n = in.nextInt();

            if (k % 2 == 0) {
                out.print(k / 2);
                for (int i = 1; i < n; ++i) {
                    out.print(" " + k);
                }
                out.println();
            } else {
                List<Integer> res = new ArrayList<>();
                for (int i = 0; i < n; ++i) res.add((k + 1) / 2);
                int cnt = n / 2;

                for (int i = 0; i < cnt; ++i) {
                    if (res.get(res.size() - 1) > 1) {
                        res.set(res.size() - 1, res.get(res.size() - 1) - 1);
                        while (res.size() < n) res.add(k);
                    } else {
                        res.remove(res.size() - 1);
                    }
                }

                for (int i = 0; i < res.size(); ++i) {
                    out.print(res.get(i));
                    if (i < res.size() - 1) {
                        out.print(" ");
                    } else {
                        out.println();
                    }
                }
            }
        }

    }
}

