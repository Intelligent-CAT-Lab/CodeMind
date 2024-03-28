import java.util.*;

public class p02100 {
    static String S;
    static int L;
    static int[] P = new int[6];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        S = sc.nextLine();
        L = S.length();

        int cur = 0;
        expr();

        System.out.println(f(P, -1));
    }

    public static void expr() {
        int op = 1;
        while (1) {
            term(op);
            if (cur == L) {
                break;
            }
            op = (op == 1) ? 2 : 1;
        }
    }

    public static void num() {
        int v = 0;
        int cur = 0;
        while (cur < L && S.charAt(cur) >= '0' && S.charAt(cur) <= '9') {
            v = 10 * v + (S.charAt(cur) - '0');
            cur++;
        }
        P[0] = v;
    }

    public static void term(int op) {
        int k = 1;
        if (S.charAt(cur) != 'x') {
            num();
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
        P[d] = k * (op == 1 ? 1 : -1);
    }

    public static int f(int[] P, int x) {
        int res = 0;
        for (int i = 0; i < 6; i++) {
            res += P[i] * Math.pow(x, i);
        }
        return res;
    }

    public static List<Integer> solve(int[] P, int x) {
        List<Integer> R = new ArrayList<>();
        for (int i = 2000; i >= -2001; i--) {
            if (f(P, i) == 0) {
                R.add(i);
            }
        }
        return R;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        S = sc.nextLine();
        L = S.length();

        int cur = 0;
        expr();

        List<Integer> R = solve(P, -1);
        System.out.println(R);
    }
}