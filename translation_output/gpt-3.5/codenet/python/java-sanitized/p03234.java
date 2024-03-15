import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

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
            int[] pair;
            if (a < b) {
                pair = new int[] { a, b };
            } else {
                pair = new int[] { b, a };
            }
            abli.add(pair);
        }

        List<Integer> flattenabli = new ArrayList<>();
        for (int[] pair : abli) {
            for (int num : pair) {
                flattenabli.add(num);
            }
        }

        int cut = (int) (1e9 + 7);

        int[] unused = new int[n + 1];
        Arrays.fill(unused, 1);
        for (int a : flattenabli) {
            unused[a]--;
        }
        int[] unusedacum = new int[n + 1];
        unusedacum[0] = unused[0];
        for (int i = 1; i <= n; i++) {
            unusedacum[i] = unusedacum[i - 1] + unused[i];
        }

        int[][] dp = new int[n + 1][n + 1];
        for (int[] row : dp) {
            Arrays.fill(row, 0);
        }

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            for (int j : getNonSandwichedNums(i, n, abli, k)) {
                int gg = g(i, j, unusedacum, cut);
                if (gg != 0) {
                    dp[i][j] = (gg - sumDP(dp, i, j, nonSandwichedNums(i, n, abli, k), ggg, unusedacum, cut)) % cut;
                } else {
                    dp[i][j] = 0;
                }
                ans = (ans + dp[i][j] * pairCombinations(undetermined(i, j, unusedacum), cut)) % cut;
            }
        }

        System.out.println(ans);
    }

    public static ArrayList<Integer> getNonSandwichedNums(int i, int n, List<int[]> abli, int k) {
        ArrayList<Integer> nonSandwichedNums = new ArrayList<>();
        for (int j = i + 1; j <= n; j++) {
            if (!isSandwiched(i, j, abli, k)) {
                nonSandwichedNums.add(j);
            }
        }
        return nonSandwichedNums;
    }

    public static boolean isSandwiched(int i, int j, List<int[]> abli, int k) {
        for (int l = 0; l < k; l++) {
            int[] pair = abli.get(l);
            if ((pair[0] < i && i <= pair[1] && pair[1] <= j) || (i <= pair[0] && pair[0] <= j && j < pair[1])) {
                return true;
            }
        }
        return false;
    }

    public static int g(int i, int j, int[] unusedacum, int cut) {
        return pairCombinations(numberUnderterminedBetween(i, j, unusedacum), cut);
    }

    public static int sumDP(int[][] dp, int i, int j, ArrayList<Integer> nonSandwichedNums, int[][] ggg, int[] unusedacum, int cut) {
        int sum = 0;
        for (int kk : nonSandwichedNums) {
            if (kk < j) {
                sum += dp[i][kk] * ggg[kk + 1][j];
            }
        }
        return sum % cut;
    }

    public static int numberUnderterminedBetween(int i, int j, int[] unusedacum) {
        return unusedacum[j] - unusedacum[i - 1];
    }

    public static int pairCombinations(int x, int cut) {
        if (x == 0) {
            return 1;
        } else if (x % 2 == 0) {
            return doubleFactorial(x - 1, cut);
        } else {
            return 0;
        }
    }

    public static int doubleFactorial(int x, int cut) {
        int result = 1;
        for (int i = x; i > 0; i -= 2) {
            result = (result * i) % cut;
        }
        return result;
    }

    public static int undetermined(int i, int j, int[] unusedacum) {
        return numberUnderterminedBetween(1, j, unusedacum) - numberUnderterminedBetween(1, i - 1, unusedacum);
    }

}