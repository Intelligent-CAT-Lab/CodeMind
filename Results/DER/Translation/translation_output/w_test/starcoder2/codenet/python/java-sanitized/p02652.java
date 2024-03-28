import java.util.*;

public class p02652 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        System.out.println(solve(S));
    }

    static int bisect(int ng, int ok, Function<Integer, Boolean> judge) {
        while (Math.abs(ng - ok) > 1) {
            int m = (ng + ok) / 2;
            if (judge.apply(m)) {
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
        int[] lookup = new int[]{-1, 1, -1, 1, -1, 1};
        int[] s = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
            s[i] = d.get(S.charAt(i));
        }

        Function<Integer, Boolean> judge = target_lo -> {
            int lo = 0;
            int hi = 0;
            boolean pl = target_lo % 2 == 0;
            boolean ph = false;
            for (int i = 0; i < s.length; i++) {
                int a = lookup[s[i] * 2];
                int b = lookup[s[i] * 2 + 1];
                lo = Math.max(lo + a, target_lo + (pl ? 1 : 0));
                hi = Math.min(hi + b, target_lo - (ph ? 1 : 0));
                if (hi < lo) {
                    return false;
                }
                pl = !pl;
                ph = !ph;
            }
            return true;
        };

        int best = 1000000 * 2;
        int n0 = 0;
        int n1 = 0;
        int n2 = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] == 0) {
                n0++;
            } else if (s[i] == 1) {
                n1++;
            } else {
                n2++;
            }
        }
        int lo = -n0 - n2;
        int hi = n1 + n2;
        while (true) {
            hi = bisect(-1, hi, x -> judge.apply(lo));
            lo = bisect(1, lo, x -> judge.apply(hi));
            if (hi - lo >= best) {
                break;
            } else {
                best = hi - lo;
            }
        }
        hi += 1;
        lo = bisect(1, lo, x -> judge.apply(hi));
        return Math.min(best, hi - lo);
    }
}