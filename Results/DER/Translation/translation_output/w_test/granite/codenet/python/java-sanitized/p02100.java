import java.util.*;

public class p02100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int L = S.length();

        int cur = 0;
        int[] P = new int[6];
        expr(S, cur, P);

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

        System.out.println(R.stream().map(x -> "(x+" + -x + ")").collect(Collectors.joining(" ")));
    }

    public static void expr(String S, int cur, int[] P) {
        String op = "+";
        while (true) {
            term(S, cur, P, op);
            if (cur == S.length()) {
                break;
            }
            op = S.substring(cur, cur + 1);
            cur += 1; // "+"/"-"
        }
    }

    public static void term(String S, int cur, int[] P, String op) {
        int k = 1;
        if (!S.substring(cur, cur + 1).equals("x")) {
            k = num(S, cur);
        }
        int d = 0;
        if (cur < S.length() && S.substring(cur, cur + 1).equals("x")) {
            cur += 1; // "x"
            d = 1;
            if (cur < S.length() && S.substring(cur, cur + 1).equals("^")) {
                cur += 1; // "^"
                d = num(S, cur);
            }
        }
        P[d] = k * (op.equals("+")? 1 : -1);
    }

    public static int num(String S, int cur) {
        int v = 0;
        while (cur < S.length() && Character.isDigit(S.charAt(cur))) {
            v = 10 * v + Integer.parseInt(S.substring(cur, cur + 1));
            cur += 1;
        }
        return v;
    }

    public static int f(int[] P, int x) {
        int res = 0;
        for (int i = 0; i < 6; i++) {
            res += P[i] * (int) Math.pow(x, i);
        }
        return res;
    }
}