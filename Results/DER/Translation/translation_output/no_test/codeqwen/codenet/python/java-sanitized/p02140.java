import java.util.*;

public class p02140 {
    static final int INF = (int)1e9 + 7;
    static final int MOD = (int)1e9 + 7;
    static int R, C, ay, ax, by, bx;
    static int[][] dists;
    static int[][] ptn;
    static Queue<int[]> q;
    static int[] dxs = {1, 0, -1, 0};
    static int[] dys = {0, 1, 0, -1};
    static int ans_d;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();
        ay = sc.nextInt();
        ax = sc.nextInt();
        by = sc.nextInt();
        bx = sc.nextInt();

        dists = new int[R][C];
        ptn = new int[R][C];
        q = new LinkedList<>();
        for (int i = 0; i < R; i++) {
            Arrays.fill(dists[i], INF);
            Arrays.fill(ptn[i], 0);
        }
        dists[ay][ax] = 0;
        ptn[ay][ax] = 1;
        q.offer(new int[]{0, ax, ay});

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int d = cur[0];
            int x = cur[1];
            int y = cur[2];
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