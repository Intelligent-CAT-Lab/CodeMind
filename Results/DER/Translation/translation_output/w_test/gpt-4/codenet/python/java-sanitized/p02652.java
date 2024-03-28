import java.util.Scanner;

public class p02652 {

    public static int bisect(int ng, int ok, Judge judge) {
        while (Math.abs(ng - ok) > 1) {
            int m = (ng + ok) / 2;
            if (judge.check(m)) {
                ok = m;
            } else {
                ng = m;
            }
        }
        return ok;
    }

    public static int solve(String S) {
        int[] d = {0, 1, 2}; // map '0' to 0, '1' to 1, '?' to 2
        int[][] lookup = {{-1, -1}, {1, 1}, {-1, 1}};
        int best = 1000000 * 2;
        int n0 = 0, n1 = 0, n2 = 0;

        // Count distribution of characters '0', '1', and '?'
        for (char c : S.toCharArray()) {
            if (c == '0') n0++;
            else if (c == '1') n1++;
            else n2++;
        }

        int lo = -n0 - n2;
        int hi = n1 + n2;
        while (true) {
            final int finalLo = lo;
            hi = bisect(-1, hi, x -> judge(S, lookup, finalLo, x));

            final int finalHi = hi;
            lo = bisect(1, lo, x -> judge(S, lookup, x, finalHi));

            if (hi - lo >= best) {
                break;
            } else {
                best = hi - lo;
            }
        }

        hi += 1;
        final int finalHi = hi;
        lo = bisect(1, lo, x -> judge(S, lookup, x, finalHi));
        return Math.min(best, hi - lo);
    }

    public static boolean judge(String S, int[][] lookup, int target_lo, int target_hi) {
        int lo = 0, hi = 0;
        boolean pl = target_lo % 2 == 0;
        boolean ph = target_hi % 2 == 0;
        for (char c : S.toCharArray()) {
            int[] entry = lookup[c == '0' ? 0 : c == '1' ? 1 : 2];
            int a = entry[0], b = entry[1];
            lo = Math.max(lo + a, target_lo + (pl ? 1 : 0));
            hi = Math.min(hi + b, target_hi - (ph ? 1 : 0));
            if (hi < lo) {
                return false;
            }
            pl = !pl;
            ph = !ph;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        System.out.println(solve(S));
        scanner.close();
    }

    @FunctionalInterface
    public interface Judge {
        boolean check(int value);
    }
}