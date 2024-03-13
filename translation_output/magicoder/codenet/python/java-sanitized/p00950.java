import java.util.*;
import java.util.stream.Collectors;

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
            System.exit(0);
        }
        int ans = 0;
        for (List<Character> b : permutations(base.toCharArray(), cnt)) {
            ans += solve(get(b));
        }
        System.out.println(ans);
    }

    static int solve(Function<Integer, Character> read) {
        int cur = 0;
        int failed = 0;
        Function<Void, Integer> next = () -> {
            cur++;
            return null;
        };
        Function<Void, Integer> error = () -> {
            failed = 1;
            return null;
        };
        Function<Void, Integer> number = () -> {
            int res = 0;
            if (base.indexOf(read.apply(cur)) == -1) {
                error.apply(null);
            }
            boolean first = true;
            while (true) {
                char c = read.apply(cur);
                if (base.indexOf(c) != -1) {
                    break;
                }
                if (!first && res == 0) {
                    error.apply(null);
                }
                res = (res << 1) ^ (c == '1' ? 1 : 0);
                next.apply(null);
                first = false;
            }
            return res;
        };
        Function<Void, Integer> factor = () -> {
            char c = read.apply(cur);
            if (c == '-') {
                next.apply(null);
                return -factor.apply(null);
            } else if (c == '(') {
                next.apply(null);
                int val = expr.apply(null);
                if (read.apply(cur) != ')') {
                    error.apply(null);
                }
                next.apply(null);
                return val;
            }
            return number.apply(null);
        };
        Function<Void, Integer> term = () -> {
            int res = 1;
            while (true) {
                res *= factor.apply(null);
                char c = read.apply(cur);
                if (c != '*') {
                    break;
                }
                next.apply(null);
            }
            return res;
        };
        Function<Void, Integer> expr = () -> {
            int res = 0;
            char op = '+';
            while (true) {
                if (op == '+') {
                    res += term.apply(null);
                } else {
                    res -= term.apply(null);
                }
                char c = read.apply(cur);
                if (base.indexOf(c) == -1) {
                    break;
                }
                next.apply(null);
                op = c;
            }
            return res;
        };
        if (s.chars().filter(c -> c == '=').count() != 1) {
            return 0;
        }
        int lv = expr.apply(null);
        next.apply(null);
        int rv = expr.apply(null);
        if (failed == 0 && cur == l) {
            return lv == rv ? 1 : 0;
        }
        return 0;
    }

    static Function<Integer, Character> get(List<Character> b) {
        return cur -> {
            if (cur >= l) {
                return '$';
            }
            char c = s.charAt(cur);
            if (base.indexOf(c) != -1) {
                return c;
            }
            return b.get(mapping.get(s.charAt(cur)));
        };
    }

    static List<List<Character>> permutations(char[] arr, int r) {
        List<List<Character>> result = new ArrayList<>();
        permutationsHelper(arr, r, 0, result);
        return result;
    }

    static void permutationsHelper(char[] arr, int r, int depth, List<List<Character>> result) {
        if (depth == r) {
            result.add(Arrays.stream(arr).limit(r).collect(Collectors.toList()));
            return;
        }
        for (int i = depth; i < arr.length; i++) {
            swap(arr, depth, i);
            permutations