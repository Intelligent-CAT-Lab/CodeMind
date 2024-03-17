import java.util.*;

public class p01725 {
    static String S;
    static int cur;

    static int parse(int[] pri) {
        String code = "+-*";
        int result = 0;
        char op = '+';
        while (true) {
            int v = number();
            if (op == '+')
                result += v;
            else if (op == '-')
                result -= v;
            else
                result *= v;
            char c = S.charAt(cur);
            if (code.indexOf(c) == -1 || pri[code.indexOf(c)] != 0)
                break;
            op = c;
            cur++;
        }
        return result;
    }

    static int number() {
        int num = 0;
        while (Character.isDigit(S.charAt(cur))) {
            num = 10 * num + S.charAt(cur) - '0';
            cur++;
        }
        return num;
    }

    public static void main(String[] args) {
        S = "3-2*3$";
        int ans = -1000000000;
        for (int[] pri : new int[][]{{0, 0, 0}, {0, 0, 1}, {0, 1, 0}, {0, 1, 1}, {1, 0, 0}, {1, 0, 1}, {1, 1, 0}, {1, 1, 1}}) {
            cur = 0;
            ans = Math.max(ans, parse(pri));
        }
        System.out.println(ans);
    }
}