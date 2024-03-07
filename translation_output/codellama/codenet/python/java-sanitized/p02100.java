import java.util.Scanner;

public class p02100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int L = S.length();

        int cur = 0;
        int[] P = new int[6];

        expr();

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

        System.out.println(R.stream().map(x -> "(x" + x + ")").collect(Collectors.joining()));
    }

    private static void expr() {
        String op = "+";
        while (cur < L) {
            term(op);
            if (cur == L) {
                break;
            }
            op = S.charAt(cur);
            cur++; // "+"/"-"
        }
    }

    private static int num() {
        int v = 0;
        while (cur < L && Character.isDigit(S.charAt(cur))) {
            v = 10 * v + Integer.parseInt(S.charAt(cur));
            cur++;
        }
        return v;
    }

    private static void term(String op) {
        int k = 1;
        if (S.charAt(cur) != 'x') {
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
        P[d] = k;
    }

    private static int f(int[] P, int x) {
        int res = 0;
        for (int i = 0; i < 6; i++) {
            res += P[i] * (int) Math.pow(x, i);
        }
        return res;
    }
}