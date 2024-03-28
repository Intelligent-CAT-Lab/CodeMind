import java.util.*;

public class p02140 {
    final static int INF = (int) 1e9 + 7;
    final static int MOD = INF;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = sc.nextLine().split(" ");
        int R = Integer.parseInt(input[0]);
        int C = Integer.parseInt(input[1]);
        int ay = Integer.parseInt(input[2]);
        int ax = Integer.parseInt(input[3]);
        int by = Integer.parseInt(input[4]);
        int bx = Integer.parseInt(input[5]);

        int[][] dists = new int[R][C];
        Arrays.fill(dists, INF);
        dists[ay][ax] = 0;
        int[][] ptns = new int[R][C];
        Arrays.fill(ptns, 0);
        ptns[ay][ax] = 1;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, ax, ay});
        int[] dxs = {1, 0, -1, 0};
        int[] dys = {0, 1, 0, -1};
        int ans_d = null;
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            if (ans_d != null && curr[0] > ans_d) {
                break;
            }
            if (curr[2] == bx && curr[1] == by) {
                ans_d = curr[0];
            }
            if (curr[0] > dists[curr[1]][curr[2]]) {
                continue;
            }
            dists[curr[1]][curr[2]] = curr[0];
            for (int i = 0; i < dxs.length; i++) {
                int nx = curr[2] + dxs[i];
                int ny = curr[1] + dys[i];
                if (nx < 0 || nx >= C || ny < 0 || ny >= R) {
                    continue;
                }
                if (curr[0] + 1 > dists[ny][nx]) {
                    continue;
                }
                if (dists[ny][nx] == INF) {
                    q.add(new int[]{curr[0] + 1, nx, ny});
                    dists[ny][nx] = curr[0] + 1;
                }
                ptns[ny][nx] += ptns[curr[1]][curr[2]];
                ptns[ny][nx] %= MOD;
            }
            for (int i = 0; i < dxs.length; i++) {
                int nx = curr[2] + dxs[i];
                int ny = curr[1] + dys[i];
                if (nx < 0 || nx >= C || ny < 0 || ny >= R) {
                    continue;
                }
                if (curr[0] + 1 > dists[ny][nx]) {
                    continue;
                }
                if (dists[ny][nx] == INF) {
                    q.add(new int[]{curr[0] + 1, nx, ny});
                    dists[ny][nx] = curr[0] + 1;
                }
                ptns[ny][nx] += ptns[curr[1]][curr[2]];
                ptns[ny][nx] %= MOD;
            }
        }
        System.out.println(ans_d + " " + ptns[by][bx] % MOD);
    }
}