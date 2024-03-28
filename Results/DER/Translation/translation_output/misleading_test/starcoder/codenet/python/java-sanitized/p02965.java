import java.util.Scanner;

public class p02965 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int MOD = 998244353;
        int[] factorials = new int[m * 3 / 2 + n + 1];
        int[] finvs = new int[m * 3 / 2 + n + 1];
        factorials[0] = 1;
        finvs[0] = 1;
        for (int i = 1; i < factorials.length; i++) {
            factorials[i] = factorials[i - 1] * i % MOD;
        }
        finvs[1] = 1;
        for (int i = 2; i < finvs.length; i++) {
            finvs[i] = finvs[i - 1] * i % MOD;
        }
        int p = 1;
        for (int i = 0; i < finvs.length; i++) {
            p = p * finvs[i] % MOD;
            finvs[i] = p;
        }

        int[][] c = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            c[i][0] = 1;
        }
        for (int i = 1; i <= m; i++) {
            c[0][i] = 0;
        }
        for (int i = 1; i <= n; i++) {
            c[i][i] = 1;
        }
        for (int i = 2; i <= m; i += 2) {
            c[0][i] = 1;
        }
        for (int i = 3; i <= m; i += 2) {
            c[0][i] = 0;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1