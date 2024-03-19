import java.util.*;

public class p01725 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine() + "$";
        int ans = -1000000000;
        for (int[] pri : product(new int[] { 0, 1, 2 }, 3)) {
            ans = Math.max(ans, parse(pri));
        }
        System.out.println(ans);
    }

    public static int parse(int[] pri) {
        String code = "+-*/";
        int cur = 0;
        int num = 0;
        int level = 0;
        while (cur < s.length()) {
            char c = s.charAt(cur);
            if (c == '(') {
                cur++;
                int v = expr(level);
                cur++;
                return v;
            }
            while (cur < s.length() && Character.isDigit(s.charAt(cur))) {
                num = 10 * num + (s.charAt(cur) - '0');
                cur++;
            }
            if (num != 0) {
                return num;
            }
            if (code.indexOf(c) == -1 || pri[code.indexOf(c)] != level) {
                break;
            }
            level++;
            cur++;
        }
        return 0;
    }

    public static int expr(int level) {
        int result = 0;
        while (true) {
            int v = number();
            if (level == 2) {
                return v;
            }
            int op = '+';
            while (true) {
                if (level == 2) {
                    break;
                }
                int num = expr(level + 1);
                if (op == '+') {
                    result += num;
                } else if (op == '-') {
                    result -= num;
                } else {
                    result *= num;
                }
                char c = s.charAt(cur);
                if (code.indexOf(c) == -1 || pri[code.indexOf(c)] != level) {
                    break;
                }
                op = c;
                cur++;
            }
        }
        return result;
    }

    public static int number() {
        int cur = 0;
        int num = 0;
        while (cur < s.length() && Character.isDigit(s.charAt(cur))) {
            num = 10 * num + (s.charAt(cur) - '0');
            cur++;
        }
        return num;
    }

    public static List<int[]> product(int[] a, int b) {
        List<int[]> res = new ArrayList<>();
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a.length; j++) {
                res.add(new int[]{a[j], i});
            }
        }
        return res;
    }

    private static final String s;
    private static final char[] code;
    private static final int[] pri;
}