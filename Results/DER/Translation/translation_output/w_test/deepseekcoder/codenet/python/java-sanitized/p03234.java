import java.util.*;
import java.util.stream.*;

public class p03234 {
    static int MOD = 1000000007;
    static int n, k;
    static List<int[]> abli = new ArrayList<>();
    static int[] unused = new int[200001];
    static int[] unusedAcum = new int[200001];
    static long[][] dp = new long[200001][200001];
    static List<Integer>[] nonSandwichedNums = new ArrayList[200001];

    static int modInverse(int a, int b) {
        int r0 = a, r1 = b, s0 = 1, s1 = 0;
        while (r1 != 0) {
            int q = r0 / r1;
            int tmp = r0 - q * r1;
            r0 = r1;
            r1 = tmp;
            tmp = s0 - q * s1;
            s0 = s1;
            s1 = tmp;
        }
        return s0 % MOD;
    }

    static int doubleFactorial(int x) {
        int res = 1;
        for (int i = x; i > 0; i -= 2) {
            res = (res * i) % MOD;
        }
        return res;
    }

    static boolean isSandwiched(int i, int j) {
        for (int[] ab : abli) {
            if ((ab[0] < i && i <= ab[1] && ab[1] <= j) || (i <= ab[0] && ab[0] <= j && j < ab[1])) {
                return true;
            }
        }
        return false;
    }

    static int numberUnderterminedBetween(int i, int j) {
        return unusedAcum[j] - unusedAcum[i - 1];
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
        int x = numberUnderterminedBetween(i, j);
        return pairCombinations(x);
    }

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
        for (int i = 1; i <= 2 * n; i++) {
            unused[i] = 1;
        }
        for (int[] ab : abli) {
            unused[ab[0]] -= 1;
        }
        for (int i = 1; i <= 2 * n; i++) {
            unusedAcum[i] = unusedAcum[i - 1] + unused[i];
        }
        for (int i = 1; i <= n; i++) {
            nonSandwichedNums[i] = new ArrayList<>();
            for (int j = i + 1; j <= n; j++) {
                if (!isSandwiched(i, j)) {
                    nonSandwichedNums[i].add(j);
                }
            }
        }
        int undetermined = numberUnderterminedBetween(1, 2 * n);
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            for (int j : nonSandwichedNums[i]) {
                int gg = g