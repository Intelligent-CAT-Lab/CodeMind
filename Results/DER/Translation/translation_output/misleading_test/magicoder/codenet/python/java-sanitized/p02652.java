import java.util.*;

public class p02652 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        System.out.println(solve(S));
    }

    static int bisect(int ng, int ok, Predicate<Integer> judge) {
        while (Math.abs(ng - ok) > 1) {
            int m = (ng + ok) / 2;
            if (judge.test(m)) {
                ok = m;
            } else {
                ng = m;
            }
        }
        return ok;
    }

    static int solve(String S) {
        Map<Character, Integer> d = new HashMap<>();
        d.put('0', 0);
        d.put('1', 1);
        d.put('?', 2);
        int[] S_arr = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
            S_arr[i] = d.get(S.charAt(i));
        }
        int[][] lookup = {{-1, -1}, {1, 1}, {-1, 1}};

        Predicate<Integer> judge = target_lo -> {
            int lo = 0, hi = 0;
            boolean pl = target_lo % 2 == 0;
            boolean ph = target_lo % 2 == 0;
            for (int s : S_arr) {
                int[] a_b = lookup[s];
                lo = Math.max(lo + a_b[0], target_lo + (pl ? 1 : 0));
                hi = Math.min(hi + a_b[1], target_lo + (ph ? 1 : 0));
                if (hi < lo) {
                    return false;
                }
                pl = !pl;
                ph = !ph;
            }
            return true;
        };

        int best = 1000000 * 2;
        int n0 = 0, n1 = 0, n2 = 0;
        for (int s : S_arr) {
            if (s == 0) {
                n0++;
            } else if (s == 1) {
                n1++;
            } else {
                n2++;
            }
        }
        int lo = -n0 - n2;
        int hi = n1 + n2;
        while (true) {
            hi = bisect(-1, hi, m -> judge.test(lo, m));
            lo = bisect(1, lo, m -> judge.test(m, hi));
            if (hi - lo >= best) {
                break;
            } else {
                best = hi - lo;
            }
        }
        hi += 1;
        lo = bisect(1, lo, m -> judge.test(m, hi));
        return Math.min(best, hi - lo);
    }
}