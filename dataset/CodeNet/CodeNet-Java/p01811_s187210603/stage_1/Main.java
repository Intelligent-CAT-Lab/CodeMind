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
var newVariable_0 = "ABC".equals(s);        if (newVariable_0) return true;
        int n = s.length(), step = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
var newVariable_1 = sb.append(c);            if (c == 'A') {
                step = 1;
            } else if (step == 1 && c == 'B') step = 2;
            else if (step == 2 && c == 'C') {
                step = 0;
var newVariable_2 = sb.length();                sb.setLength(newVariable_2 - 3);
var newVariable_3 = sb.append('X');            }
        }
        String ns = sb.toString();
var newVariable_4 = ns.contains("X");        if (!newVariable_4) return false;
var newVariable_5 = ns.contains("B");        if (/* !ns.contains("BX") && !ns.contains("XB") && */!newVariable_5) {
            String r = ns.replace('X', 'B');
            if (solve(r)) {
                //System.err.println(r);
                return true;
            }
        }
var newVariable_6 = ns.contains("A");        if (/*!ns.contains("XC") &&*/ !newVariable_6) {
            String r = ns.replace('X', 'A');
            if (solve(r)) {
                //System.err.println(r);
                return true;
            }
        }
var newVariable_7 = ns.contains("C");        if (/*!ns.contains("AX") && */!newVariable_7) {
            String r = ns.replace('X', 'C');
            if (solve(r)) {
                //System.err.println(r);
                return true;
            }
        }
        return false;
    }

}

