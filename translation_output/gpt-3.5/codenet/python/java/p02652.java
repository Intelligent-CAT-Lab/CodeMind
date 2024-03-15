```java
import java.util.Scanner;

public class Main {

    // Binary search function for finding the boundary
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

    // Functional interface for judge method
    interface Judge {
        boolean judge(int targetLo, int targetHi);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        System.out.println(solve(S));
    }

    // Main solve method translated from original Python code
    static int solve(String S) {
        int[] d = {0, 1, 2}; // 0 corresponds to '0', 1 corresponds to '1', 2 corresponds to '?'
        int[] s = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
            s[i] = d[S.charAt(i) - '0'];
        }

        int[][] lookup = {{-1, -1}, {1, 1}, {-1, 1}};

        Judge judge = (targetLo, targetHi) -> {
            int lo = 0, hi = 0;
            boolean pl = targetLo % 2 == 0;
            boolean ph = targetHi % 2 == 0;
            for (int value : s) {
                int[] ab = lookup[value];
                lo = Math.max(lo + ab[0], targetLo + (pl ? 0 : 1));
                hi = Math.min(hi + ab[1], targetHi - (ph ? 1 : 0));
                if (hi < lo) {
                    return false;
                }
                pl = !pl;
                ph = !ph;
            }
            return true;
        };

        int best = 10^6 * 2;
        int n0 = 0, n1 = 0, n2 = 0;
        for (int value : s) {
            if (value == 0) {
                n0++;
            } else if (value == 1) {
                n1++;
            } else {
                n2++;
            }
        }

        int lo = -n0 - n2;
        int hi = n1 + n2;
        int bestValue;
        while (true) {
            hi = bisect(-1, hi, (x) -> judge.judge(lo, x));
            lo = bisect(1, lo, (x) -> judge.judge(x, hi));
            bestValue = hi - lo;
            if (hi - lo >= best) {
                break;
            } else {
                best = hi - lo;
            }
        }
        hi++;
        lo = bisect(1, lo, (x) -> judge.judge(x, hi));

        return Math.min(bestValue, hi - lo);
    }
}
```

