import java.util.*;
import java.io.*;

public class p02652 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        System.out.println(solve(S));
    }

    public static int solve(String S) {
        int[] d = new int[3];
        d[0] = -1;
        d[1] = 1;
        d[2] = -1;
        int[] lookup = new int[3][2];
        lookup[0][0] = -1;
        lookup[0][1] = 1;
        lookup[1][0] = -1;
        lookup[1][1] = 1;
        lookup[2][0] = -1;
        lookup[2][1] = 1;
        int n0 = 0, n1 = 0, n2 = 0;
        for (char c : S.toCharArray()) {
            if (c == '0') n0++;
            if (c == '1') n1++;
            if (c == '?') n2++;
        }
        int lo = -n0 - n2;
        int hi = n1 + n2;
        int best = 1000000 * 2;
        while (true) {
            hi = bisect(-1, hi, (target_lo, target_hi) -> {
                int lo1 = 0, hi1 = 0;
                boolean pl = target_lo % 2 == 0;
                boolean ph = target_hi % 2 == 0;
                for (char c : S.toCharArray()) {
                    int a = lookup[c - '0'][0];
                    int b = lookup[c - '0'][1];
                    lo1 = Math.max(lo1 + a, target_lo + pl? 1 : 0);
                    hi1 = Math.min(hi1 + b, target_hi - ph? 1 : 0);
                    if (hi1 < lo1) return false;
                    pl =!pl;
                    ph =!ph;
                }
                return true;
            });
            lo = bisect(1, lo, (target_lo, target_hi) -> {
                int lo1 = 0, hi1 = 0;
                boolean pl = target_lo % 2 == 0;
                boolean ph = target_hi % 2 == 0;
                for (char c : S.toCharArray()) {
                    int a = lookup[c - '0'][0];
                    int b = lookup[c - '0'][1];
                    lo1 = Math.max(lo1 + a, target_lo + pl? 1 : 0);
                    hi1 = Math.min(hi1 + b, target_hi - ph? 1 : 0);
                    if (hi1 < lo1) return false;
                    pl =!pl;
                    ph =!ph;
                }
                return true;
            });
            if (hi - lo >= best) break;
            else best = hi - lo;
        }
        hi += 1;
        lo = bisect(1, lo, (target_lo, target_hi) -> {
            int lo1 = 0, hi1 = 0;
            boolean pl = target_lo % 2 == 0;
            boolean ph = target_hi % 2 == 0;
            for (char c : S.toCharArray()) {
                int a = lookup[c - '0'][0];
                int b = lookup[c - '0'][1];
                lo1 = Math.max(lo1 + a, target_lo + pl? 1 : 0);
                hi1 = Math.min(hi1 + b, target_hi - ph? 1 : 0);
                if (hi1 < lo1) return false;
                pl =!pl;
                ph =!ph;
            }
            return true;
        });
        return Math.min(best, hi - lo);
    }

    public static int bisect(int ng, int ok, BiFunction<Integer, Integer, Boolean> judge) {
        while (Math.abs(ng - ok) > 1) {
            int m = (ng + ok) / 2;
            if (judge.apply(m, ok)) ok = m;
            else ng = m;
        }
        return ok;
    }
}