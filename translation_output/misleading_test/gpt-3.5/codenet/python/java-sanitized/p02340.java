import java.util.Scanner;

public class p02340 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        final int MOD = 1000000007;

        int[][] D = new int[N+1][K+1];
        for (int n = 0; n <= N; n++) {
            D[n][1] = 1;
        }
        for (int k = 1; k <= K; k++) {
            D[0][k] = 1;
        }
        for (int n = 1; n <= N; n++) {
            for (int k = 1; k <= K; k++) {
                if (n >= k) {
                    D[n][k] = (D[n-k][k] + D[n][k-1]) % MOD;
                } else {
                    D[n][k] = D[n][n];
                }
            }
        }
        System.out.println(D[N][K]);
    }
}