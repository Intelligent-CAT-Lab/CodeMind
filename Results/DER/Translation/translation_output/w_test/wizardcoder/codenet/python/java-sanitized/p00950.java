import java.util.*;

public class p00950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int l = s.length();
        char[] base = {'=', '+', '-', '*', '(', ')', '0', '1'};
        int[] mapping = new int[256];
        int[] counter = new int[10];
        int cnt = 0;
        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            if (Arrays.binarySearch(base, c) >= 0) {
                continue;
            }
            if (mapping[c] == 0) {
                mapping[c] = cnt;
                cnt++;
            }
            counter[mapping[c]]++;
        }
        if (cnt > 8) {
            System.out.println(0);
            return;
        }
        int ans = 0;
        for (int[] b : permutations(base, cnt)) {
            ans += solve(s, l, b, mapping, counter);
        }
        System.out.println(ans);
    }

    private static int solve(String s, int l, char[] b, int[] mapping, int[] counter) {
        int cur = 0;
        boolean failed = false;
        int lv = expr(s, l, b, mapping, counter, cur);
        cur++;
        int rv = expr(s, l, b, mapping, counter, cur);
        if (!failed && cur == l) {
            return lv == rv? 1 : 0;
        }
        return 0;
    }

    private static int expr(String s, int l, char[] b, int[] mapping, int[] counter, int cur) {
        int res = 0;
        char op = '+';
        while (cur < l) {
            if (op == '+') {
                res += term(s, l, b, mapping, counter, cur);
            } else {
                res -= term(s, l, b, mapping, counter, cur);
            }
            char c = s.charAt(cur);
            if (c!= '+' && c!= '-') {
                break;
            }
            cur++;
            op = c;
        }
        return res;
    }

    private static int term(String s, int l, char[] b, int[] mapping, int[] counter, int cur) {
        int res = 1;
        while (cur < l) {
            res *= factor(s, l, b, mapping, counter, cur);
            char c = s.charAt(cur);
            if (c!= '*') {
                break;
            }
            cur++;
        }
        return res;
    }

    private static int factor(String s, int l, char[] b, int[] mapping, int[] counter, int cur) {
        char c = s.charAt(cur);
        if (c == '-') {
            cur++;
            return -factor(s, l, b, mapping, counter, cur);
        } else if (c == '(') {
            cur++;
            int val = expr(s, l, b, mapping, counter, cur);
            cur++;
            return val;
        }
        return number(s, l, b, mapping, counter, cur);
    }

    private static int number(String s, int l, char[] b, int[] mapping, int[] counter, int cur) {
        int res = 0;
        boolean first = true;
        while (cur < l) {
            char c = s.charAt(cur);
            if (c!= '0' && c!= '1') {
                break;
            }
            if (!first && res == 0) {
                failed = true;
                break;
            }
            res = (res << 1) ^ (c - '0');
            cur++;
            first = false;
        }
        return res;
    }

    private static boolean failed = false;

    private static List<int[]> permutations(char[] base, int cnt) {
        List<int[]> res = new ArrayList<>();
        int[] nums = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            nums[i] = i;
        }
        permute(res, nums, base, cnt);
        return res;
    }

    private static void permute(List<int[]> res, int[] nums, char[] base, int cnt) {
        if (cnt == 0) {
            res.add(Arrays.copyOf(nums, nums.length));
            return;
        }
        for (int i = 0; i < base.length; i++) {
            if (counter[i] == 0) {
                continue;
            }
            nums[cnt - 1] = i;
            counter[i]--;
            permute(res, nums, base, cnt - 1);
            counter[i]++;
        }
    }
}