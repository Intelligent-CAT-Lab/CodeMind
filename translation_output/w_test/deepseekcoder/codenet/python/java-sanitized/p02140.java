import java.util.*;

class Main {
    static int R, C, ay, ax, by, bx;
    static int[][] dists;
    static long[][] ptns;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int INF = (int)1e9+7;
    static int MOD = (int)1e9+7;
    static class Point {
        int x, y, d;
        Point(int x, int y, int d) {
            this.x = x;
            this.y = y;
            this.d = d;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();
        ay = sc.nextInt();
        ax = sc.nextInt();
        by = sc.nextInt();
        bx = sc.nextInt();

        dists = new int[R][C];
        for (int i = 0; i < R; i++)
            Arrays.fill(dists[i], INF);
        dists[ay][ax] = 0;

        ptns = new long[R][C];
        for (int i = 0; i < R; i++)
            Arrays.fill(ptns[i], 0);
        ptns[ay][ax] = 1;

        Queue<Point> q = new LinkedList<>();
        q.add(new Point(ax, ay, 0));

        int ans_d = -1;
        while (!q.isEmpty()) {
            Point p = q.poll();
            if (p.d > ans_d && ans_d != -1)
                break;
            if (p.x == bx && p.y == by) {
                ans_d = p.d;
            }
            if (p.d > dists[p.y][p.x])
                continue;
            dists[p.y][p.x] = p.d;
            for (int i = 0; i < 4; i++) {
                int nx = p.x + dx[i], ny = p.y + dy[i];
                if (nx < 0 || nx >= C || ny < 0 || ny >= R)
                    continue;
                if (p.d + 1 > dists[ny][nx])
                    continue;
                if (dists[ny][nx] == INF) {
                    q.add(new Point(nx, ny, p.d + 1));
                    dists[ny][nx] = p.d + 1;
                }
                ptns[ny][nx] += ptns[p.y][p.x];
                ptns[ny][nx] %= MOD;
            }
            for (int[] n : new int[][]{{p.x, 0}, {p.x, R-1}, {0, p.y}, {C-1, p.y}}) {
                if (p.d + 1 > dists[n[1]][n[0]])
                    continue;
                if (dists[n[1]][n[0]] == INF) {
                    q.add(new Point(n[0], n[1], p.d + 1));
                    dists[n[1]][n[0]] = p.d + 1;
                }
                ptns[n[1]][n[0]] += ptns[p.y][p.x];
                ptns[n[1]][n[0]] %= MOD;
            }
        }

        System.out.println(ans_d + " " + ptns[by][bx] % MOD);
    }
}