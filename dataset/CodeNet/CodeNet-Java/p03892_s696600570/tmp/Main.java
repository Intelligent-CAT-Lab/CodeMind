import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    void solve() throws IOException {
        int a = ni();
        int b = ni();
        int c = ni();
        int d = ni();

        if (a == c) {
            out.println(b);
            return;
        }

        if (b == d) {
            out.println(a);
            return;
        }

        int x = gcd(Math.abs(a - c), Math.abs(b - d));
System.out.println("[INST]25;None;Math.abs(a - c);"+Math.abs(a - c));
System.out.println("[INST]25;None;Math.abs(b - d);"+Math.abs(b - d));

        out.println(Math.abs(a - c) + Math.abs(b - d) - x);
    }

    int gcd(int a, int b) {
        return a == 0 ? b : gcd(b % a, a);
    }

    String ns() throws IOException {
        while (!tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine(), " ");
System.out.println("[INST]36;None;in.readLine();"+in.readLine());
        }
        return tok.nextToken();
System.out.println("[INST]38;None;tok.nextToken();"+tok.nextToken());
    }

    int ni() throws IOException {
        return Integer.parseInt(ns());
    }

    long nl() throws IOException {
        return Long.parseLong(ns());
    }

    double nd() throws IOException {
        return Double.parseDouble(ns());
    }

    String[] nsa(int n) throws IOException {
        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            res[i] = ns();
        }
        return res;
    }

    int[] nia(int n) throws IOException {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = ni();
        }
        return res;
    }

    long[] nla(int n) throws IOException {
        long[] res = new long[n];
        for (int i = 0; i < n; i++) {
            res[i] = nl();
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        tok = new StringTokenizer("");
        Main main = new Main();
        main.solve();
        out.close();
    }
}