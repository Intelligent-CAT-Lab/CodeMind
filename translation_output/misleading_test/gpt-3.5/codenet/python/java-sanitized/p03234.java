import java.util.*;
import java.util.stream.IntStream;

public class p03234 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nn = scanner.nextInt();
        int k = scanner.nextInt();
        int n = 2 * nn;

        List<int[]> abli = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a < b) {
                abli.add(new int[]{a, b});
            } else {
                abli.add(new int[]{b, a});
            }
        }

        int cut = (int) (1e9 + 7);

        int[] unused = new int[n + 1];
        Arrays.fill(unused, 1);
        for (int[] pair : abli) {
            for (int a : pair) {
                unused[a] -= 1;
            }
        }

        int[] unusedAccum = new int[n + 1];
        unusedAccum[0] = unused[0];
        for (int i = 1; i <= n; i++) {
            unusedAccum[i] = unusedAccum[i - 1] + unused[i];
        }

        long[][] dp = new long[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                dp[i][j] = g(i, j, n, abli, unusedAccum, dp, cut);
            }
        }

        long ans = 0;
        for (int i = 1; i <= n; i++) {
            for (int j : nonSandwichedNums(i, n, abli)) {
                ans = (ans + dp[i][j] * pairCombinations(n - unusedAccum[j] - unusedAccum[i - 1], cut)) % cut;
            }
        }

        System.out.println(ans);
    }

    private static long g(int i, int j, int n, List<int[]> abli, int[] unusedAccum, long[][] dp, int cut) {
        long x = numberUndeterminedBetween(i, j, unusedAccum);
        return pairCombinations(x, cut);
    }

    private static long numberUndeterminedBetween(int i, int j, int[] unusedAccum) {
        return unusedAccum[j] - unusedAccum[i - 1];
    }

    private static List<Integer> nonSandwichedNums(int i, int n, List<int[]> abli) {
        List<Integer> nonSandwiched = new ArrayList<>();
        for (int j = i + 1; j <= n; j++) {
            if (!isSandwiched(i, j, abli)) {
                nonSandwiched.add(j);
            }
        }
        return nonSandwiched;
    }

    private static boolean isSandwiched(int i, int j, List<int[]> abli) {
        for (int[] pair : abli) {
            if ((pair[0] < i && i <= pair[1] && pair[1] <= j) ||
                    (i <= pair[0] && pair[0] <= j && j < pair[1])) {
                return true;
            }
        }
        return false;
    }

    private static long pairCombinations(long x, int cut) {
        if (x == 0) {
            return 1;
        } else if (x % 2 == 0) {
            return doubleFactorial(x - 1, cut);
        } else {
            return 0;
        }
    }

    private static long doubleFactorial(long x, int cut) {
        return IntStream.iterate((int) x, n -> n > 0, n -> n - 2)
                .mapToLong(n -> (long) n)
                .reduce((a, b) -> (a * b) % cut)
                .orElse(1);
    }

}