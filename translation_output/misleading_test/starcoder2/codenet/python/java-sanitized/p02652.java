import java.util.*;

public class p02652 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        System.out.println(solve(S));
    }

    static int solve(String S) {
        int[] d = new int[3];
        d[0] = 0;
        d[1] = 1;
        d[2] = 2;
        int[] lookup = new int[3];
        lookup[0] = -1;
        lookup[1] = 1;
        lookup[2] = 2;

        int[] s = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
            s[i] = d[S.charAt(i) - '0'];
        }

        int best = 1000000 * 2;
        int n0 = 0, n1 = 0, n2 = 0;
        for (int i = 0; i < S.length(); i++) {
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
            hi = bisect(-1, hi, (x) -> judge(lo, x, s));
            lo = bisect(1, lo, (x) -> judge(x, hi, s));
            if (hi - lo >= best) {
                break;
            } else {
                best = hi - lo;
            }
        }
        hi += 1;
        lo = bisect(1, lo, (x) -> judge(x, hi, s));
        return Math.min(best, hi - lo);
    }

    static boolean judge(int target_lo, int target_hi, int[] s) {
        int lo = 0, hi = 0;
        boolean pl = target_lo % 2 == 0;
        boolean ph = target_hi % 2 == 0;
        for (int i = 0; i < s.length; i++) {
            int a = lookup[s[i]];
            lo = Math.max(lo + a, target_lo + (pl ? 1 : 0));
            hi = Math.min(hi + a, target_hi - (ph ? 1 : 0));
            if (hi < lo) {
                return false;
            }
            pl = !pl;
            ph = !ph;
        }
        return true;
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
}