```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int L = S.length();

        int cur = 0;
        int[] P = new int[6];

        expr(S, L, cur, P);

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
        for (int x : R) {
            result.append("(x").append(x >= 0 ? "+" : "").append(-x).append(")");
        }

        System.out.println(result.toString());
    }

    public static void expr(String S, int L, int cur, int[] P) {
        char op = '+';
        while (true) {
            cur = term(S, L, cur, op, P);
            if (cur == L) {
                break;
            }
            op = S.charAt(cur);
            cur++; // "+" or "-"
        }
    }

    public static int num(String S, int L, int cur) {
        int v = 0;
        while (cur < L && "0123456789".contains(String.valueOf(S.charAt(cur)))) {
            v = 10 * v + Character.getNumericValue(S.charAt(cur));
            cur++;
        }
        return v;
    }

    public static int term(String S, int L, int cur, char op, int[] P) {
        int k = 1;
        if (S.charAt(cur) != 'x') {
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
        P[d] = (op == '+') ? k : -k;
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
```
