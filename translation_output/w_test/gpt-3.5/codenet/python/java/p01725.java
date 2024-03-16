```java
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input += "$";

        int ans = Integer.MIN_VALUE;
        int[] code = new int[] {0, 1, 2};

        ans = Math.max(ans, parse(input, code));
        System.out.println(ans);
    }

    private static int parse(String s, int[] pri) {
        int[] code = new int[]{0, 1, 2};

        StringBuilder S = new StringBuilder(s);
        S.append("$");

        int[] cur = new int[]{0};

        return expr(S, cur, 0, code);
    }

    private static int number(StringBuilder S, int[] cur) {
        char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        char c = S.charAt(cur[0]);
        if (c == '(') {
            cur[0]++; // '('
            int v = expr(S, cur, 0, new int[]{0, 1, 2});
            cur[0]++; // ')'
            return v;
        }

        int num = 0;
        while (new String(digits).contains(String.valueOf(S.charAt(cur[0]))) {
            num = 10 * num + Integer.parseInt(String.valueOf(S.charAt(cur[0])));
            cur[0]++;
        }
        return num;
    }

    private static int expr(StringBuilder S, int[] cur, int level, int[] code) {
        char[] operators = {'+', '-', '*'};

        char op = '+';
        int result = 0;

        while (true) {
            int v;
            if (level == 2) {
                v = number(S, cur);
            } else {
                v = expr(S, cur, level+1, new int[]{0, 1, 2});
            }

            if (op == '+') {
                result += v;
            } else if (op == '-') {
                result -= v;
            } else {
                result *= v;
            }

            char c = S.charAt(cur[0]);
            if (new String(operators).indexOf(c) == -1 || code[new String(operators).indexOf(c)] != level) {
                break;
            }

            op = c;
            cur[0]++;
        }
        return result;
    }

}
```
```
