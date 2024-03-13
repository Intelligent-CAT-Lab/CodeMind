import java.util.*;
import java.util.stream.*;

public class p03234 {
    static int n, k;
    static List<int[]> abli = new ArrayList<>();
    static int cut = 1000000007;
    static int[] unused = new int[200001];
    static int[] unusedacum = new int[200001];
    static int[][] ggg = new int[200001][];
    static long[][] dp = new long[200001][];
    static long ans = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt() * 2;
        k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a < b) {
                abli.add(new int[]{a, b});
            } else {
                abli.add(new int[]{b, a});
            }
        }
        for (int i = 1; i <= n; i++) {
            unused[i] = 1;
        }
        for (int[] ab : abli) {
            unused[ab[0]] -= 1;
        }
        for (int i = 1; i <= n; i++) {
            unusedacum[i] = unusedacum[i - 1] + unused[i];
        }
        for (int i = 1; i <= n; i++) {
            ggg[i] = new int[i + 1];
            dp[i] = new long[i + 1];
            for (int j = i + 1; j <= n; j++) {
                if (!isSandwiched(i, j)) {
                    ggg[i][j] = g(i, j);
                    if (ggg[i][j] != 0) {
                        dp[i][j] = (ggg[i][j] - IntStream.range(i, j).filter(kk -> kk < j).mapToLong(kk -> dp[i][kk] * ggg[kk + 1][j]).sum()) % cut;
                    } else {
                        dp[i][j] = 0;
                    }
                    ans = (ans + dp[i][j] * pairCombinations(uncertaintyBetween(i, j))) % cut;
                }
            }
        }
        System.out.println(ans);
    }

    static boolean isSandwiched(int i, int j) {
        return abli.stream().anyMatch(ab -> ab[0] < i && ab[1] > j || ab[0] < i && ab[1] < j || ab[0] > i && ab[1] < j);
    }

    static int uncertaintyBetween(int i, int j) {
        return unusedacum[j] - unusedacum[i - 1];
    }

    static int pairCombinations(int x) {
        if (x == 0) {
            return 1;
        } else if (x % 2 == 0) {
            return doubleFactorial(x - 1);
        } else {
            return 0;
        }
    }

    static int g(int i, int j) {
        return pairCombinations(uncertaintyBetween(i, j));
    }

    static int doubleFactorial(int x) {
        int result = 1;
        for (int i = x; i > 0; i -= 2) {
            result = (result * i) % cut;
        }
        return result;
    }
}