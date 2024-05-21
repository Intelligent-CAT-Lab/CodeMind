import java.util.Scanner;

public class p02979 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int M = scanner.nextInt();
        // limitã®æå¤§å¤ï¼limitãªãï¼
        int L = (N+1) / 2 + 1;

        if (K % 2 == 0) {
            System.out.println((even(N/2, K/2, M) * even((N+1)/2, K/2, M)) % M);
        } else {
            // dp[x][y][z]
            // iã¨ããªãã£ãç°ãªãåãxåé£ç¶ãiã¨ããªãã£ãåãåãyåé£ç¶ã§ãã¤xã¨yã®ã©ã¡ãããzã¾ã§ä¼¸ã°ããçµã¿åãã
            int[][][] dp0 = new int[L+1][L+1][L+1];
            dp0[0][0][L] = 1;

            for (int i = 0; i < N; i++) {
                int[][][] dp1 = new int[L+1][L+1][L+1];
                for (int x = 0; x <= L; x++) {
                    for (int y = 0; y <= L; y++) {
                        if (loop(x, y)) continue;
                        for (int z = Math.max(x, y) +