Here is the Java version of the provided Python code:

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

    public static void expr(String S, int L, int cur, int[] P) {
        String op = "+";
        while (true) {
            term(S, L, cur, P, op);
            if (cur == L) {
                break;
            }
            op = S.charAt(cur) + "";
            cur++; // "+"/"-"
        }
    }

    public static int num(String S, int L, int cur) {
        int v = 0;
        while (cur < L && Character.isDigit(S.charAt(cur))) {
            v = 10 * v + Character.getNumericValue(S.charAt(cur));
            cur++;
        }
        return v;
    }

    public static void term(String S, int L, int cur, int[] P, String op) {
        int k = 1;
        if (S.charAt(cur) != 'x') {
            k = num(S, L, cur);
        }

