import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class p03234 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nn = scanner.nextInt();
        int k = scanner.nextInt();
        int n = 2 * nn;
        List<List<Integer>> abli = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a < b) {
                abli.add(List.of(a, b));
            } else {
                abli.add(List.of(b, a));
            }
        }
        int cut = 1000000007;

        int[] unused = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            unused[i] = 1;
        }
        for (List<Integer> ab : abli) {
            unused[ab.get(0)] -= 1;
            unused[ab.get(1)] -= 1;
        }
        int[] unusedAcum = new int[n + 1];
        unusedAcum[0] = unused[0];
        for (int i = 1; i < n + 1; i++) {
            unusedAcum[i] = unusedAcum[i - 1] + unused[i];
        }

        int[][] ggg = new int[n + 1][n + 1];
        for (int i = 1; i < n + 1; i++) {
            for (int j = i + 1; j < n + 1; j++) {
                ggg[i][j] = g(i, j);
            }
        }

        int undetermined = unusedAcum[n] - unusedAcum[0];

        int[][] dp = new int[n + 1][n + 1];
        for (int i = 1; i < n + 1; i++) {
            for (int j = i + 1; j < n + 1; j++) {
                int gg = ggg[i][j];
                if (gg != 0) {
                    dp[i][j] = (ggg[i][j] - IntStream.range(0, n + 1)
                            .filter(k -> k < j)
                            .map(k -> dp[i][k] * ggg[k + 1][j])
                            .sum()) % cut;
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        int ans = 0;
        for (int i = 1; i < n + 1; i++) {
            for (int j = i + 1; j < n + 1; j++) {
                ans = (ans + dp[i][j] * pairCombinations(undetermined - numberUnderterminedBetween(i, j))) % cut;
            }
        }

        System.out.println(ans);
    }

    private static int g(int i, int j) {
        int x = numberUnderterminedBetween(i, j);
        return pairCombinations(x);
    }

    private static int numberUnderterminedBetween(int i, int j) {
        return unusedAcum[j] - unusedAcum[i - 1];
    }

    private static int pairCombinations(int x) {
        if (x == 0) {
            return 1;
        } else if (x % 2 == 0) {
            return doubleFactorial(x - 1);
        } else {
            return 0;
        }
    }

    private static int doubleFactorial(int x) {
        return IntStream.range(x, 0, -2)
                .map(i -> i * (