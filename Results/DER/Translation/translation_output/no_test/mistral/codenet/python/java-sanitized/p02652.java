import java.util.*;

public class p02652 {
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

    public static int solve(String S) {
        Map<Character, Integer> d = new HashMap<>();
        d.put('0', 0);
        d.put('1', 1);
        d.put('?', 2);
        S = Arrays.stream(S.split("")).map(c -> d.get(c)).toArray();
        List<int[]> lookup = Arrays.asList(new int[]{-1, -1}, new int[]{1, 1}, new int[]{-1, 1});

        Function<Integer, Integer> judge = (target_lo, target_hi) -> {
            int lo = 0, hi = 0;
            boolean pl = target_lo % 2 == 0;
            boolean ph = target_hi % 2 == 0;
            for (int s : S) {
                int[] a = lookup.get(s);
                lo = Math.max(lo + a[0], target_lo + pl);
                hi = Math.min(hi + a[1], target_hi - ph);
                if (hi < lo) {
                    return false;
                }
                pl = !pl;
                ph = !ph;
            }
            return true;
        };

        int best = (int) Math.pow(10, 6) * 2;
        int n0 = S.count('0');
        int n1 = S.count('1');
        int n2 = S.count('?');
        int lo = -n0 - n2;
        int hi = n1 + n2;
        while (true) {
            hi = bisect(-1, hi, judge::apply);
            lo = bisect(1, lo, judge::apply);
            if (hi - lo >= best) {
                break;
            } else {
                best = hi - lo;
            }
        }
        hi++;
        lo = bisect(1, lo, judge::apply);
        return Math.min(best, hi - lo);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        System.out.println(solve(S));
    }
}