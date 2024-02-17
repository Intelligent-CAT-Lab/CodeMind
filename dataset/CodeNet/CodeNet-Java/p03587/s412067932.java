import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AAccepted solver = new AAccepted();
        solver.solve(1, in, out);
        out.close();
    }

    static class AAccepted {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            int n = 0;
            for (char c : s.toCharArray()) {
                if (c == '1') n++;
            }
            out.println(n);
        }

    }
}

