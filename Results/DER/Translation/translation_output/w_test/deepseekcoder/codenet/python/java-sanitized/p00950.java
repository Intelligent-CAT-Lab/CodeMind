import java.util.*;

public class p00950 {
    static String base = "=+-*()01";
    static String s;
    static int l;
    static Map<Character, Integer> mapping = new HashMap<>();
    static Map<Integer, Integer> counter = new HashMap<>();
    static int cnt = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        s = scanner.next();
        l = s.length();
        for (char c : s.toCharArray()) {
            if (base.indexOf(c) != -1)
                continue;
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
        int cur = 0, failed = 0;
        int read(int cur) {
            if (cur >= l)
                return '$';
            if (base.indexOf(s.charAt(cur)) != -1)
                return s.charAt(cur);
            return base.charAt(mapping.get(s.charAt(cur)));
        }
        int next() {
            return ++cur;
        }
        int error() {
            return failed = 1;
        }
        int number() {
            int res = 0;
            if (read(cur) != '0' && read(cur) != '1')
                error();
            int first = 1;
            while (true) {
                char c = (char) read(cur);
                if (c != '0' && c != '1')
                    break;
                if (first == 0 && res == 0)
                    error();
                res = (res << 1) ^ (c == '1' ? 1 : 0);
                next();
                first = 0;
            }
            return res;
        }
        int factor() {
            char c = (char) read(cur);
            if (c == '-') {
                next();
                return -factor();
            } else if (c == '(') {
                next();
                int val = expr();
                if (read(cur) != ')')
                    error();
                next();
                return val;
            }
            return number();
        }
        int term() {
            int res = 1;
            while (true) {
                res *= factor();
                char c = (char) read(cur);
                if (c != '*')
                    break;
                next();
            }
            return res;
        }
        int expr() {
            int res = 0;
            char op = '+';
            while (true) {
                if (op == '+')
                    res += term();
                else
                    res -= term();
                char c = (char) read(cur);
                if (c != '+' && c != '-')
                    break;
                next();
                op = c;
            }
            return res;
        }
        if (s.chars().filter(ch -> ch == '=').count() != 1)
            return 0;
        int lv = expr();
        next();
        int rv = expr();
        if (failed == 0 && cur == l)
            return lv == rv ? 1 : 0;
        return 0;
    }
}