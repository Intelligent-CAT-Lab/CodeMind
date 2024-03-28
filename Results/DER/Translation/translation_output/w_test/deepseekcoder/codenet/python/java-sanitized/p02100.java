import java.util.*;

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
        ArrayList<String> R = new ArrayList<>();
        for (int x = 2000; x >= -2000; x--) {
            if (f(P, x) == 0) {
                R.add(String.format("(x%+d)", -x));
            }
        }
        System.out.println(String.join("", R));
    }

    static void expr() {
        while (cur < L) {
            term();
            if (cur == L) {
                break;
            }
            cur++;
        }
    }

    static int num() {
        int v = 0;
        while (cur < L && Character.isDigit(S.charAt(cur))) {
            v = 10 * v + (S.charAt(cur) - '0');
            cur++;
        }
        return v;
    }

    static void term() {
        int k = 1;
        if (S.charAt(cur) != 'x') {
            k = num();
        }
        int d = 0;
        if (cur < L && S.charAt(cur) == 'x') {
            cur++;
            d = 1;
            if (cur < L && S.charAt(cur) == '^') {
                cur++;
                d = num();
            }
        }
        P[d] = k;
    }

    static int f(int[] P, int x) {
        int res = 0;
        for (int i = 0; i < 6; i++) {
            res += P[i] * Math.pow(x, i);
        }
        return res;
    }
}