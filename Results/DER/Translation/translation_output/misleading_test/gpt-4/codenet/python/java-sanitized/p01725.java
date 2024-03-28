import java.util.Scanner;

public class p01725 {
    private static final String digits = "0123456789";
    private static final String code = "+-*";
    private static String S;
    private static int cur;
    private static int ans;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        S = scanner.next() + "$";
        scanner.close();
        ans = Integer.MIN_VALUE;
        int[] pri;

        // Generate all permutations with repetition
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    pri = new int[]{i, j, k};
                    ans = Math.max(ans, parse(pri));
                    cur = 0;
                }
            }
        }

        System.out.println(ans);
    }

    private static int parse(int[] pri) {
        return expr(0, pri);
    }

    private static int number() {
        if (S.charAt(cur) == '(') {
            cur++; // '('
            int v = expr(0, null); // No need for priority array here, it is not used when parsing a number.
            cur++; // ')'
            return v;
        }
        int num = 0;
        while (digits.indexOf(S.charAt(cur)) >= 0) {
            num = 10 * num + Character.getNumericValue(S.charAt(cur));
            cur++;
        }
        return num;
    }

    private static int expr(int level, int[] pri) {
        char op = '+';
        int result = 0;
        while (true) {
            int v;
            if (level == 2) {
                v = number();
            } else {
                v = expr(level + 1, pri);
            }
            if (op == '+') {
                result += v;
            } else if (op == '-') {
                result -= v;
            } else {
                result *= v;
            }
            char c = S.charAt(cur);
            if (code.indexOf(c) == -1 || pri[code.indexOf(c)] != level) {
                break;
            }
            op = c;
            cur++;
        }
        return result;
    }
}