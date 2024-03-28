import java.util.*;
import java.io.*;

public class p02979 {
    static int N, K, M;
    static int L;
    static int[][][] dp0;
    static int[][][] dp1;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        N = Integer.parseInt(str[0]);
        K = Integer.parseInt(str[1]);
        M = Integer.parseInt(str[2]);
        L = (N + 1) / 2 + 1;
        dp0 = new int[L + 1][L + 1][L + 1];
        dp1 = new int[L + 1][L + 1][L + 1];
        dp0[0][0][L] = 1;
        for (int i = 0; i < N; i++) {
            for (int x = 0; x <= L; x++) {
                for (int y = 0; y <= L; y++) {
                    for (int z = Math.max(x, y) + 1; z <= L; z++) {
                        if (dp0[x][y][z] == 0) continue;
                        dp1[y][x + 1][z] += dp0[x][y][z];
                        dp1[y][x + 1][z] %= M;
                        if (y > x) {
                            zz = z;
                        } else {
                            zz = L;
                        }
                        if (2 * y >= K + 3 && x > 0) {
                            zz = Math.min(zz, 1 + y - x + K / 2);
                        }
                        dp1[y][0][zz] += dp0[x][y][z];
                        dp1[y][0][zz] %= M;
                    }
                }
            }
            dp0 = dp1;
        }
        int ret = 0;
        for (int x = 0; x <= L; x++) {
            for (int y = 0; y <= L; y++) {
                for (int z = Math.max(x, y) + 1; z <= L; z++) {
                    ret += dp0[x][y][z];
                    ret %= M;
                }
            }
        }
        System.out.println(ret);
    }
}