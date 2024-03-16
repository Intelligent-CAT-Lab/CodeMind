import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p02100 {
    static String S;
    static int L;
    static int cur = 0;
    static int[] P = new int[6];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        S = scanner.next();
        L = S.length();
        expr();
        List<Integer> R = new ArrayList<>();
        for (int x = 2000; x >= -2000; x--) {
            if (f(P, x) == 0) {
                R.add(x);
            }
        }
        for (int x : R) {
            System.out.print("(x" + (x < 0 ? "" : "+") + x + ")");
        }
    }

    static void expr() {
        String op = "+";
        while (true) {
            term(op);
            if (cur == L) {
                break;
            }
            op = S.substring(cur, cur + 1);
            cur += 1;
        }
    }

    static int num() {
        int v = 0;
        while (cur < L && Character.isDigit(S.charAt(cur))) {
            v = 10 * v + Character.getNumericValue(S.charAt(cur));
            cur += 1;
        }
        return v;
    }

    static void term(String op) {
        int k = 1;
        if (!S.substring(cur, cur + 1).equals("x")) {
            k = num();
        }
        int d = 0;
        if (cur < L && S.substring(cur, cur + 1).equals("x")) {
            cur += 1;
            d = 1;
            if (cur < L && S.substring(cur, cur + 1).equals("^")) {
                cur += 1;
                d = num();
            }
        }
        if (op.equals("+")) {
            P[d] = k;
        } else {
            P[d] = -k;
        }
    }

    static int f(int[] P, int x) {
        int res = 0;
        for (int i = 0; i < 6; i++) {
            res += P[i] * Math.pow(x, i);
        }
        return res;
    }
}