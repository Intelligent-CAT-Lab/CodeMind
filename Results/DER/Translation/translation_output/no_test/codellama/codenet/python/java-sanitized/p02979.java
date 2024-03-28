import java.util.Scanner;

public class p02979 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int M = sc.nextInt();

        // limitã®æå¤§å¤ï¼limitãªãï¼
        int L = (N+1)/2+1;

        if (K % 2 == 0) {
            System.out.println(even(N/2, K/2) * even((N+1)/2, K/2) % M);
        } else {
            int[][][] dp0 = new int[L+1][L+1][L+1];
            dp0[0][0][L] = 1;

            for (int i = 0; i < N; i++) {
                int[][][] dp1 = new int[L+1][L+1][L+1];
                for (int x = 0; x < L+1; x++) {
                    for (int y = 0; y < L+1; y++) {
                        if (loop(x, y)) {
                            continue;
                        }
                        for (int z = Math.max(x, y)+1; z < L+1; z++) {
                            if (dp0[x][y][z] == 0) {
                                continue;
                            }
                            dp1[y][x+1][z] += dp0[x][y][z];
                            dp1[y][x+1][z] %= M;
                            // zã®æ´æ°
                            // (1) y > x ã®ã¨ãã¯zãå¼ãç¶ã y <= x ã®ã¨ãã¯Lã«ãªã»ãã
                            // (2) â ã¿ãããªç¢å°ãå¼ããæ ã¤ã¾ã 2*y >= K+3 and x > 0ã®æ 
                            // y - x + K//2 + 1 ã¨ (1)ã¨ã®æå°å¤ã«æ´æ°
                            if (y > x) {
                                zz = z;
                            } else {
                                zz = L;
                            }
                            if (2*y >= K+3 && x > 0) {
                                zz = Math.min(zz, 1+y-x+K/2);
                            }
                            dp1[y][0][zz] += dp0[x][y][z];