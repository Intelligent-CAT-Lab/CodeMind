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

        ArrayList<Integer> R = new ArrayList<Integer>();
        for (int x = 2000; x >= -2001; x--) {
            if (f(P, x) == 0) R.add(x);
        }

        System.out.print(R.size());
        for (int x : R) System.out.print(" (x%+d)" % -x);
    }

    static void expr() {
        int cur = 0;
        char op = '+';
        while (1) {
            term(op);
            if (cur == L) break;
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
        if (cur < L && S.charAt(cur) == 'x') {
            cur++;
            d = 1;
            if (cur < L && S.charAt(cur) == '^') {
                cur++;
                d = num();
            }
        }
        P[d] = k;
        if (op == '-') P[d] = -k;
    }

    static int num() {
        int cur = 0;
        int v = 0;
        while (cur < L && S.charAt(cur) >= '0' && S.charAt(cur) <= '9') {
            v = 10*v + (S.charAt(cur) - '0');
            cur++;
        }
        return v;
    }

    static int f(int[] P, int x) {
        int res = 0;
        for (int i = 0; i < 6; i++) {
            res += P[i]*(x**i);
        }
        return res;
    }
}