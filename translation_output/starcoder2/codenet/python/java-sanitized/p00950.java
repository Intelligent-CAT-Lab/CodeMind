import java.util.*;

public class p00950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = s.length();
        String base = "=+-*()01";
        Map<Character, Integer> mapping = new HashMap<>();
        Map<Integer, Integer> counter = new HashMap<>();
        int cnt = 0;
        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            if (base.indexOf(c) != -1) {
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

        int solve(Function<Integer, Character> read) {
            int cur = 0, failed = 0;
            int next() {
                return ++cur;
            }
            void error() {
                failed = 1;
            }
            int number() {
                int res = 0;
                if (read.apply(cur) != '0' && read.apply(cur) != '1') {
                    error();
                }
                int first = 1;
                while (true) {
                    char c = read.apply(cur);
                    if (c != '0' && c != '1') {
                        break;
                    }
                    if (first == 0 && res == 0) {
                        error();
                    }
                    res = (res << 1) ^ (c - '0');
                    next();
                    first = 0;
                }
                return res;
            }
            int factor() {
                char c = read.apply(cur);
                if (c == '-') {
                    next();
                    return -factor();
                } else if (c == '(') {
                    next();
                    int val = expr();
                    if (read.apply(cur) != ')') {
                        error();
                    }
                    next();
                    return val;
                }
                return number();
            }
            int term() {
                int res = 1;
                while (true) {
                    res *= factor();
                    char c = read.apply(cur);
                    if (c != '*') {
                        break;
                    }
                    next();
                }
                return res;
            }
            int expr() {
                int res = 0;
                char op = '+';
                while (true) {
                    if (op == '+') {
                        res += term();
                    } else {
                        res -= term();
                    }
                    char c = read.apply(cur);
                    if (c != '+' && c != '-') {
                        break;
                    }
                    next();
                    op = c;
                }
                return res;
            }
            if (Collections.frequency(s, '=') != 1) {
                return 0;
            }
            int lv = expr();
            next();
            int rv = expr();
            if (failed == 0 && cur == l) {
                return lv == rv ? 1 : 0;
            }
            return 0;
        }

        Function<Integer, Character> get(char[] b) {
            return cur -> {
                if (l <= cur) {
                    return '$';
                }
                if (base.indexOf(s.charAt(cur)) != -1) {
                    return s.charAt(cur);
                }
                return b[mapping.get(s.charAt(cur))];
            };
        }

        int ans = 0;
        for (char[] b : permutations(base, cnt)) {
            ans += solve(get(b));
        }
        System.out.println(ans);
    }

    static char[] permutations(String base, int cnt) {
        char[] b = new char[cnt];
        for (int i = 0; i < cnt; i++) {
            b[i] = base.charAt(i);
        }
        return b;
    }
}

 1;
        }
        return 0;
    }
}

/atcoder/abc170/README.md
# AtCoder Beginner Contest 170
2020-05-16(土)