import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
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
        B solver = new B();
        solver.solve(1, in, out);
        out.close();
    }

    static class B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String S = in.next();
System.out.println("[INST]24;S;in.next();"+S);
            long len = S.length();
System.out.println("[INST]25;len;S.length();"+len);
            long count = S.chars().filter(c -> c == 'x').count();
System.out.println("[INST]26;count;S.chars().filter(c -> c == 'x').count();"+count);
System.out.println("[INST]26;None;S.chars().filter(c -> c == 'x');"+S.chars().filter(c -> c == 'x'));
System.out.println("[INST]26;None;S.chars();"+S.chars());
            out.println(8 <= (15 - len) + (len - count) ? "YES" : "NO");
        }

    }
}

