import java.util.*;

public class p00950 {
    static String base = "=+-*()01";
    static String s;
    static int l;
    static Map<Character, Integer> mapping = new HashMap<>();
    static Map<Integer, Integer> counter = new HashMap<>();
    static int cnt = 0;

    public static void main(String[] args) {
        s = new Scanner(System.in).next();
        l = s.length();
        for (char c : s.toCharArray()) {
            if (base.contains(Character.toString(c))) {
                continue;
            }
            if (!mapping.containsKey(c)) {
                mapping.put(c, cnt);
                cnt++;
            }
            int v = mapping.get(c);
            counter.put(v, counter.getOrDefault(v, 0) + 1);
        }
        if (cnt > 8) {
            System.out.println(0);
            System.exit(0);
        }

        System.out.println(solve());
    }

    static int solve() {
        int cur = 0, failed = 0, lv = 0, rv = 0;
        String op = "+";
        while (cur < l) {
            if (op.equals("+")) {
                lv += term();
            } else {
                lv -= term();
            }
            if (cur == l) {
                break;
            }
            op = s.substring(cur, cur + 1);
            cur++;
        }
        if (s.chars().filter(ch -> ch == '=').count() != 1) {
            return 0;
        }
        rv = expr();
        if (failed == 0 && cur == l) {
            return lv == rv ? 1 : 0;
        }
        return 0;
    }

    static int term() {
        int res = 1;
        while (true) {
            res *= factor();
            if (cur == l || !s.substring(cur, cur + 1).equals("*")) {
                break;
            }
            cur++;
        }
        return res;
    }

    static int factor() {
        if (s.substring(cur, cur + 1).equals("-")) {
            cur++;
            return -factor();
        } else if (s.substring(cur, cur + 1).equals("(")) {
            cur++;
            int val = expr();
            if (!s.substring(cur, cur + 1).equals(")")) {
                error();
            }
            cur++;
            return val;
        }
        return number();
    }

    static int number() {
        int res = 0;
        boolean first = true;
        while (true) {
            if (cur == l || !"01".contains(s.substring(cur, cur + 1))) {
                break;
            }
            if (!first && res == 0) {
                error();
            }
            res = (res << 1) ^ (s.charAt(cur) == '1' ? 1 : 0);
            cur++;
            first = false;
        }
        return res;
    }

    static int expr() {
        int res = 0;
        String op = "+";
        while (true) {
            if (op.equals("+")) {
                res += term();
            } else {
                res -= term();
            }
            if (cur == l || !"+-".contains(s.substring(cur, cur + 1))) {
                break;
            }
            cur++;
            op = s.substring(cur - 1, cur);
        }
        return res;
    }

    static void error() {
        failed = 1;
    }
}