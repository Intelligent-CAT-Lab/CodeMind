import java.util.*;

public class p02100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int L = S.length();

        int cur = 0;
        int[] P = new int[6];

        void expr() {
            global cur;
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

        void num() {
            global cur;
            int v = 0;
            while (cur < L && S.charAt(cur) >= '0' && S.charAt(cur) <= '9') {
                v = 10 * v + (S.charAt(cur) - '0');
                cur++;
            }
            return v;
        }

        void term(char op) {
            global cur;
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
            P[d] = k;
            if (op == '+') {
                P[d] *= 1;
            } else {
                P[d] *= -1;
            }
        }

        expr();

        int d = 5;
        while (P[d] == 0) {
            d--;
        }

        List<Integer> R = new ArrayList<>();
        for (int x = 2000; x >= 0; x--) {
            if (f(P, x) == 0) {
                R.add(x);
            }
        }

        System.out.println(R.stream().mapToObj(x -> String.format("(x%+d)", -x)).collect(Collectors.joining(" ")));
    }

    public static int f(int[] P, int x) {
        int res = 0;
        for (int i = 0; i < 6; i++) {
            res += P[i] * Math.pow(x, i);
        }
        return res;
    }
}