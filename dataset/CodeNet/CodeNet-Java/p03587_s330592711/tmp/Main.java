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
        A solver = new A();
        solver.solve(1, in, out);
        out.close();
    }

    static class A {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            String S = in.next();
System.out.println("[INST]24;S;in.next();"+S);
            int ans = 0;
            for (int i = 0; i < 6; i++) {
                ans += S.charAt(i) - '0';
System.out.println("[INST]27;None;S.charAt(i);"+S.charAt(i));
            }

            // 出力
            out.println(ans);

        }

    }
}

