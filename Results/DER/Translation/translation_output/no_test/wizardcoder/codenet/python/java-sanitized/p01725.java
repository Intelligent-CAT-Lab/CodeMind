import java.util.*;

public class p01725 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine() + "$";
        int ans = -1000000000;
        for (int[] pri : new int[][]{{1, 2, 3}, {1, 3, 2}, {2, 1, 3}, {2, 3, 1}, {3, 1, 2}, {3, 2, 1}}) {
            int cur = 0;
            int level = 0;
            int result = 0;
            while (cur < S.length()) {
                char c = S.charAt(cur);
                if (c == '(') {
                    cur++; // '('
                    level++;
                    result = Math.max(result, expr(level, pri));
                    cur++; // ')'
                } else if (c == '+' || c == '-' || c == '*') {
                    if (level == 2) {
                        result = Math.max(result, number());
                    } else {
                        result = Math.max(result, expr(level+1, pri));
                    }
                    if (c == '+') {
                        result += number();
                    } else if (c == '-') {
                        result -= number();
                    } else {
                        result *= number();
                    }
                    level = 0;
                } else if (c >= '0' && c <= '9') {
                    result = Math.max(result, number());
                }
                cur++;
            }
            ans = Math.max(ans, result);
        }
        System.out.println(ans);
    }

    public static int number() {
        int num = 0;
        while (cur < S.length() && S.charAt(cur) >= '0' && S.charAt(cur) <= '9') {
            num = num * 10 + (S.charAt(cur) - '0');
            cur++;
        }
        return num;
    }

    public static int expr(int level, int[] pri) {
        int op = '+';
        int result = 0;
        while (level <= pri[op - '+']) {
            if (level == 2) {
                result = Math.max(result, number());
            } else {
                result = Math.max(result, expr(level+1, pri));
            }
            if (op == '+') {
                result += number();
            } else if (op == '-') {
                result -= number();
            } else {
                result *= number();
            }
            op = S.charAt(cur) - '+';
            cur++;
        }
        return result;
    }
}