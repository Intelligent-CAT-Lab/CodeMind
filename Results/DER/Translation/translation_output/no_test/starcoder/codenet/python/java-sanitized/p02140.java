import java.util.*;
import java.io.*;

public class p02140 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int R = Integer.parseInt(input[0]);
        int C = Integer.parseInt(input[1]);
        int ay = Integer.parseInt(input[2]);
        int ax = Integer.parseInt(input[3]);
        int by = Integer.parseInt(input[4]);
        int bx = Integer.parseInt(input[5]);

        int MOD = 1000000007;
        int INF = 1000000000;
        int[][] dists = new int[R][C];
        int[][] ptns = new int[R][C];
        dists[ay][ax] = 0;
        ptns[ay][ax] = 1;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, ax, ay});
        int[] dxs = new int[]{1, 0, -1, 0};
        int[] dys = new int[]{0, 1, 0, -1};
        int ans_d = -1;
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int d = cur[0];
            int x = cur[1];
            int y = cur[2];
            if (ans_d!= -1 && d > ans_d) {
                break;
            }
            if (x == bx && y == by) {
                ans_d = d;
            }
            if (d > dists[y][x]) {
                continue;
            }
            dists[y][x] = d;
            for (int i = 0; i < 4; i++) {
                int nx = x + dxs[i];
                int ny = y + dys[i];
                if (nx < 0 || nx >= C || ny < 0 || ny >= R) {
                    continue;
                }
                if (d + 1 > dists[ny][nx]) {
                    continue;
                }
                if (dists[ny][nx] == INF) {
                    q.add(new int[]{d + 1, nx, ny});
                    dists[ny][nx] = d + 1;
                }
                ptns[ny][nx] += ptns[y][x];
                ptns[ny][nx] %= MOD;
            }
            for (int i = 0; i < 2; i++) {
                int nx = x;
                int ny = y;
                if (i == 0) {
                    ny = 0;
                } else {
                    ny = R - 1;
                }
                if (d + 1 > dists[ny][nx]) {
                    continue;
                }
                if (dists[ny][nx] == INF) {
                    q.add(new int[]{d + 1, nx, ny});
                    dists[ny][nx] = d + 1;
                }
                ptns[ny][nx] += ptns[y][x];
                ptns[ny][nx] %= MOD;
            }
        }
        System.out.println(ans_d + " " + ptns[by][bx] % MOD);
    }
}