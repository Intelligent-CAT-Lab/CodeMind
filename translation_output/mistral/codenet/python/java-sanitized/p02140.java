import java.util.*;

public class p02140 {
    static int R, C, ay, ax, by, bx;
    static int MOD = 1000000007;
    static int INF = Integer.MAX_VALUE;
    static int[][] dists = new int[R][C];
    static int[][] ptns = new int[R][C];
    static int ans_d = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();
        ay = sc.nextInt();
        ax = sc.nextInt();
        by = sc.nextInt();
        bx = sc.nextInt();

        Arrays.fill(dists, INF);
        dists[ay][ax] = 0;
        ptns[ay][ax] = 1;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, ax, ay});
        int[] dxs = {1, 0, -1, 0};
        int[] dys = {0, 1, 0, -1};

        while (!q.isEmpty()) {
            int[] d = q.poll();
            if (ans_d != 0 && d[0] > ans_d) {
                break;
            }
            if (Arrays.equals(d, new int[]{bx, by})) {
                ans_d = d[0];
            }
            if (d[0] > dists[ay][ax]) {
                continue;
            }
            dists[ay][ax] = d[0];
            for (int i = 0; i < dxs.length; i++) {
                int nx = ax + dxs[i];
                int ny = ay + dys[i];
                if (nx < 0 || nx >= C || ny < 0 || ny >= R) {
                    continue;
                }
                if (d[0] + 1 > dists[ny][nx]) {
                    continue;
                }
                if (dists[ny][nx] == INF) {
                    q.add(new int[]{d[0] + 1, nx, ny});
                    dists[ny][nx] = d[0] + 1;
                }
                ptns[ny][nx] += ptns[ay][ax];
                ptns[ny][nx] %= MOD;
            }
            for (int i = 0; i < dxs.length; i++) {
                int nx = ax + dxs[i];
                int ny = ay + dys[i];
                if (nx < 0 || nx >= C || ny < 0 || ny >= R) {
                    continue;
                }
                if (d[0] + 1 > dists[ny][nx]) {
                    continue;
                }
                if (dists[ny][nx] == INF) {
                    q.add(new int[]{d[0] + 1, nx, ny});
                    dists[ny][nx] = d[0] + 1;
                }
                ptns[ny][nx] += ptns[ay][ax];
                ptns[ny][nx] %= MOD;
            }
        }
        System.out.println(ans_d + " " + ptns[by][bx] % MOD);
    }
}