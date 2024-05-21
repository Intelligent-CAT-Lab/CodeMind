import java.util.*;

public class p02652 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        System.out.println(solve(S));
    }

    public static int solve(String S) {
        int[] d = new int[3];
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '0') {
                d[0]++;
            } else if (S.charAt(i) == '1') {
                d[1]++;
            } else {
                d[2]++;
            }
        }
        int[][] lookup = new int[][] {{-1, -1}, {1, 1}, {-1, 1}};
        int best = 1000000 * 2;
        int lo = -d[0] - d[2];
        int hi = d[1] + d[2];
        while (true) {
            hi = bisect(-1, hi, (target_lo) -> {
                int lo_ = 0, hi_ = 0;
                boolean pl = target_lo % 2 == 0;
                boolean ph = target_hi % 2 == 0;
                for (int i = 0; i < S.length(); i++) {
                    int a = lookup[S.charAt(i) - '0'][0];
                    int b = lookup[S.charAt(i) - '0'][1];
                    lo_ = Math.max(lo_ + a, target_lo + pl);
                    hi_ = Math.min(hi_ + b, target_hi - ph);
                    if (hi_ < lo_) {
                        return false;
                    }
                    pl =!pl;
                    ph =!ph;
                }
                return true;
            });
            lo = bisect(1, lo, (target_lo) -> {
                int lo_ = 0, hi_ = 0;
                boolean pl = target_lo % 2 == 0;
                boolean ph = target_hi % 2 == 0;
                for (int i = 0; i < S.length(); i++) {
                    int a = lookup[S.charAt(i) - '0'][0];
                    int b = lookup[S.charAt(i) - '0'][1];
                    lo_ = Math.max(lo_ + a, target_lo + pl);
                    hi_ = Math.min(hi_ + b, target_hi - ph);
                    if (hi_ < lo_) {
                        return false;
                    }
                    pl =!pl;
                    ph =!ph;
                }
                return true;
            });
            if (hi - lo >= best) {
                break;
            } else {
                best = hi - lo;
            }
        }
        hi++;
        lo = bisect(1, lo, (target_lo) -> {
            int lo_ = 0, hi_ = 0;
            boolean pl = target_lo % 2 == 0;
            boolean ph = target_hi % 2 == 0;
            for (int i = 0; i < S.length(); i++) {
                int a = lookup[S.charAt(i) - '0'][0];
                int b = lookup[S.charAt(i) - '0'][1];
                lo_ = Math.max(lo_ + a, target_lo + pl);
                hi_ = Math.min(hi_ + b, target_hi - ph);
                if (hi_ < lo_) {
                    return false;
                }
                pl =!pl;
                ph =!ph;
            }
            return true;
        });
        return Math.min(best, hi - lo);
    }

    public static int bisect(int ng, int ok, Function<Integer, Boolean> judge) {
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