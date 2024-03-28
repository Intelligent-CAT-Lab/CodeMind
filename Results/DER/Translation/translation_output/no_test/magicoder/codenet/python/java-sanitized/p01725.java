import java.util.*;

public class p01725 {
    static String S;
    static int cur;
    static String code = "+-*";

    static int number() {
        char c = S.charAt(cur);
        if (c == '(') {
            cur++; // '('
            int v = expr(0);
            cur++; // ')'
            return v;
        }
        int num = 0;
        while (Character.isDigit(S.charAt(cur))) {
            num = 10 * num + S.charAt(cur++) - '0';
        }
        return num;
    }

    static int expr(int level) {
        char op = '+';
        int result = 0;
        while (true) {
            int v = level == 2 ? number() : expr(level + 1);
            if (op == '+') {
                result += v;
            } else if (op == '-') {
                result -= v;
            } else {
                result *= v;
            }
            char c = S.charAt(cur);
            if (code.indexOf(c) == -1 || code.indexOf(c) != level) {
                break;
            }
            op = c;
            cur++;
        }
        return result;
    }

    static int parse(int[] pri) {
        cur = 0;
        int ans = -1000000000;
        for (int[] p : new ArrayList<>(Arrays.asList(pri))) {
            ans = Math.max(ans, expr(p[0]));
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        S = scanner.nextLine() + "$";
        int[] pri = new int[3];
        for (int i = 0; i < 3; i++) {
            pri[i] = scanner.nextInt();
        }
        System.out.println(parse(pri));
    }
}