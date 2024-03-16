import java.util.Scanner;

public class p00957 {
    static int l, k;
    static long[][] memo;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        l = scanner.nextInt();
        k = scanner.nextInt();
        memo = new long[l+1][2];
        for (int i = 0; i <= l; i++) {
            for (int j = 0; j < 2; j++) {
                memo[i][j] = -1;
            }
        }
        long ans = 0;
        for (int i = 1; i <= l; i++) {
            ans += rec(i, 1);
        }
        System.out.println(ans);
    }

    static long rec(int i, int isBlack) {
        if (i < 1) {
            return 0;
        }
        if (memo[i][isBlack] != -1) {
            return memo[i][isBlack];
        }
        if (isBlack == 1) { // top is black
            memo[i][isBlack] = rec(i-1, 0) + rec(i-k, 0);
        } else {  // top is white
            memo[i][isBlack] = rec(i-1, 1) + rec(i-k, 1);
        }
        return memo[i][isBlack];
    }
}