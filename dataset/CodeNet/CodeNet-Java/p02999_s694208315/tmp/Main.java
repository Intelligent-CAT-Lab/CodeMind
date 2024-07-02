import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author teiwa
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int X = in.nextInt();
System.out.println("[INST]25;X;in.nextInt();"+X);
            int A = in.nextInt();
System.out.println("[INST]26;A;in.nextInt();"+A);
            if (X < A) {
                out.println(0);
            } else {
                out.println(10);
            }
        }

    }
}

