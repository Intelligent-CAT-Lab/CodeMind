import java.util.Scanner;

public class p02652 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        System.out.println(solve(S));
    }

    public static int solve(String S) {
        int[] d = new int[3];
        d[0] = 0;
        d[1] = 1;
        d[2] = 2;

        int[] lookup = new int[3][2];
        lookup[0][0] = -1;
        lookup[0][1] = -1;
        lookup[1][0] = 1;
        lookup[1][1] = 1;
        lookup[2][0] = -1;
        lookup[2][1] = 1;

        int n0 = 0;
        int n1 = 0;
        int n2 = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '0') {
                n0++;
            } else if (S.charAt(i) == '1') {
                n1++;
            } else {
                n2++;
            }
        }

        int lo = -n0 - n2;
        int hi = n1 + n2;
        int best = 1000000 * 2;

        while (true) {
            hi = bisect(-1, hi, (x) -> judge(lo, x));
            lo = bisect(1, lo, (x) -> judge(x, hi));
            if (hi - lo >= best) {
                break;
            } else {
                best = hi - lo;
            }
        }

        hi += 1;
        lo = bisect(1, lo, (x) -> judge(x, hi));
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

    public static boolean judge(int target_lo, int target_hi) {
        int lo = 0;
        int hi = 0;
        boolean pl = target_lo % 2 == 0;
        boolean ph = target_hi % 2 == 0;
        for (int s : S) {
            int a = lookup[s][0];
            int b = lookup[s][1];
            lo = Math.max(lo + a, target_lo + pl);
            hi = Math.min(hi + b, target_hi - ph);
            if (hi < lo) {
                return false;
            }
            pl = !pl;
            ph = !ph;
        }
        return true;
    }
}