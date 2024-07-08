import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Jail solver = new Jail();
        solver.solve(1, in, out);
        out.close();
    }

    static class Jail {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long N = in.nextInt();
            long K = in.nextInt();
            long ans = 0;
            for (int i = 0; i < N - 1; i++) {
                ans += ans / (K - 1) + 1;
            }
            out.println(ans);
        }

    }
}


