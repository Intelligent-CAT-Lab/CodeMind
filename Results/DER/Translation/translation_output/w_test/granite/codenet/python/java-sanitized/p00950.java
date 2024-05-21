import java.util.*;

public class p00950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = s.length();
        String base = "=+-*()01";
        int cnt = 0;
        Map<Character, Integer> mapping = new HashMap<>();
        Map<Integer, Integer> counter = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (base.indexOf(c)!= -1) {
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
        int ans = 0;
        for (int i = 0; i < base.length(); i++) {
            for (int j = i + 1; j < base.length(); j++) {
                for (int k = j + 1; k < base.length(); k++) {
                    for (int m = k + 1; m < base.length(); m++) {
                        for (int n = m + 1; n < base.length(); n++) {
                            for (int o = n + 1; o < base.length(); o++) {
                                for (int p = o + 1; p < base.length(); p++) {
                                    char[] b = new char[cnt];
                                    b[mapping.get(s.charAt(0))] = base.charAt(i);
                                    b[mapping.get(s.charAt(1))] = base.charAt(j);
                                    b[mapping.get(s.charAt(2))] = base.charAt(k);
                                    b[mapping.get(s.charAt(3))] = base.charAt(m);
                                    b[mapping.get(s.charAt(4))] = base.charAt(n);
                                    b[mapping.get(s.charAt(5))] = base.charAt(o);
                                    b[mapping.get(s.charAt(6))] = base.charAt(p);
                                    ans += solve(b);
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }

    static int solve(char[] b) {
        int l = b.length;
        int cur = 0;
        int failed = 0;
        int cnt = 0;
        for (int i = 0; i < l; i++) {
            if (b[i] == '=') {
                cnt++;
            }
        }
        if (cnt!= 1) {
            return 0;
        }
        int lv = expr(b, cur);
        cur++; // "="
        int rv = expr(b, cur);
        if (failed == 0 && cur == l) {
            return lv == rv? 1 : 0;
        }
        return 0;
    }

    static int expr(char[] b, int cur) {
        int l = b.length;
        int res = 0;
        int op = '+';
        while (cur < l) {
            if (op == '+') {
                res += term(b, cur);
            } else {
                res -= term(b, cur);
            }
            if (cur >= l) {
                break;
            }
            char c = b[cur];
            if (c!= '+' && c!= '-') {
                break;
            }
            cur++; // "+" or "-"
            op = c;
        }
        return res;
    }

    static int term(char[] b, int cur) {
        int l = b.length;
        int res = 1;
        while (cur < l) {
            char c = b[cur];
            if (c!= '*' && c!= '/') {
                break;
            }
            cur++; // "*" or "/"
            if (c == '*') {
                res *= factor(b, cur);
            } else {
                res /= factor(b, cur);
            }
        }
        return res;
    }

    static int factor(char[] b, int cur) {
        int l = b.length;
        char c = b[cur];
        if (c == '-') {
            cur++; // "-"
            return -factor(b, cur);
        } else if (c == '(') {
            cur++; // "("
            int res = expr(b, cur);
            if (b[cur]!= ')') {
                failed = 1;
            }
            cur++; // ")"
            return res;
        }
        return number(b, cur);
    }

    static int number(char[] b, int cur) {
        int l = b.length;
        int res = 0;
        char c = b[cur];
        if (c!= '0' && c!= '1') {
            failed = 1;
        }
        int first = 1;
        while (cur < l) {
            c = b[cur];
            if (c!= '0' && c!= '1') {
                break;
            }
            if (!first && res == 0) {
                failed = 1;
            }
            res = (res << 1) ^ (c - '0');
            cur++; // "0" or "1"
            first = 0;
        }
        return res;
    }
}