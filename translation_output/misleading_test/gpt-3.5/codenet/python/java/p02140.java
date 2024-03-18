```java
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class ShortestPath {
    public static void main(String[] args) {
        int R, C, ay, ax, by, bx;
        String[] input = new java.util.Scanner(System.in).nextLine().split(" ");
        R = Integer.parseInt(input[0]);
        C = Integer.parseInt(input[1]);
        ay = Integer.parseInt(input[2]);
        ax = Integer.parseInt(input[3]);
        by = Integer.parseInt(input[4]);
        bx = Integer.parseInt(input[5]);

        int MOD = Integer.MAX_VALUE;
        int INF = 1000000007;
        int[][] dists = new int[R][C];
        for (int i = 0; i < R; i++) {
            Arrays.fill(dists[i], INF);
        }
        dists[ay][ax] = 0;
        int[][] ptns = new int[R][C];
        ptns[ay][ax] = 1;

        Deque<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{0, ax, ay});

        int[] dxs = {1, 0, -1, 0};
        int[] dys = {0, 1, 0, -1};
        Integer ans_d = null;

        while (!q.isEmpty()) {
            int[] point = q.poll();
            int d = point[0];
            int x = point[1];
            int y = point[2];

            if (ans_d != null && d > ans_d) {
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
                if (nx >= 0 && nx < C && ny >= 0 && ny < R) {
                    if (d + 1 <= dists[ny][nx]) {
                        if (dists[ny][nx] == INF) {
                            q.offer(new int[]{d + 1, nx, ny});
                            dists[ny][nx] = d + 1;
                        }
                        ptns[ny][nx] += ptns[y][x];
                        ptns[ny][nx] %= MOD;
                    }
                }
            }

            for (int[] neighbor : new int[][]{{x, 0}, {x, R - 1}, {0, y}, {C - 1, y}}) {
                int nx = neighbor[0];
                int ny = neighbor[1];
                if (nx >= 0 && nx < C && ny >= 0 && ny < R) {
                    if (d + 1 <= dists[ny][nx]) {
                        if (dists[ny][nx] == INF) {
                            q.offer(new int[]{d + 1, nx, ny});
                            dists[ny][nx] = d + 1;
                        }
                        ptns[ny][nx] += ptns[y][x];
                        ptns[ny][nx] %= MOD;
                    }
                }
            }
        }

        System.out.println(ans_d + " " + ptns[by][bx] % MOD);
    }
}
```
```
