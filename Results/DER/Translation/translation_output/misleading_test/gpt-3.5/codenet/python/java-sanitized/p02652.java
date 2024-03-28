import java.util.Scanner;

public class p02652 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        System.out.println(solve(S));
    }

    private static int bisect(int ng, int ok, Judge judge) {
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

    private static int solve(String S) {
        int[] d = {0, 1, 2};
        int[] sArray = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            sArray[i] = d[Character.getNumericValue(c)];
        }

        int[][] lookup = {{-1, -1}, {1, 1}, {-1, 1}};

        Judge judge = new Judge() {
            @Override
            public boolean judge(int targetLo, int targetHi) {
                int lo = 0, hi = 0;
                boolean pl = targetLo % 2 == 0;
                boolean ph = targetHi % 2 == 0;
                for (int s : sArray) {
                    int[] ab = lookup[s];
                    lo = Math.max(lo + ab[0], targetLo + (pl ? 0 : 1));
                    hi = Math.min(hi + ab[1], targetHi + (ph ? 0 : 1));
                    if (hi < lo) {
                        return false;
                    }
                    pl = !pl;
                    ph = !ph;
                }
                return true;
            }
        };

        int best = 10^6*2;
        int n0 = 0, n1 = 0, n2 = 0;
        for (int value : sArray) {
            if (value == 0) n0++;
            else if (value == 1) n1++;
            else n2++;
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

        hi += 1;
        lo = bisect(1, lo, judge);
        return Math.min(best, hi - lo);
    }

    interface Judge {
        boolean judge(int targetLo, int targetHi);
    }
}