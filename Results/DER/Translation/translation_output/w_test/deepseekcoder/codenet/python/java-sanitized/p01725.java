import java.util.*;

public class p01725 {
    static String S;
    static int cur;
    static String code = "+-*";

    static int number() {
        char c = S.charAt(cur);
        if (c == '(') {
            cur += 1;
            int v = expr(0);
            cur += 1;
            return v;
        }
        int num = 0;
        while (Character.isDigit(S.charAt(cur))) {
            num = 10 * num + (S.charAt(cur) - '0');
            cur += 1;
        }
        return num;
    }

    static int expr(int level) {
        char op = '+';
        int result = 0;
        while (true) {
            int v;
            if (level == 2) {
                v = number();
            } else {
                v = expr(level + 1);
            }
            if (op == '+') {
                result += v;
            } else if (op == '-') {
                result -= v;
            } else {
                result *= v;
            }
            if (code.indexOf(S.charAt(cur)) == -1 || code.indexOf(S.charAt(cur)) != level) {
                break;
            }
            op = S.charAt(cur);
            cur += 1;
        }
        return result;
    }

    static int parse(int[] pri) {
        cur = 0;
        return expr(0);
    }

    public static void main(String[] args) {
        S = "3-2*3$";
        int ans = -1000000000;
        int[][] pri = {{0, 1, 2}, {0, 2, 1}, {1, 0, 2}, {1, 2, 0}, {2, 0, 1}, {2, 1, 0}};
        for (int[] p : pri) {
            ans = Math.max(ans, parse(p));
        }
        System.out.println(ans);
    }
}