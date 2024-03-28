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

        int ans = 0;
        for (int[] b : getPermutations(base.toCharArray(), cnt)) {
            ans += solve(b);
        }
        System.out.println(ans);
    }

    public static int solve(int[] b) {
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
            while (cur < b.length && b[cur] != '0' && b[cur] != '1') {
                error.run();
            }
            if (cur < b.length && b[cur] == '0') {
                number.run();
            } else {
                error.run();
            }
            res = (res << 1) ^ b[cur];
            next.run();
            cur++;
            return res;
        };

        Runnable factor = () -> {
            int c = b[cur];
            if (c == '-') {
                next.run();
                return -factor();
            } else if (c == '(') {
                next.run();
                int val = solve(b);
                if (b[cur] != ')') {
                    error.run();
                }
                next.run();
                return val;
            }
            return number();
        };

        Runnable term = () -> {
            int res = 1;
            while (cur < b.length) {
                res *= factor();
                int c = b[cur];
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
            while (cur < b.length) {
                if (op == '+') {
                    res += term();
                } else {
                    res -= term();
                }
                int c = b[cur];
                if (c != '+' && c != '-') {
                    break;
                }
                next.run();
                op = c;
            }
            return res;
        };

        if (Arrays.stream(b).filter(c -> c == '=').count() != 1) {
            return 0;
        }
        int lv = expr();
        next.run();
        int rv = expr();
        if (failed == 0 && cur == b.length) {
            return lv == rv;
        }
        return 0;
    }

    public static List<int[]> getPermutations(char[] arr, int n) {
        List<int[]> res = new ArrayList<>();
        if (n == 1) {
            res.add(new int[]{arr[0]});
            return res;
        }
        for (int i = 0; i < n; i++) {
            char temp = arr[i];
            for (int[] permutation : getPermutations(arr, n - 1)) {
                for (int j = 0; j <= permutation.length; j++) {
                    permutation[j] = temp;
                }
                res.add(permutation);
            }
        }
        return res;
    }
}