import java.util.*;

public class p00950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = s.length();
        char[] base = new char[]{'=', '+', '-', '*', '(', ')', '0', '1'};
        int[] mapping = new int[26];
        int[] counter = new int[8];
        int cnt = 0;
        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                continue;
            }
            if (mapping[c - 'a'] == 0) {
                mapping[c - 'a'] = cnt;
                cnt++;
            }
            counter[mapping[c - 'a']]++;
        }
        if (cnt > 8) {
            System.out.println(0);
            return;
        }
        int ans = 0;
        for (int[] b : new Permutations(base, cnt)) {
            ans += solve(b, s, mapping, counter, l);
        }
        System.out.println(ans);
    }

    public static int solve(int[] b, String s, int[] mapping, int[] counter, int l) {
        int cur = 0;
        boolean failed = false;
        int[] read = new int[l];
        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                read[i] = b[mapping[c - 'A']];
            } else {
                read[i] = c;
            }
        }
        int lv = expr(read, cur);
        cur++;
        int rv = expr(read, cur);
        if (!failed && cur == l) {
            return lv == rv? 1 : 0;
        }
        return 0;
    }

    public static int expr(int[] read, int cur) {
        int res = 0;
        char op = '+';
        while (1 == 1) {
            if (op == '+') {
                res += term(read, cur);
            } else {
                res -= term(read, cur);
            }
            char c = (char) read[cur];
            if (c!= '+' && c!= '-') {
                break;
            }
            cur++;
            op = c;
        }
        return res;
    }

    public static int term(int[] read, int cur) {
        int res = 1;
        while (1 == 1) {
            res *= factor(read, cur);
            char c = (char) read[cur];
            if (c!= '*') {
                break;
            }
            cur++;
        }
        return res;
    }

    public static int factor(int[] read, int cur) {
        char c = (char) read[cur];
        if (c == '-') {
            cur++;
            return -factor(read, cur);
        } else if (c == '(') {
            cur++;
            int val = expr(read, cur);
            cur++;
            return val;
        }
        return number(read, cur);
    }

    public static int number(int[] read, int cur) {
        int res = 0;
        if (read[cur]!= '0' && read[cur]!= '1') {
            return 0;
        }
        boolean first = true;
        while (1 == 1) {
            char c = (char) read[cur];
            if (c!= '0' && c!= '1') {
                break;
            }
            if (!first && res == 0) {
                return 0;
            }
            res = (res << 1) ^ (c - '0');
            cur++;
            first = false;
        }
        return res;
    }
}

class Permutations {
    char[] base;
    int cnt;
    int[] b;
    int[] cur;
    int[] mapping;
    int[] counter;
    int l;

    public Permutations(char[] base, int cnt) {
        this.base = base;
        this.cnt = cnt;
        this.b = new int[cnt];
        this.cur = new int[cnt];
        this.mapping = new int[26];
        this.counter = new int[8];
        this.l = 0;
    }

    public Iterator<int[]> iterator() {
        return new Iterator<int[]>() {
            @Override
            public boolean hasNext() {
                return next();
            }

            @Override
            public int[] next() {
                if (l == cnt) {
                    return null;
                }
                for (int i = 0; i < cnt; i++) {
                    b[i] = base[cur[i]];
                }
                l++;
                return b;
            }
        };
    }

    public boolean next() {
        if (l == cnt) {
            return false;
        }
        for (int i = 0; i < cnt; i++) {
            cur[i]++;
            if (cur[i] == base.length) {
                cur[i] = 0;
                l++;
            } else {
                break;
            }
        }
        return l == cnt;
    }
}