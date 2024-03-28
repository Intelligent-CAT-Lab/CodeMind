```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        System.out.println(solve(S));
        scanner.close();
    }

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
        int[] d = {0, 1, 2};
        int[] symbols = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
            symbols[i] = d[S.charAt(i) - '0'];
        }
        int[][] lookup = {{-1, -1}, {1, 1}, {-1, 1}};

        Judge judge = new Judge(symbols, lookup);
        int best = 1000000 * 2;
        int n0 = 0, n1 = 0, n2 = 0;
        for (int symbol : symbols) {
            if (symbol == 0) {
                n0++;
            } else if (symbol == 1) {
                n1++;
            } else {
                n2++;
            }
        }
        int lo = -n0 - n2;
        int hi = n1 + n2;
        while (true) {
            hi = bisect(-1, hi, x -> judge.judge(lo, x));
            lo = bisect(1, lo, x -> judge.judge(x, hi));
            if (hi - lo >= best) {
                break;
            } else {
                best = hi - lo;
            }
        }
        hi++;
        lo = bisect(1, lo, x -> judge.judge(x, hi));
        return Math.min(best, hi - lo);
    }

    static class Judge {
        int[] symbols;
        int[][] lookup;

        Judge(int[] symbols, int[][] lookup) {
            this.symbols = symbols;
            this.lookup = lookup;
        }

        boolean judge(int targetLo, int targetHi) {
            int lo = 0;
            int hi = 0;
            boolean pl = targetLo % 2 == 0;
            boolean ph = targetHi % 2 == 0;
            for (int symbol : symbols) {
                int a = lookup[symbol][0];
                int b = lookup[symbol][1];
                lo = Math.max(lo + a, targetLo + (pl ? 0 : 1));
                hi = Math.min(hi + b, targetHi - (ph ? 0 : 1));
                if (hi < lo) {
                    return false;
                }
                pl = !pl;
                ph = !ph;
            }
            return true;
        }
    }
}
```
