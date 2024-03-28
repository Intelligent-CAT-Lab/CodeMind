import java.util.*;

public class p00950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int l = s.length();
        Map<Character, Integer> mapping = new HashMap<>();
        Map<Integer, Integer> counter = new HashMap<>();
        int cnt = 0;
        for (char c : s.toCharArray()) {
            if (c == '=') {
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
            return;
        }

        int ans = solve(s);
        System.out.println(ans);
    }

    public static int solve(String s) {
        int cur = 0;
        int failed = 0;

        Runnable next = () -> {
            cur++;
        };

        Runnable error = () -> {
            failed = 1;
        };

        Runnable number = () -> {
            int res = 0;
            while (s.charAt(cur) != '0' && s.charAt(cur) != '1') {
                error.run();
            }
            res = (res << 1) ^ Integer.parseInt(s.substring(cur, cur + 1));
            next.run();
            cur++;
            return res;
        };

        Runnable factor = () -> {
            char c = s.charAt(cur);
            if (c == '-') {
                next.run();
                return -factor();
            } else if (c == '(') {
                next.run();
                int val = solve(s);
                if (s.charAt(cur) != ')') {
                    error.run();
                }
                next.run();
                return val;
            }
            return number();
        };

        Runnable term = () -> {
            int res = 1;
            while (true) {
                res *= factor();
                char c = s.charAt(cur);
                if (c != '*') {
                    break;
                }
                next.run();
                cur++;
            }
            return res;
        };

        Runnable expr = () -> {
            int res = 0;
            char op = '+';
            while (true) {
                if (op == '+') {
                    res += term();
                } else {
                    res -= term();
                }
                char c = s.charAt(cur);
                if (c != '+' && c != '-') {
                    break;
                }
                next.run();
                cur++;
                op = c;
            }
            return res;
        };

        if (s.chars().filter(c -> c == '=').count() != 1) {
            return 0;
        }
        int lv = expr();
        next.run();
        int rv = expr();
        if (failed == 0 && cur == s.length()) {
            return lv == rv;
        }
        return 0;
    }
}