import java.util.Scanner;

public class p02652 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        System.out.println(solve(S));
        scanner.close();
    }

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

    public static int solve(String s) {
        int[] S = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            S[i] = s.charAt(i) == '0' ? 0 : s.charAt(i) == '1' ? 1 : 2;
        }
        int[][] lookup = {{-1, -1}, {1, 1}, {-1, 1}};

        Judge judge = new Judge() {
            public boolean check(int target) {
                int lo = target / 2;
                int hi = target - lo;
                boolean pl = lo % 2 == 0;
                boolean ph = hi % 2 == 0;
                for (int s : S) {
                    int a = lookup[s][0];
                    int b = lookup[s][1];
                    lo = Math.max(lo + a, pl ? 1 : 0);
                    hi = Math.min(hi + b, ph ? 0 : 1);
                    if (hi < lo)
                        return false;
                    pl = !pl;
                    ph = !ph;
                }
                return true;
            }
        };

        int best = 2000000;
        int lo = -countOccurrences(S, 0) - countOccurrences(S, 2);
        int hi = countOccurrences(S, 1) + countOccurrences(S, 2);
        while (true) {
            hi = bisect(-1, hi, x -> judge.check(lo * 2 + x));
            lo = bisect(1, lo, x -> judge.check(x * 2 + hi));
            if (hi - lo >= best) {
                break;
            } else {
                best = hi - lo;
            }
        }
        hi += 1;
        lo = bisect(1, lo, x -> judge.check(x * 2 + hi));
        return Math.min(best, hi - lo);
    }

    public static int countOccurrences(int[] array, int value) {
        int count = 0;
        for (int i : array) {
            if (i == value) {
                count++;
            }
        }
        return count;
    }

    interface Judge {
        boolean check(int x);
    }
}