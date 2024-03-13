import java.util.*;

public class p02652 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
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
        int[] S_arr = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
            S_arr[i] = d.get(S.charAt(i));
        }
        int[][] lookup = {{-1, -1}, {1, 1}, {-1, 1}};

        Function<Integer, Boolean> judge = (target_lo, target_hi) -> {
            int lo = 0, hi = 0;
            boolean pl = target_lo % 2 == 0;
            boolean ph = target_hi % 2 == 0;
            for (int s : S_arr) {
                int[] a_b = lookup[s];
                lo = Math.max(lo + a_b[0], target_lo + (pl ? 1 : 0));
                hi = Math.min(hi + a_b[1], target_hi - (ph ? 1 : 0));
                if (hi < lo) {
                    return false;
                }
                pl = !pl;
                ph = !ph;
            }
            return true;
        };

        int best = 1000000 * 2;
        int n0 = (int) Arrays.stream(S_arr).filter(x -> x == 0).count();
        int n1 = (int) Arrays.stream(S_arr).filter(x -> x == 1).count();
        int n2 = (int) Arrays.stream(S_arr).filter(x -> x == 2).count();
        int lo = -n0 - n2;
        int hi = n1 + n2;
        while (true) {
            hi = bisect(-1, hi, x -> judge.apply(lo, x));
            lo = bisect(1, lo, x -> judge.apply(x, hi));
            if (hi - lo >= best) {
                break;
            } else {
                best = hi - lo;
            }
        }
        hi += 1;
        lo = bisect(1, lo, x -> judge.apply(x, hi));
        return Math.min(best, hi - lo);
    }
}