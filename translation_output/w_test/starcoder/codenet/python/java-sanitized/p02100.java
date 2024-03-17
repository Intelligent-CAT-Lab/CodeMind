import java.util.*;

public class p02100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int L = S.length();

        int cur = 0;
        int[] P = new int[6];
        expr();

        int d = 5;
        while (P[d] == 0) d--;

        List<Integer> R = new ArrayList<Integer>();
        for (int x = 2000; x >= -2001; x--) {
            if (f(P, x) == 0) R.add(x);
        }

        System.out.print(S.charAt(0));
        for (int x : R) {
            if (x < 0) System.out.print("x");
            if (x < 0) System.out.print("-");
            if (Math.abs(x) > 1) System.out.print(Math.abs(x));
        }
        System.out.print(S.charAt(L-1));
    }

    static int f(int[] P, int x) {
        int res = 0;
        for (int i = 0; i < 6; i++) {
            res += P[i]*(x**i);
        }
        return res;
    }

    static void expr() {
        int cur = 0;
        char op = '+';
        while (true) {
            term(op);
            if (cur == S.length()) break;
            op = S.charAt(cur);
            cur++;
        }
    }

    static void term(char op) {
        int cur = 0;
        int k = 1;
        if (S.charAt(cur)!= 'x') {
            k = num();
        }
        int d = 0;
        if (cur < L && S.charAt(cur) == "x") {
            cur++; // "x"
            d = 1;
            if (cur < L && S.charAt(cur) == '^') {
                cur++; // "^"
                d = num();
            }
        }
        P[d] = k if (op == '+') else -k;
    }

    static int num() {
        int cur = 0;
        int v = 0;
        while (cur < L && S.charAt(cur) in "0123456789") {
            v = 10*v + (S.charAt(cur) - '0');
            cur++;
        }
        return v;
    }
}