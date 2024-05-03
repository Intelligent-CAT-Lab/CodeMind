Here is the Java version of your Python code:

```java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String S = System.console().readLine();
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

        StringBuilder result = new StringBuilder();
        for (int x : R) {
            result.append("(x" + (x < 0 ? "-" : "+") + Math.abs(x) + ")");
        }

        System.out.println(result.toString());
    }

    private static void expr(String S, int L, int cur, int[] P) {
        op(S, L, cur, P);
    }

    private static void op(String S, int L, int cur, int[] P) {
        term(S, L, cur, P);
        if (cur == L) {
            return;
        }
        char op = S.charAt(cur);
        cur++; // "+"/"-"
        term(S, L, cur, P);
    }

    private static void term(String S, int L, int cur, int[] P) {
        int k = 1;
        if (S.charAt(cur) != 'x') {
            k = num(S, L, cur);
        }
        int d = 0;
        if (cur < L && S.charAt(cur) == 'x') {
            cur++; // "x"
            d = 1;
            if (cur < L && S.charAt(cur) == '^') {
                cur
