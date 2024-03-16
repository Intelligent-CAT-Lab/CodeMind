```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class AGC028D {

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
        
        int cut = 1000000007;

        int[] unused = new int[n+1];
        for (int[] ab : abli) {
            for (int a = ab[0]; a <= ab[1]; a++) {
                unused[a] -= 1;
            }
        }
        int[] unusedacum = new int[n+1];
        unusedacum[0] = 1;
        for (int i = 1; i <= n; i++) {
            unusedacum[i] = unusedacum[i-1] + unused[i];
        }

        long[][] dp = new long[n+1][n+1];
        for (int i = 0; i <= n; i++) {
            for (int j = i+1; j <= n; j++) {
                dp[i][j] = g(i, j, abli, cut, unusedacum, dp);
            }
        }

        long ans = 0;
        int undetermined = unusedacum[n];
        for (int i = 1; i <= n; i++) {
            for (int j : nonSandwichedNums(i, n, abli)) {
                long gg = ggg(i, j, abli, cut, dp);
                if (gg != 0) {
                    dp[i][j] = (gg - sumDP(i, j, nonSandwichedNums(i, n, abli), dp, ggg, cut)) % cut;
                } else {
                    dp[i][j] = 0;
                }
                ans = (ans + dp[i][j] * pairCombinations(undetermined - numUndeterminedBetween(i, j, unusedacum))) % cut;
            }
        }

        System.out.println(ans);
    }

    private static long g(int i, int j, List<int[]> abli, int cut, int[] unusedacum, long[][] dp) {
        int x = numUndeterminedBetween(i, j, unusedacum);
        return pairCombinations(x, cut);
    }

    private static long ggg(int i, int j, List<int[]> abli, int cut, long[][] dp) {
        int x = numUndeterminedBetween(i, j, null);
        return pairCombinations(x - 1, cut);
    }

    private static long sumDP(int i, int j, List<Integer> nonSandwiched, long[][] dp, long[][] ggg, int cut) {
        long sum = 0;
        for (int kk : nonSandwiched) {
            if (kk < j) {
                sum += dp[i][kk] * ggg[kk + 1][j];
            }
        }
        return sum % cut;
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
        for (int[] ab : abli) {
            if ((ab[0] < i && i <= ab[1] && ab[1] <= j) || (i <= ab[0] && ab[0] <= j && j < ab[1])) {
                return true;
            }
        }
        return false;
    }

    private static int numUndeterminedBetween(int i, int j, int[] unusedacum) {
        return unusedacum[j] - unusedacum[i - 1];
    }

    private static long pairCombinations(int x, int cut) {
        if (x == 0) {
            return 1;
        } else if (x % 2 == 0) {
            return doubleFactorial(x - 1, cut);
        } else {
            return 0;
        }
    }

    private static long doubleFactorial(int x, int cut) {
        long result = 1;
        for (int i = x; i > 0; i -= 2) {
            result = (result * i) % cut;
        }
        return result;
    }
}
```

