import java.util.*;

public class p02979 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int M = sc.nextInt();
        int L = (N+1)/2 + 1;

        int[][][] dp0 = new int[L+1][L+1][L+1];
        dp0[0][0][L] = 1;

        for (int i = 0; i < N; i++) {
            int[][][] dp1 = new int[L+1][L+1][L+1];
            for (int x = 0; x <= L; x++) {
                for (int y = 0; y <= L; y++) {
                    if (loop(x, y)) continue;
                    for (int z = Math.max(x, y)+1; z <= L; z++) {
                        if (dp0[x][y][z] == 0) continue;
                        dp1[y][x+1][z] += dp0[x][y][z];
                        dp1[y][x+1][z] %= M;
                        if (2*y >= K+3 && x > 0) {
                            int zz = Math.min(z, 1+y-x+K/2);
                            dp1[y][0][zz] += dp0[x][y][z];
                            dp1[y][0][zz] %= M;
                        }
                    }
                }
            }
            dp0 = dp1;
        }

        int ret = 0;
        for (int x = 0; x <= L; x++) {
            for (int y = 0; y <= L; y++) {
                if (loop(x, y)) continue;
                for (int z = Math.max(x, y)+1; z <= L; z++) {
                    ret += dp0[x][y][z];
                    ret %= M;
                }
            }
        }

        if (K % 2 == 0) {
            int evenN = N/2;
            int evenK = K/2;
            int evenM = M;
            int[][] evenDp = new int[evenN+1][evenK+1];
            evenDp[0][0] = 1;
            for (int i = 0; i < evenN; i++) {
                for (int j = 0; j <= evenK; j++) {
                    evenDp[i+1][0] += evenDp[i][j];
                    evenDp[i+1][0] %= evenM;
                    if (j!= evenK) {
                        evenDp[i+1][j+1] += evenDp[i][j];
                        evenDp[i+1][j+1] %= evenM;
                    }
                }
            }
            ret = (int)((long)ret * evenDp[evenN][evenK] % evenM);
        }

        System.out.println(ret);
    }

    public static boolean loop(int x, int y) {
        return 2*x >= K+1 && 2*y >= K+3;
    }
}