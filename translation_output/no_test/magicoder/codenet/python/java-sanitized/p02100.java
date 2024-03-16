import java.util.ArrayList;
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
        int d = 5;
        while (P[d] == 0) {
            d--;
        }
        ArrayList<Integer> R = new ArrayList<>();
        for (int x = 2000; x > -2001; x--) {
            if (f(P, x) == 0) {
                R.add(x);
            }
        }
        for (int x : R) {
            System.out.print("(x" + (-x) + ")");
        }
    }

    static void expr() {
        String op = "+";
        while (true) {
            term(op);
            if (cur == L) {
                break;
            }
            op = String.valueOf(S.charAt(cur));
            cur++;
        }
    }

    static int num() {
        int v = 0;
        while (cur < L && Character.isDigit(S.charAt(cur))) {
            v = 10 * v + Character.getNumericValue(S.charAt(cur));
            cur++;
        }
        return v;
    }

    static void term(String op) {
        int k = 1;
        if (!String.valueOf(S.charAt(cur)).equals("x")) {
            k = num();
        }
        int d = 0;
        if (cur < L && String.valueOf(S.charAt(cur)).equals("x")) {
            cur++;
            d = 1;
            if (cur < L && String.valueOf(S.charAt(cur)).equals("^")) {
                cur++;
                d = num();
            }
        }
        P[d] = op.equals("+") ? k : -k;
    }

    static int f(int[] P, int x) {
        int res = 0;
        for (int i = 0; i < 6; i++) {
            res += P[i] * Math.pow(x, i);
        }
        return res;
    }
}