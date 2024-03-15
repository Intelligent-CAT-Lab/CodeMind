import java.util.HashMap;
import java.util.Scanner;

public class p02652 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        System.out.println(solve(S));
        scanner.close();
    }

    static int bisect(int ng, int ok, Judge judge) {
        while (Math.abs(ng - ok) > 1) {
            int m = (ng + ok) / 2;
            if (judge.evaluate(m)) {
                ok = m;
            } else {
                ng = m;
            }
        }
        return ok;
    }

    static int solve(String SString) {
        HashMap<Character, Integer> d = new HashMap<>();
        d.put('0', 0);
        d.put('1', 1);
        d.put('?', 2);
        int[][] lookup = {{-1, -1}, {1, 1}, {-1, 1}};
        
        int[] S = new int[SString.length()];
        for (int i = 0; i < SString.length(); i++) {
            S[i] = d.get(SString.charAt(i));
        }

        Judge judge = (target_lo, target_hi) -> {
            int lo = 0, hi = 0;
            boolean pl = (target_lo % 2) == 0;
            boolean ph = (target_hi % 2) == 0;
            for (int s : S) {
                int a = lookup[s][0];
                int b = lookup[s][1];
                lo = Math.max(lo + a, target_lo + (pl ? 1 : 0));
                hi = Math.min(hi + b, target_hi - (ph ? 1 : 0));
                if (hi < lo) {
                    return false;
                }
                pl = !pl;
                ph = !ph;
            }
            return true;
        };

        int best = (int) Math.pow(10, 6) * 2;
        int n0 = 0, n1 = 0, n2 = 0;
        for (int c : S) {
            if (c == 0) n0++;
            else if (c == 1) n1++;
            else n2++;
        }
        int lo = -n0 - n2;
        int hi = n1 + n2;
        while (true) {
            hi = bisect(-1, hi, x -> judge.evaluate(lo, x));
            lo = bisect(1, lo, x -> judge.evaluate(x, hi));
            if (hi - lo >= best) {
                break;
            } else {
                best = hi - lo;
            }
        }
        hi += 1;
        lo = bisect(1, lo, x -> judge.evaluate(x, hi));
        return Math.min(best, hi - lo);
    }

    interface Judge {
        boolean evaluate(int x);
    }
}