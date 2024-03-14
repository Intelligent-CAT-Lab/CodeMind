import java.util.*;

public class p02652 {
    static int bisect(int ng, int ok, Judge judge) {
        while (Math.abs(ng - ok) > 1) {
            int m = (ng + ok) / 2;
            if (judge.judge(m)) {
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
        char[] c = S.toCharArray();
        Integer[] s = new Integer[c.length];
        for (int i = 0; i < c.length; i++) {
            s[i] = d.get(c[i]);
        }
        int[][] lookup = {{ -1, -1}, {1, 1}, { -1, 1}};

        Judge judge = new Judge(s, lookup);

        int best = 1000000 * 2;
        int n0 = (int) Arrays.stream(s).filter(i -> i == 0).count();
        int n1 = (int) Arrays.stream(s).filter(i -> i == 1).count();
        int n2 = (int) Arrays.stream(s).filter(i -> i == 2).count();
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
        hi += 1;
        lo = bisect(1, lo, judge);
        return Math.min(best, hi - lo);
    }

    public static void main(String[] args) {
        String S = new Scanner(System.in).next();
        System.out.println(solve(S));
    }
}

interface Judge {
    boolean judge(int target);
}

class JudgeImpl implements Judge {
    Integer[] s;
    int[][] lookup;

    JudgeImpl(Integer[] s, int[][] lookup) {
        this.s = s;
        this.lookup = lookup;
    }

    public boolean judge(int target) {
        int lo = 0, hi = 0;
        boolean pl = target % 2 == 0;
        boolean ph = target % 2 == 0;
        for (int i : s) {
            int a = lookup[i][0];
            int b = lookup[i][1];
            lo = Math.max(lo + a, target + (pl ? 1 : 0));
            hi = Math.min(hi + b, target - (ph ? 1 : 0));
            if (hi < lo) {
                return false;
            }
            pl = !pl;
            ph = !ph;
        }
        return true;
    }
}