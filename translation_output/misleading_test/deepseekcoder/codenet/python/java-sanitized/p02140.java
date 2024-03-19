import java.util.*;

class Main {
    static int R, C, ay, ax, by, bx;
    static int[][] dists;
    static long[][] ptns;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int MOD = (int)Math.pow(10, 9) + 7;
    static int INF = (int)Math.pow(10, 9);
    static int ans_d = -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        R = scanner.nextInt();
        C = scanner.nextInt();
        ay = scanner.nextInt();
        ax = scanner.nextInt();
        by = scanner.nextInt();
        bx = scanner.nextInt();

        dists = new int[R][C];
        for (int i = 0; i < R; i++)
            Arrays.fill(dists[i], INF);
        dists[ay][ax] = 0;

        ptns = new long[R][C];
        for (int i = 0; i < R; i++)
            Arrays.fill(ptns[i], 0);
        ptns[ay][ax] = 1;

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, ax, ay});

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int d = cur[0], x = cur[1], y = cur[2];
            if (ans_d != -1 && d > ans_d)
                break;
            if (x == bx && y == by) {
                ans_d = d;
            }
            if (d > dists[y][x])
                continue;
            dists[y][x] = d;
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i], ny = y + dy[i];
                if (nx < 0 || nx >= C || ny < 0 || ny >= R)
                    continue;
                if (d + 1 > dists[ny][nx])
                    continue;
                if (dists[ny][nx] == INF) {
                    q.add(new int[]{d + 1, nx, ny});
                    dists[ny][nx] = d + 1;
                }
                ptns[ny][nx] += ptns[y][x];
                ptns[ny][nx] %= MOD;
            }
            for (int[] n : new int[][]{{x, 0}, {x, R - 1}, {0, y}, {C - 1, y}}) {
                int nx = n[0], ny = n[1];
                if (d + 1 > dists[ny][nx])
                    continue;
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