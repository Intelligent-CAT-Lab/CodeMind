import java.util.*;
import java.io.*;

public class p02140 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int ay = sc.nextInt();
        int ax = sc.nextInt();
        int by = sc.nextInt();
        int bx = sc.nextInt();
        int[][] dists = new int[R][C];
        int[][] ptns = new int[R][C];
        for (int i = 0; i < R; i++) {
            Arrays.fill(dists[i], Integer.MAX_VALUE);
        }
        dists[ay][ax] = 0;
        ptns[ay][ax] = 1;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, ax, ay});
        int[] dxs = new int[]{1, 0, -1, 0};
        int[] dys = new int[]{0, 1, 0, -1};
        int ans_d = -1;
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int d = cur[0], x = cur[1], y = cur[2];
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
                int nx = x + dxs[i], ny = y + dys[i];
                if (nx < 0 || nx >= C || ny < 0 || ny >= R) {
                    continue;
                }
                if (d + 1 > dists[ny][nx]) {
                    continue;
                }
                if (dists[ny][nx] == Integer.MAX_VALUE) {
                    q.add(new int[]{d + 1, nx, ny});
                    dists[ny][nx] = d + 1;
                }
                ptns[ny][nx] += ptns[y][x];
                ptns[ny][nx] %= MOD;
            }
            for (int i = 0; i < 2; i++) {
                int nx = x, ny = y + i * (R - 1);
                if (nx < 0 || nx >= C || ny < 0 || ny >= R) {
                    continue;
                }
                if (d + 1 > dists[ny][nx]) {
                    continue;
                }
                if (dists[ny][nx] == Integer.MAX_VALUE) {
                    q.add(new int[]{d + 1, nx, ny});
                    dists[ny][nx] = d + 1;
                }
                ptns[ny][nx] += ptns[y][x];
                ptns[ny][nx] %= MOD;
            }
        }
        System.out.println(ans_d + " " + ptns[by][bx]);
    }
}