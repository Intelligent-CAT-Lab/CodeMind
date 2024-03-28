import java.util.*;
import java.io.*;

public class p03234 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[k];
        int[] b = new int[k];
        for (int i = 0; i < k; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        int[] unused = new int[n + 1];
        for (int i = 0; i < k; i++) {
            unused[a[i]]++;
            unused[b[i]]++;
        }
        for (int i = 1; i <= n; i++) {
            unused[i] = unused[i] / 2;
        }
        int[] unusedacum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            unusedacum[i] = unusedacum[i - 1] + unused[i];
        }
        int cut = 1000000007;
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                int x = unusedacum[j] - unusedacum[i - 1];
                int[] nonSandwichedNums = new int[j - i + 1];
                int k = 0;
                for (int l = i; l <= j; l++) {
                    if (unused[l] == 0) {
                        nonSandwichedNums[k++] = l;
                    }
                }
                int[] dp = new int[j - i + 1];
                for (int l = 0; l < nonSandwichedNums.length; l++) {
                    int gg = g(i, nonSandwichedNums[l]);
                    if (gg!= 0) {
                        dp[l] = (gg - sum(ggg[i][k] * ggg[k + 1][nonSandwichedNums[l]] for k in nonSandwichedNums if k < nonSandwichedNums[l])) % cut;
                    } else {
                        dp[l] = 0;
                    }
                    ans = (ans + dp[l] * pairCombinations(x - numberUnderterminedBetween(i, nonSandwichedNums[l]))) % cut;
                }
            }
        }
        System.out.println(ans);
    }

    public static int pairCombinations(int x) {
        if (x == 0) {
            return 1;
        } else if (x % 2 == 0) {
            return doubleFactorial(x - 1);
        } else {
            return 0;
        }
    }

    public static int doubleFactorial(int x) {
        int ans = 1;
        for (int i = x; i > 0; i -= 2) {
            ans = ans * i;
        }
        return ans;
    }

    public static int sum(int... x) {
        int ans = 0;
        for (int i = 0; i < x.length; i++) {
            ans = ans + x[i];
        }
        return ans;
    }

    public static int numberUnderterminedBetween(int i, int j) {
        return unusedacum[j] - unusedacum[i - 1];
    }

    public static int g(int i, int j) {
        int x = numberUnderterminedBetween(i, j);
        return pairCombinations(x);
    }
}