import java.util.*;

public class p02140 {
    static final int INF = (int)1e9 + 7;
    static final int MOD = (int)1e9 + 7;
    static final int[] dxs = {1, 0, -1, 0};
    static final int[] dys = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int ay = sc.nextInt();
        int ax = sc.nextInt();
        int by = sc.nextInt();
        int bx = sc.nextInt();

        int[][] dists = new int[R][C];
        for (int[] dist : dists) {
            Arrays.fill(dist, INF);
        }
        dists[ay][ax] = 0;
        int[][] ptns = new int[R][C];
        ptns[ay][ax] = 1;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, ax, ay});
        while (!q.isEmpty()) {
            int[] dxy = q.poll();
            int d = dxy[0];
            int x = dxy[1];
            int y = dxy[2];
            if (d > dists[y][x]) continue;
            if (dists[y][x] == INF) {
                q.offer(new int[]{d + 1, x, y});
                dists[y][x] = d + 1;
            }
            ptns[y][x] += ptns[y][x];
            ptns[y][x] %= MOD;
            for (int i = 0; i < 4; i++) {
                int nx = x + dxs[i];
                int ny = y + dys[i];
                if (nx < 0 || nx