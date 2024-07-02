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
System.out.println("[INST]14;s;in.next();"+s);
        out.println(solve(s) ? "Yes" : "No");

        out.flush();
System.out.println("[INST]17;None;out.flush();"+out.flush());
    }

    private static boolean solve(String s) {
        if ("ABC".equals(s)) return true;
System.out.println("[INST]21;None;'ABC'.equals(s);"+"ABC".equals(s));
        int n = s.length(), step = 0;
System.out.println("[INST]22;n;s.length();"+n);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
System.out.println("[INST]25;c;s.charAt(i);"+c);
            sb.append(c);
System.out.println("[INST]26;None;sb.append(c);"+sb.append(c));
            if (c == 'A') {
                step = 1;
            } else if (step == 1 && c == 'B') step = 2;
            else if (step == 2 && c == 'C') {
                step = 0;
                sb.setLength(sb.length() - 3);
System.out.println("[INST]32;None;sb.setLength(sb.length() - 3);"+sb.setLength(sb.length() - 3));
System.out.println("[INST]32;None;sb.length();"+sb.length());
                sb.append('X');
System.out.println("[INST]33;None;sb.append('X');"+sb.append('X'));
            }
        }
        String ns = sb.toString();
System.out.println("[INST]36;ns;sb.toString();"+ns);
        if (!ns.contains("X")) return false;
System.out.println("[INST]37;None;ns.contains('X');"+ns.contains("X"));
        if (/* !ns.contains("BX") && !ns.contains("XB") && */!ns.contains("B")) {
System.out.println("[INST]38;None;ns.contains('B');"+ns.contains("B"));
            String r = ns.replace('X', 'B');
System.out.println("[INST]39;r;ns.replace('X', 'B');"+r);
            if (solve(r)) {
                //System.err.println(r);
                return true;
            }
        }
        if (/*!ns.contains("XC") &&*/ !ns.contains("A")) {
System.out.println("[INST]45;None;ns.contains('A');"+ns.contains("A"));
            String r = ns.replace('X', 'A');
System.out.println("[INST]46;r;ns.replace('X', 'A');"+r);
            if (solve(r)) {
                //System.err.println(r);
                return true;
            }
        }
        if (/*!ns.contains("AX") && */!ns.contains("C")) {
System.out.println("[INST]52;None;ns.contains('C');"+ns.contains("C"));
            String r = ns.replace('X', 'C');
System.out.println("[INST]53;r;ns.replace('X', 'C');"+r);
            if (solve(r)) {
                //System.err.println(r);
                return true;
            }
        }
        return false;
    }

}

