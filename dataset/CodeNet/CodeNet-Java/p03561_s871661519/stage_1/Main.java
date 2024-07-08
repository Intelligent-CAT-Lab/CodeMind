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
var newVariable_0 = res.add((k + 1) / 2);                for (int i = 0; i < n; ++i) newVariable_0;
                int cnt = n / 2;

                for (int i = 0; i < cnt; ++i) {
var newVariable_1 = res.get(res.size() - 1);var newVariable_2 = res.size();                    if (res.get(newVariable_2 - 1) > 1) {
var newVariable_3 = res.set(res.size() - 1, res.get(res.size() - 1) - 1);var newVariable_4 = res.size();var newVariable_5 = res.get(res.size() - 1);var newVariable_6 = res.size();                        res.set(newVariable_6 - 1, res.get(newVariable_6 - 1) - 1);
var newVariable_7 = res.size();var newVariable_8 = res.add(k);                        while (res.size() < n) newVariable_8;
                    } else {
var newVariable_9 = res.remove(res.size() - 1);var newVariable_10 = res.size();                        res.remove(newVariable_10 - 1);
                    }
                }

var newVariable_11 = res.size();                for (int i = 0; i < newVariable_11; ++i) {
                    out.print(res.get(i));
var newVariable_12 = res.size();                    if (i < newVariable_12 - 1) {
                        out.print(" ");
                    } else {
                        out.println();
                    }
                }
            }
        }

    }
}

