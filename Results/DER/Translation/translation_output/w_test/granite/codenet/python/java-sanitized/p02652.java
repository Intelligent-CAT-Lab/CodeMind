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
        int[] d = new int[256];
        d['0'] = 0;
        d['1'] = 1;
        d['?'] = 2;
        int[] S_ = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
            S_[i] = d[S.charAt(i)];
        }
        int[][] lookup = new int[][] {{-1, -1}, {1, 1}, {-1, 1}};

        Function<Integer, Boolean> judge = (target_lo) -> {
            int lo = 0, hi = 0;
            boolean pl = target_lo % 2 == 0;
            boolean ph = target_lo % 2 == 0;
            for (int s : S_) {
                int a = lookup[s][0];
                int b = lookup[s][1];
                lo = Math.max(lo + a, target_lo + pl);
                hi = Math.min(hi + b, target_lo - ph);
                if (hi < lo) {
                    return false;
                }
                pl =!pl;
                ph =!ph;
            }
            return true;
        };

        int best = 1000000 * 2;
        int n0 = 0, n1 = 0, n2 = 0;
        for (int s : S_) {
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
            hi = bisect(-1, hi, judge);
            lo = bisect(1, lo, judge);
            if (hi - lo >= best) {
                break;
            } else {
                best = hi - lo;
            }
        }
        hi++;
        lo = bisect(1, lo, judge);
        return Math.min(best, hi - lo);
    }
}