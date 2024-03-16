import java.util.ArrayDeque;
import java.util.Scanner;

public class p02140 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int R = input.nextInt();
        int C = input.nextInt();
        int ay = input.nextInt();
        int ax = input.nextInt();
        int by = input.nextInt();
        int bx = input.nextInt();

        final int MOD = (int) Math.pow(10, 9) + 7;
        final int INF = (int) Math.pow(10, 9) + 7;

        int[][] dists = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                dists[i][j] = INF;
            }
        }
        dists[ay][ax] = 0;

        int[][] ptns = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                ptns[i][j] = 0;
            }
        }
        ptns[ay][ax] = 1;

        ArrayDeque<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{0, ax, ay});

        int[] dxs = {1, 0, -1, 0};
        int[] dys = {0, 1, 0, -1};

        Integer ans_d = null;

        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int d = curr[0];
            int x = curr[1];
            int y = curr[2];

            if (ans_d != null && d > ans_d) {
                break;
            }

            if (x == bx && y == by) {
                ans_d = d;
            }

            if (d > dists[y][x]) {
                continue;
            }

            dists[y][x] = d;

            for (int k = 0; k < 4; k++) {
                int nx = x + dxs[k];
                int ny = y + dys[k];

                if (!(nx >= 0 && nx < C && ny >= 0 && ny < R)) {
                    continue;
                }

                if (d + 1 > dists[ny][nx]) {
                    continue;
                }

                if (dists[ny][nx] == INF) {
                    q.offer(new int[]{d + 1, nx, ny});
                    dists[ny][nx] = d + 1;
                }

                ptns[ny][nx] += ptns[y][x];
                ptns[ny][nx] %= MOD;
            }

            int[][] directions = {{x, 0}, {x, R - 1}, {0, y}, {C - 1, y}};
            for (int[] dir : directions) {
                int nx = dir[0];
                int ny = dir[1];

                if (d + 1 > dists[ny][nx]) {
                    continue;
                }

                if (dists[ny][nx] == INF) {
                    q.offer(new int[]{d + 1, nx, ny});
                    dists[ny][nx] = d + 1;
                }

                ptns[ny][nx] += ptns[y][x];
                ptns[ny][nx] %= MOD;
            }
        }

        System.out.println(ans_d + " " + ptns[by][bx] % MOD);
    }
}