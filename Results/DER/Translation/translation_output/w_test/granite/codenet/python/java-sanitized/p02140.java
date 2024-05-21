import java.util.*;

public class p02140 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int ay = sc.nextInt();
        int ax = sc.nextInt();
        int by = sc.nextInt();
        int bx = sc.nextInt();

        int MOD = 100000007;
        int[][] dists = new int[R][C];
        int[][] ptns = new int[R][C];
        for (int i = 0; i < R; i++) {
            Arrays.fill(dists[i], Integer.MAX_VALUE);
            Arrays.fill(ptns[i], 0);
        }
        dists[ay][ax] = 0;
        ptns[ay][ax] = 1;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, ax, ay});
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        int ansD = -1;
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int d = cur[0];
            int x = cur[1];
            int y = cur[2];
            if (ansD!= -1 && d > ansD) {
                break;
            }
            if (x == bx && y == by) {
                ansD = d;
            }
            if (d > dists[y][x]) {
                continue;
            }
            dists[y][x] = d;
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
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
            for (int nx = x; nx < C; nx++) {
                int ny = y;
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
            for (int nx = 0; nx <= x; nx++) {
                int ny = y;
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
            for (int ny = y; ny < R; ny++) {
                int nx = x;
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
            for (int ny = 0; ny <= y; ny++) {
                int nx = x;
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

        System.out.println(ansD + " " + ptns[by][bx] % MOD);
    }
}