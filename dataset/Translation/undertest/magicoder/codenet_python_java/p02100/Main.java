import java.util.*;

public class p02100 {
    static int cur = 0;
    static int[] P = new int[6];
    static String S;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        S = scanner.nextLine();
        expr();
        int d = 5;
        while (P[d] == 0) {
            d--;
        }
        List<Integer> R = new ArrayList<>();
        for (int x = 2000; x > -2001; x--) {
            if (f(P, x) == 0) {
                R.add(x);
            }
        }
        for (int x : R) {
            System.out.print("(x" + (x < 0 ? x : "+" + x) + ")");
        }
    }

    static void expr() {
        String op = "+";
        while (true) {
            term(op);
            if (cur == S.length()) {
                break;
            }
            op = S.substring(cur, cur + 1);
            cur++;
        }
    }

    static int num() {
        int v = 0;
        while (cur < S.length() && Character.isDigit(S.charAt(cur))) {
            v = 10 * v + Character.getNumericValue(S.charAt(cur));
            cur++;
        }
        return v;
    }

    static void term(String op) {
        int k = 1;
        if (!S.substring(cur, cur + 1).equals("x")) {
            k = num();
        }
        int d = 0;
        if (cur < S.length() && S.substring(cur, cur + 1).equals("x")) {
            cur++;
            d = 1;
            if (cur < S.length() && S.substring(cur, cur + 1).equals("^")) {
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