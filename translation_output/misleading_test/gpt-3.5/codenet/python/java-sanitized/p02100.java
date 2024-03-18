import java.util.*;

public class p02100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int L = S.length();

        int cur = 0;
        int[] P = new int[6];
        for (int i = 0; i < 6; i++) {
            P[i] = 0;
        }

        while (true) {
            expr(S, L, cur, P);
            if (cur == L) {
                break;
            }
        }

        int d = 5;
        while (P[d] == 0) {
            d--;
        }

        List<Integer> R = new ArrayList<>();
        for (int x = 2000; x >= -2000; x--) {
            if (f(P, x) == 0) {
                R.add(x);
            }
        }

        StringBuilder result = new StringBuilder();
        for (Integer x : R) {
            result.append("(x+" + (-x) + ")");
        }
        System.out.println(result.toString());
    }

    public static void expr(String S, int L, int cur, int[] P) {
        String op = "+";
        while (true) {
            cur = term(S, L, cur, op, P);
            if (cur == L) {
                break;
            }
            op = String.valueOf(S.charAt(cur));
            cur++;
        }
    }

    public static int num(String S, int L, int cur) {
        int v = 0;
        while (cur < L && Character.isDigit(S.charAt(cur))) {
            v = 10 * v + Character.getNumericValue(S.charAt(cur));
            cur++;
        }
        return v;
    }

    public static int term(String S, int L, int cur, String op, int[] P) {
        int k = 1;
        if (S.charAt(cur) != 'x') {
            k = num(S, L, cur);
        }
        int d = 0;
        if (cur < L && S.charAt(cur) == 'x') {
            cur++;
            d = 1;
            if (cur < L && S.charAt(cur) == '^') {
                cur++;
                d = num(S, L, cur);
            }
        }
        P[d] = op.equals("+") ? k : -k;
        return cur;
    }

    public static int f(int[] P, int x) {
        int res = 0;
        for (int i = 0; i < 6; i++) {
            res += P[i] * Math.pow(x, i);
        }
        return res;
    }
}