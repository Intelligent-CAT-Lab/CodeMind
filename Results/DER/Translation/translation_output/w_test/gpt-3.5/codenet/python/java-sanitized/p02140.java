import java.util.ArrayDeque;
import java.util.Deque;

public class p02140 {
    public static void main(String[] args) {
        int R, C, ay, ax, by, bx;
        R = C = ay = ax = by = bx = 0;

        String[] input = new java.util.Scanner(System.in).nextLine().split(" ");
        R = Integer.parseInt(input[0]);
        C = Integer.parseInt(input[1]);
        ay = Integer.parseInt(input[2]);
        ax = Integer.parseInt(input[3]);
        by = Integer.parseInt(input[4]);
        bx = Integer.parseInt(input[5]);

        int MOD = Integer.MAX_VALUE;
        int INF = 1000000007;
        int[][] dists = new int[R][C];
        int[][] ptns = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                dists[i][j] = INF;
                ptns[i][j] = 0;
            }
        }
        dists[ay][ax] = 0;
        ptns[ay][ax] = 1;

        Deque<int[]> q = new ArrayDeque<>();
        int[] dxs = {1, 0, -1, 0};
        int[] dys = {0, 1, 0, -1};
        Integer ans_d = null;
        while (!q.isEmpty()) {
            int[] node = q.poll();
            int d = node[0];
            int x = node[1];
            int y = node[2];
            if (ans_d != null && d > ans_d) {
                break;
            }
            if (x == bx && y == by) {
                ans_d = d;
            }
            if (d > dists[y][x]) continue;
            dists[y][x] = d;
            for (int k = 0; k < 4; k++) {
                int nx = x + dxs[k];
                int ny = y + dys[k];
                if (!(0 <= nx && nx < C) || !(0 <= ny && ny < R)) continue;
                if (d + 1 > dists[ny][nx]) continue;
                if (dists[ny][nx] == INF) {
                    q.add(new int[]{d+1, nx, ny});
                    dists[ny][nx] = d + 1;
                }
                ptns[ny][nx] += ptns[y][x];
                ptns[ny][nx] %= MOD;
            }
            int[][] directions = {{0, 1}, {0, R-1}, {C-1, 0}, {C-1, y}};
            for (int i = 0; i < 4; i++) {
                int nx = directions[i][0];
                int ny = directions[i][1];
                if (d + 1 > dists[ny][nx]) continue;
                if (dists[ny][nx] == INF) {
                    q.add(new int[]{d+1, nx, ny});
                    dists[ny][nx] = d + 1;
                }
                ptns[ny][nx] += ptns[y][x];
                ptns[ny][nx] %= MOD;
            }
        }

        System.out.println(ans_d + " " + (ptns[by][bx] % MOD));
    }
}