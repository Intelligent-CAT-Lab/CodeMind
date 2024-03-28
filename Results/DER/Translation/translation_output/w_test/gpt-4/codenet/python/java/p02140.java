Here's the equivalent Java code based on the provided Python code:

```java
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class DijkstraWithMod {
    static final int MOD = 1000000007;
    static final int INF = 1000000007;

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
            for (int j = 0; j < C; j++) {
                dists[i][j] = INF;
                ptns[i][j] = 0;
            }
        }

        dists[ay][ax] = 0;
        ptns[ay][ax] = 1;

        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{0, ax, ay});

        int[] dxs = {1, 0, -1, 0};
        int[] dys = {0, 1, 0, -1};

        Integer ans_d = null;

        while (!q.isEmpty()) {
            int[] pos = q.poll();
            int d = pos[0], x = pos[1], y = pos[2];

            if (ans_d != null && d > ans_d) {
                break;
            }

            if (x == bx && y == by) {
                ans_d = d;
            }

            if (d > dists[y][x]) continue;
            dists[y][x] = d;

            for (int i = 0; i < 4; i++) {
                int nx = x + dxs[i];
                int ny = y + dys[i];

                if (nx < 0 || nx >= C || ny < 0 || ny >= R) continue;
                if (d + 1 > dists[ny][nx]) continue;

                if (dists[ny][nx] == INF) {
                    q.offer(new int[]{d + 1, nx, ny});
                    dists[ny][nx] = d + 1;
                }
                ptns[ny][nx] += ptns[y][x];
                ptns[ny][nx] %= MOD;
            }

            int[][] teleports = {{x, 0}, {x, R - 1}, {0, y}, {C - 1, y}};
            for (int[] tp : teleports) {
                int nx = tp[0], ny = tp[1];
                if (d + 1 > dists[ny][nx]) continue;

                if (dists[ny][nx] == INF) {
                    q.offer(new int[]{d + 1, nx, ny});
                    dists[ny][nx] = d + 1;
                }
                ptns[ny][nx] += ptns[y][x];
                ptns[ny][nx] %= MOD;
            }
        }

        System.out.println(ans_d + " " + ptns[by][bx] % MOD);

        sc.close();
    }
}

```

Please note that Java has no built-in tuple type, so I'm using an array `int[]` to represent the `(d, x, y)` triplet in the queue. Likewise, since Java uses zero-based indexing for arrays, you do not need to adjust the `R-1` and `C-1` expressions like you would in Python, where lists are also zero-based. Finally, make sure that the integer operations avoid integer overflow when dealing with `MOD`.
