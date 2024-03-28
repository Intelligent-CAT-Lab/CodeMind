import java.util.*;

public class p03234 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] unused = new int[n+1];
        for (int i = 0; i < k; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a < b) {
                unused[a]++;
                unused[b]--;
            } else {
                unused[b]++;
                unused[a]--;
            }
        }
        int cut = 1000000007;
        int[] unusedacum = new int[n+1];
        for (int i = 1; i <= n; i++) {
            unusedacum[i] = (unusedacum[i-1] + unused[i]) % cut;
        }
        int[] nonSandwichedNums = new int[n+1][];
        for (int i = 1; i <= n; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = i+1; j <= n; j++) {
                boolean flag = true;
                for (int[] ab : abli) {
                    if (ab[0] < i && ab[1] > j) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    list.add(j);
                }
            }
            nonSandwichedNums[i] = list.stream().mapToInt(Integer::intValue).toArray();
        }
        int undetermined = unusedacum[n];
        int[][] ggg = new int[n+1][n+1];
        for (int i = 1; i <= n; i++) {
            for (int j = i+1; j <= n; j++) {
                int x = unusedacum[j] - unusedacum[i-1];
                ggg[i][j] = pairCombinations(x);
            }
        }
        int ans = 0;
        int[][] dp = new int[n+1][n+1];
        for (int i = 1; i <= n; i++) {
            for (int j : nonSandwichedNums[i]) {
                int gg = ggg[i][j];
                if (gg!= 0) {
                    dp[i][j] = (ggg[i][j] - sum(dp[i][kk] * ggg[kk+1][j] for (int kk : nonSandwichedNums[i]) if (kk < j))) % cut;
                } else {
                    dp[i][j] = 0;
                }
                ans = (ans + dp[i][j] * pairCombinations(undetermined - unusedacum[j] + unusedacum[i-1])) % cut;
            }
        }
        System.out.println(ans);
    }

    public static int sum(int... nums) {
        int res = 0;
        for (int num : nums) {
            res = (res + num) % 1000000007;
        }
        return res;
    }

    public static int pairCombinations(int x) {
        if (x == 0) {
            return 1;
        } else if (x % 2 == 0) {
            return doubleFactorial(x-1);
        } else {
            return 0;
        }
    }

    public static int doubleFactorial(int x) {
        int res = 1;
        for (int i = x; i >= 2; i -= 2) {
            res = (res * i) % 1000000007;
        }
        return res;
    }

    public static int modInverse(int a, int b) {
        int r0 = a, r1 = b, s0 = 1, s1 = 0;
        while (r1!= 0) {
            int q = r0 / r1;
            int stmp = s0 - q * s1;
            r0 = r1;
            s0 = s1;
            r1 = r0 % r1;
            s1 = stmp;
        }
        return s0 % 1000000007;
    }
}