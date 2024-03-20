import java.util.Scanner;

public class p00957 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        int[][] memo = new int[l+1][2];
        for (int i = 0; i <= l; i++) {
            for (int j = 0; j < 2; j++) {
                memo[i][j] = -1;
            }
        }

        int ans = 0;
        for (int i = 1; i <= l; i++) {
            ans += rec(i, k, memo);
        }

        System.out.println(ans);
    }

    public static int rec(int i, int k, int[][] memo) {
        if (i < 0) return 0;
        if (i == 0) return 1;
        if (memo[i][0]!= -1) return memo[i][0];
        if (i == k) return 1;
        if (i < k) {
            memo[i][0] = rec(i-1, k, memo);
            return memo[i][0];
        }
        memo[i][0] = rec(i-1, k, memo) + rec(i-k, k, memo);
        return memo[i][0];
    }
}