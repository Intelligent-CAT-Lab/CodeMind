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
        DoubleFactorial solver = new DoubleFactorial();
        solver.solve(1, in, out);
        out.close();
    }

    static class DoubleFactorial {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long n = in.nextLong();

            if (n % 2 == 1) {
                out.println(0);
                return;
            }

            long result = 0;
            int s = 1;
            n /= 2;
            while (true) {
                long num = n / (long) Math.pow(5, s);
                s++;
                result += num;
                if (num == 0) {
                    break;
                }
            }
            out.println(result);

        }

    }
}

