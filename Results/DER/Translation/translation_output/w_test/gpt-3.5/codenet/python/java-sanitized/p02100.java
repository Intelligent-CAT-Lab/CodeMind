import java.util.*;

public class p02100 {
    static String S;
    static int L;
    static int cur = 0;
    static int[] P = new int[6];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        S = scanner.nextLine();
        L = S.length();
        expr();

        int d = 5;
        while (P[d] == 0) {
            d--;
        }

        ArrayList<Integer> R = new ArrayList<>();
        for (int x = 2000; x >= -2000; x--) {
            if (f(P, x) == 0) {
                R.add(x);
            }
        }

        StringBuilder result = new StringBuilder();
        for (int x : R) {
            result.append("(x");
            if (x < 0) {
                result.append(x);
            } else {
                result.append("+" + x);
            }
            result.append(")");
        }

        System.out.println(result.toString());
    }

    public static void expr() {
        char op = '+';
        while (true) {
            term(op);
            if (cur == L) {
                break;
            }
            op = S.charAt(cur);
            cur++; // "+"/"-"
        }
    }

    public static int num() {
        int v = 0;
        while (cur < L && Character.isDigit(S.charAt(cur))) {
            v = 10 * v + Integer.parseInt(String.valueOf(S.charAt(cur)));
            cur++;
        }
        return v;
    }

    public static void term(char op) {
        int k = 1;
        if (S.charAt(cur) != 'x') {
            k = num();
        }
        int d = 0;
        if (cur < L && S.charAt(cur) == 'x') {
            cur++; // "x"
            d = 1;
            if (cur < L && S.charAt(cur) == '^') {
                cur++; // "^"
                d = num();
            }
        }
        P[d] = (op == '+') ? k : -k;
    }

    public static int f(int[] P, int x) {
        int res = 0;
        for (int i = 0; i < 6; i++) {
            res += P[i] * Math.pow(x, i);
        }
        return res;
    }
}