import java.util.Scanner;

public class p02342 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int MOD = 1000000007;

        int[][] D = new int[N+1][K+1];
        for (int i = 1; i <= N; i++) {
            D[i][1] = 1;
        }
        for (int i = 1; i <= Math.min(N, K); i++) {
            D[i][i] = 1;
        }
        for (int n = 1; n <= N; n++) {
            for (int k = 2; k <= Math.min(n-1, K); k++) {
                D[n][k] = (D[n-k][k] + D[n-1][k-1]) % MOD;
            }
        }
        System.out.println(D[N][K] % MOD);
    }
}