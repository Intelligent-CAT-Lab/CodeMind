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
                } else if (Character.isDigit(c)) {
                    int num = c - '0';
                    cur++;
                    while (cur < S.length() && Character.isDigit(S.charAt(cur))) {
                        num = num * 10 + (S.charAt(cur) - '0');
                        cur++;
                    }
                    result = Math.max(result, num);
                }
                cur++;
            }
            ans = Math.max(ans, result);
        }
        System.out.println(ans);
    }

    public static int expr(int level, int[] pri) {
        int cur = 0;
        int op = '+';
        int result = 0;
        while (level > 0) {
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
            op = pri[cur];
            cur = (cur + 1) % 3;
            level--;
        }
        return result;
    }

    public static int number() {
        int cur = 0;
        int num = 0;
        while (cur < S.length() && Character.isDigit(S.charAt(cur))) {
            num = num * 10 + (S.charAt(cur) - '0');
            cur++;
        }
        return num;
    }
}