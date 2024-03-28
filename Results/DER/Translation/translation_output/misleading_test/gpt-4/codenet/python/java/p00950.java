Here is the translated Java code:

```java
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class ACMParser {

    private static final String base = "=+-*()01";
    private static String s;
    private static int l;
    private static Map<Character, Integer> mapping = new HashMap<>();
    private static Map<Integer, Integer> counter = new HashMap<>();
    private static int cnt = 0;
    private static char[] b;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();
        l = s.length();

        for (char c : s.toCharArray()) {
            if (base.indexOf(c) >= 0) {
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
        Permutation permutation = new Permutation(base.toCharArray(), cnt);
        while ((b = permutation.next()) != null) {
            ans += solve() ? 1 : 0;
        }

        System.out.println(ans);
    }

    private static int cur;
    private static int failed;

    private static boolean solve() {
        cur = failed = 0;
        if (countEquals(l, s) != 1) {
            return false;
        }
        int lv = expr();
        next(); // "="
        int rv = expr();

        return failed == 0 && cur == l && lv == rv;
    }

    private static int countEquals(int length, String str) {
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == '=') {
                count++;
            }
        }
        return count;
    }

    private static void next() {
        cur++;
    }

    private static void error() {
        failed = 1;
    }

    private static int number() {
        int res = 0;
        if (read(cur) != '0' && read(cur) != '1') {
            error();
        }
        boolean first = true;
        while (true) {
            char c = read(cur);
            if (c != '0' && c != '1') {
                break;
            }
            if (!first && res == 0) {
                error();
            }
            res = (res << 1) ^ (c - '0');
            next(); // "0" or "1"
            first = false;
        }
        return res;
    }

    private static int factor() {
        char c = read(cur);
        if (c == '-') {
            next(); // "-"
            return -factor();
        } else if (c == '(') {
            next(); // "("
            int val = expr();
            if (read(cur) != ')') {
                error();
            }
            next(); // ")"
            return val;
        }
        return number();
    }

    private static int term() {
        int res = 1;
        while (true) {
            res *= factor();
            char c = read(cur);
            if (c != '*') {
                break;
            }
            next(); // "*"
        }
        return res;
    }

    private static int expr() {
        int res = 0;
        char op = '+';
        while (true) {
            if (op == '+') {
                res += term();
            } else {
                res -= term();
            }
            char c = read(cur);
            if (c != '+' && c != '-') {
                break;
            }
            next(); // "+" or "-"
            op = c;
        }
        return res;
    }

    private static char read(int cur) {
        if (l <= cur) {
            return '$';
        }
        char c = s.charAt(cur);
        if (base.indexOf(c) >= 0) {
            return c;
        }
        return b[mapping.get(c)];
    }

    // Util class to generate permutations of a given character array
    private static class Permutation {
        private char[] chars;
        private int[] indexes;
        private boolean first = true;
        private int r;

        Permutation(char[] chars, int r) {
            this.chars = chars.clone();
            this.r = r;
            indexes = new int[r];
            for (int i = 0; i < r; i++) {
                indexes[i] = i;
            }
        }

        public char[] next() {
            if (first) {
                first = false;
                return take();
            }
            int i = r - 1;
            while (i >= 0 && indexes[i] == chars.length - r + i) {
                i--;
            }
            if (i < 0) {
                return null;
            }
            indexes[i]++;
            for (int j = i + 1; j < r; j++) {
                indexes[j] = indexes[j - 1] + 1;
            }
            return take();
        }

        private char[] take() {
            char[] result = new char[r];
            for (int i = 0; i < r; i++) {
                result[i] = chars[indexes[i]];
            }
            return result;
        }
    }
}
```

This code attempts to replicate the behavior of the Python script, using recursion and backtracking to calculate expressions and evaluate their equality after permutations. However, note that unlike Python which has built-in generators and itertools.permutations, Java does not support such constructs directly. This permutation algorithm is a simple combinatorial iteration over the possible permutations of the available characters, and it may not work optimally as compared to the itertools.permutations function.

