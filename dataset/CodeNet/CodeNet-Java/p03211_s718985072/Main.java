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
        ABC114_B solver = new ABC114_B();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC114_B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String str = in.next();
            int ans = Integer.MAX_VALUE;
            for (int i = 0; i < str.length() - 2; i++) {
                int split = Integer.parseInt(str.substring(i, i + 3));
                int abs = Math.abs(753 - split);
                ans = ans < abs ? ans : abs;
            }

            out.print(ans);

        }

    }
}

