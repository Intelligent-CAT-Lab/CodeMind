import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class p03234 {
    private static final int CUT = 1000000007;
    private static int[] unusedAcum;
    private static List<Integer>[] nonSandwichedNums;
    private static int[][] ggg;
    private static long[][] dp;
    private static Map<Long, Long> doubleFactorialCache = new HashMap<>();
    private static List<Pair> abli;
    private static int n, k;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nn = input.nextInt();
        k = input.nextInt();
        n = 2 * nn;
        abli = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            if (a < b) {
                abli.add(new Pair(a, b));
            } else {
                abli.add(new Pair(b, a));
            }
        }

        unusedAcum = new int[n + 1];
        Arrays.fill(unusedAcum, 1);
        for (Pair p : abli) {
            unusedAcum[p.first]--;
            unusedAcum[p.second]--;
        }

        for (int i = 1; i <= n; i++) {
            unusedAcum[i] += unusedAcum[i - 1];
        }

        nonSandwichedNums = new List[n + 1];
        for (int i = 0; i <= n; i++) {
            nonSandwichedNums[i] = new ArrayList<>();
        }

        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (!isSandwiched(i, j)) {
                    nonSandwichedNums[i].add(j);
                }
            }
        }

        int undetermined = numberUndeterminedBetween(1, n);

        ggg = new int[n + 1][];
        for (int i = 1; i <= n; i++) {
            ggg[i] = new int[n + 2];
            for (int j = i + 1; j <= n; j++) {
                ggg[i][j] = g(i, j);
            }
        }

        dp = new long[n + 1][n + 1];
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            for (int j : nonSandwichedNums[i]) {
                int gg = ggg[i][j];
                if (gg != 0) {
                    long sum = 0;
                    for (int kk : nonSandwichedNums[i]) {
                        if (kk < j) {
                            sum = (sum + dp[i][kk] * ggg[kk + 1][j]) % CUT;
                        }
                    }
                    dp[i][j] = (ggg[i][j] - sum + CUT) % CUT;
                } else {
                    dp[i][j] = 0;
                }
                ans = (ans + dp[i][j] * pairCombinations(undetermined - numberUndeterminedBetween(i, j))) % CUT;
            }
        }

        System.out.println(ans);

        input.close();
    }

    private static long modInverse(long a) {
        long m0 = CUT;
        long y = 0, x = 1;
        if (CUT == 1) {
            return 0;
        }
        while (a > 1) {
            long q = a / CUT;
            long t = CUT;
            CUT = (int) (a % CUT);
            a = t;
            t = y;
            y = x - q * y;
            x = t;
        }
        return (x + m0) % m0;
    }

    private static long doubleFactorial(long x) {
        if (x < 2) {
            return 1;
        }
        long cached = doubleFactorialCache.getOrDefault(x, 0L);
        if (cached != 0) {
            return cached;
        }
        long result = x * doubleFactorial(x - 2) % CUT;
        doubleFactorialCache.put(x, result);
        return result;
    }

    private static boolean isSandwiched(int i, int j) {
        for (Pair p : abli) {
            if ((p.first < i && i <= p.second && p.second <= j) || (i <= p.first && p.first <= j && j < p.second)) {
                return true;
            }
        }
        return false;
    }

    private static int numberUndeterminedBetween(int i, int j) {
        return unusedAcum[j] - unusedAcum[i - 1];
    }

    private static int pairCombinations(int x) {
        if (x == 0) {
            return 1;
        } else if (x % 2 == 0) {
            return (int) doubleFactorial(x - 1);
        } else {
            return 0;
        }
    }

    private static int g(int i, int j) {
        return pairCombinations(numberUndeterminedBetween(i, j));
    }

    private static class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}