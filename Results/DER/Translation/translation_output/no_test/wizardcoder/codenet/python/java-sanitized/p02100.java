import java.util.*;

public class p02100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int L = S.length();

        int cur = 0;
        int[] P = new int[6];
        expr(S, L, cur, P);

        int d = 5;
        while (P[d] == 0) {
            d--;
        }

        List<Integer> R = new ArrayList<>();
        for (int x = 2000; x >= -2001; x--) {
            if (f(P, x) == 0) {
                R.add(x);
            }
        }

        System.out.print("".join("(x%+d)" % -x for x in R));
    }

    public static void expr(String S, int L, int cur, int[] P) {
        while (cur < L) {
            term(S, L, cur, P);
            if (cur == L) {
                break;
            }
            char op = S.charAt(cur);
            cur++; // "+"/"-"
        }
    }

    public static void term(String S, int L, int cur, int[] P) {
        int k = 1;
        if (S.charAt(cur)!= 'x') {
            k = num(S, L, cur);
        }
        int d = 0;
        if (cur < L && S.charAt(cur) == 'x') {
            cur++; // "x"
            d = 1;
            if (cur < L && S.charAt(cur) == '^') {
                cur++; // "^"
                d = num(S, L, cur);
            }
        }
        P[d] = k;
    }

    public static int num(String S, int L, int cur) {
        int v = 0;
        while (cur < L && Character.isDigit(S.charAt(cur))) {
            v = 10*v + (S.charAt(cur) - '0');
            cur++;
        }
        return v;
    }

    public static int f(int[] P, int x) {
        int res = 0;
        for (int i = 0; i < 6; i++) {
            res += P[i]*(int)Math.pow(x, i);
        }
        return res;
    }
}