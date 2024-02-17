import java.io.PrintWriter;
import java.util.*;

public class Main {

    private static long gcd(long a, long b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String s = in.next();
        out.println(solve(s) ? "Yes" : "No");

        out.flush();
    }

    private static boolean solve(String s) {
        if ("ABC".equals(s)) return true;
        int n = s.length(), step = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            sb.append(c);
            if (c == 'A') {
                step = 1;
            } else if (step == 1 && c == 'B') step = 2;
            else if (step == 2 && c == 'C') {
                step = 0;
                sb.setLength(sb.length() - 3);
                sb.append('X');
            }
        }
        String ns = sb.toString();
        if (!ns.contains("X")) return false;
        if (/* !ns.contains("BX") && !ns.contains("XB") && */!ns.contains("B")) {
            String r = ns.replace('X', 'B');
            if (solve(r)) {
                //System.err.println(r);
                return true;
            }
        }
        if (/*!ns.contains("XC") &&*/ !ns.contains("A")) {
            String r = ns.replace('X', 'A');
            if (solve(r)) {
                //System.err.println(r);
                return true;
            }
        }
        if (/*!ns.contains("AX") && */!ns.contains("C")) {
            String r = ns.replace('X', 'C');
            if (solve(r)) {
                //System.err.println(r);
                return true;
            }
        }
        return false;
    }

}

