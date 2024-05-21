import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class p02652 {
    public static void main(String[] args) {
        String S = System.console().readLine();
        System.out.println(solve(S));
    }

    public static int solve(String S) {
        Map<Character, int[]> d = new HashMap<>();
        d.put('0', new int[]{0, 1});
        d.put('1', new int[]{1, 0});
        d.put('?', new int[]{2, 2});

        int n0 = 0, n1 = 0, n2 = 0;
        for (char c : S.toCharArray()) {
            int[] lookup = d.get(c);
            n0 += lookup[0];
            n1 += lookup[1];
            n2 += 2 - lookup[0] - lookup[1];
        }

        int lo = -n0 - n2;
        int hi = n1 + n2;
        while (true) {
            hi = bisect(-1, hi, (x) -> judge(lo, x));
            lo = bisect(1, lo, (x) -> judge(x, hi));
            if (hi - lo >= 10_000_000) {
                break;
            } else {
                hi += 1;
            }
        }
        hi += 1;
        lo = bisect(1, lo, (x) -> judge(x, hi));
        return Math.min(hi - lo, hi - lo);
    }

    public static int bisect(int ng, int ok, java.util.function.IntPredicate judge) {
        while (Math.abs(ng - ok) > 1) {
            int m = (ng + ok) / 2;
            if (judge.test(m)) {
                ok = m;
            } else {
                ng = m;
            }
        }
        return ok;