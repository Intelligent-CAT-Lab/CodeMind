import java.util.Scanner;
import java.util.stream.IntStream;

public class p00957 {
    static int l, k;
    static int[] dp;

    static int rec(int i, boolean isBlack) {
        if (i < 0) return 0;
        if (i == 0) return isBlack ? 0 : 1;
        if (isBlack) {
            if (dp[i] != -1) return dp[i];
            return dp[i] = rec(i - 1, false) + rec(i - k, false);
        } else {
            if (dp[i] != -1) return dp[i];
            return dp[i] = rec(i - 1, true);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        l = scanner.nextInt();
        k = scanner.nextInt();
        dp = new int[l + 1];
        for (int i = 0; i <= l; i++) dp[i] = -1;
        int ans = IntStream.range(1, l + 1).map(i -> rec(i, true)).sum();
        System.out.println(ans);
    }
}