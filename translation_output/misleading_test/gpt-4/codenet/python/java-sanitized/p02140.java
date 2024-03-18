import java.util.*;

public class p02140 {
    static final int MOD = 1000000007;
    static final int INF = Integer.MAX_VALUE;

    static class Point {
        int x, y, dist;

        public Point(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }

    public static void main(String[] args) {
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
            Arrays.fill(dists[i], INF);
            Arrays.fill(ptns[i], 0);
        }

        dists[ay][ax] = 0;
        ptns[ay][ax] = 1;
        
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(ax, ay, 0));
        int[] dxs = {1, 0, -1, 0};
        int[] dys = {0, 1, 0, -1};
        Integer ans_d = null;

        while (!q.isEmpty()) {
            Point p = q.poll();
            if (ans_d != null && p.dist > ans_d) break;
            if (p.x == bx && p.y == by) ans_d = p.dist;
            if (p.dist > dists[p.y][p.x]) continue;
            dists[p.y][p.x] = p.dist;

            for (int i = 0; i < 4; i++) {
                int nx = p.x + dxs[i];
                int ny = p.y + dys[i];
                
                if (!(0 <= nx && nx < C) || !(0 <= ny && ny < R)) continue;
                if (p.dist + 1 > dists[ny][nx]) continue;
                if (dists[ny][nx] == INF) {
                    q.add(new Point(nx, ny, p.dist + 1));
                    dists[ny][nx] = p.dist + 1;
                }
                ptns[ny][nx] += ptns[p.y][p.x];
                ptns[ny][nx] %= MOD;
            }

            int[][] teleports = {{p.x, 0}, {p.x, R - 1}, {0, p.y}, {C - 1, p.y}};
            for (int[] teleport : teleports) {
                int nx = teleport[0];
                int ny = teleport[1];
                if (p.dist + 1 > dists[ny][nx]) continue;
                if (dists[ny][nx] == INF) {
                    q.add(new Point(nx, ny, p.dist + 1));
                    dists[ny][nx] = p.dist + 1;
                }
                ptns[ny][nx] += ptns[p.y][p.x];
                ptns[ny][nx] %= MOD;
            }
        }

        System.out.println(ans_d + " " + ptns[by][bx]);
    }
}