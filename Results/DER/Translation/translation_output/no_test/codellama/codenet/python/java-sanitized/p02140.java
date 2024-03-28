import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class p02140 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int ay = sc.nextInt();
        int ax = sc.nextInt();
        int by = sc.nextInt();
        int bx = sc.nextInt();

        int MOD = 1000000007;
        int[][] dists = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                dists[i][j] = Integer.MAX_VALUE;
            }
        }
        dists[ay][ax] = 0;
        int[][] ptns = new int[R][C];
        ptns[ay][ax] = 1;
        Deque<int[]> q = new ArrayDeque<>();
        q.add(new int[] {0, ax, ay});
        int[] dxs = {1, 0, -1, 0};
        int[] dys = {0, 1, 0, -1};
        int ans_d = -1;
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int d = curr[0];
            int x = curr[1];
            int y = curr[2];
            if (ans_d != -1 && d > ans_d) {
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
                if (!(0 <= nx && nx < C) || !(0 <= ny && ny < R)) {
                    continue;
                }
                if (d + 1 > dists[ny][nx]) {
                    continue;
                }
                if (dists[ny][nx] == Integer.MAX_VALUE) {
                    q.add(new int[] {d + 1, nx, ny});
                    dists[ny][nx] = d + 1;
                }
                ptns[ny][nx] += ptns[y][x];
                ptns[ny][nx] %= MOD;
            }
            for (int i = 0; i < 4; i++) {
                int nx = x + dxs[i];
                int ny = y + dys[i];
                if (!(0 <= nx && nx < C) || !(0 <= ny && ny < R)) {
                    continue;
                }
                if (d + 1 > dists[ny][nx]) {
                    continue;
                }
                if (dists[ny][nx] == Integer.MAX_VALUE) {
                    q.add(new int[] {d + 1, nx, ny});
                    dists[ny][nx] = d + 1;
                }
                ptns[ny][nx] += ptns[y][x];
                ptns[ny][nx] %= MOD;
            }
        }
        System.out.println(ans_d + " " + ptns[by][bx] % MOD);
    }
}