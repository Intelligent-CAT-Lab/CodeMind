import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.HashMap;
import java.util.Map;

public class p03234 {
    private static final int CUT = 1000000007;
    private static int[] unused;
    private static int[] unusedacum;
    private static List<List<Integer>> nonSandwichedNums;
    private static Pair[][] ggg;
    private static long[][] dp;
    private static Pair[] abli;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nn = sc.nextInt();
        int k = sc.nextInt();
        int n = 2 * nn;

        abli = new Pair[k];
        for (int i = 0; i < k; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            abli[i] = (a < b) ? new Pair(a, b) : new Pair(b, a);
        }

        unused = new int[n + 1];
        Arrays.fill(unused, 1);
        for (Pair pair : abli) {
            unused[pair.first] -= 1;
            unused[pair.second] -= 1;
        }

        unusedacum = new int[n + 1];
        int acumSum = 0;
        for (int i = 0; i <= n; i++) {
            acumSum += unused[i];
            unusedacum[i] = acumSum;
        }

        nonSandwichedNums = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            nonSandwichedNums.add(new ArrayList<>());
        }
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (!isSandwiched(i, j)) {
                    nonSandwichedNums.get(i).add(j);
                }
            }
        }

        ggg = new Pair[n + 1][];
        for (int i = 0; i <= n; i++) {
            ggg[i] = new Pair[n + 1];
        }
        dp = new long[n + 1][n + 1];
        
        long ans = 0;
        int undetermined = numberUndeterminedBetween(1, n);
        for (int i = 1; i <= n; i++) {
            for (Integer j : nonSandwichedNums.get(i)) {
                long gg = pairCombinations(numberUndeterminedBetween(i, j));
                if (gg != 0) {
                    long sum = 0;
                    for (Integer kk : nonSandwichedNums.get(i)) {
                        if (kk < j) {
                            sum += dp[i][kk] * pairCombinations(numberUndeterminedBetween(kk + 1, j));
                            sum %= CUT;
                        }
                    }
                    dp[i][j] = (gg - sum + CUT) % CUT;
                } else {
                    dp[i][j] = 0;
                }
                ans = (ans + dp[i][j] * pairCombinations(undetermined - numberUndeterminedBetween(i, j))) % CUT;
            }
        }

        System.out.println(ans);
        sc.close();
    }

    private static long modInverse(long a, long b) {
        long r0 = a;
        long r1 = b;
        long s0 = 1;
        long s1 = 0;
        while (r1 != 0) {
            long q = r0 / r1;
            long rtmp = r0 - q * r1;
            long stmp = s0 - q * s1;
            r0 = r1;
            s0 = s1;
            r1 = rtmp;
            s1 = stmp;
        }
        return (s0 % CUT + CUT) % CUT;
    }

    private static long doubleFactorial(int x) {
        return LongStream.iterate(x, i -> i - 2)
                .limit((x + 1) / 2)
                .reduce(1, (y, z) -> y * z % CUT);
    }

    private static boolean isSandwiched(int i, int j) {
        for (Pair pair : abli) {
            if ((pair.first < i && i <= pair.second && pair.second <= j) || (i <= pair.first && pair.first <= j && j < pair.second)) {
                return true;
            }
        }
        return false;
    }

    private static int numberUndeterminedBetween(int i, int j) {
        return unusedacum[j] - unusedacum[i - 1];
    }

    private static long pairCombinations(int x) {
        if (x == 0) {
            return 1;
        } else if (x % 2 == 0) {
            return doubleFactorial(x - 1);
        } else {
            return 0;
        }
    }

    private static class Pair {
        int first, second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}