import java.util.*;
import java.util.stream.*;

public class p03234 {
    static int MOD = 1_000_000_007;
    static int n, k;
    static List<int[]> abli = new ArrayList<>();
    static int[] unused = new int[200_001];
    static int[] unusedAcum = new int[200_001];
    static long[] dp = new long[200_001];
    static long[] ggg = new long[200_001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
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
        Collections.sort(abli, Comparator.comparingInt(a -> a[0]));
        for (int[] ab : abli) {
            unused[ab[0]]--;
            unused[ab[1] + 1]++;
        }
        for (int i = 1; i <= 2 * n; i++) {
            unusedAcum[i] = unusedAcum[i - 1] + unused[i];
        }
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                ggg[j] = g(i, j);
                if (ggg[j] != 0) {
                    dp[j] = ggg[j] - IntStream.rangeClosed(i, n)
                            .filter(kk -> !isSandwiched(i, j, kk))
                            .mapToLong(kk -> dp[kk] * ggg[j])
                            .sum();
                } else {
                    dp[j] = 0;
                }
                ans = (ans + dp[j] * pairCombinations(uncertaintyBetween(i, j))) % MOD;
            }
        }
        System.out.println(ans);
    }

    static boolean isSandwiched(int i, int j, int kk) {
        return abli.stream().anyMatch(ab -> ab[0] < i && ab[1] > j || i < ab[0] && ab[1] > j);
    }

    static long uncertaintyBetween(int i, int j) {
        return unusedAcum[j] - unusedAcum[i - 1];
    }

    static long pairCombinations(long x) {
        if (x == 0) {
            return 1;
        } else if (x % 2 == 0) {
            return doubleFactorial((int) x - 1);
        } else {
            return 0;
        }
    }

    static long doubleFactorial(int x) {
        long res = 1;
        for (int i = x; i > 0; i -= 2) {
            res = res * i % MOD;
        }
        return res;
    }

    static long g(int i, int j) {
        long x = uncertaintyBetween(i, j);
        return pairCombinations(x);
    }
}