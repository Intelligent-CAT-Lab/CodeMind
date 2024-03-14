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
        int ans = 0;
        List<Character> b = new ArrayList<>();
        for (char c : base.toCharArray())
            b.add(c);
        do {
            ans += calc(b);
        } while (nextPermutation(b));
        return ans;
    }

    static int calc(List<Character> b) {
        int cur = 0, failed = 0;
        int read = get(b);
        int lv = expr(read), rv = expr(read);
        if (failed == 0 && cur == l)
            return lv == rv ? 1 : 0;
        return 0;
    }

    static int get(List<Character> b) {
        return cur -> {
            if (cur >= l)
                return '$';
            char c = s.charAt(cur);
            if (base.indexOf(c) != -1)
                return c;
            return b.get(mapping.get(c));
        };
    }

    static int expr(IntFunction<Character> read) {
        int res = 0, termRes = 0, op = '+';
        while (true) {
            termRes = term(read);
            if (op == '+')
                res += termRes;
            else
                res -= termRes;
            char c = read.apply(0);
            if (c != '+' && c != '-')
                break;
            op = c;
        }
        return res;
    }

    static int term(IntFunction<Character> read) {
        int res = 1, factorRes = 0;
        while (true) {
            factorRes = factor(read);
            res *= factorRes;
            char c = read.apply(0);
            if (c != '*')
                break;
        }
        return res;
    }

    static int factor(IntFunction<Character> read) {
        char c = read.apply(0);
        if (c == '-') {
            return -factor(read);
        } else if (c == '(') {
            read.apply(0); // "("
            int res = expr(read);
            if (read.apply(0) != ')')
                failed = 1;
            read.apply(0); // ")"
            return res;
        }
        return number(read);
    }

    static int number(IntFunction<Character> read) {
        int res = 0;
        while (true) {
            char c = read.apply(0);
            if (c != '0' && c != '1')
                break;
            res = (res << 1) ^ (c - '0');
            read.apply(0); // "0" or "1"
        }
        return res;
    }

    static boolean nextPermutation(List<Character> a) {
        int n = a.size(), i = n - 1;
        while (i > 0 && a.get(i - 1) >= a.get(i))
            i--;
        if (i <= 0)
            return false;
        int j = n - 1;
        while (a.get(j) <= a.get(i - 1))
            j--;
        Collections.swap(a, i - 1, j);
        j = n - 1;
        while (i < j) {
            Collections.swap(a, i, j);
            i++;
            j--;
        }
        return true;
    }
}