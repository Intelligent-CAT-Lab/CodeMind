import java.util.*;

public class p01725 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next() + "$";
        int ans = -100000000;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    int[] pri = {i, j, k};
                    ans = Math.max(ans, parse(S, pri));
                }
            }
        }
        System.out.println(ans);
    }

    public static int parse(String S, int[] pri) {
        String code = "+-*" + "*";
        int cur = 0;
        int result = 0;
        while (cur < S.length()) {
            char c = S.charAt(cur);
            if (c == '(') {
                cur++; // '('
                int v = expr(S, pri, 0);
                cur++; // ')'
                result += v;
            } else if (c == '+' || c == '-' || c == '*') {
                int v = expr(S, pri, pri[code.indexOf(c)]);
                if (c == '+') {
                    result += v;
                } else if (c == '-') {
                    result -= v;
                } else {
                    result *= v;
                }
            } else {
                break;
            }
        }
        return result;
    }

    public static int expr(String S, int[] pri, int level) {
        int cur = 0;
        int result = 0;
        while (cur < S.length()) {
            char c = S.charAt(cur);
            if (c == '(') {
                cur++; // '('
                int v = expr(S, pri, level + 1);
                cur++; // ')'
                return v;
            } else if (c == '+' || c == '-' || c == '*') {
                if (pri[code.indexOf(c)]!= level) {
                    break;
                }
                int v = expr(S, pri, level + 1);
                if (c == '+') {
                    result += v;
                } else if (c == '-') {
                    result -= v;
                } else {
                    result *= v;
                }
            } else if (c >= '0' && c <= '9') {
                int num = 0;
                while (cur < S.length() && S.charAt(cur) >= '0' && S.charAt(cur) <= '9') {
                    num = 10 * num + (S.charAt(cur) - '0');
                    cur++;
                }
                return num;
            } else {
                break;
            }
        }
        return result;
    }
}