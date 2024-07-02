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
System.out.println("[INST]27;k;in.nextInt();"+k);
            int n = in.nextInt();
System.out.println("[INST]28;n;in.nextInt();"+n);

            if (k % 2 == 0) {
                out.print(k / 2);
                for (int i = 1; i < n; ++i) {
                    out.print(" " + k);
                }
                out.println();
            } else {
                List<Integer> res = new ArrayList<>();
                for (int i = 0; i < n; ++i) res.add((k + 1) / 2);
System.out.println("[INST]38;None;res.add((k + 1) / 2);"+res.add((k + 1) / 2));
                int cnt = n / 2;

                for (int i = 0; i < cnt; ++i) {
                    if (res.get(res.size() - 1) > 1) {
System.out.println("[INST]42;None;res.get(res.size() - 1);"+res.get(res.size() - 1));
System.out.println("[INST]42;None;res.size();"+res.size());
                        res.set(res.size() - 1, res.get(res.size() - 1) - 1);
System.out.println("[INST]43;None;res.set(res.size() - 1, res.get(res.size() - 1) - 1);"+res.set(res.size() - 1, res.get(res.size() - 1) - 1));
System.out.println("[INST]43;None;res.size();"+res.size());
System.out.println("[INST]43;None;res.get(res.size() - 1);"+res.get(res.size() - 1));
System.out.println("[INST]43;None;res.size();"+res.size());
                        while (res.size() < n) res.add(k);
System.out.println("[INST]44;None;res.size();"+res.size());
System.out.println("[INST]44;None;res.add(k);"+res.add(k));
                    } else {
                        res.remove(res.size() - 1);
System.out.println("[INST]46;None;res.remove(res.size() - 1);"+res.remove(res.size() - 1));
System.out.println("[INST]46;None;res.size();"+res.size());
                    }
                }

                for (int i = 0; i < res.size(); ++i) {
System.out.println("[INST]50;None;res.size();"+res.size());
                    out.print(res.get(i));
                    if (i < res.size() - 1) {
System.out.println("[INST]52;None;res.size();"+res.size());
                        out.print(" ");
                    } else {
                        out.println();
                    }
                }
            }
        }

    }
}

