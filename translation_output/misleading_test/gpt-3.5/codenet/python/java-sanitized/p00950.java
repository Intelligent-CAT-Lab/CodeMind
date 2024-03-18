import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class p00950 {

    static String base = "=+-*()01";
    static String s;
    static int l;
    static int[] mapping;
    static int[] counter;
    static int cnt;

    public static void main(String[] args) {
        s = "ACM";
        l = s.length();
        mapping = new int[256];
        counter = new int[256];
        cnt = 0;

        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            if (base.contains(String.valueOf(c))) {
                continue;
            }
            if (mapping[c] == 0) {
                mapping[c] = cnt;
                cnt++;
            }
            int v = mapping[c];
            counter[v]++;
        }

        if (cnt > 8) {
            System.out.println(0);
            System.exit(0);
        }

        int ans = 0;
        for (char[] b : permutations(base.toCharArray(), cnt)) {
            ans += solve(get(b));
        }
        System.out.println(ans);
    }

    static boolean solve(IntFunction<Character> read) {
        int[] cur = {0};
        int[] failed = {0};

        IntConsumer next = () -> cur[0]++;
        Runnable error = () -> failed[0] = 1;

        IntSupplier number = () -> {
            int res = 0;
            if (read.apply(cur[0]) != '0' && read.apply(cur[0]) != '1') {
                error.run();
            }
            boolean first = true;
            while (true) {
                char c = read.apply(cur[0]);
                if (c != '0' && c != '1') {
                    break;
                }
                if (!first && res == 0) {
                    error.run();
                }
                res = (res << 1) ^ Integer.parseInt(String.valueOf(c));
                next.run();
                first = false;
            }
            return res;
        };

        IntSupplier factor = () -> {
            char c = read.apply(cur[0]);
            if (c == '-') {
                next.run();
                return -factor.getAsInt();
            } else if (c == '(') {
                next.run();
                int val = expr();
                if (read.apply(cur[0]) != ')') {
                    error.run();
                }
                next.run();
                return val;
            }
            return number.getAsInt();
        };

        IntSupplier term = () -> {
            int res = 1;
            while (true) {
                res *= factor.getAsInt();
                char c = read.apply(cur[0]);
                if (c != '*') {
                    break;
                }
                next.run();
            }
            return res;
        };

        IntFunction<Integer> expr = () -> {
            int res = 0;
            char op = '+';
            while (true) {
                if (op == '+') {
                    res += term.getAsInt();
                } else {
                    res -= term.getAsInt();
                }
                char c = read.apply(cur[0]);
                if (c != '+' && c != '-') {
                    break;
                }
                next.run();
                op = c;
            }
            return res;
        };

        int equalSignCount = 0;
        for (int i = 0; i < l; i++) {
            if (read.apply(i) == '=') {
                equalSignCount++;
            }
        }

        if (equalSignCount != 1) {
            return false;
        }

        int lv = expr.get();
        next.run();
        int rv = expr.get();

        return !failed[0] && cur[0] == l && lv == rv;
    }

    static IntFunction<Character> get(char[] b) {
        return cur -> cur >= l ? '$' : (base.indexOf(s.charAt(cur)) != -1 ? s.charAt(cur) : b[mapping[s.charAt(cur)]);
    }

    static <T> Set<T[]> permutations(T[] arr, int r) {
        Set<T[]> result = new HashSet<>();
        permute(result, arr, 0, r);
        return result;
    }

    static <T> void permute(Set<T[]> result, T[] arr, int start, int r) {
        if (start == r) {
            result.add(Arrays.copyOf(arr, r));
        } else {
            for (int i = start; i < arr.length; i++) {
                swap(arr, i, start);
                permute(result, arr, start + 1, r);
                swap(arr, i, start);
            }
        }
    }

    static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}